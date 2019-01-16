package com.example.binarytree.rest;

import com.example.binarytree.dto.inputDataDto;
import com.example.binarytree.entity.BinaryTree;
import com.example.binarytree.service.BinaryTreeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/exercise")
public class BinaryResource {

    private final BinaryTreeService binaryTreeService;

    @Autowired
    public BinaryResource(BinaryTreeService binaryTreeService) {
        this.binaryTreeService = binaryTreeService;
    }

    @PostMapping (consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BinaryTree createBinaryTree(@RequestBody inputDataDto inputDataDto){
        return binaryTreeService.create(inputDataDto);

    }

    @PostMapping (value="/lca" , consumes= MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Integer LowCommonAncestorBinaryTree(@RequestBody inputDataDto inputDataDto){
        BinaryTree binaryTree = binaryTreeService.create(inputDataDto);
        return binaryTreeService.lowerCommonAncestor(binaryTree.getRoot(), inputDataDto.getFirstNumber(), inputDataDto.getSecondNumber());

    }
}
