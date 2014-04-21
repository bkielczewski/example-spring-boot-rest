Example Spring Boot REST Service
================================

The article: [http://kielczewski.eu/2014/04/developing-restful-web-service-with-spring-boot/](http://kielczewski.eu/2014/04/developing-restful-web-service-with-spring-boot/)

Requirements
------------
* [Java Platform (JDK) 7](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Apache Maven 3.x](http://maven.apache.org/)

Quick start
-----------
1. `mvn package`
2. `java -jar target/example-spring-boot-rest-1.0-SNAPSHOT.jar`
3. Point your browser to [http://localhost:8080](http://localhost:8080)
4. `curl -X POST -d '{ "id": "test_id", "password": "test_password" }' http://localhost:8080/user`
5. Refresh the page