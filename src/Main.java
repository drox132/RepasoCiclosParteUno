import com.sun.source.tree.IfTree;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Main {


    public static void main(String[] args) {


/*
        for (int i = 1; i >= 1; i = +2) {

                int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numer entero"));


            if (numero % 10 == 0) {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es multiplo de 10");
            } else JOptionPane.showMessageDialog(null, "El numero " + numero + " no es multiplo de 10");
        }




        int indice=0;

        while (indice<=10){
            System.out.println(indice);
            indice++;
        }



        //EJERCICIO N°1



        int numero,cuadrado;

        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        while (numero>=0){
            cuadrado= (int)Math.pow(numero,2);
            JOptionPane.showMessageDialog(null,"El cuadrado del numero es: "+cuadrado);
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        }


        //EJERCICIO N°2


            int numero;
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

            while (numero!=0){
                if (numero>0){
                    JOptionPane.showMessageDialog(null,"El numero es positivo");
                }else{
                    JOptionPane.showMessageDialog(null,"El numero es Negativo");
                }
                numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            }



        //EJERCICIO N° 3
        //LEER NUMROS HASTA QUE SE INTRODUZCA UNCERO, PARA CADA UNO INDICAR SI ES PAR O IMPAR

        int numero;

        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        while (numero!=0){
            if (numero%2==0){
                JOptionPane.showMessageDialog(null,"El numero es Par");
            }else{
                JOptionPane.showMessageDialog(null,"El numero es Impar");

            }
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        }


        //EJERCICIO N°5
        //REAIZAR UN JUEGO PARA ADIVINAR UN NUMERO, PARA ELLO GENERAR UN NUMERO
        //ALEATORIO ENTRE O-100 Y LUEGO IR PIDIENDO NUMEROS INDICANDO ES MAYOR
        //O MENOR CON RESPECTO A N, EL PROCESO TERMINA CUANDO EL USUARIO ACIERTA
        //Y MONTRAS EL NUMERO DE INTENTOS

        int contadorIntentos=0;
        int numeroUsuario;
        int numeroAleatorio = (int) Math.floor(Math.random() * 100);


        do {
            numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            if (numeroUsuario < numeroAleatorio) {
                System.out.println("Ingrese un numero mayor");
            } else {
                System.out.println("Ingrese un numero menor");
            }
            contadorIntentos++;

        } while (numeroUsuario!=numeroAleatorio);
        System.out.println("Felicidades acertaste en: "+contadorIntentos+" intentos");


*/

        //EJERCICIO N° 6
        //PEDIR NUMROS HASTA QUE SE TECLEE UN 0
        //MOSTRAR LA SUMA DE TODOS LOS NUMEROS INTRODUCIDOS
        //

        int numero;
        int sumatoriaAcumulada=0;

        do {

            int numeroBase= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero cuantas veces guste, " +
                    "\n que sea distinto a cero ya que cuando digite cero finalizara el" +
                    "\n programa y se sumaran todos los numers ingresados "));
            if (numeroBase==0){JOptionPane.showMessageDialog(null,"La sumatoria de todos los numeros es 0");}
            do {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

                sumatoriaAcumulada = numeroBase+ numero + sumatoriaAcumulada;

            } while (numero != 0);

            JOptionPane.showMessageDialog(null,"la sumatoria de todos los numeos ingresados es: "
                    + sumatoriaAcumulada);

        }while(numero==0 );





        }

    }

