import java.util.Random;

public class Coin{
	private int coinValue;
	Random generator = new Random();
	public Coin(){
	}
	public void flip(){
		coinValue = generator.nextInt(2);
	}
	public boolean isHeads(){
		if (coinValue == 1){
			return true;
		}
		else{
			return false;
		}
	}
	public String toString(){
		String value = Integer.toString(coinValue);
		return value;
	}
}