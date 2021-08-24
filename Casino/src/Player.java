
public class Player {

	public Player(double money) {
		this.money = money;
	}

	public void won(double sum) {
		money = getMoney() + sum * 5;
	}

	public void lost(double sum) {
		money = getMoney() - sum;
	}

	public double getMoney() {
		return money;
	}

	private double money;

}
