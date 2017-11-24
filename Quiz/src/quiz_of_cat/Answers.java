package quiz_of_cat;

public class Answers {
    int t = 0;

	int one(int a) {

		switch(a) {
        case 1:t = 1;    break;
        case 2:t = 0;    break;
        case 3:t = 0;    break;
        case 4:t = 0;    break;

        }
        return t;
	}

	int two(int b) {

		switch(b) {
        case 1:t = 0;    break;
        case 2:t = 1;    break;
        case 3:t = 0;    break;
        case 4:t = 0;    break;

        }
        return t;
	}

	int thr(int c) {

		switch(c) {
        case 1:t = 0;    break;
        case 2:t = 0;    break;
        case 3:t = 1;    break;
        case 4:t = 0;    break;

        }
        return t;
	}

	int paturna(int d) {

		switch(d) {
        case 1:t = 0;    break;
        case 2:t = 0;    break;
        case 3:t = 0;    break;
        case 4:t = 1;    break;

        }
        return t;
	}
}
