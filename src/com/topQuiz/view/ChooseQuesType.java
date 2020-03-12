package com.topQuiz.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Java extension packages

public class ChooseQuesType extends JFrame {
<<<<<<< HEAD
    private JButton blankQuesBtn, choiceQuesBtn;

    public ChooseQuesType(){
        super( "Choose Question Type" );
        
        // get content pane
        Container container = getContentPane();

        // set the layout
        container.setLayout( new FlowLayout() );

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

        container.add(blankQuesBtn);
        container.add(choiceQuesBtn);

        setLocationRelativeTo(null);
        // Use an anonymous class as an event handler
        blankQuesBtn.addActionListener(event -> {
            dispose();
            new FillBlankQues().setVisible(true);
        });

        choiceQuesBtn.addActionListener(event -> {
            dispose();
            new FillChoiceQues().setVisible(true);
        });
        pack();
        setLocationRelativeTo(null);
        setVisible( true );
    }
=======
	private JPanel panel1,panel2;
	private JButton blankQuesBtn, choiceQuesBtn, backToHomeBtn;

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

		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());

		backToHomeBtn = new JButton("Back To Home");
		backToHomeBtn.setActionCommand("back to home");
		backToHomeBtn.setFont(new Font("Arial", Font.BOLD, 15));

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


		backToHomeBtn.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent event ) {
				dispose();
				new TopQuizMain().setVisible(true);
			}
		});

		panel2.add(backToHomeBtn);

		container.add(panel1,BorderLayout.CENTER);
		container.add(panel2,BorderLayout.SOUTH);

		pack();
		setLocationRelativeTo(null);
		setVisible( true );
	}
>>>>>>> 289262d804fd771fd5ebafcf40fb676e464e9f8f


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


