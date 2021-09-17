package com.DSA_IN_JAVA;

import java.util.Scanner;

class Tree{
    static class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val = val;
            left = right = null;
        }
    }
    public Node Insert(Node node,int val){

        Node t = node;

        if(node == null){
            node.val = val;
            return node;
        }
        else if(val < node.val){
            if(node.left != null)
                Insert(node.left,val);
            else
                node.left = new Node(val);
        }
        else if(val > node.val){
            if(node.right != null)
                Insert(node.right,val);
            else
                node.right = new Node(val);
        }

        return t;
    }
    public void PreOrder(Node node){
        if(node != null){
            System.out.print(node.val + "  ");
            PreOrder(node.left);
            PreOrder(node.right);
        }
    }
    public static void main(String[] args) {
        Tree t = new Tree();

        Node root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("1)Insert   2)PreOrder   3)Exit\n");
        boolean f = true;
        while (f) {
            int i =0;
            int ch = sc.nextInt();
            switch (ch){
                case 1 :
                {
                    int val = sc.nextInt();

                    root = t.Insert(root,val);

                    break;
                }
                case 2:
                {
                    if(root != null)
                    t.PreOrder(root);
                    break;
                }
                case 3:
                    f = false;
            }
        }

    }
}