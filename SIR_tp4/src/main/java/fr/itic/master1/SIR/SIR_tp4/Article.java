package fr.itic.master1.SIR.SIR_tp4;

import java.util.List;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

@Entity
public class Article {
	
	@Id
	private ObjectId id;
	private String name;
	private int stars;
	@Reference private List<Person> pers;
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
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public List<Person> getPers() {
		return pers;
	}
	public void setPers(List<Person> pers) {
		this.pers = pers;
	}
	
	public Article(){
		this.id = new ObjectId();
	}}
