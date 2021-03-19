import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {
    @Test
    public void ableTo_CreateAQueueAndInsertElementAtRear() {
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(70);

        Queue myQueue = new Queue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();

        INode peak;
        peak = myQueue.peak();
        myQueue.printQueue();

        Assertions.assertEquals(myFirstNode, peak);
    }

}
