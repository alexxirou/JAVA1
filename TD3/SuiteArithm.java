public class SuiteArithm extends Suite {

    public SuiteArithm(int premier, int pas){
        super(premier,pas);
    }

    public int valeurAuRang(int rang)
    {
        return this.premier + ((rang-1)*this.pas);
    }


    public int sommeAuRang(int rang)
    {
        return ((this.premier + this.valeurAuRang(rang))*rang)/2;
    }
}
