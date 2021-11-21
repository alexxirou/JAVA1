public class SuiteGeom extends Suite {

    public SuiteGeom(int premier, int pas){
        super(premier,pas);
    }

    public int valeurAuRang(int rang)
    {
        return (int)(this.premier * Math.pow((this.pas),(rang - 1)));
    }


    public int sommeAuRang(int rang)
    {
        return (int)((this.premier * (1- Math.pow(this.pas, rang)))/(1 - this.pas));
    }    
    
}
