public class TestHeritageModelisation {
    
    public static void main(String[] args)
    {   
        Carre[] tableau =new Carre[5]; 
        tableau[0] = new Rectangle(5,2.25);
        tableau[1] = new Carre(10);
        tableau[2] = new Carre(8.5);
        tableau[3] = new Rectangle(2.5, 6);
        tableau[4] = new Rectangle(3.3, 7.1);

        for (int i=0; i<5; i++)
        {
            System.out.println(""+ tableau[i] + "J'ai pour abscisse et ordonne : " + tableau[i].getCote());
            System.out.println("Mon perimetre et ma surface sont respectivement : " +  tableau[i].perimetre() + " " + tableau[i].surface());
        }
    }
}
