class Oiseau extends Animal {
  protected boolean vole = false ; 

 public Oiseau(String s) {
   super(s) ; 
 }

 public void apprendVole() {
   vole = true ; 
 }

 public void dire() {
  if (vole) 
    System.out.println("cui-cui"); 
  else
    System.out.println("piou-piou");
 }
} // Oiseau 
