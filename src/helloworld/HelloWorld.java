package helloworld;

public class HelloWorld {
    //Funciones
    //F(x) = x^2+x-10 eR  ->  nombreFuncion(varible) = {...}
    //modificador de acceso: public | protected | private
    //modificar estatico
    //int valorSuma = suma(6, 7);
    //int valorSuma = suma(valorSumando1, valorSumando2);
    
    public static int suma(int a, int b){
        int c = a + b;
        
        return c;
    }
    
    //Sobre carga de métodos es crear una funcion con el mismo nombre que otra
    //ya existente, cambiando la cantidad de parametros que la nueva recive
    //o cambiando los tipos de datos que recibe la funcion respecto a la incial
    public static int suma(int a, int b, int d){
        int c = a + b + d;
        
        return c;
    }
    
    public static double suma(double a, double b, double d){
        double c = a + b + d;
        
        return c;
    }
    
    public static void main(String[] args) {
        //Imprimir en consola:
        
        //Tipos de variables primitivas:
        
        //Enteros: Integer
        int contador = 0;
        
        //Boleanos (Verdaderos y Falsos) true|false
        boolean verificacion = false;
        
        //double y float (decimales)
        float valorDecimalCorto = 1.789f;
        double valorDecimal = 1.056789;
        
        //Caracteres char
        char caracter = 'c';
        
        //Tipos de variables complejas:
        
        //Cadenas de texto (String)
        String string = "Hola Como Se encuentran Alumnos de Atex";
        
        
        //Operadores
        //Aritmeticos + - * / % | ++ -- += -= *= /= |(int, float, double)
        int numero1 = 8, numero2 = 3;
        int numero3 = numero1 % numero2;
        //System.out.println(numero3);
        
        //  |numero3 = numero3 + 1;| = |numero3 += 1;| = |numero3++;|
        //  |numero3 = numero3 - 1;| = |numero3 -= 1;| = |numero3--;|
        //  |numero3 = numero3 * 1;| = |numero3 *= 1;|
        //  |numero3 = numero3 / 1;| = |numero3 /= 1;|
        
        numero3--;
        //System.out.println(numero3);
        /*
            &&: true && true && true => true; true && false && true => false
            ||: true || false || false => true;
        
            //Operadores comparativos
            ==: valida que el valor de la izquierda y la derecha sean iguales
            !=: valida que el valor de la izquierda y derecha sean diferentes
            >: valida que el valor de la izquierda sea mayor al de la derecha
            <: valida que el valor de la derecha sea mayor al de la izquierda
            >=: valida que el valor de la dereche sea mayor o igual al de la izquierda
            <=: valida que el valor de la izquierda sea mayor o igual al de la derecha
            
            String.equals(String); compara que ambas cadenas sean iguales
        
            !boolean: invierte el valor boleano al opuesto: true -> false; false -> true
        */
        
        //Estructuras de control: condificionales If-Else | switch
        int valorA = 6;
        int valorB = 5;
        int valorC = 7;
        boolean condicion = valorA < valorB || valorA >= valorC || valorA != valorC;
        System.out.println(condicion);
        if(condicion){
            int valorZ = 0;
            System.out.println("El valor de la izquierda es mayor al de la derecha");
            System.out.println("El valor de Z es: "+valorZ);
            System.out.println("\n\n");
            if(true){
                int z = 0;
                valorZ++;
            }
            //z = 1;
        }
        else if(condicion){
            System.out.println("El valor de Z será z+1");
            //valorZ++;
            System.out.println("Entramos al else if");
        }
        else{
            System.out.println("El valor de la derecha es mayor al de la izquierda");
        }
        
        
        switch(valorA){
            case 1:
                System.out.println("El valor de a es 1");
                break;
            case 2:
                System.out.println("El valor de a es 2");
                break;
            case 6:
                System.out.println("El valor de a es 6");
                break;
            case 7:
                System.out.println("El valor de a es 7");
                break;
        }
        
        //Estructura de control: bucles while | do-while | for
        int a = 0;
        while(a < 11){
            System.out.println("El valor de a es: "+(a+1)+" en el ciclo numero: "+a);
            if(a == 6){
                break;
            }
            a++;
        }
        
        //a = 0;
        do{
            System.out.println("El valor de a es: "+(a+1)+" en el ciclo numero: "+a);
            a++;
        }while(a < 10);
        
        for(a = 0; a < 10; a++){
            System.out.println("El valor de a es: "+(a+1)+" en el ciclo numero: "+a);
        }
        
        System.out.println("\n\n");
        //Llamar Funciones
        int valorSumando1 = 6, valorSumando2 = 4;
        int valorSuma = suma(valorSumando1, valorSumando2, 8);
        System.out.println(valorSuma);
        double valorSumaD = suma(1.5, 4.0, 0.5);
        System.out.println(valorSumaD);
    }
}