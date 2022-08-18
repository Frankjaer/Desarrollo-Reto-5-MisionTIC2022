
package com.mycompany.reto_5_g59.modelo.VO;

public class Cliente {
    private int id_compra;
    private String Constructora;
    private String Banco;

    public Cliente() {
    }

    public Cliente(int id_compra, String Constructora, String Banco) {
        this.id_compra = id_compra;
        this.Constructora = Constructora;
        this.Banco = Banco;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_compra=" + id_compra + ", Constructora=" + Constructora + ", Banco=" + Banco + '}';
    }
    
    
}
