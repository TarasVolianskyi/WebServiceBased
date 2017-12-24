/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicebased.pkg22.pkg12.pkg17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/**
 *
 * @author tarasvolianskyi
 */
public class SortService implements Callable<JSONObject> {

    public static final int ASC = 1;
    public static final int DESK = 2;

    private int[] myListSort;

    public SortService(int[] myListSort) {
        this.myListSort = myListSort;
    }

    public int[] sort(int typeOfSort) {
        //TODO add type of sort
        //Arrays.sort(myListSort);

       // SortingMethods.bubble_srt(myListSort);
        SortingMethods se = new SortingMethods();
        se.sort(myListSort);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SortService.class.getName()).log(Level.SEVERE, null, ex);
        }
        //doSelectionSort(myListSort);
        //doInsertionSort(myListSort);
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

    @Override
    public JSONObject call() throws Exception {
        //TODO add type of sort
        JSONObject result = new JSONObject();
        //Arrays.sort(myListSort);
        SortingMethods.bubble_srt(myListSort);
        //doSelectionSort(myListSort);
        //doInsertionSort(myListSort);
        result.put("result", myListSort);
        return result;
    }

}
