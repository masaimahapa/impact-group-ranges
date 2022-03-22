#Create Ranges
This project takes in a list of numbers and returns a list of Stings which are grouped into ranges provided that they are consecutive.

The following code;
```java
int[] numbers = {1,2,3,5,7,8,9,15,16,18};
System.out.println(App.createRanges(numbers));
```
returns 
```shell
[1-3, 5, 7-9, 15-16, 18]
```

## How to run
Make sure you are in the parent folder of this project and run the following command.
```shell
 ./gradlew run
```


## How to test
Make sure you are in the parent folder of this project and run the following command.
```shell
 ./gradlew test
```
