package view;

import javax.swing.JFrame;

public class InterfaceGrafica extends JFrame {
	
	public InterfaceGrafica() {
		setSize(400,500);
		setTitle("Tela Inicial");
		setVisible(true);
	}
	public static void main(String[]args) {
		InterfaceGrafica telaInicial = new InterfaceGrafica();
	}

}
