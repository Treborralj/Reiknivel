package robert.vinnsla;

/******************************************************************************
 * @author Róbert A. Jack
 * Tölvupóstur: ral9@hi.is
 * Lýsing : Vinnslu klasi fyrir reiknivélar forritið mitt. Skilgreinir tölu og
 * ýmsar reikniaðferðir.
 *
 *****************************************************************************/
public class Tala {
    public double tala;

    public Tala(double tala){
        this.tala=tala;
    }
    public Tala plus(Tala a, Tala b){
        double samlagning = a.getTala() + b.getTala();
        return new Tala(samlagning);
    }
    public Tala minus(Tala a, Tala b){
        double fradrattur = a.getTala() - b.getTala();
        return new Tala(fradrattur);
    }
    public Tala margfoldun(Tala a, Tala b){
        double margfoldun = a.getTala() * b.getTala();
        return new Tala(margfoldun);
    }
    public Tala deiling(Tala a, Tala b){
        double deiling = a.getTala() / b.getTala();
        return new Tala(deiling);
    }
    public Tala rot(Tala a){
        return new Tala(Math.sqrt(a.getTala()));
    }
    public Tala veldi(Tala a, Tala b){
       double veldi = Math.pow(a.getTala(), b.getTala());
       return new Tala(veldi);
    }
    public double getTala() {
        return tala;
    }
    public void setTala(int a){
        this.tala = a;
    }
}
