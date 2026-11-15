package decorator.upgrades;

import decorator.armas.Arma;

public class CanoLongo extends Upgrade {

    public CanoLongo (Arma arma) throws IllegalAccessException {
        super(arma);

        if (getNome().equals("Bazuca")) {
            throw new IllegalAccessException("Upgrade Incompatível");
        }
    }

    @Override
    public String getDescricao () {
        return getDescricao() + " + Cano Longo";
    }

}
