import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Stock_Account {
    public static double total_portfolio;
    public static void main(String[] args) throws IOException, ParseException{
        JSONParser jsonParser=new JSONParser();
        FileReader reader=new FileReader("C:\\Users\\Arti\\IdeaProjects\\JsonFile\\src\\stock.json");
        Object stock_object=jsonParser.parse(reader);
        JSONObject stock=(JSONObject)stock_object;
        JSONArray array=(JSONArray)stock.get("StockDetails");
        for(int i=0;i<array.size();i++){
                JSONObject StockDetails=(JSONObject)array.get(i);
                String stock_name=(String)StockDetails.get("stock_name");
                double stock_quantity=(double)StockDetails.get("stock_quantity");
                double stock_price=(double)StockDetails.get("stock_price");

            System.out.println("Stock Portfolio:" +i+ ":is");

            System.out.println("stock name:"+stock_name);
            System.out.println("stock quantity:" +stock_quantity);
            System.out.println("stock price:"+stock_price);

            double total_price=stock_quantity * stock_price;
            System.out.println("price of "+stock_name+"total stock is:"+total_price);

            total_portfolio+=total_price;


        }

        System.out.println("total portfolio price of stock market is:"+total_portfolio);
    }
}
