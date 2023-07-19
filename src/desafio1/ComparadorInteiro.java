package desafio1;
import java.util.Comparator;

/**
 * 
 */

/**
 * @author Tassia
 *
 */
public class ComparadorInteiro  implements Comparator<Integer>{
	@Override
	public int compare(Integer x, Integer y) {
		
		if(x % 2 == 0 && y % 2 != 0) {
			return -1;
		}
		
		if(x % 2 == 0 && y % 2 == 0) {
			if(x < y) {
				return -1;
			} else {
				return 1;
			}
		}
		
		
		if(x % 2 != 0 && y % 2 == 0) {
			return 1;
		}
		
		if(x % 2 != 0 && y % 2 != 0) {
			if(x > y) {
				return -1;
			} else {
				return 1;
			}
		}
		
		return 0;
	}
}
