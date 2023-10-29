from py4j.java_gateway import JavaGateway, GatewayParameters
gateway = JavaGateway(gateway_parameters=GatewayParameters(auto_convert=True))
pythonList = eval(input('Enter the List'))
ob = gateway.entry_point
print('resultant list is ', ob.Update(pythonList))