package com.example.binarytree.assembler.impl;

import com.example.binarytree.assembler.BinaryTreeAssembler;
import com.example.binarytree.dto.BinaryTreeDto;
import com.example.binarytree.entity.BinaryTree;

public class BinaryTreeAssemblerImpl implements BinaryTreeAssembler {

    @Override
    public BinaryTreeDto toDto(BinaryTree binaryTree) {

        return new BinaryTreeDto(binaryTree.getRoot());
    }

    @Override
    public BinaryTree toEntity(BinaryTreeDto binaryTreeDto) {
        return new BinaryTree(binaryTreeDto.getRoot());
    }
}
