package com.example.binarytree.assembler;

public interface Assembler <DTO, ENTITY> {
    DTO toDto(ENTITY entity);
    ENTITY toEntity(DTO dto);
}
