/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IT20B;

/**
 *
 * @author admin
 */
public class LinearSearch {

    public static int search(int arr[], int target){
        for (int i = 0; i < arr.length; i++){
        if (arr[i] == target){
        return i;
            }
     }
        return -1; 
    }
    
            
    public static void main(String[] args) {
      int arr[] = { 10, 30, 20 ,50 };
      int target = 50;
      int result = search(arr , target);
       
        if ( result >= 0 ) {
         System.out.println("Found at index: " + result + " = " + arr[result]);
        } else { System.out.println("Element not found");
        }
    }
    
}
