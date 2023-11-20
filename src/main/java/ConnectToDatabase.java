import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;

public class ConnectToDatabase {
    PreparedStatement preparedStatement = null;

    // Load the MySQL driver
    public void makeConnection() throws ClassNotFoundException, SQLException, IOException, ParseException {

        JSONParser parser=new JSONParser();

        Class.forName("com.mysql.jdbc.Driver");

        Connection connect = DriverManager.getConnection("jdbc:mysql://dbhost/database?" + "user=sqluser&password=sqluserpw");

        // PreparedStatements
        preparedStatement = connect.prepareStatement("insert into MichelinRestaurants values (?, ?, ?, ? )");

        Object obj = parser.parse(new FileReader("LosAngeleData.json"));

        JSONObject jsonObject = (JSONObject) obj;

        String name = (String) jsonObject.get("name");
        // Parameters start with 1
        preparedStatement.setString(1, name);

        String url = (String) jsonObject.get("url");
        // Parameters start with 1
        preparedStatement.setString(2, url);

        String location = (String) jsonObject.get("location");
        // Parameters start with 1
        preparedStatement.setString(3, location);

        String cost = (String) jsonObject.get("cost");
        // Parameters start with 1
        preparedStatement.setString(4, cost);

        String cuisine = (String) jsonObject.get("cuisine");
        // Parameters start with 1
        preparedStatement.setString(5, cuisine);

        String address = (String) jsonObject.get("address");
        // Parameters start with 1
        preparedStatement.setString(1, address);
    }

//    public int saveToDatabase() throws FileNotFoundException {
//
//    }

}
