package decorator.armas;

public class Metralhadora implements Arma {

    @Override
    public String getNome() {
        return "Metralhadora";
    }

    @Override
    public int getDano() {
        return 20;
    }

    @Override
    public String getDescricao() {
        return "De fato, é uma metralhadora. Ela atira e o inimigo faz A A A A A A A A A.";
    }

}
