public class TestAnimaux {
  public static void main(String[] args) {
    Animal a = new Animal("Joe");
    Oiseau o = new Oiseau("le piaf");
    Perroquet p = new Perroquet("Coco");
    Animal [] tab = new Animal[5];
    tab[0] = a;
    tab[1] = o ;
    tab[2] = p ;
    tab[3] = new Oiseau("Birdy");
    tab[4] = new Perroquet("Roger");
    for (int i = 0; i<5 ; i++) {
       tab[i].dire();
    }
   } // main
}
