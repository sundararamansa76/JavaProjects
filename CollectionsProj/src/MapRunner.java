import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hare Krsna Hare Krsna Krsna Krsna Hare Hare " + "Hare Rama Hare Rama Rama Rama Hare Hare "
				+ "is this Yuga Maha Mantra. Chant them and be happy";
		Map<Character, Integer> occurrences = new HashMap<>();
		char[] chars = str.toCharArray();
		for(char character:chars)
		{
			if (character != ' ')
			{
				Integer int1 = occurrences.get(character);
				if (int1 == null) {
					occurrences.put(character, 1);
				} else {
					int1++;
					occurrences.put(character, int1);
				}
			}
		}
		System.out.println(occurrences);

		Map<String, Integer> strOcc = new HashMap<>();
		System.out.println(str);
		String[] words = str.split(" ");


		for (String word : words) {
			Integer integer = strOcc.get(word);
			if (integer == null) {
				strOcc.put(word, 1);
			} else {
				integer++;
				strOcc.put(word, integer);
			}
		}
		System.out.println(strOcc);
	}
}
