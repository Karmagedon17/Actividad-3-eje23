package solucionecuacion;

public class calculador {
    public static double calcularSolucion1(double A,double B,double C){
        double solucion1;
        solucion1 = ( (-1*B) + Math.sqrt(B*B-(4*A*C)))/(2*A);
        return solucion1;
    }
    public static double calcularSolucion2(double A,double B,double C){
        double solucion2;
        solucion2 = ( (-1*B) - Math.sqrt(B*B-(4*A*C)))/(2*A);
        return solucion2;
    }    
}
