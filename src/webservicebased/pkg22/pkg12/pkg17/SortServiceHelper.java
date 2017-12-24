/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicebased.pkg22.pkg12.pkg17;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author tarasvolianskyi
 */
public class SortServiceHelper {

    private ExecutorService executorService;

    public SortServiceHelper() {
        executorService = Executors.newFixedThreadPool(1);
    }

    public JSONObject startService(String jsonString) {
       JSONObject resultJSONObject = null;
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            System.out.println("descending " + jSONObject.getBoolean("descending"));
            System.out.println("array " + jSONObject.getJSONArray("array"));

            SortService sortService = new SortService(new int[]{1, 5, 3, 8, 9});
            sortService.sort(SortService.ASC);
            Future<JSONObject> futureJsonObj = executorService.submit(sortService);
            resultJSONObject=futureJsonObj.get();
            //TODO transfer elements from jsonobj from str to int
        } catch (JSONException ex) {
            Logger.getLogger(SortServiceHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(SortServiceHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(SortServiceHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultJSONObject;
    }

}
