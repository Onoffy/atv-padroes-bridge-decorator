package decorator.upgrades;

import decorator.armas.Arma;

public class FreioDeBoca extends Upgrade {

    public FreioDeBoca (Arma arma) throws IllegalAccessException {
        super(arma);

        if (getNome().equals("Bazuca")) {
            throw new IllegalAccessException("Upgrade Incompatível");
        }
    }

    @Override
    public String getDescricao () {
        return getDescricao() + " + Freio de Boca";
    }

}
