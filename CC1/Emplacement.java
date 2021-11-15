import java.lang.reflect.Array;

//Nom: XIROUCHAKIS,  Prenom: Alexandros,  Groupe: TP6
// paquetage anonyme (i.e. pas de paquetage)

class Emplacement {
    //  à compléter I.1
         public static char[] MIN_MAX_LIGNES = {'A','F'};  // lignes de A à F 
         public static char[] MIN_MAX_COL  = {'1','5'} ;    // colonnes de 1 à 5 
         public String REPERE_INCONNU = "REPERE INCONNU";  // référence inconnue
         public String repere = REPERE_INCONNU;  	// 2 caractères : une lettre et un chiffre 
                    // dans les limites données 
                    // ou REPERE_INCONNU
      
        public static String info () {
            
        }
    
        private static boolean dansLimites(char val, char[] minMax) {
        // minMax qui contient les 2 valeurs limites autorisées
        // renvoie true si val dans les limites données par minMax
        
            // à compléter I.3
            for (int i = (int)minMax[0]; i <= (int)minMax[1]; i++){
                if(val==i) return true;
            }    
            return false;    
            
        }
     
            
        public static boolean repereOK(String repere) {
        // vrai si longueur=2 et 
        // si les 2 lettres dans leurs limites respectives 
            
            return (repere.length()==2 && dansLimites(repere.charAt(0), MIN_MAX_LIGNES) && dansLimites(repere.charAt(1), MIN_MAX_COL)? true : false;
        }
    
        public void setRepere(String repere) {
            // à compléter I.5
        }
        
        public Emplacement(String repere) {
            if (repereOK(repere)) this.repere=repere;

        }
            
        public Emplacement(char ligne, char colonne) {
            // à compléter I.6 b)
            
            this(ligne + colonne);
        }
            
        public String toString() {
            return repereOK(this.repere)? repere :  "Emplacement invalide";
        }
    
        public double distance(Emplacement autre) {
            // à compléter I.9
        }
    }
    