package main;

public class Arreglos {
    public static void main(String[] args){
        int[] calificaciones = new int[5];
        int[] calificaciones1 = {10, 10, 4, 7, 9};
        
        calificaciones[0] = 9;
        calificaciones[1] = 10;
        calificaciones[2] = 5;
        calificaciones[3] = 7;
        calificaciones[4] = 8;
        //System.out.println(calificaciones[0]);
        
        
        for(int o : calificaciones){
            System.out.println(o);
        }
        System.out.println("\n");
        for(int i = 0; i < calificaciones1.length; i++){
            System.out.println(calificaciones1[i]);
        }
        System.out.println("\n");
        int i = 0;
        while(i < calificaciones.length){
            System.out.println(calificaciones[i]);
            i++;
        }
    }
}