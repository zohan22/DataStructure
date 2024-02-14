package org.sdag.trees;

import java.util.Arrays;

public class BinaryTree implements IBinaryTree{
    public BTNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(int data) {
        root = new BTNode(data);
    }

    @Override
    public void insert(int data) {
        root = insert(root, data);
    }

    @Override
    public boolean search(int data) {
        return search(root, data);
    }

    @Override
    public BTNode getRoot() {
        return root;
    }

    @Override
    public BTNode getNode(int data) {
        return getNode(root, data);
    }

    @Override
    public void delete(int data) {
        root = delete(root, data);
    }

    @Override
    public int[] inOrder() {
        int treeSize = size();
        int[] result = new int[treeSize];
        inOrder(root, result,0);
        System.out.println(Arrays.toString(result));
        return result;
    }

    @Override
    public int[] preOrder() {
        int treeSize = size();
        int[] result = new int[treeSize];
        preOrder(root, result,0);
        System.out.println(Arrays.toString(result));
        return result;
    }

    @Override
    public int[] postOrder() {
        int treeSize = size();
        int[] result = new int[treeSize];
        postOrder(root, result,0);
        System.out.println(Arrays.toString(result));
        return result;
    }

    @Override
    public int height() {
        return height(root);
    }

    @Override
    public int size() {
        return size(root);
    }

    @Override
    public void print() {
        System.out.println("Array traversal PreOrder");
        var preOrder = preOrder();
        for(int j : preOrder) {
            System.out.print(j + " - ");
        }
        System.out.println();
        System.out.println("Array traversal InOrder");
        var inOrder = inOrder();
        for(int i : inOrder) {
            System.out.print(i + " - ");
        }
        System.out.println();
        System.out.println("Array traversal PostOrder");
        var postOrder = postOrder();
        for(int z : postOrder) {
            System.out.print(z + " - ");
        }
        System.out.println();
    }

    private static BTNode delete(BTNode root, int data) {
        if(root == null) {
            return null;
        }

        if(data < root.data) {
            root.left = delete(root.left, data);
        }

        else if(data > root.data) {
            root.right = delete(root.right, data);
        }

        else {
            // Node Leaf
            if(root.left == null && root.right == null) {
                return null;
            }

            if(root.left == null) {
                return root.right;
            }

            if(root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }

        return root;
    }

    private static int minValue(BTNode node) {
        int minv = node.data;
        while (node.left != null) {
            minv = node.left.data;
            node = node.left;
        }
        return minv;
    }

    private static int preOrder(BTNode root, int[] result, int index) {
        if(root == null) {
            return index;
        }

        result[index++] = root.data;
        index = preOrder(root.left, result, index);
        index = preOrder(root.right, result, index);

        return index;

    }

    private static int inOrder(BTNode root, int[] result, int index) {
        if(root == null) {
            return index;
        }


        index = inOrder(root.left,result,index);
        result[index++] = root.data;
        index = inOrder(root.right,result,index);

        return index;
    }

    private static int postOrder(BTNode root, int[] result, int index) {
        if(root == null) {
            return index;
        }

        index = postOrder(root.left,result,index);
        index = postOrder(root.right,result,index);
        result[index++] = root.data;

        return index;
    }

    private static boolean search(BTNode root, int data) {
        if(root == null) {
            return false;
        }

        if(root.data == data) {
            return true;
        }

        if(data < root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }

    private static BTNode getNode(BTNode root, int data) {
        if(root == null) {
            return null;
        }

        if(root.data == data) {
            return root;
        }

        if(data < root.data) {
            return getNode(root.left, data);
        } else {
            return getNode(root.right, data);
        }
    }

    private static BTNode insert(BTNode root, int data) {
        if(root == null) {
            return new BTNode(data);
        }

        if(data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }


    private static int size(BTNode root) {
        if(root == null) {
            return 0;
        }

        return 1 + size(root.left) + size(root.right);
    }

    private static int height(BTNode root) {
        if(root == null) {
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }
}
