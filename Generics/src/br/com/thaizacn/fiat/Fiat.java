package br.com.thaizacn.fiat;

import br.com.thaizacn.lista.Carro;

public abstract class Fiat implements Carro {
    @Override
    public String getMarca() {
        return "Fiat";
    }
}
