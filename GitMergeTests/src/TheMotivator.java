
public class TheMotivator {
	private int score;
	public TheMotivator(int score){
		this.score = score;
	}
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	public void addTestScore(int score){
		this.score += score;
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator(65);
		tm.feedback(60);
		TheMotivator test = new TheMotivator(92);
		test.feedback(92);
		tests.addTestScore(6);
	}
// adding happy comments
// more comments
git 
}