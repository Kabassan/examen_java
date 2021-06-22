import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Traitement traitement = new Traitement();
        int choix;
        do {
            choix = menu();
            switch (choix) {
                case 1:
                    System.out.print("Entrer l'ID : ");
                    String id = scanner.nextLine();
                    Employe employe =traitement.searchEmploye(Integer.parseInt(id));
                    if (employe == null){
                        System.out.print("Entrer le nom complet de l'employe : ");
                        String nomComplet = scanner.nextLine();
                        System.out.print("Entrer la date d'embauche de l'employe : ");
                        String dateEmbauche = scanner.nextLine();
                        employe = new Employe(Integer.parseInt(id),nomComplet,dateEmbauche);
                        System.out.println(traitement.createEmploye(employe));
                    }
                    break;
                case 2:
                    System.out.println("Saisir l'ID de l'employé : ");
                    id = scanner.nextLine();
                    employe = traitement.searchEmploye(Integer.parseInt(id));
                    if (employe !=null){

                        System.out.println("Donnée de l'employe : ");
                        System.out.println(traitement.listerEmployer(employe));
                    }
                    else {
                        System.out.println("l'employe est introuvable");
                    }
                    break;
                case 3:

                    System.out.print("Entrer l'ID : ");
                    id = scanner.nextLine();
                    Service service = traitement.seachService(Integer.parseInt(id));
                    if (service == null){
                        System.out.print("Entrer le libelle de service : ");
                         String lbelle = scanner.nextLine();
                        service = new Service(Integer.parseInt(id),lbelle);
                        System.out.println(traitement.createService(service));
                    }
                    break;
                case 4:
                    System.out.println("Saisir l'ID du service : ");
                    id = scanner.nextLine();
                    service=traitement.seachService(Integer.parseInt(id));
                    if (service!=null){
                        System.out.println("le service est introuvable");
                        System.out.println("Donnée du service : ");
                        System.out.println(traitement.listerService(service));
                    }
                    else {

                    }
                    break;
                case 5:
                    System.out.println("Saisir l'ID du service : ");
                    id = scanner.nextLine();
                    service=traitement.seachService(Integer.parseInt(id));
                    if (service!=null){
                        System.out.println("entrer l'id de l'employer : ");
                        id = scanner.nextLine();
                        System.out.println("entrer le nom complet de l'employer : ");
                        String nomComplet = scanner.nextLine();
                        System.out.println("entrer la date d'embauche ");
                        String dateEbauche = scanner.nextLine();
                        Employe employe1 = new Employe(Integer.parseInt(id),nomComplet,dateEbauche);
                        service.addEmployer(employe1);
                    }
                    break;
                case 6:
                    System.out.println("Saisir l'id du service : ");
                    id = scanner.nextLine();
                    service=traitement.seachService(Integer.parseInt(id));
                    if (service!=null){
                        System.out.println("Donnée du service : ");
                        System.out.println(traitement.listerService(service));
                    }
                    break;
                case 7:
                    System.out.println("VOUZ AVEZ QUITTER LE PROGRAMME");
                    break;
            }
        }
        while (choix != 7);
    }

        public static int menu(){
            int choix;
            System.out.println
                    ("Menu"
                            + "\n 1-Creer un employer"
                            + "\n 2-Lister les employes"
                            + "\n 3-creer un service"
                            + "\n 4-lister les service"
                            + "\n 5-Affecter a un service"
                            + "\n 6-Afficher les employer d'un service"
                            + "\n 7-Quitter");
            System.out.print("Faites votre choix : ");
            choix = Integer.parseInt(scanner.nextLine());
            return choix;
        }


}



