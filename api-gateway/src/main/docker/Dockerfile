FROM openjdk:15-jdk-alpine
# time zone
RUN echo "Asia/Chongqing" > /etc/timezone 
VOLUME /tmp
ADD api-gateway-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-Xmx512m","-jar","app.jar"]