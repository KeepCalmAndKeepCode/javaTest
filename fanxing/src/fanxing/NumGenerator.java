package fanxing;

import java.util.Random;
public class NumGenerator implements Generator<Integer>{
	int[] ages = {18,19,20};
	@Override
	public Integer text() {
		Random rand = new Random();
		return ages[rand.nextInt(3)];
	}
	public static void main(String[] args) {
		NumGenerator age = new NumGenerator();
		System.out.println(age.text());
	}
}
