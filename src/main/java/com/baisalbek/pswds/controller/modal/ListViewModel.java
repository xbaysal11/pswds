package com.baisalbek.pswds.controller.modal;


import com.baisalbek.pswds.entities.Item;

import java.util.ArrayList;

import javax.validation.Valid;

public class ListViewModel {

    @Valid
    private ArrayList<Item> list = new ArrayList<Item>();

    public ListViewModel() {}

    public ListViewModel(ArrayList<Item> list) {
        this.list = list;
    }

    public ArrayList<Item> getList() {
        return list;
    }

    public void setList(ArrayList<Item> list) {
        this.list = list;
    }
}