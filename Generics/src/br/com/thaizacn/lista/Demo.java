package br.com.thaizacn.lista;

import java.util.ArrayList;
import java.util.List;

import br.com.thaizacn.audi.RoadsterTTS;
import br.com.thaizacn.audi.SedanA4;
import br.com.thaizacn.audi.SportbackA3;
import br.com.thaizacn.chevrolet.Camaro;
import br.com.thaizacn.chevrolet.Onix;
import br.com.thaizacn.fiat.Argo;
import br.com.thaizacn.fiat.Uno;

public class Demo {
    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();

        carros.add(new SportbackA3());
        carros.add(new SedanA4());
        carros.add(new RoadsterTTS());

        //Chevrolet
        carros.add(new Camaro());
        carros.add(new Onix());

        //Fiat
        carros.add(new Argo());
        carros.add(new Uno());

        listarCarros(carros);
        listaExtrendsCarro(carros);
        imprimirGeneric(carros);
    }

    public static void listarCarros(List<Carro> carros ){
        System.out.println("Imprimindo lista de carros");
        for(Carro carro : carros){
            System.out.println(carro.getMarca() + "-" + carro.getModelo());
        }
        System.out.println("");
    }

    public static void listaExtrendsCarro(List<? extends Carro> carros){
        System.out.println("Imprimindo classes que extendem carro");
        for(Carro carro : carros){
            System.out.println(carro.getMarca() + "-" + carro.getModelo());
        }
        System.out.println("");
    }

    public static void imprimirGeneric(List<?> lista){
        System.out.println("Imprimindo lista de <qualquer coisa>");
        for(Object st : lista ){
            System.out.println("Qualquer coisa: " + st);
        }
    }
}
