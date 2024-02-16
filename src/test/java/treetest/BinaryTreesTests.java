package treetest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sdag.trees.BTNode;
import org.sdag.trees.BinaryTree;

import java.util.Random;

public class BinaryTreesTests {
    BinaryTree tree = new BinaryTree();

    @Test
    public void testInsertTree() {
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        Assertions.assertTrue(tree.search(5));
        Assertions.assertTrue(tree.search(3));
        Assertions.assertTrue(tree.search(7));
        Assertions.assertTrue(tree.search(2));
        Assertions.assertTrue(tree.search(4));
        Assertions.assertTrue(tree.search(6));
        Assertions.assertTrue(tree.search(8));

        Assertions.assertFalse(tree.search(1));
        Assertions.assertEquals(7, tree.size());

    }

    @Test
    public void testSizeTree() {
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        Assertions.assertEquals(7, tree.size());
    }

    @Test
    public void testHeightTree() {
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(1);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        Assertions.assertEquals(4, tree.height());
    }

    @Test
    public void testSearchData() {
        Assertions.assertFalse(tree.search(5));
        Assertions.assertFalse(tree.search(4));

        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        Assertions.assertTrue(tree.search(5));
        Assertions.assertTrue(tree.search(4));
        Assertions.assertFalse(tree.search(9));

        BinaryTree tree2 = new BinaryTree(5);
        Assertions.assertTrue(tree2.search(5));
    }

    @Test
    public void testGetRoot() {
        BTNode m = tree.getRoot();
        Assertions.assertNull(m);
        BinaryTree tree5 = new BinaryTree(10);

        BTNode r = tree5.getRoot();
        Assertions.assertNotNull(r);
        Assertions.assertEquals(10, r.data);
    }


    @Test
    public void testGetNode() {
        int value = 5;
        int value2 = 3;
        int value3 = 2;
        BinaryTree tree2 = new BinaryTree(value);
        Assertions.assertEquals(value, tree2.getNode(value).data);

        tree.insert(value2);
        tree.insert(7);
        tree.insert(value3);
        tree.insert(4);

        Assertions.assertEquals(value2, tree.getNode(value2).data);
        Assertions.assertEquals(value3, tree.getNode(value3).data);
        Assertions.assertEquals(7, tree.getNode(7).data);
        Assertions.assertEquals(4, tree.getNode(4).data);
    }

    @Test
    public void testPreOrder() {
        BinaryTree preTree = new BinaryTree();
        preTree.insert(8);
        preTree.insert(5);
        preTree.insert(6);
        preTree.insert(9);
        preTree.insert(3);
        preTree.insert(4);
        preTree.insert(2);
        preTree.insert(7);
        preTree.insert(10);

        int[] expected = {8, 5, 3, 2, 4, 6, 7, 9, 10};

        int[] result = preTree.preOrder();

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testInOrder() {
        BinaryTree inTree = new BinaryTree();
        inTree.insert(8);
        inTree.insert(5);
        inTree.insert(6);
        inTree.insert(9);
        inTree.insert(3);
        inTree.insert(4);
        inTree.insert(2);
        inTree.insert(7);
        inTree.insert(10);

        int[] expected = {2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] result = inTree.inOrder();

        Assertions.assertArrayEquals(expected, result);

    }

    @Test
    public void testPostOrder() {
        BinaryTree postTree = new BinaryTree();
        postTree.insert(8);
        postTree.insert(5);
        postTree.insert(6);
        postTree.insert(9);
        postTree.insert(3);
        postTree.insert(4);
        postTree.insert(2);
        postTree.insert(7);
        postTree.insert(10);

        int[] expected = {2, 4, 3, 7, 6, 5, 10, 9, 8};

        int[] result = postTree.postOrder();

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testDeleteTree() {
        BinaryTree tr = new BinaryTree();
        tr.insert(5);
        tr.insert(3);
        tr.insert(7);
        tr.insert(2);
        tr.insert(4);
        tr.insert(6);
        tr.insert(8);

        Assertions.assertTrue(tr.search(3));
        Assertions.assertTrue(tr.search(7));
        Assertions.assertTrue(tr.search(4));
        Assertions.assertTrue(tr.search(6));

        tr.delete(3);
        tr.delete(7);

        Assertions.assertFalse(tr.search(3));
        Assertions.assertFalse(tr.search(7));

        Assertions.assertTrue(tr.search(5));
        Assertions.assertTrue(tr.search(2));
        Assertions.assertTrue(tr.search(4));
        Assertions.assertTrue(tr.search(6));
        Assertions.assertTrue(tr.search(8));
    }
}
