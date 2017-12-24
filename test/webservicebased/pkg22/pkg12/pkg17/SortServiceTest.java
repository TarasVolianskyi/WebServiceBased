/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicebased.pkg22.pkg12.pkg17;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tarasvolianskyi
 */
public class SortServiceTest {

    public SortServiceTest() {
    }

    @Test
    public void testSortAsc() {
        int[] myListForSort = {1, 9, 2, 3, 4, 7};
        int[] mySortedList = {1, 2, 3, 4, 7, 9};

        SortService sortService = new SortService(myListForSort);
        sortService.sort(SortService.ASC);

        assertArrayEquals(mySortedList, myListForSort);
    }

    @Test
    public void testSortDesk() {
        int[] myListForSort = {1, 9, 2, 3, 4, 7};
        int[] mySortedList = {9, 7, 4, 3, 2, 1};

        SortService sortService = new SortService(myListForSort);
        sortService.sort(SortService.DESK);

        assertArrayEquals(mySortedList, myListForSort);
    }

    @Test
    public void testSort() {
        int[] myListForSort = SortService.createNewArray(6, 9);
        int[] mySortedList = Arrays.copyOf(myListForSort, myListForSort.length);

        Arrays.sort(mySortedList);

        SortService sortService = new SortService(myListForSort);
        sortService.sort(SortService.ASC);

        assertArrayEquals(mySortedList, myListForSort);
    }

    @Test
    public void testSortMillion() {
        int[] myListForSort = SortService.createNewArray(100000, 1000);
        int[] mySortedList = Arrays.copyOf(myListForSort, myListForSort.length);

        Arrays.sort(mySortedList);

        SortService sortService = new SortService(myListForSort);
        sortService.sort(SortService.ASC);

        assertArrayEquals(mySortedList, myListForSort);
    }

}
