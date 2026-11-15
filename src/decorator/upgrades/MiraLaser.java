package decorator.upgrades;

import decorator.armas.Arma;

public class MiraLaser extends Upgrade {

    public MiraLaser(Arma arma) {
        super(arma);
    }

    @Override
    public String getDescricao () {
        return arma.getDescricao() + " + Mira Laser";
    }
}
