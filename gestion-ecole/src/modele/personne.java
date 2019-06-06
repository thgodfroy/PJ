package modele;

public class personne {
	
	private String nom, prenom, type;

    public personne(String nom, String prenom, String type) {
    	
        this.nom = nom;
        this.prenom = prenom;
        this.type=type;
    }
    
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    
    public String getType() {
        return type;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return nom + " " + prenom;
    }

}
