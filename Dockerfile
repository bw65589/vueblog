#基础镜像
FROM openjdk:8
#WORKDIR /var/jenkins_home/workspace/vueblog
#作者
MAINTAINER  <1973322410@qq.com>

VOLUME /tmp
#指定配置文件，以及jar包在服务器上的路径
RUN ["chmod", "+x", "/var/jenkins_home/workspace/vueblog/vueblog.jar"]
ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","/var/jenkins_home/workspace/vueblog/vueblog.jar"]
#ENTRYPOINT ["sh","-c","java -jar /var/jenkins_home/workspace/vueblog/vueblog.jar"]
#暴露端口
EXPOSE 8080