package decorator.upgrades;

import decorator.armas.Arma;

public class MunicaoIncendiaria extends Upgrade {

    public MunicaoIncendiaria(Arma arma) throws IllegalAccessException {
        super(arma);

        if (getNome().equals("Bazuca")) {
            throw new IllegalAccessException("Upgrade Incompatível");
        }
    }

    @Override
    public String getDescricao () {
        return getDescricao() + " + Munição Incendiária";
    }

}
