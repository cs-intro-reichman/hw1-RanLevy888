// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int Number = Integer.parseInt(args[0]);
	// 1+ to include the user number in the range
		int a = (int)(Math.random()*(Number+1));
	    int b = (int)(Math.random()*(Number+1));
	    int c = (int)(Math.random()*(Number+1));
        System.out.println(a + " " + b + " " + c);
       int min = (Math.min(Math.min(a, b),c));
        int max = (Math.max(Math.max(a, b),c));
		int middle = a+b+c-min-max;
        System.out.println(min + " " + middle + " " + max);
}
}
