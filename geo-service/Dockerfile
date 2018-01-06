FROM openjdk:8-jdk-alpine
MAINTAINER staleks@gmail.com

VOLUME /tmp

ADD build/libs/geo-service-*.jar /opt/app.jar

ADD ./start-service.sh /opt/start-service.sh
RUN chmod +x /opt/start-service.sh

ENTRYPOINT ["/opt/start-service.sh"]
CMD ["-Xmx48m", "-Xss256k"]

