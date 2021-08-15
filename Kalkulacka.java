import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Kalkulacka extends JFrame{

	JButton plus = new JButton("+"); 
	JButton minus = new JButton("-"); 
	JButton multiply = new JButton("*");
	JButton devideButton = new JButton("/");
	JButton oneButton = new JButton("1"); 
	JButton twoButton = new JButton("2"); 
	JButton threeButton = new JButton("3"); 
	JButton fourButton = new JButton("4"); 
	JButton fiveButton = new JButton("5"); 
	JButton sixButton = new JButton("6"); 
	JButton sevenButton = new JButton("7"); 
	JButton eightButton = new JButton("8"); 
	JButton nineButton = new JButton("9"); 
	JButton zeroButton = new JButton("0"); 
	JButton equalButton= new JButton("=");
	JButton delete= new JButton("AC"); 
	JLabel pole = new JLabel("                   ");
	
	String text = "";
	float numberOne=0;
	float numberTwo=0;
	byte znak=1;
	boolean secondNumber = false;
	
	Kalkulacka(String name)
	{
		super(name);
		setSize(400,400);
		setLayout(new BorderLayout());
		
		getContentPane().add(pole, BorderLayout.NORTH);
		JPanel panelNumbers = new JPanel(new GridLayout(3,4));
		getContentPane().add(panelNumbers, BorderLayout.CENTER);
		int znak = 0;
		for (int i=7; i>0; i= i-3)
		{
			for (int j=0; j<4; j++)
			{
				if (j==3)
				{
					if (znak == 0)
						panelNumbers.add(plus);
					else if (znak == 1)
						panelNumbers.add(minus);
					else if (znak == 2)
						panelNumbers.add(multiply);
					
					znak++;
				}
				else
				{
					int a = i+j;
					if (a == 1)
						panelNumbers.add(oneButton);
					else if (a==2)
						panelNumbers.add(twoButton);
					else if (a==3)
						panelNumbers.add(threeButton);
					else if (a==4)
						panelNumbers.add(fourButton);
					else if (a==5)
						panelNumbers.add(fiveButton);
					else if (a==6)
						panelNumbers.add(sixButton);
					else if (a==7)
						panelNumbers.add(sevenButton);
					else if (a==8)
						panelNumbers.add(eightButton);
					else if (a==9)
						panelNumbers.add(nineButton);
				}
			}
		}		
		
		JPanel panelSouth = new JPanel(new GridLayout(1,4));
		getContentPane().add(panelSouth, BorderLayout.SOUTH);
		panelSouth.add(delete);
		panelSouth.add(zeroButton);
		panelSouth.add(equalButton);
		panelSouth.add(devideButton);
		
		oneButton.addActionListener(new ActionListener(){
			@Override
			
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				oneTisk(e);
			}
		});
		
		twoButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				twoTisk(e);
			}
		});
		
		threeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				threeTisk(e);
			}
		});
		
		fourButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fourTisk(e);
			}
		});
		
		fiveButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fiveTisk(e);
			}
		});
		
		sixButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sixTisk(e);
			}
		});
		
		sevenButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sevenTisk(e);
			}
		});
		
		eightButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				eightTisk(e);
			}
		});
		
		nineButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				nineTisk(e);
			}
		});
		
		zeroButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				zeroTisk(e);
			}
		});
		
		plus.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				plusTisk(e);
			}
		});
		
		minus.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				minusTisk(e);
			}
		});
		
		multiply.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				multTisk(e);
			}
		});
		
		devideButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				divTisk(e);
			}
		});
		
		equalButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				equalTisk(e);
			}
		});
		
		delete.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				deleteTisk(e);
			}
		});
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void oneTisk(ActionEvent e)
	{
		if (secondNumber)
			numberTwo=10*numberTwo+1;   
		else
			numberOne=10*numberOne+1;
		text= text+"1";
		pole.setText(text);
	}
	
	public void twoTisk(ActionEvent e)
	{
		if (secondNumber)
			numberTwo=10*numberTwo+2;
		else
			numberOne=10*numberOne+2;
		text= text+"2";
		pole.setText(text);
	}
	
	public void threeTisk(ActionEvent e)
	{
		if (secondNumber)
			numberTwo=10*numberTwo+3;
		else
			numberOne=10*numberOne+3;
		text= text+"3";
		pole.setText(text);
	}
	
	public void fourTisk(ActionEvent e)
	{
		if (secondNumber)
			numberTwo=10*numberTwo+4;
		else
			numberOne=10*numberOne+4;
		text= text+"4";
		pole.setText(text);
	}
	
	public void fiveTisk(ActionEvent e)
	{
		if (secondNumber)
			numberTwo=10*numberTwo+5;
		else
			numberOne=10*numberOne+5;
		text= text+"5";
		pole.setText(text);
	}
	
	public void sixTisk(ActionEvent e)
	{
		if (secondNumber)
			numberTwo=10*numberTwo+6;
		else
			numberOne=10*numberOne+6;
		text= text+"6";
		pole.setText(text);
	}
	
	public void sevenTisk(ActionEvent e)
	{
		if (secondNumber)
			numberTwo=10*numberTwo+7;
		else
			numberOne=10*numberOne+7;
		text= text+"7";
		pole.setText(text);
	}
	
	public void eightTisk(ActionEvent e)
	{
		if (secondNumber)
			numberTwo=10*numberTwo+8;
		else
			numberOne=10*numberOne+8;
		text= text+"8";
		pole.setText(text);
	}
	
	public void nineTisk(ActionEvent e)
	{
		if (secondNumber)
			numberTwo=10*numberTwo+9;
		else
			numberOne=10*numberOne+9;
		text= text+"9";
		pole.setText(text);
	}
	
	public void zeroTisk(ActionEvent e)
	{
		if (secondNumber)
			numberTwo=10*numberTwo;
		else
			numberOne=10*numberOne;
		text= text+"0";
		pole.setText(text);
	}
	
	public void plusTisk(ActionEvent e)
	{
		secondNumber = true;
		znak = 1;
		text= text+" + ";
		pole.setText(text);
	}
	
	public void minusTisk(ActionEvent e)
	{
		secondNumber = true;
		znak = 2;
		text= text+" - ";
		pole.setText(text);
	}
	
	public void multTisk(ActionEvent e)
	{
		secondNumber = true;
		znak = 3;
		text= text+" * ";
		pole.setText(text);
	}
	
	public void divTisk(ActionEvent e)
	{
		secondNumber = true;
		znak = 4;
		text= text+" / ";
		pole.setText(text);
	}
	
	public void deleteTisk(ActionEvent e)
	{
		secondNumber = false;
		numberOne = 0;
		numberTwo = 0;
		znak = 1;
		text=" ";
		pole.setText(text);
		text="";
	}
	
	public void equalTisk(ActionEvent e)
	{	
		if (znak == 1)
			text= text+ " = " + (int)(numberOne+numberTwo);
		else if (znak == 2)
			text= text+ " = " + (int)(numberOne-numberTwo);
		else if (znak == 3)
			text= text+ " = " + (int)(numberOne*numberTwo);
		else if (znak == 4)
			text= text+ " = " + (numberOne/numberTwo);
		pole.setText(text);
		text = "";
		numberOne=0;
		numberTwo=0;
		znak=1;
		secondNumber = false;
	}
}
