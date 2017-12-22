/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicebased.pkg22.pkg12.pkg17;

import java.util.Arrays;

/**
 *
 * @author tarasvolianskyi
 */
public class SortService {
    
    public static final int ASC = 1;
    public static final int DESK = 2;
    
    private int[] myListSort;
    
    public SortService(int[] myListSort) {
        this.myListSort = myListSort;
    }
    
    public int[] sort(int typeOfSort) {
        //TODO add type of sort
        //Arrays.sort(myListSort);
        bubble_srt(myListSort);
        return myListSort;
    }
    
    
    
    public void printArray() {
        for (int i = 0; i < myListSort.length; i++) {
            System.out.println(myListSort[i]);
        }
    }
    
    public static int[] createNewArray(int length, int delta) {
        int[] resultArray = new int[length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = (int) (Math.random() * delta);
        }
        
        return resultArray;
    }
    
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
    }
    
}
