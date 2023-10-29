package AccessingJavaCollectionsAndArraysInPython;

import py4j.GatewayServer;

public class javaListInPython {
    public String Message() {
        return " java server";
    }
    public static void main(String[] args) {
        System.out.println("package interupted");

        // gateway server starts here
        GatewayServer gatewayServer = new GatewayServer(new javaArraysInPython());
        gatewayServer.start();
        System.out.println("gateway server started");
    }
}
