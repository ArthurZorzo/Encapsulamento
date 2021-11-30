/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento;

/**
 *
 * @author IFSC
 */
public class Agenda {
    //Atributos
    private int dia;
    private int mes;
    int ano;
    private String anotacao;
    
    void anote(int d, int m, String mensagem){
        dia = d;
        mes = m;
        anotacao = mensagem;
        validaData();
    }
    
    private void validaData(){
        if((dia<1)||(dia>31)||(mes < 1)||(mes > 12)){
            dia = 0;
            mes = 0;
            System.out.println("Anotação não inserida, use uma data valida");
        }
    }
    
    public void mostraAnotacao(){
        System.out.println(dia+"/"+mes+" "+anotacao);
    }
}