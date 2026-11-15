package decorator.upgrades;

import decorator.armas.Arma;

public class Silenciador extends Upgrade {

    public Silenciador (Arma arma) throws IllegalAccessException {
        super(arma);

        if (!(arma.getNome().equals("Pistola") || arma.getNome().equals("Metralhadora"))){
            throw new IllegalAccessException("Upgrade incompatível");
        }
    }

    @Override
    public String getDescricao () {
        return arma.getDescricao() + " + Silenciador";
    }

}
