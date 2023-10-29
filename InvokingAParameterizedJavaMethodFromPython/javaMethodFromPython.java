package InvokingAParameterizedJavaMethodFromPython;

import py4j.GatewayServer;
import java.util.ArrayList;

public class javaMethodFromPython {
    public ArrayList <Integer> Update (ArrayList <Integer> lst) {
        for (int i = 0; i < lst.size(); i++) {
            lst.set(i, lst.get(i)*2);
        }
        return lst;
    }    

    public static void main(String[] args) {
        GatewayServer gatewayServer = new GatewayServer(new javaMethodFromPython());
        gatewayServer.start();
        System.out.println("gateway server started");
    }
}
