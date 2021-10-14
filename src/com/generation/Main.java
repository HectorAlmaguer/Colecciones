package com.generation;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*String Universidades[];
        Universidades = new String[5];
        Universidades[0]="ITVH";
        Universidades[1]="ULA";
        Universidades[2]="UAM";
        Universidades[3]="UADM";
        Universidades[4]="UNAM";
        //Universidades[5]="UPN";
        //Universidades[6]="IPN";
        //Universidades[7]="TESCO";

        for(String universidad:Universidades){
            System.out.println(universidad);
            }
            */
        /*
        Set<String> frutas = new HashSet();
        frutas.add("Mango");
        frutas.add("Kiwi");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Melon");
        for(String fruta:frutas){
            System.out.println(fruta);
        }
        System.out.println("--------------------------------------");
        Set<String> frutas2 = new TreeSet();
        frutas2.add("Mango");
        frutas2.add("Kiwi");
        frutas2.add("Fresa");
        frutas2.add("Pera");
        frutas2.add("Uva");
        frutas2.add("Melon");
        for(String fruta:frutas2){
            System.out.println(fruta);
        }
        System.out.println("--------------------------------------");
        Set<String> frutas3 = new LinkedHashSet<>(4);
        frutas3.add("Mango");
        frutas3.add("Kiwi");
        frutas3.add("Fresa");
        frutas3.add("Pera");
        frutas3.add("Uva");
        frutas3.add("Melon");
        for(String fruta:frutas3){
            System.out.println(fruta);
        }*/
        /*
        System.out.println("--------------------------------------");
        List<String> frutas4 = new ArrayList<>();
        //si admite duplicados
        frutas4.add("Mango");
        frutas4.add("Kiwi");
        frutas4.add("Fresa");
        frutas4.add("Pera");
        frutas4.add("Uva");
        frutas4.add("Melon");
        for(String fruta:frutas4){
            System.out.println(fruta);
        }
        System.out.println("--------------------------------------");
        System.out.println(frutas4.get(3));
        int indice = frutas4.indexOf("Melon");
        System.out.println(frutas4.get(indice));
        */
        /*
        System.out.println("--------------------------------------");
        List<String> frutas5 = new LinkedList<>();
        frutas5.add("Mango");
        frutas5.add("Kiwi");
        frutas5.add("Fresa");
        frutas5.add("Pera");
        frutas5.add("Uva");
        frutas5.add("Melon");
        for(String fruta:frutas5){
            System.out.println(fruta);
        }*/
        Map<Integer,String> universidades = new HashMap<Integer,String>();
        universidades.put(1,"IPN");
        universidades.put(2,"UNAM");
        universidades.put(3,"UAEM");
        universidades.put(4,"UAM");
        universidades.put(5,"TESCO");

        for (Map.Entry<Integer, String> universidad : universidades.entrySet()) {
            System.out.println("clave=" + universidad.getKey() + ", valor=" + universidad.getValue());
        }
        System.out.println(universidades.get(3));
    }
    }
