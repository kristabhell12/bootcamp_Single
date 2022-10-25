package kiss;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Connection1 implements ClientMongo{
    String connectionString = System.getProperty("mongodb.uri");
    @Override
    public void getElements() {
        try

        {
            MongoClient mongoClient = MongoClients.create(connectionString);
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            databases.forEach(db -> System.out.println(db.toJson()));
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }

    @Override
    public void addElements() {
        try

        {
            MongoClient mongoClient = MongoClients.create(connectionString);
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            databases.forEach(db -> System.out.println(db.toJson()));
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }

    @Override
    public void deleteElements() {

    }
}
