package brackebalancer;
import java.util.*;

public class BracketsManager {
	private static Set<Bracket> predefinedBrackets;
	static {
		LinkedHashSet<Bracket> predefinedBrackets = new LinkedHashSet<Bracket>();
		
		predefinedBrackets.add(new Bracket('(',')'));
		predefinedBrackets.add(new Bracket('{','}'));
		predefinedBrackets.add(new Bracket('[',']'));
		predefinedBrackets.add(new Bracket('<','>'));
		
	}
	public static Set<Character> getOpenBracketCharsSet(){
		Set<Character> result = new LinkedHashSet<Character>();
		
		Iterator<Bracket> iterator = predefinedBrackets.iterator();
		while(iterator.hasNext()) {
			Bracket bracket =iterator.next();
			result.add(bracket.getOpenChar());
		}
		return result;
	}
		
		public static Set<Character> getCloseBracketCharsSet(){
		Set<Character> result = new LinkedHashSet<Character>();
		Iterator<Bracket> iterator = predefinedBrackets.iterator();
		while(iterator.hasNext()) {
			Bracket bracket =iterator.next();
			result.add(bracket.getCloseChar());
		}
		return result;
		}
		public static Bracket getBracket(Character closeBracket) {
			
			for(Bracket predefinedBracket : predefinedBrackets ) {
				if (predefinedBracket.getCloseChar().equals(closeBracket)) {
					return predefinedBracket;
				}
			}
			return null;
		}
		

}
