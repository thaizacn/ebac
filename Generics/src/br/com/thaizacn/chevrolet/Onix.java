package br.com.thaizacn.chevrolet;

public class Onix extends Chevrolet{
    @Override
    public String getModelo() {
        return "Onix";
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }
}
