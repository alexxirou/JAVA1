public class Carre { // implantation
    protected double c = 0;
    
    public Carre(double c)
    {
        this.c=c;   
    }

     public double getCote()
    {
        return this.c;
    }

    public void setCote(double c)
    {
        this.c=c;
    }

    public double perimetre()
    {
        return (this.c*4);
    }

    public double surface(){
        return (this.c*this.c);
    }


    public String toString()
    {
        return "Je suis un carre. ";
    }
}
/*
public class Carre extends Rectangle { // modélisation
    //dx=dy
    

    public Carre(double dx)
    {
        super(dx,dx);
    }
    
    public double getCote()
    {
        return this.getdx();
    }

    public void setCote(double c)
    {
        this.dy=this.setdy(c);
    }
    
    public double setdy(double dy)
    {   this.dx = dy;
        this.dy = dy;
        return this.dy;
    }

    public double setdx(double dx)
    {   this.dx = dx;
        this.dy = dx;
        return this.dx;    
    }

    public String toString()
    {
        return "Je suis un carre. ";
    }
}*/