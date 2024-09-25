public class Operations {
    /*
    1.	Aire d’un cercle :

    A = \pi \times r^2
    Où  A  est l’aire et  r  est le rayon du cercle.

	2.	Périmètre d’un cercle (ou circonférence) :

    C = 2 \times \pi \times r
    Où  C  est le périmètre (circonférence) et  r  est le rayon.
     */
    public static double calculerAireCercle(double rayon){
        return Math.PI * Math.pow(rayon, 2);
    }
    public static double calculerPerimetreCercle(double rayon){
        return 2 * Math.PI * rayon;
    }
}
