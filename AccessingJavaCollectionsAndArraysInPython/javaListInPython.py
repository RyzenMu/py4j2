from py4j.java_gateway import JavaGateway

gateway = JavaGateway()

#creating and accessing java list
lst = gateway.jvm.java.util.ArrayList()
lst.append('red') # calling Python method
lst.add(3) #calling Java Method

print(lst)