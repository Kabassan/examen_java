public class Traitement {
    private final int TAILLE = 10;
    private int nombreEmployeReel;
    private int nombreServiceReel;
    Employe[] tableauEmploye = new Employe[TAILLE];
    Service[] tableauService = new Service[TAILLE];

    public boolean createEmploye(Employe employe){
        if (nombreEmployeReel < TAILLE){
            tableauEmploye[nombreEmployeReel]=employe;
            nombreEmployeReel++;
        }
        else {
            System.out.println("Table d'employé plein  ");
        }
        return true;
    }
    public boolean createService(Service service){
        if (nombreServiceReel < TAILLE){
            tableauService[nombreServiceReel]=service;
            nombreServiceReel++;
        }
        else {
            System.out.println("Table de service plein  ");
        }
        return true;
    }
    public Employe searchEmploye(int id){
        for (Employe employe : tableauEmploye){
            if (employe != null){
                if (employe.getId() == id){
                    return employe;
                }
            }
        }
        return null;
    }
    public  Service seachService(int id){
        for (Service service : tableauService){
            if (service!=null){
                if (service.getId()== id){
                    return service;
                }
            }
        }
        return null;
    }
    public boolean listerEmployer(Employe employe){
            if (employe != null){
                System.out.println(employe.affiche());
            }

        return true;
    }
    public boolean listerService(Service service){
            if (service != null){
                System.out.println(service.affiche());
            }

        return true;
    }

}
