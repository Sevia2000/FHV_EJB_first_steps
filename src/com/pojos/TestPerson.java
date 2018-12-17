package com.pojos;

import java.io.Serializable;

@SuppressWarnings("WeakerAccess")
public class TestPerson implements Serializable {

    private static final long serialVersionUID = 77433L;
    private int id;
    private String name;

    public TestPerson(){

    }

    public TestPerson(int cId){
        this();
        id = cId;
    }

    public TestPerson(int cId, String cNmae){
        this(cId);
        name = cNmae;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void print(){
        System.out.println("\nPerson id: " + id + "\nPerson name: " + name + "\n");
    }
}
