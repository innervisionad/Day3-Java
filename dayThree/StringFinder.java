package dayThree;

import dayOne.ValidatePassword;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import javax.swing.*;
/**
 * Created by student on 29-Jun-16.
 */
public class StringFinder {


    JFrame mainFrame;
    JPanel panel;
    JButton btnCheck;
    JTextArea stringTxt;
    JTextArea charTxt;
    JLabel label;

    public StringFinder() {
        mainFrame = new JFrame("String Finder");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500, 300);
        mainFrame.setResizable(true);
        mainFrame.setLocationRelativeTo(null);


        panel = new JPanel(new FlowLayout());
        //panel.setSize(500, 300);
        panel.setBackground(Color.LIGHT_GRAY);

        //add components to panel

        label = new JLabel("Enter the text you want to search:");
        panel.add(label);


        stringTxt = new JTextArea("", 5, 20); // start text, no of lines, chars on 1 line
        panel.add(stringTxt, BorderLayout.NORTH);

        charTxt = new JTextArea("", 1, 15); // start text, no of lines, chars on 1 line
        panel.add(charTxt, BorderLayout.SOUTH);

        btnCheck = new JButton("Check Sentence");
        btnCheck.addActionListener(event -> {
            char c = charTxt.getText().charAt(0);
            String input = stringTxt.getText();

            char[] inputArray = input.toCharArray();

            int counter = 0;
            for(char d : inputArray){
                if(c == d){
                    counter ++;
                }
            }
            JOptionPane.showMessageDialog(null, counter);
        });

        panel.add(btnCheck);
        mainFrame.add(panel);
        mainFrame.setVisible(true);
    }
  public static void main(String [] args){
        new StringFinder();
    }
}
