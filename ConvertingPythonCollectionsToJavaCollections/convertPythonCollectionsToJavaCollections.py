from py4j.java_gateway import JavaGateway, GatewayParameters
gateway = JavaGateway(gateway_parameters=GatewayParameters(auto_convert=True))
from py4j.java_collections import ListConverter
pythonList = [3, 87, 1, 78, 4]
pythonList1 = pythonList
javaList = ListConverter().convert(pythonList, gateway._gateway_client)
gateway.jvm.java.util.Collections.sort(javaList)
print(pythonList, javaList)

print(pythonList1)
gateway.jvm.java.util.Collections.sort(pythonList1)
print(pythonList1)