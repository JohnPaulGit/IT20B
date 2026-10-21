/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IT20B;


public class BinarySearch {


    public static int search(int arr[], int target){
int left = 0;
int right = arr.length -1;

while(left <= right ){
int mid = ( left + right ) / 2;

if (arr[mid] == target) {
return mid;
}   else if (arr[mid] > target ){
left = mid + 1; 
} else {
    right = mid -1;
    }
   }
return -1;
 }
public static void main(String[] args) {
        int arr[] = {10 , 20, 70 ,80};
       
        int result = search(arr, 20);
        
      if ( result >= 0 ) {
         System.out.println("Found at index: " + result + " = " + arr[result]);
        } else { System.out.println("Element not found");
        }
    }
    
}
