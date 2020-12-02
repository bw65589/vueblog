#基础镜像
FROM openjdk:8
WORKDIR /var/jenkins_home/workspace/vueblog
#作者
MAINTAINER  <1973322410@qq.com>

VOLUME /tmp
#指定配置文件，以及jar包在服务器上的路径
ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","vueblog.jar"]
#暴露端口
EXPOSE 8080