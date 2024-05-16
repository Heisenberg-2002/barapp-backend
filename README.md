# barapp-backend

## launch app 

To launch the db with corones

```bash
docker-compose up -d
```

To launch the app

```bash
mvn clean package
java -jar target/barapp-backend-0.0.1-SNAPSHOT.jar
```

To stop 

```bash
docker-compose down
```