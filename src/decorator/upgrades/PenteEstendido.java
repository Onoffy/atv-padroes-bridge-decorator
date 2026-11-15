package decorator.upgrades;

import decorator.armas.Arma;

public class PenteEstendido extends Upgrade {

    public PenteEstendido (Arma arma) throws IllegalAccessException {
        super(arma);

        if (getNome().equals("Bazuca")) {
            throw new IllegalAccessException("Upgrade incompatível");
        }
    }

    @Override
    public String getDescricao () {
        return arma.getDescricao() + " + Pente Estendido";
    }

}
