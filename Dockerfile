#FROM hub.c.163.com/wuxukun/maven-aliyun:3-jdk-8
#
#ADD pom.xml /tmp/build/
#
#ADD src /tmp/build/src
#        #构建应用
#RUN cd /tmp/build && mvn clean package \
#        #拷贝编译结果到指定目录
#        && mv target/*.jar /app.jar \
#        #清理编译痕迹
#        && cd / && rm -rf /tmp/build
#
#VOLUME /tmp
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","/app.jar"]

FROM kimicheng/jdk1.8.0_91
MAINTAINER lm65589@163.com
#设置docker容器的工作区
WORKDIR /app
ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8
 #拷贝当前目录下的jar到docker容器中
COPY app-0.0.1-SNAPSHOT.jar /app/app.jar
#对外开放端口
EXPOSE 8787
CMD java -jar /app/app.jar  #最后运行的命令