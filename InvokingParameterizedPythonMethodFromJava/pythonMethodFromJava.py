from py4j.java_gateway import JavaGateway, GatewayParameters

class ListManipulation(object):
    def Update(self, lst):
        for i in range(0, len(lst)):
            lst[i] = lst[i] * 2
        print(lst)
        return lst
    
    class java:
        implements = ['py4j.InvokingParameterizedPythonMethodFromJava.pythonMethodFromJava']

if __name__=='__main__':
    gateway = JavaGateway(start_callback_server=True, gateway_parameters=GatewayParameters(auto_convert=True))
    lst = ListManipulation()
    javaClasslst = gateway.jvm.py4j.examples.pythonMethodFromJava()
    # pass python object to the java program
    javaClasslst.ListOperation(lst)