package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class GUI {

    public GUI(){
        // create JFrame object
        JFrame frame = new JFrame();

        // new button for frame
        JButton button = new JButton("Get Time");

        // label for frame
        JLabel label = new JLabel();
        //JLabel label = new JLabel(AtomicTime.getCurrentTime());


        // Create JPanel object, needed for JFrame GUI
        JPanel panel = new JPanel();

        // setting border of the JPanel
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));

        // Setting layout of the JPanel
        panel.setLayout(new GridLayout(0,1));

        panel.add(button);

        panel.add(label);

        final JTextField atomicTimeTextField = new JTextField(24);

        atomicTimeTextField.setEditable(false);

        atomicTimeTextField.setBackground(Color.WHITE);

        panel.add(label);

        panel.add(atomicTimeTextField);

        // Add the panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // set an exit for the gui (hitting red x on window)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // My GUI window title
        frame.setTitle("Harvey's Atomic Clock");

        // pack the frame, this sends everything I have written so far.
        frame.pack();

        // set visible to true
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                AtomicTime time = new AtomicTime();
                atomicTimeTextField.setText(time.getCurrentTime());
            }
        });
    }

    public static void main(String[] args){
        new GUI();
    }
}
