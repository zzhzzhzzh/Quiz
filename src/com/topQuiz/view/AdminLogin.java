package com.topQuiz.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogin extends JFrame{
    private JPanel panel1,panel2;
    private JButton submitBtn;
    private JLabel unameLbl,pswLbl;
    private JTextField unametTf, pswTf;

    public AdminLogin(){
        super( "Admin Login" );
        this.setSize(550, 100);
        this.setResizable(false);

        // get content pane
        Container container = getContentPane();
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        // create  labels
        unameLbl = new JLabel("User Name");
        pswLbl = new JLabel("Password");
        unameLbl.setFont(new Font("ARIAL", Font.BOLD, 16));
        unameLbl.setForeground(Color.DARK_GRAY);
        pswLbl.setFont(new Font("ARIAL", Font.BOLD, 16));
        pswLbl.setForeground(Color.DARK_GRAY);

        unametTf = new JTextField(12);
        pswTf = new JTextField(12);

        // Add the labels and textfield to panel1
        panel1.add(unameLbl);
        panel1.add(unametTf);
        panel1.add(pswLbl);
        panel1.add(pswTf);

        // Create and add button to panel2
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        submitBtn = new JButton("Submit");
        submitBtn.setActionCommand("submit");
        submitBtn.setFont(new Font("Arial", Font.BOLD, 16));

        // add the event handlers to the buttons
        ButtonEventHandler handler = new ButtonEventHandler();
        submitBtn.addActionListener(handler);

        panel2.add(submitBtn);

        container.add(panel1,BorderLayout.WEST);
        container.add(panel2,BorderLayout.PAGE_END);

        //pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }
    class ButtonEventHandler implements ActionListener {
        public void actionPerformed( ActionEvent event ){
            if ( (unametTf.getText().equals("admin")) && (pswTf.getText().equals("123456"))){
                dispose();
                new ChooseQuesType().setVisible(true);
                //new ChooseQuesType().setVisible(true);
            } else if ((unametTf.getText().equals("")) || (pswTf.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Please enter full info!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Wrong user info!");
                unametTf.setText("");
                pswTf.setText("");
            }
        }

    }
    public static void createAndShowGUI(){
        AdminLogin app = new AdminLogin();
        app.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

    }

}
