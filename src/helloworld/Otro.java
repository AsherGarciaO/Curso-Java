package helloworld;

public class Otro {
    public static void main(String[] args){
        //Array => arreglo
        //tipo_de_dato[] nombre_variable = new tipo_de_dato[cantidad_de_posiciones];
        /*
        int[] calificaciones = new int[4];
        calificaciones[0] = 8;
        calificaciones[1] = 9;
        calificaciones[2] = 10;
        calificaciones[3] = 9;
        System.out.println(calificaciones[3]);
        System.out.println(calificaciones.length);
        
        int[] calificaciones2 = {8, 9, 10, 9};
        System.out.println(calificaciones2[3]);
        System.out.println(calificaciones2.length);
        
        int[][] matriz = new int[4][2];
        matriz[0][0] = 10;
        matriz[0][1] = 8;
        matriz[1][0] = 7;
        matriz[1][1] = 9;
        matriz[2][0] = 8;
        matriz[2][1] = 10;
        matriz[3][0] = 10;
        matriz[3][1] = 9;
        System.out.println(matriz[2][1]);
        System.out.println(matriz.length);
        
        int[][] matriz2 = {{10, 8}, {7, 9}, {8, 10}, {10, 9}};
        System.out.println(matriz2[2][1]);
        System.out.println(matriz2[0].length);
        
        
        for(int i = 0; i < calificaciones2.length; i++){
            System.out.println("Valor de i: "+i+"; Longitud Del Arreglo: "+calificaciones2.length+";Valor del Arreglo: "+calificaciones2[i]);
        }
        
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[i].length; j++){
                System.out.println("Valor de i: "+i+";Valor de J: "+j+";Valor del Arreglo: "+matriz2[i][j]);
            }
        }*/
        
        char c = 'c';
        String cadena = "  Hola Mundo ";
        cadena.equals("Hola Mundo");
        cadena.endsWith("undo");
        cadena.startsWith("Hola");
        cadena.contains("la Mun");
        System.out.println(cadena.indexOf("M"));
        System.out.println(cadena);
        System.out.println(cadena.trim());
        System.out.println(cadena.replace(" ", "-"));
        String[] arreglo = cadena.split(" ");
        for(int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
    }
}