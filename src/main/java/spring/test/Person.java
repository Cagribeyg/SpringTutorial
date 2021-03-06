package spring.test;

public class Person {
	private int id;
	private String name;
	private int taxId;
	
	private Address address;

	public void setId(int id) {
		this.id = id;
	}
	
	public Person() {
		
	}

	public static Person getInstance(int id, String name) {
		System.out.println("Creating Person Factory using factory method");
		 return new Person(1234, "Bob"); 
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getTaxId() {
		return taxId;
	}


	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}


	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
	public void onCreate() {
		System.out.println("Person created" + this);
	}
	
	public void onDestroy() {
		System.out.println("Person destroyed");
	}
	


	public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}




	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}




	public void speak() {
		System.out.println("Hello Iam a person");
	}
}
