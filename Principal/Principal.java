package DesafioFinal_MinhasMusicas.Principal;

import DesafioFinal_MinhasMusicas.Modelos.MinhasPreferidas;
import DesafioFinal_MinhasMusicas.Modelos.Musica;
import DesafioFinal_MinhasMusicas.Modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setCantor("Jennifer Lopez");
        minhaMusica.setTitulo("Love dont cost a thing ");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha LGBT ");
        meuPodcast.setApresentador("Leona Assassina");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);


    }
}
