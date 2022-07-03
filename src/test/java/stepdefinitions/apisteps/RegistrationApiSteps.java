package stepdefinitions.apisteps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Registrant;
import utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;


public class RegistrationApiSteps {


    Response response;
    Registrant [] registrants ;
    @Given("user sends a get request for users' data")
    public void user_sends_a_get_request_for_users_data() {
        response = given().headers(

                "Authorization",
                "Bearer" + ConfigReader.getProperty("api_token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",

                ContentType.JSON
        ).when().get(ConfigReader.getProperty("users_api_url"));


    }

    @Given("user deserializes the useres' data to java")
    public void user_deserializes_the_useres_data_to_java() throws IOException {
        ObjectMapper obj = new ObjectMapper();
        registrants = obj.readValue(response.asString(), Registrant[].class); // this will give us all the records from the app

        System.out.println("Size of the actual elements: " + registrants.length);

        boolean flag = false;

        for(int i = 0; i < registrants.length; i++){
            if("147-25-0613".contains(registrants[i].getSsn()));
            flag = true;
        }
        assertTrue(flag);

    }
       /* for(int i = 0; i < registrants.length; i++){
            System.out.println("name " + (i+1) + ":" +registrants[i].getFirstName());
            System.out.println("lastname " + (i+1) + ":" +registrants[i].getLastName());
        } */



    @Then("user saves the users' data to correspondent files and validates")
    public void user_saves_the_users_data_to_correspondent_files_and_validates() {


    }



}
