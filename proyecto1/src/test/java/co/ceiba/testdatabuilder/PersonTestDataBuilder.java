package co.ceiba.testdatabuilder;

import co.ceiba.domain.Person;

public class PersonTestDataBuilder {
	private String name;
	private String lastName;
	
	public PersonTestDataBuilder() {
		this.name = "Froilan";
		this.lastName = "Ruiz";
	}
	
	public PersonTestDataBuilder withName(String name){
		this.name = name;
		return this;
	}
	
	public Person build(){
		return new Person(this.name,this.lastName);
	}
}
