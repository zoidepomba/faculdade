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
	private JButton btnapurar;
	private JTextField txtNome;
	private JTextField txtTotalVotoBranco;
	private JTextField txtTotalVotoCandidato1;
	private JTextField txtTotalVotoCandidato2;
	private JTextField txtTotalVotacao;
	private JLabel lblNome;
	private JLabel lblCandidato;
	private JLabel lblTotal;
	private JLabel lblTotalBranco;
	private JLabel lblCandidato1;
	private JLabel lblCandidato2;
	private JLabel lblNome1;
	private JLabel lblNome2;
	private JLabel lblNome3;
	private Container ctn;
	private int totalVotosBranco = 0;
	private int totalVotosCandidato1 = 0;
	private int totalVotosCandidato2 = 0;
	private int totalvotacao = 0;
	public Tela1()
	{
	setSize(300,340);
	setTitle("Eventos em Java Swing");
	ctn = getContentPane();
	ctn.setLayout(null);
	btnenviar = new JButton("Votar");
	btnapurar = new JButton("Apuracao dos votos");
	lblNome = new JLabel ("Voto:");
	txtNome = new JTextField();
	txtTotalVotoBranco = new JTextField();
	txtTotalVotoCandidato1 = new JTextField();
	txtTotalVotoCandidato2 = new JTextField();
	txtTotalVotacao = new JTextField();
	lblNome.setBounds(10,70,100,25);
	txtNome.setBounds(70,70,50,25);
	txtTotalVotoBranco.setBounds(170,170,30,25);
	txtTotalVotoCandidato1.setBounds(170,190,30,25);
	txtTotalVotoCandidato2.setBounds(170,210,30,25);
	txtTotalVotacao.setBounds(170,150,30,25);
	lblCandidato = new JLabel ("Candidato");
	lblCandidato.setBounds(10,10,100,25);
	lblTotal = new JLabel ("Total de votos");
	lblTotal.setBounds(10,150,250,25);
	lblTotalBranco = new JLabel ("Total em branco");
	lblTotalBranco.setBounds(10,170,350,25);
	lblCandidato1 = new JLabel ("Votos em candidato 1");
	lblCandidato1.setBounds(10,190,250,25);
	lblCandidato2 = new JLabel ("Votos em candidato 2");
	lblCandidato2.setBounds(10,210,250,25);
	lblNome1 = new JLabel ("1 - Joaquim Santos");
	lblNome1.setBounds(110,10,150,25);
	lblNome2 = new JLabel ("2 - Karina Constas");
	lblNome2.setBounds(110,30,150,25);
	lblNome3 = new JLabel ("3 - Voto em Branco");
	lblNome3.setBounds(110,50,150,25);
 	btnenviar.setBounds(200,70,75,25);
 	btnapurar.setBounds(10,120,250,25);
	ctn.add(btnenviar);
	ctn.add(btnapurar);
	ctn.add(lblNome);
	ctn.add(lblCandidato);
	ctn.add(lblNome1);
	ctn.add(lblNome2);
	ctn.add(lblNome3);
	ctn.add(lblTotal);
	ctn.add(lblTotalBranco);
	ctn.add(lblCandidato1);
	ctn.add(lblCandidato2);	
	ctn.add(txtNome);
	ctn.add(txtTotalVotoBranco);
	ctn.add(txtTotalVotoCandidato1);
	ctn.add(txtTotalVotoCandidato2);
	ctn.add(txtTotalVotacao);
	//tratamento do botao
		btnenviar.addActionListener (this);
		btnapurar.addActionListener (this);
		
	
	setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Votar"))
		{
			int numtotalvoto = Integer.parseInt(txtNome.getText());
			if( numtotalvoto == 3) {
				totalVotosBranco = totalVotosBranco + 1;
				totalvotacao = totalvotacao +1;
				txtTotalVotoBranco.setText(Integer.toString(totalVotosBranco));
			}else if( numtotalvoto == 1) {
				totalVotosCandidato1 = totalVotosCandidato1 +1;
				totalvotacao = totalvotacao +1;
				txtTotalVotoCandidato1.setText(Integer.toString(totalVotosCandidato1));
			}else if( numtotalvoto == 2) {
				totalVotosCandidato2 = totalVotosCandidato2 +1;
				totalvotacao = totalvotacao +1;
				txtTotalVotoCandidato2.setText(Integer.toString(totalVotosCandidato2));
			}txtNome.setText("Voto Computado");	
		} if(e.getActionCommand().equals("Apuracao dos votos")) {
			txtTotalVotacao.setText(Integer.toString(totalvotacao));
		}
		
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tela1 tela = new Tela1();

	}

}
