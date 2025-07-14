package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {
    public static List<String> groceryList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void startGrocery(){
        while(true){
            System.out.println("Lütfen bir sayı giriniz");
            System.out.println("0 tuşu uygulamayı durudur.");
            System.out.println("1 tuşu Malzeme ekler.");
            System.out.println("2 tuşu Malzeme çıkartır.");
            System.out.println("Alışveriş listeniz uygulama durdurulduğunda gösterilir.");
            int sayi = scanner.nextInt();
            scanner.nextLine();

            if(sayi == 0){
                System.out.println("Uygulama Sonlanıyor");
                printSorted();
                break;
            } else if (sayi == 1){
                System.out.println("Eklenmesini istediğiniz elemanları giriniz. Virgül kullanarak boşluksuz bir şekilde birden fazla eleman girebilirsiniz.");
                String malzemeler = scanner.nextLine();
                addItems(malzemeler);
            } else if (sayi == 2){
                System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                String malzemeler = scanner.nextLine();
                removeItems(malzemeler);
            } else {
                System.out.println("Geçersiz sayı girdiniz.");
            }
        }
    }

    public static  void addItems(String input){
        String[] items = input.split(",");
        for (String item : items){
            if(!groceryList.contains(item)){
                groceryList.add(item);
            }
        }
        Collections.sort(groceryList);
    }

    public static void removeItems(String input){
        String[] items = input.split(",");
        for(String item : items){
            groceryList.remove(item);
        }
        Collections.sort(groceryList);
    }

    public static boolean checkItemIsInList(String product){
        return groceryList.contains(product);
    }

    public static void printSorted(){
        Collections.sort(groceryList);

        for (String elm : groceryList){
            System.out.println(elm);
        }
    }
}