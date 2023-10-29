package InvokingParameterizedPythonMethodFromJava;
// package py4j.examples;
import java.util.ArrayList;
import py4j.GatewayServer;

public class pythonMethodFromJava {
    public void ListOperation(pythonMethodFromJava op) {
        ArrayList <Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        ArrayList<Integer> result = op.Update(numbers);
        System.out.println("Updated list :");
        for (int i =0; i < result.size(); i++ ) {
            System.out.print(result.get(i));
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        GatewayServer gatewayServer = new GatewayServer(new pythonMethodFromJava());
        gatewayServer.start();
        System.out.println("gateway server started");
    }
}
