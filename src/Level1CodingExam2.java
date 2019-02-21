import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1CodingExam2 implements ActionListener {

	JFrame window = new JFrame(" animal noises ");
	JPanel panal = new JPanel();
	JButton button1 = new JButton("llama");
	JButton button2 = new JButton("Cat");
	JButton button3 = new JButton("Cow");
	JButton button4 = new JButton("Duck");
	JButton button5 = new JButton("Dog");
	
	public static void main(String[] args) {
		Level1CodingExam2 sounds = new Level1CodingExam2();
		
		sounds.code();
		
		
	}
	
	void code() {
		window.setVisible(true);
		window.add(panal);
		panal.add(button1);
		panal.add(button2);
		panal.add(button3);
		panal.add(button4);
		panal.add(button5);
		
		button1.addActionListener( this);
		button2.addActionListener( this);
		button3.addActionListener( this);
		button4.addActionListener( this);
		button5.addActionListener( this);
		
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		
	window.pack();}
	
	 public void playNoise(String soundFile) {
			try {
				AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
				sound.play();
				Thread.sleep(3400);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub  
		
		
		if (button1 == e.getSource()) {
			playNoise( "llama.wav") ;
		}
		if (button2 == e.getSource()) {
			playNoise( "meow.wav") ;
		}
		 if (button3 == e.getSource()) {
			playNoise( "moo.wav") ;
		}
		 if (button4 == e.getSource()) {
			playNoise( "quack.wav") ;
		}
		 if (button5 == e.getSource()) {
			playNoise( "woof.wav") ;
		}
	}
	 
	 
	 
}
