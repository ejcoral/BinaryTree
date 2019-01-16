package com.example.binarytree.dto;

import com.example.binarytree.entity.Node;
import lombok.Data;

@Data
public class BinaryTreeDto {

    private Node root;

    public BinaryTreeDto() {
    }

    public BinaryTreeDto(Node node) {
        this.root = node;
    }
}
