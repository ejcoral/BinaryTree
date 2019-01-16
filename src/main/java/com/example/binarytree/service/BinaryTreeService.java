package com.example.binarytree.service;

import com.example.binarytree.dto.inputDataDto;
import com.example.binarytree.entity.BinaryTree;
import com.example.binarytree.entity.Node;


public interface BinaryTreeService {

    BinaryTree create(inputDataDto inputDataDto);

    int lowerCommonAncestor( Node root,int firstNumber, int secondNumber);

}
