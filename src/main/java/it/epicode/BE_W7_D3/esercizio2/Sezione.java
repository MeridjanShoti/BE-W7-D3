package it.epicode.BE_W7_D3.esercizio2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sezione {
    private String titolo;
    private List<Pagina> pagine;
    private List<Sezione> sottoSezioni;
    public List<Pagina> getPagine() {
        List<Pagina> pagineTotali = new ArrayList<>();
        if (sottoSezioni != null && !sottoSezioni.isEmpty()) {
            pagineTotali.addAll(sottoSezioni.stream()
                    .flatMap(sezione -> sezione.getPagine().stream())
                    .toList());
        }
        if (pagine != null && !pagine.isEmpty()) {
            pagineTotali.addAll(pagine);
        }
        return pagineTotali;
    }
}
