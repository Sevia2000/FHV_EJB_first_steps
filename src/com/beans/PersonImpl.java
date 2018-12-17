package com.beans;

import com.pojos.TestPerson;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import java.util.LinkedList;
import java.util.List;

@Stateful(mappedName = "PersonBean")
@Remote(PersonRemote.class)
public class PersonImpl implements PersonRemote {

    private List<TestPerson> allPersons;

    public PersonImpl(){
        initPersons();
    }

    private void initPersons(){
        allPersons = new LinkedList<>();
        allPersons.add(new TestPerson(1, "Severin"));
        allPersons.add(new TestPerson( 2, "Marcel"));
        allPersons.add(new TestPerson(3, "Lukas"));
        allPersons.add(new TestPerson(4, "Adrian"));
        allPersons.add(new TestPerson(5, "Marc"));
    }

    @Override
    public TestPerson getFirstPerson() {
        if(allPersons == null) return null;
        else if(allPersons.isEmpty()) return null;
        return allPersons.get(0);
    }

    @Override
    public TestPerson getLastPerson() {
        if(allPersons == null) return null;
        else if(allPersons.isEmpty()) return null;
        return allPersons.get(allPersons.size() - 1);
    }

    @Override
    public void addPersonPerson(TestPerson cPerson) {
        if(allPersons == null) allPersons = new LinkedList<>();
        allPersons.add(cPerson);
    }

    @Override
    public List<TestPerson> getAllPersons() {
        return allPersons;
    }
}
