package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import java.util.ArrayList;


public class Principalcomlistas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8.5);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(7.5);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item:lista){
            System.out.println(item.getNome() + " (" + item.getAnoDeLancamento() + ")");
            System.out.println("Avaliação:" +item.pegaMedia());
        }

        System.out.println("\nLista de títulos:");
        for (Titulo titulo : lista) {
            System.out.println(titulo.getNome() + " (" + titulo.getAnoDeLancamento() + ")");
        }
    }
}
