
import java.util.*;
public class Calculate {
	static void push(Deque stack, int sum) {
			
		stack.push(sum);
	      
	   }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        String string = scanner.nextLine();
        String[] array = string.split(" ");
        Deque<Integer> num = new ArrayDeque<Integer>();
        int loop;
        int calculate=0;
        for(loop=array.length-1;loop>=0;loop--) 
        {
        	if((array[loop].equals("+")||array[loop].equals("-")||array[loop].equals("*")||array[loop].equals("/")))
        	{
        		Integer number1 = (Integer) num.pop();
        		Integer number2 = (Integer) num.pop();
        		if(array[loop].equals("+")) 
        		{
        			calculate = number1+number2;
        			push(num,calculate);
        		}
        		if(array[loop].equals("-")) 
        		{
        			calculate = number1-number2;
        			push(num,calculate);	
        		}
        		if(array[loop].equals("*")) 
        		{
        			calculate = number1*number2;
        			push(num,calculate);	
        		}
        		if(array[loop].equals("/")) 
        		{
        			calculate = number1/number2;
        			push(num,calculate);
        		}
        	}
        	else 
        	{
        		int number = Integer.parseInt(array[loop]);
        		push(num,number);
        		calculate = calculate+number;
        	}		
        }
        System.out.println(calculate);
	}
}
