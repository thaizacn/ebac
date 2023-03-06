package br.com.thaizacn.chevrolet;

import br.com.thaizacn.lista.Carro;

public abstract class Chevrolet implements Carro {
    @Override
    public String getMarca() {
        return "Chevrolet";
    }
}
