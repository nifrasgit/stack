import java.util.*;
public class ChainStackPalin implements Stack
{
    ChainNode top ;
    
   public ChainStackPalin()
    {
        top=null;
    }
    
    public void push(Object element)
    {
        ChainNode tcn= new ChainNode(element,top);
        top=tcn;
    }
    
    public Object pop()
    {
        if (!empty())
        {
            Object tobeReturned=top.getElement();
            top=top.next;  //because of package visiblity
            //otherwise stack.setNext(stack.next);
            return tobeReturned;
        }
        throw new java.util.EmptyStackException();
    }
    
    public Object peek()
    {
        if (!empty())
        {
            return top.getElement();
        }
        throw new java.util.EmptyStackException();
    }
    
    public boolean empty()
    {
        return (top==null);
    }
    
	public void checkPalin(){
		Scanner S = new Scanner(System.in);
		String word = S.nextLine();
		word = word.toLowerCase();
		String palin="";
		for(int i=0; i<word.length(); i++)
		{
			int assci = (int)word.charAt(i);
			if(assci >=97 && assci<=122){
				palin += word.charAt(i);
				push(word.charAt(i));
			}
		}
		String revWord="";
		while(!empty()){
			revWord += pop();
		}
		System.out.println(palin);
		System.out.println(revWord);
		if(palin.equals(revWord)){
			System.out.println("Is Palin");
		}
		else{
		System.out.println("not");
		}
	}
	public static void main(String args[]){
		ChainStackPalin cs = new ChainStackPalin();
		//cs.push("kumar");
		//cs.push(10);
		//while(!cs.empty()){
		//System.out.println("POpit is "+cs.pop());}
		cs.checkPalin();
	}
}
