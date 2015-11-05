/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.exception;

/**
 *
 * @author silvioghedin
 */
public class LojaException extends Exception{
    public LojaException(){
        super("Ocorreu um erro desconhecido!");
    }
    public LojaException(String msg){
        super(msg);
    }
}
