import java.awt.*; import javax.swing.*; import java.awt.event.*;
public class Buttons extends JFrame implements ActionListener { Container c;
JButton btnHi, btnHowareyou, btnCharmi, btnGladtomeet; JLabel label;
Buttons() {
c = getContentPane(); c.setLayout(null);
btnHi = new JButton("Hi"); btnCharmi = new JButton("Charmi");
btnGladtomeet = new JButton("Gladtomeet"); btnHowareyou = new JButton("Howareyou?"); label = new JLabel(" ");
label.setSize(200, 60);
btnHi.setLocation(100, 50);
btnCharmi.setLocation(100, 110);
btnGladtomeet.setLocation(100, 170);
btnHowareyou.setLocation(100, 230);
btnHi.setSize(100, 50);
btnCharmi.setSize(100, 50);
btnGladtomeet.setSize(100, 50);
btnHowareyou.setSize(100, 50); c.add(btnHi);
c.add(btnCharmi); c.add(btnGladtomeet); c.add(btnHowareyou); c.add(label); btnHi.addActionListener(this); btnCharmi.addActionListener(this);
btnGladtomeet.addActionListener(this); btnHowareyou.addActionListener(this);
}
public static void main(String[] args) { Buttons frm = new Buttons();
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frm.setBounds(200, 200, 400, 500);
frm.setVisible(true); frm.setTitle("clickme");
}
 
public void actionPerformed(ActionEvent e) { if (e.getSource() == btnHi) { label.setText("Hi");
label.setLocation(220, 50);
}
if (e.getSource() == btnCharmi) { label.setText("Charmi?"); label.setLocation(220, 110);
}
if (e.getSource() == btnGladtomeet) { label.setText("Gladtomeet"); label.setLocation(220, 160);
}
if (e.getSource() == btnHowareyou) { label.setText("Howareyou"); label.setLocation(220, 230);
}
}
}
