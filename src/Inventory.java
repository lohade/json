import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.IOException;


public class Inventory {
    public static void main(String[] args) throws IOException,org.json.simple.parser.ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader=new FileReader("C:\\Users\\Arti\\IdeaProjects\\JsonFile\\src\\Inventory.json");
        Object object=jsonParser.parse(reader);
        JSONObject inventorying = (JSONObject)object;
        JSONArray array=(JSONArray)inventorying.get("InventoryDetails");
        for(int i=0;i<array.size();i++){
            JSONObject inventoryDetails=(JSONObject)array.get(i);

                String Type=(String)inventoryDetails.get("Type");
                String Name=(String)inventoryDetails.get("Name");
                double weight=(double)inventoryDetails.get("weight");
                double pricePerKg=(double) inventoryDetails.get("pricePerKg");


            System.out.println("inventoryDetail "+i+"is:");

            System.out.println("name::" + Name);
            System.out.println("weight::" + weight);
            System.out.println("pricePerKg::" + pricePerKg);
            System.out.println("type::" + Type);

            double value = weight * pricePerKg;
            System.out.println("value for Inventory is::" + value);
        }

        }


    }

