package bridge.notificacoes;

import bridge.canais.CanalNotificacao;

public abstract class Notificacao {

    protected CanalNotificacao canal;

    public Notificacao (CanalNotificacao canal) {
        this.canal = canal;
    }

    public abstract void enviar (String mensagem);

}
