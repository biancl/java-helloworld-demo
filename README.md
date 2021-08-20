# Demo for Springboot & Docker 
Public Docker Image: biancl/java-helloworld-demo:0.1

## Compile and Build Docker Image
```
mvn clean package
docker build . -t java-helloworld-demo:0.1
```

## Run With Docker Image
```
docker run -d --name=demo -p 8080:8080 java-helloworld-demo:0.1
```

## Run With Maven 3
```
mvn clean spring-boot:run 
```

## API List
1. Default 
    - path：/
    - method: get
    - parameters：
    - result：Hello,{name}
    - example: curl http://<server>:8080/
1. plus
    - path：/plus
    - method：get
    - parameters： [double]x、[double]y
    - result：x+y
    - example: curl http://<server>:8080/plus?x=10&y=8
1. minus
    - path：/minus
    - method：get
    - parameters： [double]x、[double]y
    - result：x-y
    - example: curl http://<server>:8080/minus?x=10&y=8
