/** A class that is used to roll a die 1000 times.
 * 
 * @author Jose Garcia Balboa
 *
 */
public class RecDieRoller1000 {

	/**
	* This method will roll a die 1000 times, and let the user know when they rolled a 2,
	* and how many rolls it has taken them to get a 2.
	*/
	public void roll1000() {

		int count = 0;
		for (int i = 0; i < 1000; i++) {

			int die = ((int) (Math.random() * 6) + 1);

			System.out.println(die);

			if (die == 2) {

				count = i++ + 1;
				System.out.println("Congratulations! You rolled a 2 ");
				System.out.println("It has taken you " + count + " roll(s) to get a 2");

			}
		}
	}
}