import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import java.util.*;
import java.lang.*;
public class mongodemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	MongoClient mc=new MongoClient("localhost",27017);
            DB db=mc.getDB("mypatients");
            System.out.println("db has collections "+db.getCollectionNames());
            DBCollection coll=db.getCollection("patients");
            DBCursor cus=coll.find();
            System.out.println("let's print "+cus.count());
            while(cus.hasNext()) {
            	System.out.println("nothing");
            	System.out.println(cus.next());
            }
            System.out.println("data printed");
        }catch(Exception e) {
        	
        }
	}

}
