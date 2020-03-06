package Epam;

public class mainMethod {

	 public static void main(String[] args) {
	        collectionFramework<Integer> value = new collectionFramework();
	        value.adding(10);
	        value.adding(9);
	        value.adding(8);
	        value.adding(7);
	        value.adding(6);
	        value.adding(5);
	        value.adding(4);
	        value.adding(3);
	        value.adding(2);
	        value.adding(1);
	        System.out.println(value);
	        System.out.println("The actual size is: " + value.size());
	        value.remove(5);
	        System.out.println(value);
	        System.out.println("At index 0: " + value.get(0) );
	        System.out.println( "At index 5: " + value.get(5) );
	        System.out.println("The new size is: " + value.size());
	    }
}


