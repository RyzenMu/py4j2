from py4j.java_gateway import JavaGateway

gateway = JavaGateway()

intArray = gateway.new_array(gateway.jvm.int, 2)

intArray[0] = 64
intArray[1] = 65

for value in intArray:
    print(value)