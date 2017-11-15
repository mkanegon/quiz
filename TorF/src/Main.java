
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

	    int t,n;
        t = 0;

        do {
            n = scanner.nextInt();
        }while(n < 1 || 4 < n);

        switch(n) {
        case 1:t = 0;    break;
        case 2:t = 0;    break;
        case 3:t = 1;    break;
        case 4:t = 0;    break;

        }

	    if(t == 1) {
		    System.out.println("○");
	    }else {
	        System.out.println("×");
	    }
	scanner.close();
	}

}
