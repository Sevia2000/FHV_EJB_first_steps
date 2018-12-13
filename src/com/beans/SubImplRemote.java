package com.beans;

import javax.ejb.Remote;

@Remote
public interface SubImplRemote {

    int sub(int a, int b);
}
