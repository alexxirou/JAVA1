public abstract class Suite {
    int premier;
    int pas;

    public Suite(int premier, int pas){
        this.premier= premier;
        this.pas=pas;
    }

    abstract int valeurAuRang(int rang);
    abstract int sommeAuRang(int rang);
    
}

