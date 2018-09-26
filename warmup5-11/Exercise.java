
public class Exercise {

		public void count()
		{
			System.out.println("Exercise 1");
			
			for (int counter = 1; counter < 31; counter++)
			{
				if (counter % 2 == 0)
					System.out.println(counter + " even");
				else
					System.out.println(counter + " odd");
			}
			
			System.out.println("End of Exercise 1");
			System.out.println("");
		}
		
		public void sumEvenOdd(int lowerBound, int upperBound)
		{
			System.out.println("Exercise 2");
			
			//declare variables
			int totalEven = 0;
			int totalOdd = 0;
			int difference;
			
			//display range
			System.out.println("Range is " + lowerBound + " to " + upperBound);
			
			//calculate even total
			for (int i = lowerBound; i < upperBound + 1; i ++)
			{
				if (i % 2 == 0)
					totalEven += i;
			}
			
			//display even total
			System.out.println("The even total is " + totalEven);
			
			//calculate odd value
			for (int i = lowerBound; i < upperBound + 1; i ++)
			{
				if (i % 2 == 1)
					totalOdd += i;
			}
			
			//display odd total
			System.out.println("The odd total is " + totalOdd);
			
			//calculate the difference
			difference = upperBound - lowerBound;
			
			//display difference
			System.out.println("The difference is " + difference);
			
			System.out.println("End of Exercise 2");
			System.out.println("");
		}

		public void sumAndAverageEx3(int lowerBound, int upperBound)
		{
			System.out.println("Exercise 3");
			
			//set variables
			int sum = 0;
			int counter = 0;
			
			//calculate sum
			for (int i = lowerBound; i < upperBound + 1; i++)
			{
				sum += i;
				counter++;
			}
			
			//calculate average
			int average = sum / counter;
			 
			//display sum and average
			System.out.println("The sum is " + sum);
			System.out.println("The average is " + average);
			
			System.out.println("End of Exercise 3");
			System.out.println("");
		}
		
		public void sumAndAverageEx4(int upperBound)
		{
			System.out.println("Exercise 4");
			
			//set variables
			int sum = 0;
			int counter = 0;
			
			//calculate sum
			while (counter < upperBound + 1)
			{
				sum += counter;
				counter++;
			}
			
			//calculate average
			int average = sum / counter;
			 
			//display sum and average
			System.out.println("The sum is " + sum);
			System.out.println("The average is " + average);
			
			System.out.println("End of Exercise 4");
			System.out.println("");
		}
		
		public void sumAndAverageEx5(int lowerBound, int upperBound)
		{
			System.out.println("Exercise 5");
			
			//set variables
			int sum = 0;
			int counter = 0;
			
			//calculate sum
			for (int i = lowerBound; i < upperBound + 1; i++)
			{
				sum += i;
				counter++;
			}
			
			//calculate average
			int average = sum / counter;
			 
			//display sum and average
			System.out.println("The sum is " + sum);
			System.out.println("The average is " + average);
			
			System.out.println("End of Exercise 5");
			System.out.println("");
		}
		
		public void totalOdd(int lowerBound, int upperBound)
		{
			System.out.println("Exercise 6");
			
			//declare variables
			int totalOdd = 0;
			int counter = 0;
			
			//calculate odd value
			for (int i = lowerBound; i < upperBound + 1; i ++)
			{
				counter++;
				if (i % 2 == 1)
					totalOdd += i;
			}
			
			//calculate the average
			int average = totalOdd / counter;
			
			//display odd total
			System.out.println("The odd total is " + totalOdd);
			System.out.println("The average total is " + average);
			
			System.out.println("End of Exercise 6");
			System.out.println("");
		}
		
		public void divide7Average(int lowerBound, int upperBound)
		{
			System.out.println("Exercise 7");
			
			//declare variables
			int sum = 0;
			int counter = 0;
			
			//display all divisible by 7
			for (int i = lowerBound; i< upperBound + 1; i ++)
			{
				if (i % 7 == 0)
				{
					System.out.println(i);
					sum += i;
					counter++;
				}			
			}
			
			//calculate average
			int average = sum / counter;
			
			System.out.println("The average is " + average);
			
			System.out.println("End of Exercise 7");
			System.out.println("");
		}
		
		public void squares(int lowerBound, int upperBound)
		{
			System.out.println("Exercise 8");
			
			//display all squares
			for (int i = lowerBound; i < upperBound + 1; i++)
			{
				int square = i*i;
				System.out.println("The square of " + i + " is " + square);
			}
			
			System.out.println("End of Exercise 8");
			System.out.println("");
		}
		
		public void moonWeight(Double lowerBound, Double upperBound)
		{
			System.out.println("Exercise 9");
			
			for (Double i = lowerBound; i < upperBound + 1; i++)
			{
				Double moonWeight = i * 0.17;
				System.out.println("The Moon's weight of " + i + " pounds is " + moonWeight + " pounds");
			}
			
			System.out.println("End of Exercise 9");
			System.out.println("");
		}
		
		public void pattern()
		{
			System.out.println("Exercise 10");
			
			for(int i = 0; i < 6; i++)
			{
				for(int j = 0; j < 6; j++)
				{
					System.out.print("# ");
				}
				System.out.println();
			}
			
			System.out.println("End of Exercise 10");
			System.out.println("");
		}
		
		public void multiplesOfnine()
		{
			System.out.println("Exercise 11");
			
			System.out.print(" " + 0 + " |  ");
			for (int i = 1; i < 10; i++)
			{
				System.out.print(i + "     ");
			}
			System.out.println();
			
			for (int i = 1; i < 10; i++)
			{
				if (i == 1)
					System.out.println("----------------------------------------------------------");
				
				System.out.print(" " + i + " |  ");
				
				for (int j = 1; j < 10; j++)
				{
					if (i*j > 9)
						System.out.print((i * j) + "    ");
					else
						System.out.print((i * j) + "     ");
				}
				System.out.println();						
			}
			
			System.out.println("End of Exercise 11");
			System.out.println("");
		}
		
		public static void main(String[] args) 
		{
			Exercise warmups = new Exercise();
			warmups.count();
			warmups.sumEvenOdd(1,30);
			warmups.sumAndAverageEx3(1,30);
			warmups.sumAndAverageEx4(30);
			warmups.sumAndAverageEx5(111,8899);
			warmups.totalOdd(111,8899);
			warmups.divide7Average(111,8899);
			warmups.squares(1,100);
			warmups.moonWeight(1.00,100.00);
			warmups.pattern();
			warmups.multiplesOfnine();
		}
	}
