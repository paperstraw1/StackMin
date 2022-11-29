package StackMin;
import java.util.Stack;

public class stackmin {
	  Stack<Integer> stack;
	    int minimum;

      stackmin() { 
	    	stack = new Stack<Integer>(); 
	    }
	 
	    void push(Integer i)
	    {
	        if (stack.isEmpty()) {
	            minimum = i;
	            stack.push(i);
	            System.out.println("The number inserted: " + i);
	            return;
	        }

	        if (i < minimum) {
	            stack.push(2 * i - minimum);
	            minimum = i;
	        } else
	            stack.push(i);
	 
	        System.out.println("The number inserted: " + i);
	    }

	    void pop()
	    {
	        if (stack.isEmpty()) {
	            System.out.println("There is nothing in the stack.");
	            return;
	        }
	 
	        System.out.print("The top element REMOVED: ");
	        Integer x = stack.pop();
	 
	        if (x < minimum) {
	            System.out.println(minimum);
	            minimum = 2 * minimum - x;
	        } else
	            System.out.println(x);
	    }
	    
	    void Min()
	    {
	        if (stack.isEmpty())
	            System.out.println("There is nothing in the stack.");
	        else
	            System.out.println("The minimum element in the stack is: " + minimum);
	    }
	}