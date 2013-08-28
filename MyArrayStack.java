
import java.util.*;

public class MyArrayStack implements Stack
{
    private  int top;
    private  Object[] stack;
    
    public MyArrayStack(int initialCapacity)
    {
        if(initialCapacity<1)
        {
          throw new IllegalArgumentException("initial capacity must be >=1");  
        }
        
        stack=new Object[initialCapacity];
        top=-1;
    }
	
    public MyArrayStack()
    {
        this(20);
    }
	
    public void push(Object  theElement)
    {
        if(top==stack.length-1)
        {
            stack=changeLength(stack,2*stack.length);
			/*Object[] newArray=new Object[2*stack.length];
			System.arraycopy(stack, 0, newArray,0, a.length);
			stack = newArray;*/
        }
		top = top +1;
        stack[top]=theElement;
    }
    public static Object[] changeLength(Object[] a, int newLength)
    {
        Object[] newArray=new Object[newLength];
        System.arraycopy(a, 0, newArray,0, a.length);
        
        return newArray;
    }
    
    //@SuppressWarnings("unchecked")
    public Object  pop()
    {
        if(empty())
        {
            throw new EmptyStackException();
        }
        Object  topElement = stack[top];
        stack[top--]=null; // garbage collection.
		
        return topElement;
    }
    
    //@SuppressWarnings("unchecked")
    public Object peek()
    {
        if(empty())
        {
            throw new EmptyStackException();
        }
        return stack[top];
    }
	
    public boolean empty()
    {
        return (top==-1);
    }
    public static void main(String args[])
    {
        MyArrayStack s=new MyArrayStack(4);
        s.push(1);
        s.push(2);
        s.push(43);
        s.pop();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(19);
        s.pop();
        s.push(9);
        s.push(10);
        
        
        if(!s.empty()) 
		System.out.print(s.pop());

        while (!s.empty()) {
            System.out.print("->"+s.pop());
        }
        System.out.println();
    }
}
