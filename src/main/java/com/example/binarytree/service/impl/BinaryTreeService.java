package com.example.binarytree.service.impl;

import com.example.binarytree.dto.inputDataDto;
import com.example.binarytree.entity.BinaryTree;
import com.example.binarytree.entity.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BinaryTreeService implements com.example.binarytree.service.BinaryTreeService {

    private ArrayList<Integer> inOrder;
    private ArrayList<Integer> postOrder;

    @Autowired
    public BinaryTreeService() {
        this.inOrder = new ArrayList<>();
        this.postOrder = new ArrayList<>();
    }

    @Override
    public BinaryTree create(inputDataDto inputDataDto){
        BinaryTree binaryTree = new BinaryTree();

        inputDataDto.getData().forEach(number->{
            add(binaryTree, number);
        });

        return  binaryTree;
    }

    @Override
    public int lowerCommonAncestor( Node root,int firstNumber, int secondNumber){

        this.traverseInOrder(root);
        this.traversePostOrder(root);;
        int indexInOrder= this.inOrder.indexOf(firstNumber);
        int indexPostOrder= this.inOrder.indexOf(secondNumber);

        List<Integer>  subList;

        if(indexInOrder < indexPostOrder)
            subList = this.getInOrder().subList((indexInOrder+1), indexPostOrder);
        else
            subList = this.getInOrder().subList((indexPostOrder+1), indexInOrder);

        int maximum = 0;

        for (int data: subList) {
            int index = this.getPostOrder().indexOf(data);
            if(index > maximum)
                maximum = index;
        }

        return this.getPostOrder().get(maximum);

    }

    private void add(BinaryTree binaryTree , int value) {
        binaryTree.setRoot(addRecursive(binaryTree.getRoot(), value));
    }


    private Node addRecursive(Node current, int value) {

        if (current == null) {
            return new Node(value);
        }

        if (value < current.getValue()) {
            current.setLeft( addRecursive(current.getLeft(), value));
        } else if (value > current.getValue()) {
            current.setRight( addRecursive(current.getRight(), value));
        } else {

            return current;
        }

        return current;
    }


    private void traverseInOrder(Node node){
        if (node != null) {
            traverseInOrder(node.getLeft());
            this.inOrder.add(node.getValue());
            traverseInOrder(node.getRight());
        }

    }

    private void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.getLeft());
            traversePostOrder(node.getRight());
            this.postOrder.add(node.getValue());
        }
    }

    private ArrayList<Integer> getInOrder() {
        return inOrder;
    }

    private ArrayList<Integer> getPostOrder() {
        return postOrder;
    }
}
