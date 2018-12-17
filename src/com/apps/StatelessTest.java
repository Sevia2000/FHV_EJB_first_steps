package com.apps;

import com.beans.AdderImplRemote;
import com.beans.IncreaseRemote;
import com.beans.SubImplRemote;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;
import java.util.stream.IntStream;

public class StatelessTest {

    @EJB private static AdderImplRemote adderStub;
    @EJB private static SubImplRemote subStub;

    public static void main(String[] args) throws NamingException {

        // environment
        Context context = new InitialContext(GenerateEnvironment());
        // Context context = new InitialContext();

        // stateless EJB
        System.out.println("\nstateless EJB \n");

        // AdderImplRemote remote = (AdderImplRemote)context.lookup("java:global/HelloSessionApp/AdderImpl/AdderBean");
        AdderImplRemote remote = (AdderImplRemote) context.lookup("AdderBean");
        System.out.println("Result of 32 + 32 = " + remote.add(32, 32));

        SubImplRemote subRemote = (SubImplRemote) context.lookup("SubBean");
        System.out.println("Result of 32 - 32 = " + subRemote.sub(32, 32));

        // System.out.println("Result of 32 + 32 = " + adderStub.add(32, 32));
        // System.out.println("Result of 32 - 32 = " + subStub.sub(32, 32));

        // stateful EJB
        System.out.println("\nstateful EJB \n");

        IncreaseRemote incRemote = (IncreaseRemote) context.lookup("IncBean");
        IntStream.range(1,5).forEach(x -> System.out.println("current number: " + incRemote.increaseNumber(x)));

        System.out.println("\n");
    }

    private static Properties GenerateEnvironment(){
        Properties environment = new Properties();
        environment.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.enterprise.naming.impl.SerialInitContextFactory");
        environment.put(Context.STATE_FACTORIES, "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
        environment.put(Context.URL_PKG_PREFIXES, "com.sun.enterprise.naming");
        // environment.put("org.omg.CORBA.ORBInitialHost", "192.168.1.3");
        // environment.put("org.omg.CORBA.ORBInitialPort", "3700");
        return environment;
    }
}
