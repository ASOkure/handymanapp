FROM tomcat:8.0.20-jre8
ADD  /target/handymanapp.war /usr/local/tomcat/webapps
CMD ["catalina.sh", "run"]
EXPOSE 8080