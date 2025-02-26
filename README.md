## Algoritms with Java

### 개선점 or Tips

1. #### ```System.out.println()```말고 ```BufferedWriter``` 쓰자.<br>
   ```BufferedWriter``` 를 사용하면 코드가 출력을 모아서 한 번에 처리하기 때문에 빠름.<br>
   ```System.out.println()```를 반복적으로 호출하면 출력할 때마다 I/O 처리가 발생하여 속도가 느려짐.