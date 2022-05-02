package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela1 extends JFrame implements ActionListener {

	private JButton btnenviar;
	private JTextField txtNome;
	private JLabel lblNome;
	private Container ctn;
	public Tela1()
	{
	setSize(300,140);
	setTitle("Eventos em Java Swing");
	ctn = getContentPane();
	ctn.setLayout(null);
	btnenviar = new JButton("Enviar");
	lblNome = new JLabel ("Nome");
	txtNome = new JTextField();
	lblNome.setBounds(10,10,100,25);
	txtNome.setBounds(70,10,200,25);
	btnenviar.setBounds(90,50,80,40);
	ctn.add(btnenviar);
	ctn.add(lblNome);
	ctn.add(txtNome);
	//tratamento do botao
		btnenviar.addActionListener (this);
		
	
	setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Enviar"))
		{
			int num1 = Integer.parseInt(txtNome.getText());
			int num2 = num1+10;
			
			txtNome.setText(Integer.toString(num2));
		}
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tela1 tela = new Tela1();

	}

}
