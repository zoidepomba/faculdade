import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.*;

public class PrimeiraTela extends JFrame {
	
	private JButton btnenviar;
	private JTextField txtNome;
	private JLabel lblNome;
	private Container ctn;
	public PrimeiraTela()
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
	
	setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeiraTela tela = new PrimeiraTela();
	}

}
