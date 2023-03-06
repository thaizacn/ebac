package br.com.thaizacn.chevrolet;

public class Camaro extends Chevrolet{
    @Override
    public String getModelo() {
        return "Camaro";
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }
}
