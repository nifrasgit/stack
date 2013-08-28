
public class ChainStack implements Stack
{
    ChainNode top ;
    
   public ChainStack()
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
    
	public static void main(String args[]){
		ChainStack cs = new ChainStack();
		cs.push("kumar");
		cs.push(10);
		while(!cs.empty()){
		System.out.println("POpit is "+cs.pop());}
	}
}
