package it.epicode.BE_W7_D3.esercizio2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    private List<Autore> autore;
    private String titolo;
    private double prezzo;
    private List<Sezione> sezioni;
    public List<Pagina> getPagine() {
        return sezioni.stream()
                .flatMap(sezione -> sezione.getPagine().stream())
                .toList();
    }

    public List<Autore> getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public List<Sezione> getSezioni() {
        return sezioni;
    }

    public void setAutore(List<Autore> autore) {
        this.autore = autore;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setSezioni(List<Sezione> sezioni) {
        this.sezioni = sezioni;
    }

    public int getNumeroPagine() {
        return getPagine().size();
    }
    @Override
    public String toString() {
        return "Libro{" +
                "autore=" + autore +
                ", titolo='" + titolo + '\'' +
                ", prezzo=" + prezzo +
                ", sezioni=" + sezioni +
                '}';
    }
}
