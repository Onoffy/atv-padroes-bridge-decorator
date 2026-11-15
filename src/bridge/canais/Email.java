package bridge.canais;

public class Email implements CanalNotificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando E-mail: " + mensagem);
    }

}
