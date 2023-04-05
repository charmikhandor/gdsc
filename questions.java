import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class OnlineTest extends JFrame implements ActionListener
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2,b3;  
    ButtonGroup bg;  
    int k=0;    
    int scores[]=new int[50];
    String name[]=new String[50];

    String choice[]={" "," "," "," "," "," "," "," "," "," "};
    
    String answer[]={"Use of pointers","Compilation","Object class","run() method is used to begin execution of a thread before start() method in special cases","Void","Method overriding","int","JDB","Bytecode is executed by JVM","java.util package"};
     int questions=1;
    
    OnlineTest(String s)  
    {   
        super(s);  
        l=new JLabel();  
        add(l);  
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            add(jb[i]);  
            bg.add(jb[i]);  
        }  
        b1=new JButton("Next");  
        b2=new JButton("Previous");
        b3=new JButton("Submit"); 

        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);  
        set();  
        l.setBounds(30,40,450,20);  
        jb[0].setBounds(45,80,500,20);  
        jb[1].setBounds(45,110,500,20);  
        jb[2].setBounds(45,140,500,20);  
        jb[3].setBounds(45,170,500,20);  
        b1.setBounds(400,240,100,30);  
        b2.setBounds(100,240,100,30);
        b3.setBounds(250,240,100,30);  
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,350);  
    } 
    
    public void actionPerformed(ActionEvent e)
    
    {  
        if(e.getSource()==b1 && questions<10 )

      {  if(jb[0].isSelected())
        choice[questions-1]=jb[0].getText();
 
        if(jb[1].isSelected())
        choice[questions-1]=jb[1].getText();
        
        if(jb[2].isSelected())
        choice[questions-1]=jb[2].getText();
        
        if(jb[3].isSelected())
        choice[questions-1]=jb[3].getText();
        
        questions++;
        set();

      }
       if(e.getSource()==b2 && questions>1)
       {
        if(jb[0].isSelected())
        choice[questions-1]=jb[0].getText();
        
        if(jb[1].isSelected())
        choice[questions-1]=jb[1].getText();
        
        if(jb[2].isSelected())
        choice[questions-1]=jb[2].getText();
        
        if(jb[3].isSelected())
        choice[questions-1]=jb[3].getText();
        
        questions--;
        set();

       }
       if(e.getSource()==b3)
       {
        if(jb[0].isSelected())
        choice[questions-1]=jb[0].getText();
      
        if(jb[1].isSelected())
        choice[questions-1]=jb[1].getText();
        
        if(jb[2].isSelected())
        choice[questions-1]=jb[2].getText();
       
        if(jb[3].isSelected())
        choice[questions-1]=jb[3].getText();
            
        nameGenerator();  
    }
  }
  
  public void nameGenerator()
  { 
    JFrame jty=new JFrame();
    
    JTextField tr=new JTextField("Enter your name");
    JTextField tw =new JTextField();
    JButton jbr=new JButton("Enter");

    tr.setBounds(50,50 ,100 ,50 );
    tw.setBounds(170,50 ,100 ,50 );
    jbr.setBounds(110,170 ,140 ,50 );

jty.add(tr);
jty.add(tw);
jty.add(jbr);
jty.setSize(400,400);  
jty.setLayout(null);  
jty.setVisible(true);

jbr.addActionListener(new ActionListener(){  
  public void actionPerformed(ActionEvent e){  
              name[k]=tw.getText();
              result();
          }
        });  
  }

    public void set()
    {   
        jb[4].setSelected(true);
        if(questions==1)
       { l.setText("Q1)Which one of the following is not a Java feature?");
        jb[0].setText("Object-oriented");
        jb[1].setText("Use of pointers");
        jb[2].setText("Portable");
        jb[3].setText("Dynamic and Extensible");
    }

    if(questions==2)
    { l.setText("Q2)Which of the following is not an OOPS concept in Java?");
     jb[0].setText("Polymorphism");
     jb[1].setText("Inheritance");
     jb[2].setText("Compilation");
     jb[3].setText("Encapsulation");
 }
 if(questions==3)
 { l.setText("Q3)Which of the following is a superclass of every class in Java?");
  jb[0].setText("ArrayList");
  jb[1].setText("Abstract class");
  jb[2].setText("Object class");
  jb[3].setText("String");
}
if(questions==4)
{ l.setText("Q4)Which of these statements is incorrect about Thread?");
 jb[0].setText("start() method is used to begin execution of the thread");
 jb[1].setText("run() method begins thread execution before start() method in special cases");
 jb[2].setText("A thread can be formed by implementing Runnable interface only");
 jb[3].setText("A thread can be formed by a class that extends Thread class");
}
if(questions==5)
{ l.setText("Q5) Which one of the following is not an access modifier?");
 jb[0].setText("Protected");
 jb[1].setText("Void");
 jb[2].setText("Public");
 jb[3].setText("Private");
}
if(questions==6)
{ l.setText("Q6)What is the process of defining a method in a subclass having same name & type signature as a method in its superclass? ");
 jb[0].setText("Method overloading");
 jb[1].setText("Method overriding");
 jb[2].setText("Method hiding");
 jb[3].setText("None of the mentioned");
}
if(questions==7)
{ l.setText("Q7)What is the return type of the hashCode() method in the Object class? ");
 jb[0].setText("Object");
 jb[1].setText("int");
 jb[2].setText("long");
 jb[3].setText("void");
}
if(questions==8)
{ l.setText("Q8)What is used to find and fix bugs in the Java programs? ");
 jb[0].setText("JVM");
 jb[1].setText("JRE");
 jb[2].setText("JDK");
 jb[3].setText("JDB");
}
if(questions==9)
{ l.setText("Q9)Which of the following option leads to the portability and security of Java? ");
 jb[0].setText("Bytecode is executed by JVM");
 jb[1].setText("The Java applet ");
 jb[2].setText("Use of exception handling");
 jb[3].setText("Dynamic binding between objects");
}
if(questions==10)
{ l.setText("Q10)Which package contains the Random class?");
 jb[0].setText("java.util package");
 jb[1].setText("java.lang package");
 jb[2].setText("java.awt package");
 jb[3].setText("java.io package");
}    
}


