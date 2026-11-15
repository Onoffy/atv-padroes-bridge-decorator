package decorator.upgrades;

import decorator.armas.Arma;

public class Baioneta extends Upgrade {

    public Baioneta (Arma arma) throws IllegalAccessException {
        super(arma);

        if (!(getNome().equals("Metralhadora"))) {
            throw new IllegalAccessException("Upgrade Incompatível");
        }
    }
    @Override
    public String getDescricao () {
        return arma.getDescricao() + " + Baioneta";

    }

}
