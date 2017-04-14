How to install and uninstall tomcat7?

sudo yum install tomcat7-webapps tomcat7-docs-webapp tomcat7-admin-webapps
sudo yum remove tomcat7

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
