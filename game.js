const question = document.getElementById('question');
const choices = Array.from(document.getElementsByClassName('choice'));

let currentQuestion = {};
let score = 0;
let questionCounter = -1;
let availableQuesions = [];


let questions = [];

fetch(
    "https://opentdb.com/api.php?amount=10"
)
    .then((res) => {
        return res.json();
        //returning response(which is http) file as .json file
    })
    .then((loadedQuestions) => {
        console.log(loadedQuestions)

        questions = loadedQuestions.results.map((loadedQuestion) => {
            const formattedQuestion = {
                question: loadedQuestion.question,
            };//transforming question from api into an object with question property

            const answerChoices = [...loadedQuestion.incorrect_answers];
            formattedQuestion.answer = Math.floor(Math.random() * 4) + 1;//randomising the correct answer
            answerChoices.splice(
                formattedQuestion.answer - 1,
                0,
                loadedQuestion.correct_answer
            );//adding the right choice into the anserChoices array

            answerChoices.forEach((choice, index) => {
                formattedQuestion['choice' + (index + 1)] = choice;
            });//assigning property choice to our answerChoices 

            return formattedQuestion;
        });
        startGame();//wait for questions to get loaded*/
    })
    .catch((err) => {
        console.error(err);
    });//returns error in case of an error scenario

const MAX_QUESTIONS = 9;

startGame = () => {

    score = 0;
    availableQuesions = [...questions]; 
    //spread operator: spreads out the items in array of questions and put them into a new array
    console.log(availableQuesions);
    getNewQuestion();
};
getNewQuestion = () => {
    if (questionCounter >= MAX_QUESTIONS) {
        //go to the end page
        return window.location.assign('/end.html');
    }
    questionCounter++;
    currentQuestion = availableQuesions[questionCounter];
    question.innerText = currentQuestion.question;

    choices.forEach((choice) => {
        const number = choice.dataset['number'];
        choice.innerText = currentQuestion['choice' + number];
    });

};

choices.forEach((choice) => {
    choice.addEventListener('click', (e) => {

        const selectedOption = e.target;
        const selectedAnswer = selectedOption.dataset['number'];

        if (selectedAnswer==currentQuestion.answer)
        {score++;}
        console.log(selectedAnswer==currentQuestion.answer)
        getNewQuestion();

    });
});
    
