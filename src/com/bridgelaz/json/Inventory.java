package com.bridgelaz.json;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
//import java.text.ParseException;
public class Inventory {
    public static void main(String[] args) throws IOException, ParseException {

        JSONParser jsonparser = new JSONParser();
        FileReader reader = new FileReader("C:\\Users\\hp\\Desktop\\New_Bridgelabz_Programs\\untitled\\src\\com\\bridgelaz\\json\\InventoryDetail.json");

// Java Object variable
        Object obj = jsonparser.parse(reader); // THis is my Main Object i.e which includes JSONParser, JSONObject, JSONarray

// JSON Object ( after type casting)
        JSONObject inventoryobj = (JSONObject)obj; // FIle Inventory.json it will pasrse the object to JSONObject
        JSONArray array = (JSONArray)inventoryobj.get("inventoryDetails"); // Will now change JSON Object to JSON Array.

        for (int i = 0; i < array.size(); i++ )
        {
            JSONObject inventoryDetails = (JSONObject)array.get(i);

            String name = (String) inventoryDetails.get("name");
            double weight = (double) inventoryDetails.get("weight");
            double pricePerKg = (double) inventoryDetails.get("pricePerKg");
            String type = (String) inventoryDetails.get("type");

            System.out.println("inventoryDetail " +i+ " is ......");

            System.out.println("name::" + name);
            System.out.println("weight::" + weight);
            System.out.println("pricePerKg::" + pricePerKg);
            System.out.println("type::" + type);

            double value = weight * pricePerKg;
            System.out.println("value for Inventory is::" + value);
        }

    }

}

/*
json parse jar
*/