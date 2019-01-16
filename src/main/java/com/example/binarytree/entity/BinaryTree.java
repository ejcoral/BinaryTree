package com.example.binarytree.entity;

import lombok.Data;

@Data
public class BinaryTree {

    Node root;

    public BinaryTree() {

    }
    public BinaryTree(Node root) {
        this.root = root;
    }
}
