package DesafioFinal_MinhasMusicas.Modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + "é considerado absoluto e preferido por todo mundo");
        }

        else{
            System.out.println(audio.getTitulo() + "Também é um dos que todo mundo está curtindo");
        }
    }
}
