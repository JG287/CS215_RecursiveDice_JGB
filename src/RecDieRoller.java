/** A class that is used to roll a die.
 * 
 * @author Jose Garcia Balboa
 *
 */
public class RecDieRoller {

	/**
	* This method will continuously roll a die until the number shown is 2, and then it will stop.
	*/
	public void roll() {

		for (int i = 1; i >= 1; i++) {
			
			int die = (int) (Math.random() * 6 + 1);

			System.out.println(die);

			if (die == 2) {
				System.out.println("Congratulations! You have finally rolled a 2 ");
				break;
			}
		}
	}
}