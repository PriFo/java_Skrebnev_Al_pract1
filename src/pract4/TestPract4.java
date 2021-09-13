package pract4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TestPract4 extends JFrame{
    JFrame frame = new JFrame("Match!");
    JButton but1 = new JButton("AC Millan");
    JButton but2 = new JButton("Real Madrid");
    JButton but3 = new JButton("End Match");
    JButton but4 = new JButton("New Match");
    JLabel label1 = new JLabel("Result: 0X0");
    JLabel label2 = new JLabel("Last scorer: N/A");
    JLabel label3 = new JLabel("Winner: none");
    public int click_but1 = 0;
    public int click_but3 = 0;

    public TestPract4(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        but1.setBounds(25,15,200,100);
        but1.setActionCommand("Millan");
        but2.setBounds(250,15,200,100);
        but2.setActionCommand("Madrid");
        but3.setBounds(25,120,200,100);
        but3.setActionCommand("End");
        but4.setBounds(250,120,200,100);
        but4.setActionCommand("Reset");
        label1.setBounds(25,250,150,20);
        label2.setBounds(25,300,150,20);
        label3.setBounds(25,350,150,20);
        frame.add(but1);
        frame.add(but2);
        frame.add(but3);
        frame.add(but4);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        ActionListener actionListener = new TestActionListener();

        but1.addActionListener(actionListener);
        but2.addActionListener(actionListener);
        but3.addActionListener(actionListener);
        but4.addActionListener(actionListener);
        frame.setSize(500, 450);
        frame.setVisible(true);
    }

    public class TestActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String butText = e.getActionCommand();
            switch(butText){
                case "Millan":
                    click_but1++;
                    label1.setText("Result: " + click_but1 + "X" + click_but3);
                    label2.setText("Last scorer: " + butText);
                    if (click_but1 > click_but3){
                        label3.setText("Winner: " + butText);
                    } else if (click_but3 == click_but1){
                        label3.setText("Winner: none");
                    }
                    break;
                case "Madrid":
                    click_but3++;
                    label1.setText("Result: " + click_but1 + "X" + click_but3);
                    label2.setText("Last scorer: " + butText);
                    if (click_but3 > click_but1){
                        label3.setText("Winner: " + butText);
                    } else if (click_but3 == click_but1){
                        label3.setText("Winner: none");
                    }
                    break;
                case "Reset":
                    click_but1 = 0; click_but3 = 0;
                    label1.setText("Result: " + click_but1 + "X" + click_but3);
                    label2.setText("Last scorer: N/A");
                    label3.setText("Winner: none");
                    break;
                case "End":
                    if (click_but1 > click_but3){
                        JOptionPane.showMessageDialog(null, "Winner in this match is AC Millan!!!", "Result", JOptionPane.INFORMATION_MESSAGE);
                    } else if (click_but3 > click_but1){
                        JOptionPane.showMessageDialog(null, "Winner in this match is Real Madrid!!!", "Result", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "The match ended in a draw", "Result", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
            }
        }
    }
    public static void main(String[] args){
        new TestPract4();
    }
}