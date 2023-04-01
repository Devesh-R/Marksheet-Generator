import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.*;
public class ConnectToDB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String names;
        int ids;
        try{
//---------- Connecting DataBase -------------------------//
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
//---------- Creating DataBase ---------------------------//
            MongoDatabase db = mongoClient.getDatabase("Marksheet");
//---------- Creating Collection -------------------------//
            MongoCollection<Document> table = db.getCollection("marks");

//---------- Creating Document ---------------------------//
            names=sc.next();
            Document doc = new Document("name", names);
            ids=sc.nextInt();
            doc.append("id",ids);
//----------- Inserting Data ------------------------------//
            table.insertOne(doc);

            DBObject dbc= .findOne();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}