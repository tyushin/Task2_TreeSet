import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class Tests {

    @Test
    public void testSubSet() {
        BinaryTree tree1 = new BinaryTree();
        List<Integer> nodes = Arrays.asList(1, 3, 4, 6, 8, 12);
        tree1.addAll(nodes);

        SortedSet<Integer> result1 = new TreeSet<>(Arrays.asList(3, 4, 6, 8));
        SortedSet<Integer> example1 = tree1.subSet(2, 9);

        SortedSet<Integer> result2 = new TreeSet<>(Arrays.asList(1, 3));
        SortedSet<Integer> example2 = tree1.subSet(-2, 4);

        SortedSet<Integer> result3 = new TreeSet<>(Arrays.asList(8, 12));
        SortedSet<Integer> example3 = tree1.subSet(8, 15);

        assertEquals(example1, result1);
        assertEquals(example2, result2);
        assertEquals(example3, result3);
    }

    @Test
    public void testHeadSet() {
        BinaryTree tree2 = new BinaryTree();
        List<Integer> nodes = Arrays.asList(1, 2, 4, 7, 9);
        tree2.addAll(nodes);

        SortedSet<Integer> result1 = new TreeSet<>(Arrays.asList(1, 2, 4));
        SortedSet<Integer> example1 = tree2.headSet(7);

        SortedSet<Integer> result2 = new TreeSet<>(Arrays.asList(1, 2, 4));
        SortedSet<Integer> example2 = tree2.headSet(6);

        assertEquals(example1, result1);
        assertEquals(example2, result2);
    }

    @Test
    public void testTailSet() {
        BinaryTree tree3 = new BinaryTree();
        List<Integer> nodes = Arrays.asList(1, 6, 7, 9, 11);
        tree3.addAll(nodes);

        SortedSet<Integer> result1 = new TreeSet<>(Arrays.asList(7, 9, 11));
        SortedSet<Integer> example1 = tree3.tailSet(7);

        SortedSet<Integer> result2 = new TreeSet<>(Arrays.asList(9, 11));
        SortedSet<Integer> example2 = tree3.tailSet(8);

        assertEquals(example1, result1);
        assertEquals(example2, result2);
    }

}