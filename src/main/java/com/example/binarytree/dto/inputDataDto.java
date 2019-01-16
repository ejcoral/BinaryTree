package com.example.binarytree.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class inputDataDto {

    private List <Integer> data;
    private int firstNumber;
    private int secondNumber;

    public inputDataDto() {

    }

    public inputDataDto(List<Integer> data, int firstNumber, int secondNumber) {

        this.data = data;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    private List<Integer> convertJsonData(){
        List<Integer> data = new ArrayList<>();
        return data;
    }
}
