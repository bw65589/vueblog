#FROM kimicheng/jdk1.8.0_91
#MAINTAINER 754369677@qq.com
##设置docker容器的工作区
#WORKDIR /app
#ENV LANG en_US.UTF-8
#ENV LANGUAGE en_US:en
#ENV LC_ALL en_US.UTF-8
# #拷贝当前目录下的jar到docker容器中
#COPY app-0.0.1-SNAPSHOT.jar /app/app.jar
##对外开放端口
#EXPOSE 8787
#CMD java -jar /app/app.jar  #最后运行的命令

#FROM openjdk:8-jdk-alpine
FROM hub.c.163.com/dwyane/openjdk:8
VOLUME /tmp
ADD docker-springboot-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]