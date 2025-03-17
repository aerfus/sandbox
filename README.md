# Sandbox

## Profiler

For profiler example.

### Steps
1. Run the command below
```bash
java -jar ./sandbox-0.0.1.jar
```
2. Wait till the process listens to the port _8080_
3. Navigate to Intellij IDEA or other IDE
4. Attach the profiler (should detect the process automatically)
5. Run the REST call below 2 or 3 times
```http request
POST http://localhost:8080/profiler
```
6. Stop both Profiler and the application
7. Enjoy the profiler`s result :-)
8. 22222