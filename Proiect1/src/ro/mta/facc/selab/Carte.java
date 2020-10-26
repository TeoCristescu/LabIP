package ro.mta.facc.selab;

public class Carte {
    private String titlu;
    private String autor;
    private int anaparritie;
    private int numarpagini;

    public Carte(String titlu, String autor, int anaparritie, int numarpagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.anaparritie = anaparritie;
        this.numarpagini = numarpagini;
    }



    @Override
    public String toString() {
        return this.titlu+" scrisa de " +this.autor +" a fost publicata in anul " + this.anaparritie + " \n ";

    }
}
