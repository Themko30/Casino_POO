import java.util.Scanner;

/*Scrivere un programma che si comporta come segue:
1. Crea due conti correnti uno (conto giocatore) con importo
iniziale pari a 1000 euro ed uno (conto casinò) con importo
iniziale pari a 100000 euro.
2. Prende in input da tastiera un intero n e un double somma e
simula il lancio di un dado (con 6 facce). Se il risultato del lancio
è n allora il programma trasferisce un importo pari a 5 volte il
valore di somma dal conto del casinò al conto del giocatore; se
il risultato è diverso da n il programma trasferisce un importo
pari a somma dal conto del giocatore a quello del casinò. Il
valore di somma deve essere inferiore al saldo del vostro conto
e 5 volte più piccolo di quello del conto del casinò.
3. Se dopo la scommessa il giocatore dispone ancora di soldi sul
conto, il programma chiede se volete continuare a scommettere.
Se digitate “si” il programma continua dal punto 2. Se digitate
qualcosa di diverso da “si” oppure il saldo è zero il programma
si interrompe stampando il saldo del vostro conto.
*/
public class Play {

	public static void main(String[] args) {
		int guess;
		double sum;
		System.out.println("Let`s play a game shall we?");
		Player player = new Player(1000);
		Casino casino = new Casino(10000);
		CasinoRules play = new CasinoRules();
		Scanner in = new Scanner(System.in);
		String flag = "y";

		do {
			System.out.println("Insert guess:");
			guess = in.nextInt();
			System.out.println("Insert sum:");
			sum = in.nextDouble();
			if (play.ruleCheck(sum, player, casino)) {
				System.out.println("Incorrect sum...");
				continue;
			}
			play.diceRoll(sum, guess, player, casino);
			System.out.println("Wanna play again?");
			flag = in.next();
		} while (flag.equals("y") && player.getMoney() > 0);

		if (player.getMoney() <= 0) {
			System.out.println("Sorry...no more money...");
		} else {
			System.out.println("See you around...");
		}

		in.close();
	}

}
