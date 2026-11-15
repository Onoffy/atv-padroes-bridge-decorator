package bridge.notificacoes;

import bridge.canais.CanalNotificacao;

public class NotificacaoCobranca extends Notificacao {

    public NotificacaoCobranca(CanalNotificacao canal) {
        super(canal);
    }

    @Override
    public void enviar (String mensagem) {
        canal.enviar("COBRANÇA - " + mensagem);
    }

}
