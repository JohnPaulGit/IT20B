/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRELIM;

/**
 *
 * @author admin
 */
public class Multi_Dimensional_Array {
    public static void main(String[] args) {
        int numbers[][] = {
            {41, 44, 48},
            {71, 74, 78},
            {81, 84, 88}
        };
        
        for (int i = 0; i < numbers.length; i++) {      
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
                
            }
            System.out.println("");
        }
    }
    
}
