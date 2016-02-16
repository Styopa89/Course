package Lesson4;

public class ObjectLauncher {

	public static void main(String[] args) {
		Objects obj1 = new Objects("obj1");
		Objects obj2 = new Objects("obj2");
		Objects obj3 = new Objects("obj3");
		
			
		obj1.setRef(obj2);
		obj2.setRef(obj3);
		obj3.setRef(obj1);
		
		
		obj1.printObject();
		obj2.printObject();
		obj3.printObject();
		
		

	}

}
