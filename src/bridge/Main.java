package bridge;

import bridge.canais.Email;
import bridge.canais.Sms;
import bridge.canais.Whatsaap;
import bridge.notificacoes.Notificacao;
import bridge.notificacoes.NotificacaoCobranca;
import bridge.notificacoes.NotificacaoSimples;
import bridge.notificacoes.NotificacaoUrgente;

public class Main {

    public static void main(String[] args) {

        Notificacao simples = new NotificacaoSimples(new Email());
        Notificacao urgente = new NotificacaoUrgente(new Sms());
        Notificacao cobranca = new NotificacaoCobranca(new Whatsaap());

        simples.enviar("Bem-vindo ao sistema!");
        urgente.enviar("STRANGER THAN HEAVEN postou trailer novo!");
        cobranca.enviar("Sua fatura de R$8.000.000,00 está pendente!");

    }

}
