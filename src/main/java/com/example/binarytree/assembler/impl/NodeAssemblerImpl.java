package com.example.binarytree.assembler.impl;

import com.example.binarytree.assembler.NodeAssembler;
import com.example.binarytree.dto.NodeDto;
import com.example.binarytree.entity.Node;

public class NodeAssemblerImpl implements NodeAssembler {

    @Override
    public Node toEntity(NodeDto nodeDto) {
        return new Node(nodeDto.getValue(), nodeDto.getLeft(), nodeDto.getRight());
    }

    @Override
    public NodeDto toDto(Node node) {
        return new NodeDto(node.getValue(), node.getLeft(), node.getRight());
    }
}
