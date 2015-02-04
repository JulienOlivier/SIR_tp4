package fr.itic.master1.SIR.SIR_tp4;
/*
 * https://www.playframework.com/modules/morphia-1.2.4/model
 */

import java.util.List;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

@Entity("person")
public class Person {
	@Id
	private ObjectId id;
	private String name;
	@Reference
	public List<Address> address;
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	public Person(){
		this.id = new ObjectId();
	}
}
