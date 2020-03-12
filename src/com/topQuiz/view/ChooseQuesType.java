package com.topQuiz.view;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

// Java extension packages

public class ChooseQuesType extends JFrame {
   private JPanel panel1;
   private JButton blankQuesBtn, choiceQuesBtn;

   public ChooseQuesType(){
      super( "Choose Question Type" );

      // get content pane
      Container container = getContentPane();

      panel1 = new JPanel();
      panel1.setLayout(new FlowLayout());

      // create buttons
      blankQuesBtn = new JButton("Blank Question");
      blankQuesBtn.setPreferredSize(new Dimension(150, 150));
      blankQuesBtn.setFont(new Font("Arial", Font.BOLD, 16));
      blankQuesBtn.setBackground(Color.WHITE);
      blankQuesBtn.setForeground(Color.RED);
      blankQuesBtn.setActionCommand("blankQues");

      choiceQuesBtn = new JButton("Choice Question");
      choiceQuesBtn.setPreferredSize(new Dimension(150, 150));
      choiceQuesBtn.setFont(new Font("Arial", Font.BOLD, 16));
      choiceQuesBtn.setBackground(Color.WHITE);
      choiceQuesBtn.setForeground(Color.BLUE);
      choiceQuesBtn.setActionCommand("choiceQues");

      panel1.add(blankQuesBtn);
      panel1.add(choiceQuesBtn);

      // Use an anonymous class as an event handler
      blankQuesBtn.addActionListener( new ActionListener(){
         public void actionPerformed(ActionEvent event){
            dispose();
            new FillBlankQues().setVisible(true);
         }

      });

      choiceQuesBtn.addActionListener( new ActionListener(){
         public void actionPerformed(ActionEvent event){
            dispose();
            new FillChoiceQues().setVisible(true);
         }

      });

      container.add(panel1,BorderLayout.CENTER);

      pack();
      setLocationRelativeTo(null);
      setVisible( true );
   }


   public static void createAndShowGUI(){
      ChooseQuesType app = new ChooseQuesType();
      app.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
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


