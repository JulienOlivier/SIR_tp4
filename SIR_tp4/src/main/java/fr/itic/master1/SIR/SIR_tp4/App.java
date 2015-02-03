package fr.itic.master1.SIR.SIR_tp4;

import java.net.UnknownHostException;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

public class App 
{
    public static void main( String[] args ) throws UnknownHostException
    {
    	Morphia morphia = new Morphia();    
        Mongo mongo = new Mongo();
        morphia.map(Person.class).map(Address.class);
        Datastore ds = morphia.createDatastore(mongo, "my_database");
        
        Person p = new Person();
        p.setName("Tintin");

        Address address = new Address();
        address.setStreet("123 Some street");
        address.setCity("Some city");
        address.setPostCode("123 456");
        address.setCountry("Some country");
        //set address
        p.setAddress(address);
        
        // create list of address
        //ArrayList<Address> lesAdd = new ArrayList<Address>();
        //lesAdd.add(address);
        //p.setAddress(lesAdd);
        
        // Save the POJO
        ds.save(p);
        for (Person e : ds.find(Person.class))
             System.err.println(e);
    }
}
