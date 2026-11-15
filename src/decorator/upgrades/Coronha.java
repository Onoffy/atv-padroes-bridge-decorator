package decorator.upgrades;

import decorator.armas.Arma;

public class Coronha extends Upgrade {

    public Coronha (Arma arma) throws IllegalAccessException {
        super(arma);

        if (!arma.getNome().equals("Metralhadora")) {
            throw new IllegalAccessException("Upgrade Incompatível");
        }
    }

    @Override
    public String getDescricao () {
        return getDescricao() + " + Coronha";
    }

}
