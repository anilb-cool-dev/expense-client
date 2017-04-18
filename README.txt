
How to install and uninstall tomcat7?

sudo yum install tomcat7-webapps tomcat7-docs-webapp tomcat7-admin-webapps
sudo yum remove tomcat7

===========================================

How to install docker?

sudo yum install -y docker
http://docs.aws.amazon.com/AmazonECS/latest/developerguide/docker-basics.html

===========================================

What is the URL?

http://localhost:8080/expense/JSP/ReportsList.jsp
http://localhost:8081/expense/expense

============================================

where is the tomcat folder?

/etc/tomcat7
/usr/share/tomcat7

==========================================

How to restart tomcat7

sudo service tomcat7 start
sudo service tomcat7 stop
sudo service tomcat7 restart

tomcat7 stop
tomcat7 start

==========================================

What should be in tomcat-users.xml?

	<role rolename="manager-gui"/>
	<role rolename="manager-script"/>
	<user username="tomcat" password="s3cret" roles="manager-gui,manager-script"/>

=========================================

Where are environment variables persisted in?

/home/ec2-user/.bash_profile

=========================================

How to swith to get root access?

sudo su

=========================================

How to deploy/undeploy?

mvn tomcat7:deploy
mvn tomcat7:undeploy
mvn tomcat7:redeploy

=========================================

Dockerization

A great resource is at http://trimc-devops.blogspot.com/2015/03/running-docker-applications-apache.html
Basic useful commands
$docker build -t anilbhagwat/expense-client .
$docker run -p 8080:8080 anilbhagwat/expense-client
$docker login
$docker push anilbhagwat/expense-client
$docker pull anilbhagwat/expense-client

=========================================

How do I check IP addr of my VM?

/sbin/ifconfig

=========================================
