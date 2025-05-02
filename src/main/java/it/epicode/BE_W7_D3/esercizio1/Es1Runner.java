package it.epicode.BE_W7_D3.esercizio1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Order(1)
public class Es1Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("ESERCIZIO 1:");
        Info info = new Info("Mario", "Rossi", new Date(1990, 1, 1));
        InfoAdapter infoAdapter = new InfoAdapter(info);
        UserData userData = new UserData();
        userData.getData(infoAdapter);
        StampaDataSource.stampaInfo(infoAdapter);
        StampaDataSource.stampaInfo(userData);
        System.out.println("-----------------------------------");

    }
}
