package decorator.upgrades;

import decorator.armas.Arma;

public class MunicaoExplosiva extends Upgrade {

    public MunicaoExplosiva(Arma arma) throws IllegalAccessException {
        super(arma);

        if (getNome().equals("Bazuca")) {
            throw new IllegalAccessException("Upgrade Incompatível");
        }
    }

    @Override
    public String getDescricao () {
        return getDescricao() + " + Munição Explosiva";
    }

}
