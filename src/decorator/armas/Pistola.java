package decorator.armas;

public class Pistola implements Arma {

    @Override
    public String getNome() {
        return "Pistola";
    }

    @Override
    public int getDano() {
        return 2; // Hiro (amigo meu) disse que era pra da 2 de dano, culpe ele
    }

    @Override
    public String getDescricao() {
        return "De fato, é uma pistola. Ela atira e o inimigo faz AAAAAAAAAAAAAAAAAAA.";
    }

}
