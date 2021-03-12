import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {

    static  Stack stack = new Stack();

    @Test
    public static void top_element_mustBePrintedFirst_When_pushed_3Values() {
        Node<Integer> myFirstNode = new Node<>(70);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(56);

        stack.push(myFirstNode);
        stack.push(mySecondNode);
        stack.push(myThirdNode);
        stack.list();
    }


    @Test
    public void given3NumberInStack_WhenPoped_ShouldReturnEmpty() {
        top_element_mustBePrintedFirst_When_pushed_3Values();
        stack.pop();
        stack.pop();
        stack.pop();
        INode peak = stack.peak();
        System.out.println(" After pop "+ peak );
        Assertions.assertEquals(null, peak);
    }


}
