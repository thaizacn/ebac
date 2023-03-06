package br.com.thaizacn.audi;

import br.com.thaizacn.lista.Carro;

public abstract class Audi implements Carro {
    @Override
    public String getMarca() {
        return "Audi";
    }
}
