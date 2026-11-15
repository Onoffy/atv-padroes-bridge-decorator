package decorator.upgrades;

import decorator.armas.Arma;

public class CargaRapida extends Upgrade {

    public CargaRapida (Arma arma) {
        super(arma);
    }

    @Override
    public String getDescricao () {
        return arma.getDescricao() + " + Carga Rápida";
    }

}
