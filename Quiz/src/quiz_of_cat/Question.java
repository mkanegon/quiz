package quiz_of_cat;

import java.util.Scanner;

public class Question {

	int text(int choice) {
	    Scanner scanner = new Scanner(System.in);
	    int ans,t;
	    t = 0;

	    if(choice > 20) {
		    System.out.print("1+1は？\n1:0\n2:1\n3:2\n4:∞\n解答:");
	    }

		do {
	        ans = scanner.nextInt();
        }while(ans < 1 || 4 < ans);

		switch(ans) {
        case 1:t = 0;    break;
        case 2:t = 0;    break;
        case 3:t = 1;    break;
        case 4:t = 0;    break;

        }

        scanner.close();
        return t;
	}
}
