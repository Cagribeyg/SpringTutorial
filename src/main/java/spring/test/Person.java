package spring.test;

public class Person {
	private int id;
	private String name;
	private int taxId;
	


	public void setId(int id) {
		this.id = id;
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

	

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + "]";
	}




	public void speak() {
		System.out.println("Hello Iam a person");
	}
}
