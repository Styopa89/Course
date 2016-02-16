package Lesson4;

public class Objects {
	private String name;
	private Objects ref;
	
	public Objects(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}	

	public Objects getRef() {
		return ref;
	}

	public void setRef(Objects ref) {
		this.ref = ref;
	}

	public void printObject() {
		System.out.println(name + " --> " + ref.getName() );
	}
}
