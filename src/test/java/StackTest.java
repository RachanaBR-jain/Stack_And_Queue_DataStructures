import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {


    @Test
    public void top_element_mustBePrintedFirst_When_pushed_3Values() {
        Node<Integer> myFirstNode = new Node<>(70);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(56);

        Stack stack = new Stack();
        stack.push(myFirstNode);
        stack.push(mySecondNode);
        stack.push(myThirdNode);
        stack.list();
    }

}
