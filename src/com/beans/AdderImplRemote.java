package com.beans;

import javax.ejb.Remote;

@Remote
public interface AdderImplRemote {

    int add(int a, int b);
}
