import com.example.michelinrestaurantguide.Restaurant;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFromJson {
    private String fileName;

    public void readJson() {
        try {

            JSONParser jsonParser = new JSONParser();

            Object obj = jsonParser.parse(new FileReader(this.fileName));

            JSONArray jsonArray = (JSONArray) obj;

            List<Restaurant> restaurants = new ArrayList<>();

            for (Object jsonElement : jsonArray) {
                JSONObject jsonObject = (JSONObject) jsonElement;

                Restaurant restaurant = new Restaurant(
                        (String) jsonObject.get("name"),
                        (String) jsonObject.get("url"),
                        (String) jsonObject.get("location"),
                        (String) jsonObject.get("cuisine"),
                        (String) jsonObject.get("address")
                );

                restaurants.add(restaurant);
            }

            for (Restaurant restaurant : restaurants) {
                System.out.println("Name: " + restaurant.getName());
                System.out.println("URL: " + restaurant.getUrl());
                System.out.println("Location: " + restaurant.getLocation());
                System.out.println("Cuisine: " + restaurant.getCuisine());
                System.out.println("Address: " + restaurant.getAddress());
                System.out.println("--------------------");
            }

        } catch (Exception e)  {
            System.out.println("Error!!!" + e);
        }

    }

}
