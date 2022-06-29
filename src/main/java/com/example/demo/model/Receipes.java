package com.example.demo.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public @Data class Receipes {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String DateTime;
	private String TypeOfDish;
	private int SuitableFor;

//	@OneToOne(cascade=CascadeType.ALL,targetEntity=ingredients.class)
//	@JoinColumn(name="ing_id")
	String Ingredients;
	private String CookingInstructions;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateTime() {
		return DateTime;
	}

	public void setDateTime(String dateTime) {
		DateTime = dateTime;
	}

	public String getTypeOfDish() {
		return TypeOfDish;
	}

	public void setTypeOfDish(String typeOfDish) {
		TypeOfDish = typeOfDish;
	}

	public int getSuitableFor() {
		return SuitableFor;
	}

	public void setSuitableFor(int suitableFor) {
		SuitableFor = suitableFor;
	}

	public String getIngredients() {
		return Ingredients;
	}

	public void setIngredients(String ingredients) {
		Ingredients = ingredients;
	}

	public String getCookingInstructions() {
		return CookingInstructions;
	}

	public void setCookingInstructions(String cookingInstructions) {
		CookingInstructions = cookingInstructions;
	}

	public String toString() {
		

		return "Receipes [id=" + id + ", name=" + name + ", DateTime=" + DateTime + ", TypeOfDish=" + TypeOfDish
				+ ", SuitableFor=" + SuitableFor + ", Ingredients=" + Ingredients + ", CookingInstructions="
				+ CookingInstructions + "]";


	}
	
	public List<String> getList(){
		String s="" + id + "," + name + "," + DateTime + "," + TypeOfDish
				+ "," + SuitableFor + "," + Ingredients + ","
				+ CookingInstructions;
		List<String> list=new ArrayList<String>(Arrays.asList(s.split(",")));
		return list;
	}

	public List<String> getvaluess(String h){

		ArrayList<String> l=new ArrayList<String>();
		String d="";
		for(int i=0;i<h.length();i++) {

			if(h.charAt(i)=='.') {
				l.add(d);
				d="";

			}else {
				d=d+h.charAt(i);
			}


		}
		return l;
	}
}
