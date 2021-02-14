package mountainmadness2021.ohtheplacesyoullgo.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FlagURL {
    public static void fineFlag(){
        try {
            URL url = new URL("https://www.worldometers.info/geography/flags-of-the-world/");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String inputLine = "";

            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }

            in.close();
//            urlConnection.disconnect();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
//            e.printStackTrace();
        }
    }
}
