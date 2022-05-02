import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConexaoBancoDeDados {

	private Connection conexao;
	private final String URL_Bancodedados = "jdbc:mysql://localhost:3306/nomebd";
	private final String usuario = "root";
	private final String senha = "Iftm@123";
	
	public ConexaoBancoDeDados()	{
		try { Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection(URL_Bancodedados,usuario,senha);
			System.out.println("Conexao realizada com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao acessar o banco de Dados!");
		}
	}
	public static void main(String[] args)  {
		ConexaoBancoDeDados objBancoDeDados = new ConexaoBancoDeDados();
		if(objBancoDeDados != null) {
			try { Statement inserir = objBancoDeDados.conexao.createStatement();
				String query = "INSERT INTO pessoa(nome,sobrenome,nivelusuario) VALUES ('Joaquim','Saraiva',1)";
				inserir.execute(query);
				PreparedStatement psInsert = objBancoDeDados.conexao.prepareStatement("INSERT INTO pessoa(nome,sobrenome,nivelusuario) VALUES (?,?,?)");
				psInsert.setString(1, "RENATA");
				psInsert.setString(2, "SILVA");
				psInsert.setInt(3, 3);
				psInsert.execute();
				
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Erro ao acessar o banco de Dados!");
			}
			
			
			try 
			{ Statement comandoconsulta = objBancoDeDados.conexao.createStatement();
			ResultSet resultadoconsultaBD = comandoconsulta.executeQuery("SELECT * FROM pessoa");
			while(resultadoconsultaBD.next()) {
				System.out.println(resultadoconsultaBD.getString("nome")+""+resultadoconsultaBD.getString("sobrenome")+"Nível:"+resultadoconsultaBD.getString("nivelusuario"));
				
			}
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("Erro ao acessar o banco de Dados!");
			}

		}
		
	}

}
