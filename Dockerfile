FROM openjdk:8-jdk-alpine

MAINTAINER liunewshine@qq.com

ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone && mkdir -p /esms

WORKDIR /esms

EXPOSE 8090

ADD ./target/esms.jar ./

CMD java -Djava.security.egd=file:/dev/./urandom -jar esms.jar
