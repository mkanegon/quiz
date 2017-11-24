package quiz_of_cat;

import java.util.Scanner;

public class Question {

	int text(int choice) {
	    Cquiz cquiz = new Cquiz();
        Answers answer = new Answers();
	    int ans,t;
	    t = 0;
	    ans = 0;


	    int no = cquiz.celect(choice);

	    switch(no) {
	    case 1 : System.out.print("No.1\n1+1は？\n1:0\n2:1\n3:2\n4:∞\n解答:");
	              ans = kotae(); t = answer.thr(ans); break;
	    case 2 : System.out.print("No.2\n1+1は？\n1:0\n2:1\n3:2\n4:∞\n解答:");
	              ans = kotae(); t = answer.thr(ans); break;
        case 3 : System.out.print("No.3\n1+1は？\n1:0\n2:1\n3:2\n4:∞\n解答:");
                  ans = kotae(); t = answer.thr(ans); break;
        case 4 : System.out.print("No.4\n1+1は？\n1:0\n2:1\n3:2\n4:∞\n解答:");
                  ans = kotae(); t = answer.thr(ans); break;
        case 5 : System.out.print("No.5\n1+1は？\n1:0\n2:1\n3:2\n4:∞\n解答:");
                  ans = kotae(); t = answer.thr(ans); break;
        case 6 : System.out.print("No.6\n1+1は？\n1:0\n2:1\n3:2\n4:∞\n解答:");
                  ans = kotae(); t = answer.thr(ans); break;
        case 7 : System.out.print("No.7\n1+1は？\n1:0\n2:1\n3:2\n4:∞\n解答:");
                  ans = kotae(); t = answer.thr(ans); break;
        case 8 : System.out.print("No.8\n1+1は？\n1:0\n2:1\n3:2\n4:∞\n解答:");
                  ans = kotae(); t = answer.thr(ans); break;
        case 9 : System.out.print("No.9\n1+1は？\n1:0\n2:1\n3:2\n4:∞\n解答:");
                  ans = kotae(); t = answer.thr(ans); break;
        case 10 : System.out.print("No.10\n1+1は？\n1:0\n2:1\n3:2\n4:∞\n解答:");
                  ans = kotae(); t = answer.thr(ans); break;
	    }
        return t;
	}

	int kotae() {
		Scanner scanner = new Scanner(System.in);
		int ans;
		do {
	        ans = scanner.nextInt();
		}while(ans < 1 || 4 < ans);

		scanner.close();
		return ans;
	}
}