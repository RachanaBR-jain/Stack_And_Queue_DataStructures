public class Queue <K> {
    LinkedList linkedList;

    public Queue()
    {
        this.linkedList=new LinkedList();
    }

    public void enqueue(INode myNode) {
        linkedList.insertAtLast(myNode);
    }

    public void dequeue() {
        this.linkedList.deleteFirst();
    }

    public void printQueue() {
        linkedList.printMyNodes();
    }

    public INode peak() {
        return linkedList.head;
    }
}


