
public class Casino {

	public Casino(double money) {
		this.money = money;
	}

	public void won(double sum) {
		money = getMoney() + sum;
	}

	public void lost(double sum) {
		money = getMoney() - (sum * 5);
	}

	public double getMoney() {
		return money;
	}

	private double money;

}
