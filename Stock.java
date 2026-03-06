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

    //déclaration des variables
    int choix = 0;
    Scanner sc = new Scanner(System.in);

    //fonction Menu qui affiche le menu principal de l'application
    public void Menu() {

        System.out.println("**************************");
        System.out.println("*    GESTION DE STOCK    *");
        System.out.println("*          1.0           *");
        System.out.println("**************************");
        System.out.println("                          ");
        System.out.println("Que souhaitez vous faire ?");

        do {
            System.out.println("");
            System.out.println("***** SOUHAITEZ VOUS FAIRE AUTRE CHOSE ? *****");
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
            sc.nextLine(); //pour netoyer le buffer

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
                    System.out.println("Merci d'avoir utilisé l'application");
                    break;
            
                default:
                    System.out.println("Mauvais choix. Veuillez saisir un nombre parmis ceux qui sont proposés");
                    break;
            }

            
        } while (choix != 0);

        sc.close();
    }

    //premier sous-menu de l'appli 
    public void tableauDeBord() {
        System.out.println("");
        System.out.println("QUE SOUHAITEZ-VOUS FAIRE EN SUITE ?");
        System.out.println("");
        System.out.println("1. Voir état du stock");
        System.out.println("2. Produit en rupture");
        System.out.println("3. Produit stock faible");
        System.out.println("4. Retour");
        System.out.println("0. Quitter");
        choix = sc.nextInt();
        sc.nextLine();

        do {
            switch (choix) {
                case 1:
                    etatDeStock();
                    break;

                case 2:
                    produitsEnRupture();
                    break;

                case 3:
                    produitStockFaible();
                    break;

                case 4:
                    Menu();
                    break;

                case 0:
                    System.out.println("Merci d'avoir utilisé l'application");
                    break;
            
                default:
                    System.out.println("Mauvais choix. Veuillez saisir un nombre parmis ceux qui sont proposés");
                    break;
            }
            
        } while (choix != 0);
        sc.close();

    }

    //second sous-menu de l'appli
    public void gestionDeProduit() {
        System.out.println("");
        System.out.println("QUE SOUHAITEZ-VOUS FAIRE EN SUITE ?");
        System.out.println("");
        System.out.println("1. Ajouter un produit");
        System.out.println("2. Modifier un produit");
        System.out.println("3. Supprimer un produit");
        System.out.println("4. Rechercher un produit");
        System.out.println("5. Afficher tous les produits");
        System.out.println("6. Retour");
        System.out.println("0. Quitter");
        choix = sc.nextInt();
        sc.nextLine();

             do {
            switch (choix) {
                case 1:
                    ajouterUnProduit();
                    break;

                case 2:
                    modifierUnProduit();
                    break;

                case 3:
                    supprimerUnProduit();
                    break;

                case 4:
                    rechercherUnProduit();
                    break;

                case 5:
                    afficherTousLesProduits();
                    break;

                case 6:
                    Menu();
                    break;

                case 0:
                    System.out.println("Merci d'avoir utilisé l'application");
                    break;
            
                default:
                    System.out.println("Mauvais choix. Veuillez saisir un nombre parmis ceux qui sont proposés");
                    break;
            }
            
        } while (choix != 0);
        sc.close();

    }

    //troisième sous-menu de l'appli
    public void approvisionement() {
         System.out.println("");
        System.out.println("QUE SOUHAITEZ-VOUS FAIRE EN SUITE ?");
        System.out.println("");
        System.out.println("1. Ajouter une entrée de stock");
        System.out.println("2. Historique des entrée");
        System.out.println("3. Retour");
        System.out.println("0. Quitter");
        choix = sc.nextInt();
        sc.nextLine();

        do {
            switch (choix) {
                case 1:
                    ajouterUneEntréeDeStock();
                    break;

                case 2:
                    historiqueDesEntrées();
                    break;

                case 3:
                    Menu();
                    break;

                case 0:
                    System.out.println("Merci d'avoir utilisé l'application");
                    break;
            
                default:
                    System.out.println("Mauvais choix. Veuillez saisir un nombre parmis ceux qui sont proposés");
                    break;
            }
            
        } while (choix != 0);
        sc.close();

    }

    //quatrième sous-menu de l'appli
    public void ventes() {
        System.out.println("");
        System.out.println("QUE SOUHAITEZ-VOUS FAIRE EN SUITE ?");
        System.out.println("");
        System.out.println("1. Nouvelle vente");
        System.out.println("2. Historique des ventes");
        System.out.println("3. Retour produit");
        System.out.println("4. Retour");
        System.out.println("0. Quitter");
        choix = sc.nextInt();
        sc.nextLine();

        do {
            switch (choix) {
                case 1:
                    nouvelleVente();
                    break;

                case 2:
                    historiqueDesVentes();
                    break;

                case 3:
                    retourProduit();
                    break;

                case 4:
                    Menu();
                    break;

                case 0:
                    System.out.println("Merci d'avoir utilisé l'application");
                    break;
            
                default:
                    System.out.println("Mauvais choix. Veuillez saisir un nombre parmis ceux qui sont proposés");
                    break;
            }
            
        } while (choix != 0);
        sc.close();


    }

    //cinquième sous-menu de l'appli
    public void clients() {
        System.out.println("");
        System.out.println("QUE SOUHAITEZ-VOUS FAIRE EN SUITE ?");
        System.out.println("");
        System.out.println("1. Ajouter un client");
        System.out.println("2. Modifier un client");
        System.out.println("3. Supprimer un client");
        System.out.println("4. Rechercher un client");
        System.out.println("5. Afficher tous les clients");
        System.out.println("6. Retour");
        System.out.println("0. Quitter");
        choix = sc.nextInt();
        sc.nextLine();

             do {
            switch (choix) {
                case 1:
                    ajouterUnClient();
                    break;

                case 2:
                    modifierUnClient();
                    break;

                case 3:
                    supprimerUnClient();
                    break;

                case 4:
                    rechercherUnClient();
                    break;

                case 5:
                    afficherTousLesClients();
                    break;

                case 6:
                    Menu();
                    break;

                case 0:
                    System.out.println("Merci d'avoir utilisé l'application");
                    break;
            
                default:
                    System.out.println("Mauvais choix. Veuillez saisir un nombre parmis ceux qui sont proposés");
                    break;
            }
            
        } while (choix != 0);
        sc.close();

    }

    //sixième sous-menu de l'appli
    public void fournisseur() {
        System.out.println("");
        System.out.println("QUE SOUHAITEZ-VOUS FAIRE EN SUITE ?");
        System.out.println("");
        System.out.println("1. Ajouter un fournisseur");
        System.out.println("2. Modifier un fournisseur");
        System.out.println("3. Supprimer un fournisseur");
        System.out.println("4. Rechercher un fournisseur");
        System.out.println("5. Afficher tous les fournisseurs");
        System.out.println("6. Retour");
        System.out.println("0. Quitter");
        choix = sc.nextInt();
        sc.nextLine();

             do {
            switch (choix) {
                case 1:
                    ajouterUnFournisseur();
                    break;

                case 2:
                    modifierUnFournisseur();
                    break;

                case 3:
                    supprimerUnFournisseur();
                    break;

                case 4:
                    rechercherUnFournisseur();
                    break;

                case 5:
                    afficherTousLesFournisseurs();
                    break;

                case 6:
                    Menu();
                    break;

                case 0:
                    System.out.println("Merci d'avoir utilisé l'application");
                    break;
            
                default:
                    System.out.println("Mauvais choix. Veuillez saisir un nombre parmis ceux qui sont proposés");
                    break;
            }
            
        } while (choix != 0);
        sc.close();

    }

    //septièmme sous-menu de l'appli
    public void mouvementDeStock() {
        System.out.println("");
        System.out.println("QUE SOUHAITEZ-VOUS FAIRE EN SUITE ?");
        System.out.println("");
        System.out.println("1. Voir les entrées");
        System.out.println("2. Voir les sorties");
        System.out.println("3. Retour");
        System.out.println("0. Quitter");
        choix = sc.nextInt();
        sc.nextLine();

        do {
            switch (choix) {
                case 1:
                    voirLesEntrées();
                    break;

                case 2:
                    voirLesSorties();
                    break;

                case 3:
                    Menu();
                    break;

                case 0:
                    System.out.println("Merci d'avoir utilisé l'application");
                    break;
            
                default:
                    System.out.println("Mauvais choix. Veuillez saisir un nombre parmis ceux qui sont proposés");
                    break;
            }
            
        } while (choix != 0);
        sc.close();

    }

    //huitième sous-menu de l'appli
    public void rapport() {
        System.out.println("");
        System.out.println("QUE SOUHAITEZ-VOUS FAIRE EN SUITE ?");
        System.out.println("");
        System.out.println("1. Rapport vente");
        System.out.println("2. Rapport achat");
        System.out.println("3. Rapport bénéfice");
        System.out.println("4. Produits les plus vendus");
        System.out.println("5. Produits les moins vendus");
        System.out.println("6. Retour");
        System.out.println("0. Quitter");
        choix = sc.nextInt();
        sc.nextLine();

             do {
            switch (choix) {
                case 1:
                    rapportVente();
                    break;

                case 2:
                    rapportAchat();
                    break;

                case 3:
                    rapportBenefice();
                    break;

                case 4:
                    produitsLesPlusVendus();
                    break;

                case 5:
                    produitsLesMoinsVendus();
                    break;

                case 6:
                    Menu();
                    break;

                case 0:
                    System.out.println("Merci d'avoir utilisé l'application");
                    break;
            
                default:
                    System.out.println("Mauvais choix. Veuillez saisir un nombre parmis ceux qui sont proposés");
                    break;
            }
            
        } while (choix != 0);
        sc.close();

    }
    
    //neuvième sous-menu de l'appli
    public void utilisateur() {
        System.out.println("");
        System.out.println("QUE SOUHAITEZ-VOUS FAIRE EN SUITE ?");
        System.out.println("");
        System.out.println("1. Ajouter un utilisateur");
        System.out.println("2. Modifier un utilisateur");
        System.out.println("3. Supprimer un utilisateur");
        System.out.println("4. Role de l'utilisateur");
        System.out.println("5. Retour");
        System.out.println("0. Quitter");
        choix = sc.nextInt();
        sc.nextLine();

             do {
            switch (choix) {
                case 1:
                    ajouterUnUtilisateur();
                    break;

                case 2:
                    modifierUnUtilisateur();
                    break;

                case 3:
                    supprimerUnUtilisateur();
                    break;

                case 4:
                    roleUtilisateur();
                    break;

                case 5:
                    Menu();
                    break;

                case 0:
                    System.out.println("Merci d'avoir utilisé l'application");
                    break;
            
                default:
                    System.out.println("Mauvais choix. Veuillez saisir un nombre parmis ceux qui sont proposés");
                    break;
            }
            
        } while (choix != 0);
        sc.close();


    }

    public void etatDeStock() {
        System.out.println("mon stock");

    }

    public void produitsEnRupture() {

    }

    public void produitStockFaible() {

    }

    public void ajouterUnProduit() {
        System.out.println("produit ajouté");

    }

    public void modifierUnProduit() {

    }

    public void supprimerUnProduit() {

    }

    public void rechercherUnProduit() {

    }

    public void afficherTousLesProduits() {

    }

    public void ajouterUneEntréeDeStock() {
        System.out.println("une entrée de stock a été ajouté");

    }

    public void historiqueDesEntrées() {

    }

    public void nouvelleVente() {

    }

    public void historiqueDesVentes() {

    }

    public void retourProduit() {

    }

    public void ajouterUnClient() {

    }

    public void modifierUnClient() {

    }

    public void supprimerUnClient() {

    }

    public void rechercherUnClient() {

    }

    public void afficherTousLesClients() {

    }

    public void ajouterUnFournisseur() {

    }
    
    public void modifierUnFournisseur() {

    }

    public void supprimerUnFournisseur() {

    }

    public void rechercherUnFournisseur() {

    }

    public void afficherTousLesFournisseurs() {

    }

    public void voirLesEntrées() {

    }

    public void voirLesSorties() {

    }

    public void rapportVente() {

    }

    public void rapportAchat() {

    }

    public void rapportBenefice() {

    }

    public void produitsLesPlusVendus() {

    }

    public void produitsLesMoinsVendus() {

    }

    public void ajouterUnUtilisateur() {

    }

    public void modifierUnUtilisateur() {

    }

    public void supprimerUnUtilisateur() {

    }

    public void roleUtilisateur() {

    }
}

