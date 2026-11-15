package bridge.notificacoes;

import bridge.canais.CanalNotificacao;

public class NotificacaoSimples extends Notificacao {

    public NotificacaoSimples (CanalNotificacao canal) {
        super(canal);
    }

    @Override
    public void enviar (String mensagem) {
        canal.enviar(mensagem);
    }

}
