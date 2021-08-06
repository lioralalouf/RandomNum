import java.util.ArrayList;
import java.util.Random;

public class RandomWithoutDup {
	static Random rnd = new Random();
	ArrayList<Integer> ls = new ArrayList<Integer>();

	public RandomWithoutDup(ArrayList<Integer> ls) {
		this.ls = ls;
	}

	public RandomWithoutDup() {
		this.ls = new ArrayList<Integer>();
	}

	public int nextInt(int min, int max) {
		int range = max - min;
		boolean flag = true;
		int num = 0;
		while (flag == true) {
			flag = false;
			num = Math.abs(rnd.nextInt()) % range + min;
			for (Integer item : ls) {
				if (item == num) {
					flag = true;
					break;
				}
			}
		}
		ls.add(num);
		return num;
	}
}
