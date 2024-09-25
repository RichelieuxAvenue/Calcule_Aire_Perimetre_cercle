import javax.swing.*;

public class InterractionsUtilisateur {

    public static double demanderDouble(String prompt){
        boolean valeurValide = false;
        double nombre = 0.0;
        while(!valeurValide){
            try{
                nombre = Double.parseDouble(JOptionPane.showInputDialog(null, prompt));
                valeurValide = true;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "🛑La valeur est incorrecte, Veuillez saisir un nombre.🛑");
            }
        }
        return nombre;
    }
}
