package quiz_of_cat;

public class Main {

	public static void main(String[] args) {
		TF tf = new TF();
		Random ran = new Random();
        Question quiz = new Question();

		int choice = ran.num();

		int t = quiz.text(choice);

        tf.judge(t);

	}

}
