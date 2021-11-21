
public class Rectangle extends Carre { // implantation
    double dy = 0;

    public Rectangle(double dx, double dy)
    {
        super(dx);
        this.dy=dy;
    }

    public double getdx()
    {
        return this.c;
    }

    public double getdy()
    {
        return this.dy;
    }


    public double getCote()
    {       
        this.getdy();
        return this.c; 
    }

    public double setdx(double dx)
    {
        return this.c=dx;
    }
    
    public double setdy(double dy)
    {
        return this.dy=dy;
    }

    public double perimetre()
    {
        return (this.c*2 + this.dy*2);
    }

    public double surface(){
        return (this.c*this.dy);
    }


    public String toString()
    {
        return "Je suis un rectangle";
    }
}
/*

public class Rectangle { // implantation
    protected double dx;
    protected double dy;

    public Rectangle(double dx, double dy)
    {
        this.dx=dx;
        this.dy=dy;
    }

    public double getdx()
    {
        return this.dx;
    }

    public double getdy()
    {
        return this.dy;
    }

    public double setdx(double dx)
    {
        return this.dx=dx;
    }
    
    public double setdy(double dy)
    {
        return this.dy=dy;
    }

    public double perimetre()
    {
        return (this.dx*2 + this.dy*2);
    }

    public double surface(){
        return (this.dx*this.dy);
    }

    public String toString()
    {
        return "Je suis un rectangle. ";
    }
}
*/