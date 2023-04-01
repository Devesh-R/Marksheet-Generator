import com.mongodb.client.FindIterable;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Iterator;

public class R {
    public static void main(String[] args){
        try{
//---------- Connecting DataBase -------------------------//
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
//---------- Creating DataBase ---------------------------//
            MongoDatabase db = mongoClient.getDatabase("dv");
//---------- Creating Collection -------------------------//
            MongoCollection<Document> table = db.getCollection("marksheer");
//---------- Creating Document ---------------------------//
            Document doc = new Document("name", "Peter John");
            doc.append("id",12);
//----------- Inserting Data ------------------------------//
            table.insertOne(doc);
            FindIterable<Document> iterDoc = table.find();
            Iterator it = iterDoc.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}