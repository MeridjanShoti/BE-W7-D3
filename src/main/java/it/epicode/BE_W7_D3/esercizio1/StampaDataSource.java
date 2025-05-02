package it.epicode.BE_W7_D3.esercizio1;

public class StampaDataSource {
    public static void stampaInfo(DataSource ds) {
        System.out.println("Nome Completo: " + ds.getNomeCompleto());
        System.out.println("Età: " + ds.getEta());
    }
}
