# gateway-uaa-allinone-fixed
Working example of micro-service architecture with GW+AuthorizationServer all in one

## How to run?

1. In order to provide Docker images, those first needs to be built.
Execute Gradle build & buildDocker tasks to build Docker images.

In root of the project execute following command:

```
$ ./gradlew clean build buildDocker
```

2. Once previous step is finished, there should be notification that two Docker images are built.
In order to check if this is ok, execute following command:

```
$ docker images
```

3. If you have two images built like here:

```
REPOSITORY                 TAG                 IMAGE ID            CREATED             SIZE
staleksit/gw-auth-server   latest              e941bf166be1        10 minutes ago      144MB
staleksit/geo-service      latest              c1f5b526b44c        10 minutes ago      138MB
```

then you can execute docker compose command, that will, run Service Discovery (Consul) and two containers.
Before you start docker compose, please make sure that you don't have processes binded to 8080, 9090, 8300, 8400, 8500 & 8600.

If this is the case, run:

```
$ docker-compose up
```

After a while, check localhost:8500 in order to see that all services are up and green in Consul UI.


## Testing

1. Check if all services are UP & Running (status Green)
![Consul UI](images/sc-consul-001.png?raw=true)

2. Get OAuth2 JWT token at GW+Auth. server
![Getting OAuth2 JWT Token](images/sc-postman-001.png?raw=true)

3. Provide OAuth2 JWT token at Zuul, passing to Resource Server
![Request at Resource Server](images/sc-postman-002.png?raw=true)
