

public class ChainNode
{ 
	Object element;
    ChainNode next;
    
    public ChainNode()
    {
        element=null;
        next=null;
    }
    
    public ChainNode(Object element, ChainNode next)
    {
        this.element=element;
        this.next=next;
    }
    
    public ChainNode(Object element)
    {
        this.element=element;
    }
    
    public Object getElement()
    {
        return element;
    }
    public ChainNode getNext()
    {
        return next;
    }
    
    public void setElement(Object element)
    {
        this.element= element;
    }
	
    public void setNext(ChainNode next)
    {
        this.next=next;
    }
}
