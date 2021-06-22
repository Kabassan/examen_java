public class Service implements IEmploye{
    private int id;
    private String libelle;
    private int nbreEmploye;
    private Employe employe = new Employe();



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public Service(int id,String libelle){
        this.id=id;
        this.libelle=libelle;
    }
    public int getNbreEmploye() {
        return nbreEmploye;
    }

    public void setNbreEmploye(int nbreEmploye) {
        this.nbreEmploye = nbreEmploye;
    }


    @Override
    public String affiche() {
        return "\n id : " + getId()
                + "\n libelle : " + getLibelle();
    }

    @Override
    public String compare() {
        return null;
    }
    private Employe[] tableEmploye = new Employe[5];
    public void addEmployer(Employe employe){
        tableEmploye[nbreEmploye]=employe;
        nbreEmploye++;
    }
}
