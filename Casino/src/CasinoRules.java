import java.util.Random;

public class CasinoRules {

	public CasinoRules() {
		super();
	}

	public void diceRoll(double sum, int guess, Player player, Casino casino) {
		Random dice = new Random();
		roll = dice.nextInt(6) + 1;
		if (guess == roll) {
			System.out.println("You won!");
			player.won(sum);
			casino.lost(sum);
		} else {
			System.out.println("You lost...");
			player.lost(sum);
			casino.won(sum);
		}
		System.out.println("Current balance:" + player.getMoney() + " " + casino.getMoney());
	}

	public boolean ruleCheck(double sum, Player player, Casino casino) {
		if (sum > player.getMoney() || sum > casino.getMoney() / 5) {
			return true;
		} else {
			return false;
		}

	}

	private int roll;

}
