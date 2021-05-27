package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexao {

    private final String driver = "com.mysql.jdbc.Driver";
    private final String database = "alphachamados";
    private final String url = "jdbc:mysql://localhost/alphachamados";
    private final String username = "root";
    private final String password = "";
    public Statement stm;
    public ResultSet rs;
    public Connection conex = null;

    public void conecta() {
        try {
            System.setProperty("jdbc.Drivers", driver);
            conex = DriverManager.getConnection(url, username, password);
            //JOptionPane.showMessageDialog(null,"Conexão realizada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "O banco de dados não foi localizado!" + ex.toString());
        }
    }
    
    public void executaSQL(String sql){
        try{
            stm = conex.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro! executa SQL:\n"+ex.getMessage());
        }
    }
    
    public void desconecta(){
        try{
            conex.close();
            JOptionPane.showMessageDialog(null,"O banco foi desconectado!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao desconectar o Banco de Dados!"+ex.toString());
        }
    }

}
