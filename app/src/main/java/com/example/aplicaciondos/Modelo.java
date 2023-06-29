package com.example.aplicaciondos;

public class Modelo {


    public Modelo(String dataIncoming){
        this.campo=dataIncoming;
    }
    private String campo;

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }
}
