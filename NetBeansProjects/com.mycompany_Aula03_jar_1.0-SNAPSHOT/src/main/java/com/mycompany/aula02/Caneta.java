
package com.mycompany.aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("O modelo da caneta: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("A caneta está tampada? " + this.tampada);
        System.out.println("O número da ponta da caneta é: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
            
        }else{
            System.out.println("Pode rabiscar");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
