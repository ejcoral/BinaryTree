package com.example.binarytree.dto;

import com.example.binarytree.entity.Node;
import lombok.Data;

@Data
public class NodeDto {


    private int value;
    private Node left;
    private Node right;

    public NodeDto() {
    }

    public NodeDto(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;

    }
}
