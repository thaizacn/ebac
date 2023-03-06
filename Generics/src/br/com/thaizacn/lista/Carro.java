package br.com.thaizacn.lista;

public interface  Carro {
    public abstract String getMarca();

    public default String getModelo(){
        return "Modelo";
    }
}
