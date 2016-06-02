### Sample project for http://stackoverflow.com/questions/37526576

On Unix run
```
./gradlew bootRun
```

On Windows run
```
gradlew.bat bootRun
```
----
Go to <http://localhost:8080/default/json> or <http://localhost:8080/rest/json> to view pure json response like this
```json
{
  "username":"superuser",
  "password":"secret",
  "email":"superuser@mail.com"
}
````
----
Go to <http://localhost:8080/default/html> or <http://localhost:8080/rest/html> to view pure json response like this
```json
{"response": "<div><h1>Java Spring creating response from template</h1><h2>User</h2><p>username: superuser</p><p>password: secret</p><p>email: superuser@mail.com</p></div>undefined</html>"}
````
