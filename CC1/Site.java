// Nom: XIROUCHAKIS,  Prenom: Alexandros,  Groupe: TP6
// paquetage anonyme

class Site {
    // à compléter : II.1
        static private int total ; 	// nombre d'instances crées
        public final int id;		// identifiant unique calculé automatiquement
        public Emplacement lieu;
        public String nom;
    
        public Site(String nom, Emplacement lieu) {
                // à compléter II.2 a)
                total++;
                this.nom=nom;
                this.lieu=lieu;
                this.id=total;
        }
    
        public Site(String nom, String emplacement) {
            
            this(nom, new Emplacement(emplacement));
        }
        
        public Site(String nom,  char planLigne, char planCol) {
            this(nom, new Emplacement(planLigne, planCol));
        }
        
        public String toString() {
            // à compléter II.3
            return this.id + " sur  " + total + " " + this.nom + ", Repere : " + this.lieu;
        }
        
        public double distance (Site autre) {
            // à compléter II.4
            return this.distance(autre);
        }
    }
    