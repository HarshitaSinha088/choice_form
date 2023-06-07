import java.awt.*;
import java.awt.event.*;
class awt14 extends Frame implements ActionListener
{
	Label EDUCATION ,CHOOSE_EDU,CHOOSE_CITY,CITY;
	Button b1,b2,Clear,b4;
	TextField tf1,tf2;
	Choice ch1,ch2;
	String x,y;
	
	awt14()
	{
		CHOOSE_EDU=new Label("CHOOSE_EDU");
		CHOOSE_EDU.setBounds(50,50,150,30);
		ch1=new Choice();
		ch1.setBounds(210,50,100,20);
		ch1.add("Select");
		ch1.add("Intermediate");
		ch1.add("Graduation ");
		ch1.add("Post Graduation");
		ch1.add("Doctorate");
		ch1.add("Post-Doctorate");
		
		EDUCATION=new Label("EDUCATION");
		EDUCATION.setBounds(50,100,150,30);
		tf1=new TextField("");
		tf1.setBounds(210,100,100,30);
		b1=new Button("ENTER");
		b1.setBounds(400,100,100,30);
		b1.addActionListener(this);
		
		CHOOSE_CITY=new Label("CHOOSE_CITY");
		CHOOSE_CITY.setBounds(50,150,150,30);
		ch2=new Choice();
		ch2.setBounds(210,150,150,150);
		ch2.add("Select");
		ch2.add("Haridwar");
		ch2.add("Meerut");
		ch2.add("Dadri");
		ch2.add("Hapur");
		ch2.add("Dehradun");
		ch2.add("Ranikhet");
		
		CITY=new Label("CITY");
		CITY.setBounds(50,200,150,30);
		tf2=new TextField("");
		tf2.setBounds(210,200,100,30);
		b2=new Button("ENTER");
		b2.setBounds(400,200,100,30);
		b2.addActionListener(this);
		
		
		Clear=new Button("Clear");
		Clear.setBounds(50,400,100,30);
		Clear.addActionListener(this);
		b4=new Button("save");
		b4.setBounds(200,400,100,30);
		b4.addActionListener(this);
		
		add(EDUCATION);
		add(CHOOSE_EDU);
		add(tf1);
		add(b1);
		add(ch1);
		add(CITY);
		add(tf2);
		add(b2);
		add(CHOOSE_CITY);
		add(ch2);
		add(b4);
		add(Clear);
		
		setSize(800,500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			x=ch1.getSelectedItem();
			tf1.setText(String.valueOf(x));
		}
		if(ae.getSource()==b2)
		{
			y=ch2.getSelectedItem();
			tf2.setText(String.valueOf(y));
		}
		if(ae.getSource()==Clear)
		{
			tf1.setText("");
			tf2.setText("");
			ch1.select("Select");
			ch2.select("Select");
		}
	}
	public static void main(String[] args)
	{
		new awt14();
	}
}
		
		
		
		

