## Build
```
mvn clean package -DskipTests -Pnative native:compile
```

## Run
Change dir
```
cd target
```
Run jar file
```
java -jar test_graalvm.jar
```
Run native image
```
test_graalvm.exe
```

## Results
![results](results/Screenshot_2024-11-13%20004631.png)
![results](results/Screenshot_2024-11-13%20004925.png)

## Reference
* [spring.io](https://docs.spring.io/spring-boot/how-to/native-image/developing-your-first-application.html)
* [medium](https://medium.com/graalvm/using-graalvm-and-native-image-on-windows-10-9954dc071311)
* [graalvm](https://www.graalvm.org/latest/reference-manual/native-image/)