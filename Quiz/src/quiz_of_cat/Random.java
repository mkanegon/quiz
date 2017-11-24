package quiz_of_cat;

public class Random {

	int num() {
	    int choice = new java.util.Random().nextInt(99);
	    System.out.println("No." + choice);
	    return choice;
	}
}
