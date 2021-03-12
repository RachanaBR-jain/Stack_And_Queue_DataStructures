
public class Stack <K> {
    private final LinkedList linkedList;

    public Stack(){
        this.linkedList=new LinkedList();
    }

    public void push( INode val)
    {
        this.linkedList.insertAtFirst(val);
    }
    public void pop( )
    {
        this.linkedList.deleteFirst();
    }
    public INode peak(){
        return this.linkedList.head;
    }
    public void list(){
        this.linkedList.printMyNodes();
    }
}
