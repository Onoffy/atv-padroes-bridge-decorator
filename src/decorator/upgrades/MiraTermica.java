package decorator.upgrades;

import decorator.armas.Arma;

public class MiraTermica extends Upgrade {

    public MiraTermica(Arma arma) {
        super(arma);
    }

    @Override
    public String getDescricao () {
        return arma.getDescricao() + " + Mira Térmica";
    }
}
