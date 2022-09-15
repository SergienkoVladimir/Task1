import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.Yaml;

import java.io.*;

public class task1 {




    public static void main(String[] args) throws IOException, ParseException {
    }

    @Test
public void Test1() throws IOException, ParseException {
        JSONParser jsonparse = new JSONParser();
        FileReader fileReader = new FileReader("src/regular_users.json");
        Object obj = jsonparse.parse(fileReader);
        JSONArray jsonArray = (JSONArray) obj;
        for (Object o : jsonArray) {
            JSONObject json = (JSONObject) o;

            Long id = (Long) json.get("id");
            String name = (String) json.get("name");

            Assert.assertNotNull(id,name);
        }
    }

    @Test
    public void Test2() throws FileNotFoundException {

        InputStream input = new FileInputStream(new File("src/regular_users.yaml"));
        Yaml yaml = new Yaml();
        Object obj = yaml.load(input);
        System.out.println("object type:" + obj.getClass());



    }
}


