import java.util.Scanner;
import java.lang.Math;

public class calcular {
    public static void main(String[] args) {

        int number1, number2;

        double base, altura;

        int radioCirculo;

        boolean mayorminusresult;

        Scanner digitarEntrada = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Ejemplo creado por: Adolfo Sánchez Lopéz");
        System.out.println(" ");
        System.out.println("::: BIENVENIDOS A EL PEPESOFT INTERNATIONAL SOLUTIONS :::");
        System.out.println(" ");
        System.out.println("(1) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma,  resta, multiplicación, división.");
        System.out.println("* Ingrese el 1er numero para calcular operaciones basicas");
        number1 = digitarEntrada.nextInt();
        System.out.println("* Ingrese el 2do numero para calcular operaciones basicas");
        number2 = digitarEntrada.nextInt();
        System.out.println(" ");
        System.out.println("- Respuesta enunciado (1)");
        System.out.println("Suma: " + (number1+number2));
        System.out.println("Resta: " + ((number1)-(number2)));
        System.out.println("Multiplicacion: " + (number1*(number2)));
        System.out.println("Division: " + (number1/(number2)));
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("(2) Realizar un programa que me permita calcular el área de un triangulo");
        System.out.println("* Ingrese el valor de la base en cm");
        base = digitarEntrada.nextDouble();
        System.out.println("* Ingrese el valor de la altura en cm");
        altura = digitarEntrada.nextDouble();
        System.out.println(" ");
        System.out.println("- Respuesta enunciado (2)");
        System.out.println("El area del triangulo es: " + ((base*altura)/2) + "cm al cuadrado");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("3) Realizar un programa que me permita calcular el área de un círculo");
        System.out.println("* Ingrese el valor del radio del circulo en cm");
        radioCirculo = digitarEntrada.nextInt();
        System.out.println(" ");
        System.out.println("- Respuesta enunciado (3)");
        System.out.println("El area del circulo es: " + (Math.PI * Math.pow(radioCirculo, 2) + " cm al cuadrado"));
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("4) Realizar un programa que me permita recibir 2 números y me diga cuál es el número mayor o si ambos son iguales");
        System.out.println("* Ingrese el 1er numero para calcular operaciones");
        number1 = digitarEntrada.nextInt();
        System.out.println("* Ingrese el 2do numero para calcular operaciones mayor, menor y igual");
        number2 = digitarEntrada.nextInt();
        System.out.println(" ");
        System.out.println("- Respuesta enunciado (4)");
        System.out.println("¿El numero " + number1 + " es mayor que el " + number2 + "?");
        System.out.println(mayorminusresult = number1 > number2);
        System.out.println(" ");
        System.out.println("¿El numero " + number1 + " es menor que el " + number2 + "?");
        System.out.println(mayorminusresult = number1 < number2);
        System.out.println(" ");
        System.out.println("¿El numero " + number1 + " es igual que el " + number2 + "?");
        System.out.println(mayorminusresult = number1 == number2);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("5) Realizar un programa que me permita recibir x número y me diga si es par o impar");
        System.out.println("* Ingrese el 1er numero para calcular si es par o impar");
        number1 = digitarEntrada.nextInt();
        System.out.println(" ");
        System.out.println("- Respuesta enunciado (5)");
        if ((number1 % 2) == 0) {
        System.out.println("El numero " + number1 + " es par");
        } else {
        System.out.println("El numero " + number1 + " es impar");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("6) Dependiendo el dia de la semana, indique si el dia es laboral o no");
        System.out.println("1 = Lun, 2 = Mar, 3 = Mie, 4 = Jue, 5 = Vie, 6 = Sab, 7 = Dom");
        System.out.println("* Ingrese el numero del dia del 1 al 7 para saber si es laboral o no");
        number1 = digitarEntrada.nextInt();
        System.out.println(" ");
        System.out.println("- Respuesta enunciado (5)");
        if ((number1 == 1)){
            System.out.println("El numero " + number1 + " es par");
            } else {
                System.out.println("El numero " + number1 + " es impar");
        }



    }
}
}
