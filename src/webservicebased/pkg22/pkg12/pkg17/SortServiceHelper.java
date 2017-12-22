/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicebased.pkg22.pkg12.pkg17;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author tarasvolianskyi
 */
public class SortServiceHelper {

    public void startService(String jsonString) {
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            System.out.println("descending " + jSONObject.getBoolean("descending"));
            System.out.println("array " + jSONObject.getJSONArray("array"));
        } catch (JSONException ex) {
            Logger.getLogger(SortServiceHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
