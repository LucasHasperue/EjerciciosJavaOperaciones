package MainOperacion;

import Entidades.Operacion;

public class CalculoOperacion {

    public static void main(String[] args) {
        Operacion op = new Operacion();
        double suma;
        op.crearOperacion();
        suma = op.sumar();
        System.out.println("la suma es: " + op.sumar());
        System.out.println("La resta es: " + op.restar());
        if (op.multiplicar()!=0) {
            System.out.println("La multiplicacion es: " + op.multiplicar());
        }
        if (op.dividir()!=0) {
            System.out.println("La division es: " + op.dividir());
        }

    }
}
