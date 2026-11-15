package bridge.canais;

public class Whatsaap implements CanalNotificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando mensagem: " + mensagem);
    }

}
