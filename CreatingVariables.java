public class CreatingVariables {
	public static void main(String[] args) {
		int x, y, age;
		double seconds, e, checking;
		String firstName, lastName, title;
		
		x = 10;
		y = 400;
		age = 39;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		
		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		
		int myAge = 10000000;
		double powerLevel = 9001;
		String name = "Alexis";
		String myTitle = "Queen of All Cosmos";
		
		
		System.out.println("The variable x contains " + x);
		System.out.println("The value " + y + " is stored in the variable y.");
		System.out.println("The experiment took " + seconds + " seconds.");
		System.out.println("A favorite irrational # is Euler's number: " + e);
		System.out.println("Hopefully you have more than $" + checking);
		System.out.println("My name's " + title + " " + firstName + " " + lastName);
		
		System.out.println("I am " + name + ", " + myTitle + ". I am " + myAge + " years old, and my power level is " + powerLevel + ".");
	}
}
