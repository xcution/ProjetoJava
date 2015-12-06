
package exception;

import java.io.Serializable;

public class ExceptionLoja extends Exception implements Serializable{
    private static final long serialVersionUID = 1L;

    public ExceptionLoja(){
        super("Ocorreu um erro desconhecido!");
        
    }
    public ExceptionLoja(String msg){
        super(msg);
        
    }
}
