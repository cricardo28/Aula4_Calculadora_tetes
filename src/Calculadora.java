
import exception.DivisaoPorZeroException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DeliverIT
 */
class Calculadora {

    public Calculadora() {
    }
    
    public Double doSoma(Double numeroUm,Double numeroDois) {
        if (numeroUm == null || numeroDois == null){
            throw new NullPointerException();
        }
        
        return numeroUm + numeroDois;
    }
    
    public Double doSubtracao(Double numeroUm,Double numeroDois) {
        if (numeroUm == null || numeroDois == null){
            throw new NullPointerException();
        }
        
        return numeroUm - numeroDois;
    }
    
     public Double doMultiplicacao(Double numeroUm,Double numeroDois) {
        if (numeroUm == null || numeroDois == null){
            throw new NullPointerException();
        }
        
        return numeroUm * numeroDois;
    }
     
      public Double doDivisao(Double numeroUm,Double numeroDois) {
        if (numeroUm == null || numeroDois == null){
            throw new DivisaoPorZeroException("Número inválido");          
            
        }
        
        return numeroUm / numeroDois;
    }
}
