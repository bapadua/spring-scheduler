package br.com.bapadua.scheduler.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerConfig {

    /**
     * Executa de 30 em 30 segundos
     * os parametros são
     * seg min hr dia mes ano
     * (*) = todos
     */
    @Scheduled(cron = "0/30 * * * * *")
    public void exec() {
        System.out.println("Executando task");
    }
}
