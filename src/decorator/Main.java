package decorator;

import decorator.armas.Arma;
import decorator.armas.Bazuca;
import decorator.armas.Metralhadora;
import decorator.armas.Pistola;
import decorator.upgrades.Baioneta;
import decorator.upgrades.MiraLaser;
import decorator.upgrades.Silenciador;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {

        Arma pistola = new Pistola();

        pistola = new Silenciador(pistola);

        Arma bazuca = new Bazuca();

        bazuca = new MiraLaser(bazuca);

        Arma metralhadora = new Metralhadora();

        metralhadora = new Baioneta(metralhadora);

        System.out.println("-----ARMAS-----");

        System.out.println(pistola.getNome());
        System.out.println(pistola.getDescricao());
        System.out.println("Dano: " + pistola.getDano());

        System.out.println("---");

        System.out.println(bazuca.getNome());
        System.out.println(bazuca.getDescricao());
        System.out.println("Dano: " + bazuca.getDano());

        System.out.println("---");

        System.out.println(metralhadora.getNome());
        System.out.println(metralhadora.getDescricao());
        System.out.println("Dano: " + metralhadora.getDano());


    }

}
