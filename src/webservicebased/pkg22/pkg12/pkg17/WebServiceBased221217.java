/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicebased.pkg22.pkg12.pkg17;

/**
 *
 * @author tarasvolianskyi
 */
public class WebServiceBased221217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* int[] myListForSort = {1, 9, 2, 3, 4, 7};
        int[] myListForSortSecond = {2, 4, 8, 7, 9, 6, 8, 4, 2, 3, 6, 1, 2, 0, 11, 23, 15, 14, 18, 56, 25, 35, 24, 26, 12, 21, 21, 20, 23, 25, 59, 57, 59, 65, 45, 24, 23, 36, 54, 26, 32, 15, 28, 26};
        SortService sortService = new SortService(myListForSort);
        sortService.sort(SortService.ASC);
        sortService.printArray();*/

        SortServiceHelper sortServiceHelper = new SortServiceHelper();
        sortServiceHelper.startService("{\"descending\":false,\"array\":[9,7,3,15]}");

    }

}
