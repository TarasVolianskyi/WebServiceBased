/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicebased.pkg22.pkg12.pkg17;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author tarasvolianskyi
 */
public class WebServiceBased221217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (1 == 1) {
            String request = scanner.nextLine();
            SortServiceHelper sortServiceHelper = new SortServiceHelper();
            JSONObject result = sortServiceHelper.startService(request);
            System.out.println(result);
        }

    }

}
