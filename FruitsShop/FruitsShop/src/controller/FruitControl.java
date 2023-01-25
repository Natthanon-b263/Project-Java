package controller;
import java.sql.SQLException;
import entity.Fruit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FruitControl extends DBControl{
   public boolean insertNewFruit(Fruit fruit){
      connectDB();
      boolean returnValue = false;
      String query="INSERT INTO fruit(name,color,taste,price)VALUES('"
              +fruit.getName()+"','"+fruit.getColor()
              +"','"+fruit.getTaste()+"','"
              +fruit.getPrice()+"')";
       try {
           int i=stmt.executeUpdate(query);
           if (i != 0) {
               returnValue=true;
           }
       } catch (SQLException sqlex) {
           System.err.print("SQL Exception");
           sqlex.printStackTrace();
       }
       closeDB();
       return (returnValue);
   }
   
   public ArrayList<Fruit> retrieveAllFruits(){
   connectDB();
   ArrayList<Fruit>fruits=new ArrayList<Fruit>();
   Fruit fruit;
   
   String query = "SELECT * FROM fruit";
       try {
           rs=stmt.executeQuery(query);
           while (rs.next()) {
               fruit=new Fruit();
               fruit.setName(rs.getString("name"));
               fruit.setColor(rs.getString("color"));
               fruit.setTaste(rs.getString("taste"));
               fruit.setPrice(Integer.parseInt(rs.getString("price")));
               fruits.add(fruit);
           }
       } catch (SQLException sqlex) {
           System.err.print("SQLException");
           sqlex.printStackTrace();
       }
   
       Comparator<Fruit> com=new Comparator<Fruit>(){
       @Override
       public int compare(Fruit o1, Fruit o2){
            return o1.getName().compareTo(o2.getName());
       }
       };
       Collections.sort(fruits, com);
       closeDB();
       return (fruits);
   }
}
