package classes;
// Generated 07/05/2018 22:38:49 by Hibernate Tools 4.3.1



/**
 * Transferencia generated by hbm2java
 */
public class Transferencia  implements java.io.Serializable {


     private Integer idTranferencia;
     private Cliente cliente;
     private Conta contaByContaDestino;
     private Conta contaByAgenciaDestino;
     private float valor;

    public Transferencia() {
    }

    public Transferencia(Cliente cliente, Conta contaByContaDestino, Conta contaByAgenciaDestino, float valor) {
       this.cliente = cliente;
       this.contaByContaDestino = contaByContaDestino;
       this.contaByAgenciaDestino = contaByAgenciaDestino;
       this.valor = valor;
    }
   
    public Integer getIdTranferencia() {
        return this.idTranferencia;
    }
    
    public void setIdTranferencia(Integer idTranferencia) {
        this.idTranferencia = idTranferencia;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Conta getContaByContaDestino() {
        return this.contaByContaDestino;
    }
    
    public void setContaByContaDestino(Conta contaByContaDestino) {
        this.contaByContaDestino = contaByContaDestino;
    }
    public Conta getContaByAgenciaDestino() {
        return this.contaByAgenciaDestino;
    }
    
    public void setContaByAgenciaDestino(Conta contaByAgenciaDestino) {
        this.contaByAgenciaDestino = contaByAgenciaDestino;
    }
    public float getValor() {
        return this.valor;
    }
    
    public void setValor(float valor) {
        this.valor = valor;
    }




}


