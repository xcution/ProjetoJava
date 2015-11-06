
package loja.exception;

import java.io.Serializable;

public class LojaException extends Exception implements Serializable{
    private static final long serialVersionUID = 1L;

    public LojaException(){
        super("Ocorreu um erro desconhecido!");
        
    }
    public LojaException(String msg){
        super(msg);
        
    }
}
