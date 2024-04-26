package robert.vinnsla;

/******************************************************************************
 * @author Róbert A. Jack
 * Tölvupóstur: ral9@hi.is
 * Lýsing : Vinnslu klasi fyrir reiknivélar forritið mitt. Skilgreinir tölu og
 * ýmsar reikniaðferðir.
 *
 *****************************************************************************/
public class Tala {
    public int tala;

    public Tala(int tala){
        this.tala=tala;
    }
    public Tala plus(Tala a, Tala b){
        int samlagning = a.getTala() + b.getTala();
        return new Tala(samlagning);
    }
    public Tala minus(Tala a, Tala b){
        int fradrattur = a.getTala() - b.getTala();
        return new Tala(fradrattur);
    }
    public Tala margfoldun(Tala a, Tala b){
        int margfoldun = a.getTala() * b.getTala();
        return new Tala(margfoldun);
    }
    public int getTala() {
        return tala;
    }
    public void setTala(int a){
        this.tala = a;
    }
}
