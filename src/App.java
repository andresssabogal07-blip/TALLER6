import java.util.Scanner;
import java.math.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System. in);

        
        
            
        

        /* 
        int opcion;

        do{
            System.out.println("\n===MENU===");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Ganaste 1M de oportunidades");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            if (opcion == 1){
                System.out.println("Hola!");
            }
            else if (opcion == 2){
                System.out.println("Hasta luego!");
            }
            else if (opcion == 3){
                System.out.println("Felicidades! Ganaste 1M de oportunidades");
            }
        } while (opcion != 0);

        System.out.println("Programa terminado.");
        sc.close();


        /* 
        int edad = -1;

        while (edad < 0 || edad > 120){
            System.out.print("Ingrese su edad (0-120): ");
            edad = sc.nextInt();
            if (edad < 0 || edad > 120){
                System.out.println("Edad invalida, intente de nuevo.");
            }
        }

        System.out.println("edad registrada: "+ edad);
        sc.close();

        /* 
        int contador = 1;

        while (contador <= 5){
            System.out.println("Vuelta numero" + contador);
            contador++;
        }


        /*  
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0) continue;
            System.out.println(i);
        }





        /* 
        for (int i = 1; i <= 10; i++){
            if (i == 6) break;
            System .out.println(i);
        }





        /* 
    for ( int fila = 1; fila <= 4; fila++){
        for (int col = 1; col <= 4; col++){
            System.out.print("* ");
        }
        System.out.println();
    }
    


       /* 
        for (int i = 0; i <= 20; i+=2){
            if (i % 2 == 0){
                System.out.println(i);
            } 
     }
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Número 1: ");
        double num1 = sc.nextDouble();

        System.out.println("Operación: (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.println("Número 2: ");
        double num2 = sc.nextDouble();

        double resultado = 0;

        switch (op) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                 resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operación no valida");
       }
         sc.close();
         System.out.println(resultado);




        /*
        int edad2 = 12;
        String mensaje = (edad2 >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(mensaje);


        Scanner sc = new Scanner(System.in);
        String nombreDia;
        System.out.println("Ingresa el número del día: ");
        int numeroDia = sc.nextInt();

        switch (numeroDia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5: 
                nombreDia = "Viernes";
                break;
            case 6: 
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Día no vaido";
                break;
       }

         sc.close();
         System.out.println(nombreDia);
        */


        /*Área del circulo
        double pi = Math.PI;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo: ");
        double radioCirculo = sc.nextDouble();

        double areaCirculo = Math.pow(radioCirculo, 2) * pi;

        System.out.println("El área del circulo es: " + areaCirculo);

        sc.close();
        */

        
        /*Mayor o menor de edad
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edadIngresada = sc.nextInt();

        if (edadIngresada < 18) {
            System.out.println("Eres menor de edad");
        }
        else {
            System.out.println("Eres mayor de edad");
        }

        sc.close();
        */


        /*Promedio de notas 
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa la Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.println("Ingresa la Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.println("Ingresa la Nota 3: ");
        double nota3 = sc.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("El promedio de las notas es: " + promedio);


        if (promedio >= 90){
            System.out.println("Excelente");;
        }
        else if (promedio >= 70){
            System.out.println("Bueno");
        }
        else if (promedio >= 60){
            System.out.println("Aprobado");
        }
        else{
            System.out.println("Reprobado");
        }

        sc.close();
        */
     

        /*Área del rectangulo
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa la altura: ");
        double altura = sc.nextDouble();

        System.out.println("Ingresa la base: ");
        double base = sc.nextDouble();

        double area = base * altura;

        System.out.println("El area del rectangulo es: " + area);

        sc.close();
        */
        

        /*Saludo personalizado
        Scanner sc = new Scanner (System.in);

        System.out.println("¿Cómo te llamas? ");
        String nombre = sc.nextLine();

        System.out.println("¿Cuántos años tienes? ");
        int edad = sc.nextInt();

        System.out.println("Hola " + nombre + ". Tienes " + edad    + " años");

        sc.close();
        */


        /*
        int a = 10, b = 3, edad = 20;
        boolean mayorDeEdad = true, tieneCarnet = false;
        

        System.out.println("Operadores basicos");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(10.0 / 3);

        System.out.println("Operadores abreviados");
        System.out.println(a+=5);
        System.out.println(a-=3);
        System.out.println(a*=2);
        System.out.println(a/=4);
        System.out.println(a++);
        System.out.println(a--);

        System.out.println("Operadores de comparación");
        System.out.println(edad == 20);
        System.out.println(edad != 18);
        System.out.println(edad >  18);
        System.out.println(edad < 18);
        System.out.println(edad >= 20);
        System.out.println(edad <= 19);

        System.out.println("Operadores logicos");
        System.out.println(tieneCarnet && mayorDeEdad);
        System.out.println(tieneCarnet || mayorDeEdad);
        System.out.println(!mayorDeEdad);
        */
    }
}
