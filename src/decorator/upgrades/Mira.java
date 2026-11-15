package decorator.upgrades;

import decorator.armas.Arma;

public class Mira extends Upgrade {

    public Mira (Arma arma) {
        super(arma);
    }

    @Override
    public String getDescricao () {
        return arma.getDescricao() + " + Mira";
    }
}
