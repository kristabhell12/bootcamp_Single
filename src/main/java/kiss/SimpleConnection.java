package kiss;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class SimpleConnection {
    String connectionString = System.getProperty("mongodb.uri");

    public void SimpleConnectionToShowDataBases(){

        try

        {
            MongoClient mongoClient = MongoClients.create(connectionString);
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            databases.forEach(db -> System.out.println("DB "+db.toJson()));
        }
        catch(Exception e){

            e.getStackTrace();
        }
    }


}
