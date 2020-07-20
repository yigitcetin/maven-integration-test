package it;

import org.junit.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class SwaggerIT {
    @Test
    public void CheckHttpStatus() throws IOException {
        URL url = new URL("http://generator.swagger.io/api/swagger.json");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int code = connection.getResponseCode();

        System.out.println("Status code of the object is " + code);
        if (code == 200) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }
}