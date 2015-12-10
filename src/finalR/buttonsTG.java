package finalR;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class buttonsTG extends JButton implements ActionListener {
	ImageIcon X,O;
	
	
	
	public buttonsTG(){
		super();
		addActionListener(this);
		
	}
	

    
	@Override
	public void actionPerformed(ActionEvent event)
	{
		JButton newButton = (JButton) event.getSource();
		
		if(event.getActionCommand()=="RESET")
		{
		
			
			newButton.setBackground(Color.GREEN);
			BoardGame hello = new BoardGame();
			hello.createPanel();
			
		}
		
		
	}
	
}


/*	
for(int i = 0; i<=3;i++){
switch(i){

case 1:

miscell[i]= new buttonsTG();

miscell[i].setText("RESET");
panel.add(miscell[i]);



;
break;

case 2:
	buttons[i]= new JButton("1VPC");
	panel.add(buttons[i]);;	
	break;
case 3:
	buttons[i]= new JButton("PCvsPC");
	panel.add(buttons[i]);;	
	break;
}


}*/