public void result()
{
    JFrame j=new JFrame("Scores");
    JLabel w=new JLabel();
    JLabel c=new JLabel();
    JButton q=new JButton("Re-quiz");
    JButton n=new JButton("Exit");
    int count=0;
    List v=new List();
    List z=new List();
 
for(int i=0;i<10;i++)
{
if(choice[i].equals(answer[i]))
count++;
}
 scores[k]=count;

int temp; 
String temper; 
 
    for (int i = 0; i <= k-1 ; i++)
 {
        // Last i elements are already in place
        for (int o = 0; o < k- i ; o++)
          { 
            if (scores[o] < scores[o+ 1])
          {
            temp=scores[o+1];
            
            scores[o+1]=scores[o];

            scores[o]=temp;

            temper=name[o+1];

            name[o+1]=name[o];

            name[o]=temper;
}
}
}
   for(int g=0;g<=k;g++)  
{
int value=scores[g];
v.add(Integer.toString(value));
String creden=name[g];
z.add(creden);
}

w.setText("your score is: "+count);

c.setText("High scores:");
q.setBounds(50, 0, 100, 40);

w.setBounds(50,50,150,50);

z.setBounds(160,120,300,500);
c.setBounds(50,120,100,50);
n.setBounds(170,0 ,100 ,40 );
v.setBounds(460,120,300,500 );

j.add(w);  
j.add(c);
j.add(q); 
j.add(v);
j.add(z); 

j.setSize(400,400);  
j.setLayout(null);  
j.setVisible(true);

q.addActionListener(new ActionListener(){  
  public void actionPerformed(ActionEvent e){  
              questions=1;
              for(int u=0;u<k;u++)
              choice[u].equals(" ");
              
              k++;
              
              set();
          }
        });  
        n.addActionListener(new ActionListener(){  
          public void actionPerformed(ActionEvent e){  
                      
                      System.exit(0);
        
                  }
                });

}

public static void main(String s[])
{
  new OnlineTest ("Java quiz");
}
}