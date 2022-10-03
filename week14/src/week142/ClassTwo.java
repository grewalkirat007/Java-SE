
package week142;


public class ClassTwo {

	
		
		String name;
		int number;
		int[] array = new int[5];
		
		public ClassTwo()
		{
			name = "none";
			number = 2;
		}
		
		public ClassTwo(String name)
		{
			this.name = name;
			number = 2;
		}
		
		public void methodOne()
		{
			System.out.println("method in the ClassTwo");
		}
		public void methodTwo()
		{
			array[0] = 1;
			System.out.println("The number is " + array[0]);
		}
}
