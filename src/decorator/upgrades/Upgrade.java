package decorator.upgrades;

import decorator.armas.Arma;

public abstract class Upgrade implements Arma {

    protected Arma arma;

    public Upgrade (Arma arma) {
        this.arma = arma;
    }

    @Override
    public String getNome() {
        return arma.getNome();
    }

    @Override
    public int getDano() {
        return arma.getDano();
    }

    @Override
    public String getDescricao() {
        return arma.getDescricao();
    }

}
