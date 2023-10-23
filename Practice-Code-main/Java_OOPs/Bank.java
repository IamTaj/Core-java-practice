package Java_OOPs;
class RBI{
	public int getRate() {
		return 0;
	}}
class SBI extends RBI{
	public int getRate() {
		return 5;
	}}
class AXIS extends RBI{
	public int getRate() {
		return 9;
	}}
class BOI extends RBI {
	public int getRate() {
		return 12;
	}
}
class Bank {
	public static void main(String arg[]) {
		SBI r = new SBI();
		AXIS a = new AXIS();
		BOI b = new BOI();
		System.out.println()
		
	}

}
