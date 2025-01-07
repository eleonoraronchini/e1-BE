public class Esercizio3 {
    public static void main(String[] args) {

        System.out.println("Il perimetro del rettangolo è: "+perimetroRettangolo(5,10));
        System.out.println("Il numero passato come parametro è" +pariDispari(4));
        System.out.println("L'area del triangolo è:" + areaTriangolo(2.3,4.1,5));
    }
    public static double perimetroRettangolo (double l1,double l2){
      return 2*(l1+l2);
    }
    public static int pariDispari (int num){
    return num % 2;
    }
    public static double areaTriangolo(double l1, double l2, double l3){
        double semiPerimetro = (l1+l2+l3)/2;
        double area = Math.sqrt(semiPerimetro * (semiPerimetro-l1) * (semiPerimetro-l2) * (semiPerimetro-l3));
        return area;
    }
}
