package gestion;

/** Ceci est une minie application qui aidera
 * l'utilisateur à effectuer la gestion
 * de stock de son entreprise
 * application codée par
 * @author : Arthuro Synthé
 * @version 1.0
 */

import java.util.Scanner;

public class Stock {

    Scanner sc = new Scanner(System.in);

    public void Menu() {
        int choix = 0;

        System.out.println("**************************");
        System.out.println("*    GESTION DE STOCK    *");
        System.out.println("*          1.0           *");
        System.out.println("**************************");
        System.out.println("                          ");
        System.out.println("Que souhaitez vous faire ?");

        do {
            System.out.println("");
            System.out.println("1. Tableau de bord");
            System.out.println("2. Gestion de produit");
            System.out.println("3. Approvisionement");
            System.out.println("4. Ventes");
            System.out.println("5. Clients");
            System.out.println("6. Fournisseur");
            System.out.println("7. Mouvement de stock");
            System.out.println("8. Rapport");
            System.out.println("9. Utilisateurs");
            System.out.println("0. Quitter");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    tableauDeBord();
                    break;

                case 2:
                    gestionDeProduit();
                    break;

                case 3:
                    approvisionement();
                    break;

                case 4:
                    ventes();
                    break;

                case 5:
                    clients();
                    break;

                case 6:
                    fournisseur();
                    break;

                case 7:
                    mouvementDeStock();
                    break;

                case 8:
                    rapport();
                    break;

                case 9:
                    utilisateur();
                    break;

                case 0:
                    System.out.println("Merci d'avoir utilisé l'application");;
                    break;
            
                default:
                    System.out.println("Mauvais choix. Veuillez saisir un nombre parmis ceux qui sont proposés");
                    break;
            }

            
        } while (choix != 0);

        sc.close();
    }

    public void tableauDeBord() {
        System.out.println("un tableau");

    }

    public void gestionDeProduit() {

    }

    public void approvisionement() {

    }

     public void ventes() {

    }

     public void clients() {

    }

     public void fournisseur() {

    }

     public void mouvementDeStock() {

    }

     public void rapport() {

    }

     public void utilisateur() {

    }
    
}
