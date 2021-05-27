package ConexaoBD;
    import java.util.ArrayList;
    import javax.swing.table.AbstractTableModel;

public class MostrarTabela extends AbstractTableModel{
    private ArrayList linhas = null; //Armazena dados
    private String[] colunas = null; //Armazena nomes das colunas
    
    public MostrarTabela(ArrayList lin,String[] col){
        setLinhas(lin); //Pega a quantidade de linhas
        setColunas(col); //Pega a quantidade de colunas
    }
    
    /**
     * 
     * @return the linhas 
     */
    public ArrayList getLinhas(){
        return linhas;
    }
    
    /**
     * 
     * @param linhas the linhas to set 
     */
    public void setLinhas(ArrayList linhas){
        this.linhas = linhas;
    }
    
    /**
     * 
     * @return the colunas 
     */
    public String[] getColunas(){
        return colunas;
    }
    
    /**
     * 
     * @param colunas the colunas to set
     */
    public void setColunas(String[] colunas){
        this.colunas = colunas;
    }
    
    public int getColumnCount(){
        return getColunas().length;
    }
    
    public int getRowCount(){
        return getLinhas().size();
    }
    
    public String getColumnName(int numCol){
        return getColunas()[numCol];
    }
    
    //Monta a tabela com a quantidade de linhas e colunas//
    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
}
