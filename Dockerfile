FROM tomcat:8-jre8
ADD target/expense.war /usr/local/tomcat/webapps

