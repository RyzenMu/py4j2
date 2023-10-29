import py4j.GatewayServer;


public class helloClass {

    public String Message() {
        return "Hello py4j from java";
    }

    public int Calculation() {
        int q = 787;
        int w = 90890;
        int sum = q+w;
        return sum;
    }


    public static void main(String args[]) {
        System.out.println("Hello World");
        System.out.println(7657+6565-23424);

        // connection to gateway server
        GatewayServer gatewayServer = new GatewayServer(new helloClass());
        gatewayServer.start();
        System.out.println("gateway server started successfully from java 17");
    }
}
