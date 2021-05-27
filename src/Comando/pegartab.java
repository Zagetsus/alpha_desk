package Comando;


public class pegartab {
    private static String cid;
    private static String cst;
    private static String idU;
    private static boolean al = false;
            
    public static String getcid(){
        //retorna o nome guardado//
        return cid;
    }
    
    public static void setcid(String value){
        //nome vai recebr um valor//
        cid = value;
    }
    
    public static String getcst(){
        //retorna o nome guardado//
        return cst;
    }
    
    public static void setcst(String value){
        //nome vai recebr um valor//
        cst = value;
    }
    
    public static String getidU(){
        //retorna o nome guardado//
        return idU;
    }
    
    public static void setidU(String value){
        //nome vai recebr um valor//
        idU = value;
    }
    
    public static boolean getal(){
        //retorna o nome guardado//
        return al;
    }
    
    public static void setal(boolean value){
        //nome vai recebr um valor//
        al = value;
    }
}
