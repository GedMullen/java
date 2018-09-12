public class Exercises {

	//Exercise 1
	public void count(){
		System.out.println("Exercise 1:");
		for (int i=1; i<31; i++){
			if (i % 2 == 0)
				System.out.println(i + " is an even number");
			else
				System.out.println(i + " is an odd number");
		}		
	}

	// Exercise 2
	public void sumEvenOdd(int from, int to){
		System.out.println("Exercise 2:");
		int x=0;
		int y=0;
		int z=0;
		int j=0;
		
		if (from > to) {
			x=to;
			to=from;
			from=x;
		}
		
		System.out.println("The range is "+from+" to "+to);
		
		for (y=from; y<to+1; y++){
			 if (y % 2 == 0) {
			        z=z+y;
			      }
			      if (y % 2 != 0) {
			        j=j+y;
			      }
		}
		
		System.out.println("The even total is "+z);
		System.out.println("The odd total is "+j);
		System.out.println("The difference is "+(z-j));
	}

	//Exercise 3
	public void sumAndAverage(int from, int to){
		System.out.println("Exercise 3:");
		int x=0;
		int y=0;
		int z=0;
		float j=0;
		
		if (from > to) {
			x=to;
			to=from;
			from=x;
		}
		
		for (y=from; y<to+1; y++){
			z=z+y;
			j++;
		}
		System.out.println("The sum is "+z);
		System.out.println("The average is "+(z/j));
	}
	
	//Exercise 4
	public void sumAndAverage2(int from, int to){
		System.out.println("Exercise 4:");
		int x=0;
		int y=0;
		int z=0;
		float j=0;
		
		if (from > to) {
			x=to;
			to=from;
			from=x;
		}
		y=from;
		do {
			z=z+y;
			y++;
			j++;
		}while(y<to+1);
		
		System.out.println("The sum is "+z);
		System.out.println("The average is "+(z/j));
	}

	public static void main(String[] args) {

		Exercises exercises = new Exercises();
		exercises.count();
		exercises.sumEvenOdd(3, 5);
		exercises.sumAndAverage(7,33);
		exercises.sumAndAverage2(2,10);
	}

}

