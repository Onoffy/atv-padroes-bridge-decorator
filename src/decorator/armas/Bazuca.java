package decorator.armas;

public class Bazuca implements Arma {

    @Override
    public String getNome() {
        return "Bazuca";
    }

    @Override
    public int getDano() {
        return 67;
    }

    @Override
    public String getDescricao() {
        return "De fato, é uma bazuca. Ela atira e o inimigo faz BOOM.";
    }

}
