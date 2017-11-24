package quiz_of_cat;

public class Cquiz {

	int celect(int cel) {
		int no = 0;

		if(0 <= cel && cel < 10) {
			no = 1;
		}else if(10 <= cel && cel < 20) {
			no = 2;
		}else if(20 <= cel && cel < 30) {
			no = 3;
		}else if(30 <= cel && cel < 40) {
			no = 4;
		}else if(40 <= cel && cel < 50) {
			no = 5;
		}else if(50 <= cel && cel < 60) {
			no = 6;
		}else if(60 <= cel && cel < 70) {
			no = 7;
		}else if(70 <= cel && cel < 80) {
			no = 8;
		}else if(80 <= cel && cel < 90) {
			no = 9;
		}else if(90 <= cel && cel < 100) {
			no = 10;
		}

        return no;
	}

}
