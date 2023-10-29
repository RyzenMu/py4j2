package ConvertingPythonCollectionsToJavaCollections;

import py4j.GatewayServer;

public class convertPythonCollectionsToJavaCollections {
    public String Message() {
        return " java server";
    }
    public static void main(String[] args) {
        System.out.println("package interupted");

        // gateway server starts here
        GatewayServer gatewayServer = new GatewayServer(new convertPythonCollectionsToJavaCollections());
        gatewayServer.start();
        System.out.println("gateway server started");
    }
}
