package com.bilgeadam.lesson015;

public class PersonID
{
	private Person person1;
	private Person person2;
	private Person person3;
	private Person person4;
	private Person person5;
	
	
	public static void main(String[] args)
	{
		PersonID iD = new PersonID();
		
		iD.registerPerson1();
		iD.registerPerson2();
		iD.registerPerson3();
		iD.registerPerson4();
		iD.registerPerson5();
		
		iD.person1.showID();
		iD.person2.showID();
		iD.person3.showID();
		iD.person4.showID();
		iD.person5.showID();
		

	}
	
	
	
	
	private void registerPerson1()
	{
		person1 = new Person();
		person1.setName("Eralp");
		person1.setLastName("Nitelik");
		person1.setAge(1);
		person1.setGender("Male");
	}
	
	private void registerPerson2()
	{
		person2 = new Person();
		person2.setName("Çağrı");
		person2.setLastName("Türkmen");
		person2.setAge(2);
		person2.setGender("Male");
	}
	
	private void registerPerson3()
	{
		person3 = new Person();
		person3.setName("Olgu");
		person3.setLastName("Başak");
		person3.setAge(3);
		person3.setGender("Female");
	}
	
	private void registerPerson4()
	{
		person4 = new Person();
		person4.setName("Berna Baykan");
		person4.setLastName("Dere");
		person4.setAge(4);
		person4.setGender("Female");
	}
	
	private void registerPerson5()
	{
		person5 = new Person();
		person5.setName("Can");
		person5.setLastName("Demirhan");
		person5.setAge(5);
		person5.setGender("Male");
	}
	
}
