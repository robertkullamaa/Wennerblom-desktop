package Wennerblom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class PostGreConnection {
    public static String HOST = "ewis.era.ee:5432";
    //final static String HOST = "localhost:5432";
    final static String DB = "ewis";
    final static String USER = "ewis";
    final static String PW = "A11ik45";

        public Connection con = null;
        public ResultSet rs = null;

   public PostGreConnection() {

        try{
            Class.forName("org.postgresql.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:postgresql://" + HOST + "/" + DB, USER, PW); //andmebaas, kasutaja, parool
            System.out.println("Connected successfully to "+HOST);


        }catch(Exception e){
            System.out.println("Ühendus puudu");
            System.out.println(e);
        }
    }

    public ResultSet getResultSet(String query){
        try{
            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            statement.executeQuery(query);
            rs = statement.getResultSet();
        }catch (Exception e){
            System.out.println(e);
        }
        return rs;
    }
}


