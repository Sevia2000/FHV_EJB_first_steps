package com.beans;

import com.pojos.TestPerson;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import java.util.List;

@Remote
public interface PersonRemote {

    TestPerson getFirstPerson();
    TestPerson getLastPerson();
    void addPersonPerson(TestPerson cPerson);
    List<TestPerson> getAllPersons();
}
