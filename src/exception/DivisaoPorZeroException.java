/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author DeliverIT
 */
public class DivisaoPorZeroException extends RuntimeException {
    /**
     * importante caso a exceção seja serializada
     */
    private static final long serialVersionUID = 1149241039409861914L;

    // constrói um objeto DivisaoPorZeroException com a mensagem passada por parâmetro
    public DivisaoPorZeroException(String msg){
        super(msg);
    }

    // contrói um objeto DivisaoPorZeroException com mensagem e a causa dessa exceção, utilizado para encadear exceptions
    public DivisaoPorZeroException(String msg, Throwable cause){
        super(msg, cause);
    }
}
