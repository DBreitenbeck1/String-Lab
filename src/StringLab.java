import java.util.*;

public class StringLab {

	public static void main(String[] args) {
	StringMethods sm = new StringMethods();
	
	String capital = sm.capitalize("hieRONYmous");
	int waldo = sm.wheresWaldo("Run for it, Waldo!");
	String firstThings = sm.firstThingsFirst("fie", "fiat");
	String reverse =sm.reverse("Goblin");
	
	String aftMat =	sm.afterMath("I matly love Mathematics Class!");
	String cC = sm.camelCase("The very model of a modern major general");
	
	System.out.println("Capitalized: " + capital);
	System.out.println();
	System.out.println("Where's Waldo: " + waldo);
	System.out.println();
	System.out.println("First Things First: " + firstThings);
	System.out.println();
	System.out.println("Reverse: " + reverse);
	System.out.println();
	System.out.println("After Math: " + aftMat);
	System.out.println();
	System.out.println("So Long: ");
	sm.soLong("Fun", "Cattle");
	System.out.println();
	System.out.println("Letterize: ");
	sm.letterize("King");
	System.out.println();
	System.out.println("camelCase: " + cC);
	
	}


}
