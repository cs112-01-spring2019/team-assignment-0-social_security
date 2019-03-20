public class CoinTest{

	public static void main(String[] args){
		Coin tossCoin = new Coin();
		tossCoin.flip();
		System.out.println(tossCoin.toString());
		if(tossCoin.isHeads()){
			System.out.println("Heads");
		}
		else{
			System.out.println("Tails");
		}
	}
}