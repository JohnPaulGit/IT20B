/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRELIM;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Testing {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.addFirst(0);
        numbers.addLast(5);
        numbers.add(2, 2);
        numbers.add(3);
        numbers.add(3, 4);
        numbers.add(6);
        numbers.remove(6);
        
        System.out.print(numbers);
        System.out.println("");
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());
        for(int i =0; i<numbers.size(); i++){
            System.out.print(numbers.get(i) + "  ");
        }
        System.out.println("\n");
        
        System.out.println("NEW STUFF");
        
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.addFirst("Cedenio");
        names.addLast("Paul");
        names.add(3, "THE GOAT");
        
        System.out.print(names);
    names.clear();
        System.out.println("    ");
        System.out.println(names);
    
    }

}
