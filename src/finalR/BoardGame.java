package finalR;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class BoardGame {
	private int click = 1;
	private JFrame j;
	private JPanel panel= new JPanel();
	private JLabel l= new JLabel("HelloS");
	private JButton[] buttons = new JButton[12];
	private GridLayout layout = new GridLayout(4,3);
	private buttonsTG[] miscell = new buttonsTG[3];
	boolean gameStatus= false;
	private ImageIcon cross;
	
	public BoardGame(){	
		frame();
	}
	
	public void frame()
	{
		j= new JFrame("Tic Tac Toe Game");
		j.setSize(500, 500);
		j.setLocationRelativeTo(null);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//panel.setLayout(layout);
		//panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 50));	
	}
	
	//11make the game board layout
	public void createPanel(){		
		panel.setLayout(layout);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 50));
			for(int i = 0; i<9;i++)
			{
				buttons[i]= new JButton("");
				panel.add(buttons[i]);
				buttons[i].addActionListener( new ActionListener() {
				
					int times=1;//while loop

					@Override
					
					public void actionPerformed(ActionEvent var){
						//String cross = "X";	
						ImageIcon cross = new ImageIcon("x.png");
						ImageIcon circle = new ImageIcon("o.png");
						//String circle = "0";	
						//each click becomes a new var object
						// ActionEvent object information about the event and its source
						JButton newButton = (JButton) var.getSource();
							while(times<=9)
							{
								if(click==1){
									newButton.setBackground(Color.GREEN);
									newButton.setIcon(cross);
									newButton.setActionCommand("cross");
									click++;
								}
								else{
									newButton.setBackground(Color.BLUE);
									newButton.setIcon(circle);
									click--;		
								}
							times++;
							}
							
					}
					
					
				});
			}	
	
		//??Miscell buttons
				for(int i = 9; i<buttons.length;i++){
						switch(i){
							case 9:
									buttons[i]= new JButton("RESET");
									buttons[i].setBackground(Color.YELLOW);
									panel.add(buttons[i]);;	
									buttons[i].addActionListener(new ActionListener(){
			
							public void actionPerformed(ActionEvent miscell){
				
							JButton newButton = (JButton) miscell.getSource();
				
								if(miscell.getActionCommand()=="RESET")
								   {  panel.removeAll();
								createPanel();
									}
								}
			
							});break;
		
							case 10:
								buttons[i]= new JButton("1VPC");
								panel.add(buttons[i]);;	
								break;
							case 11:
								buttons[i]= new JButton("PCvsPC");
								panel.add(buttons[i]);;	
								break;
						}		
	}

		j.add(panel);
		j.setVisible(true);	
		
		//declareWin();
}//createPanel method

	public void declareWin() {
		
		
		if(buttons[1].getIcon().equals(cross))// && buttons[1].equals("X") && buttons[2].equals("X"))
		{
			
			gameStatus=true;
			chooseWinner(gameStatus);
		}
		else if(buttons[4].getAction()==buttons[5].getIcon() & buttons[5].getIcon()==buttons[6].getIcon())
		{
			gameStatus=true;
		}
		else //(
		{
			gameStatus=true;
			chooseWinner(gameStatus);
		}
		
		
	}

	private void chooseWinner(boolean gameStatus2) {
		
		if(gameStatus=true)
			JOptionPane.showMessageDialog(null, "Winner");
		else
			JOptionPane.showMessageDialog(null, "Winner");
		
	}
	
	
	
	
	
	
	
	
	
	


}
