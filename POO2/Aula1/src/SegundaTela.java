
import javax.swing.JFrame;
import javax.swing.*;

public class PrimeiraTela extends JFrame {
	
	private JButton btnenviar;
	private JTextField txtNome;
	private JLabel lblNome;
	{
	setSize(300,140);
	setTitle("Eventos em Java Swing");
	btnenviar = new JButton("Enviar");
	lblNome = new JLabel ("Nome");
	txtNome = new JTextField();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeiraTela tela = new PrimeiraTela();
	}

}
