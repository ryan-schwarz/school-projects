
public class ArrayBuilder {
	static char [] arr = n`w char[5]; 
	
	public static void main(String[] args) {
		Push('A');
		Push('B');
		char popped = Pop();
		Push('C');
		for (int i = 0; i < arr.length; i++) {
			char item = arr[i];
			if (item != 0) {
				System.out.println("-----");
				System.out.println("| " + item + " |");
				if (i == 4) {
					System.out.println("-----");
					System.out.println("stack");
				}
			}
		}
		

		System.out.println("We popped: " + popped);
	}
	
	public static void Push(char x) {
		for (int i = arr.length - 1; i >= 0 ; i--) {
			if (arr[i] == 0) {
				arr[i] = x;
				break;
			}
		}
	}
	
	public static char Pop() {
		char x = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				x = arr[i];
				arr[i] = 0;
				return x;
			}
		}
		return x;
	}
}
