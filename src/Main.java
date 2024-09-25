import javax.swing.*;

public class Main {
    /*
    Écrire un programme qui demande à un utilisateur le rayon d'un cercle.
    Ensuite, le programme demande à l'utilisateur de taper:
    • "p" si il souhaite obtenir le périmètre
    • "A" si il souhaite obtenir l'aire
    En fonction du choix, le programme calcule et affiche la valeur adéquate.
    Pour toute autre lettre tapée par l'utilisateur, le programme affiche un message indiquant les instructions décrites ci-dessus.
    Contrainte imposée: utiliser la structure "switch"
     */
    public static void main(String[] args) {
        boolean isOn = true;
        while (isOn) {
            JOptionPane.showMessageDialog(null, "Bienvenue dans le programme de calculs d'aire et de périmètre d'un cercle. ✅");
            String [] menu = {"Calculer le périmètre d'un cercle", "Calculer l'aire d'un cercle", "Quitter le programme"};
            String choixMenu =(String) JOptionPane.showInputDialog(null, "Veuillez faire un choix parmis les propositions suivantes","menu", JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            switch (choixMenu) {
                case "Calculer le périmètre d'un cercle":{
                    double rayonCercle = InterractionsUtilisateur.demanderDouble("Veuillez saisir le rayon du cercle:");
                    double resultat = Operations.calculerPerimetreCercle(rayonCercle);
                    String message = String.format("Le périmètre d'un cercle de rayon '%.2f' vaut '%.2f%n'", rayonCercle, resultat);
                    JOptionPane.showMessageDialog(null, message);
                }
                break;
                case "Calculer l'aire d'un cercle":{
                    double rayonCercle = InterractionsUtilisateur.demanderDouble("Veuillez saisir le rayon du cercle:");
                    double resultat = Operations.calculerAireCercle(rayonCercle);
                    String message = String.format("L'aire d'un cercle de rayon '%.2f' vaut '%.2f%n'", rayonCercle, resultat);
                    JOptionPane.showMessageDialog(null, message);
                }
                break;
                case "Quitter le programme":{
                    isOn = false;
                }
                break;
            }
        }
    }
}
