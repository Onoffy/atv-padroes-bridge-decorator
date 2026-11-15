package bridge.notificacoes;

import bridge.canais.CanalNotificacao;

public class NotificacaoUrgente extends Notificacao {

    public NotificacaoUrgente(CanalNotificacao canal) {
        super(canal);
    }

    @Override
    public void enviar (String mensagem) {
        canal.enviar("URGENTE - " + mensagem);
    }

}
