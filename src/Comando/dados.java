package Comando;


public class dados {
    private static String nome;
    private static String login;
    private static String senha;
    private static String id;
    
    //metodo static pra pegar (get) nome//
    
    public static String getnome(){
        //retorna o nome guardado//
        return nome;
    }
    
    public static void setnome(String value){
        //nome vai recebr um valor//
        nome = value;
    }
    
    public static String getlogin(){
        return login;
    }
    public static void setlogin(String value){
        //nome vai recebr um valor//
        login = value;
    }
    
    public static String getsenha(){
        return senha;
    }
    public static void setsenha(String value){
        //nome vai recebr um valor//
        senha = value;
    }
    
    public static String getcont(){
        return id;
    }
    public static void setcont(String value){
        //nome vai recebr um valor//
        id = value;
    }
    
    
}
