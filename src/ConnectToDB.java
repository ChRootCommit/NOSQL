import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;

public class ConnectToDB {
	public static void main( String args[] ) {  
	      
	      // Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	   
	      // Creating Credentials 
	      MongoCredential credential; 
	      credential = MongoCredential.createCredential("Trung", "dbcontacts", 
	         "passroot".toCharArray()); 
	      System.out.println("Connected to the database successfully");  
	      
	      // Accessing the database 
	      MongoDatabase database = mongo.getDatabase("dbcontacts"); 
	      System.out.println("Credentials ::"+ credential);     
	   } 
}
