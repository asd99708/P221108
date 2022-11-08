package runanimal;
public class RunAnimal {
	public static void main(String[] args) {
		Animal ani1 = new Animal();
		ani1.setName("Cat");
		ani1.setAge(10);
		
		System.out.println(ani1.getName());
		System.out.println(ani1.getAge());
		
		Animal ani2 = new Animal();
		ani2.setName("Dog");;
		ani2.setAge(15);;
		
		System.out.println(ani2.getName());
		System.out.println(ani2.getAge());
	}

}
