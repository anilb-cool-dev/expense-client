=========================================

How do I transfer a file from local windows to my linux instance in AWS?

Use pscp that comes with putty.
C:\>pscp -i "C:\Users\anilb\Desktop\Tech\AWS Keys\MyLinuxBuildEnv.ppk" c:\apache-maven-3.5.0-bin.tar.gz ec2-user@ec2-34-210-13-156.us-west-2.compute.amazonaws.com:/home/ec2-user/maven.tar.gz

=========================================

Download git for windows

https://git-scm.com/download/win

=========================================

How to reset credentials in git

Go to Control Panel > User Accounts > Credential Manager > Windows Credentials. You will see Git credentials in the list

=========================================

How do I install git?

sudo yum install git

=========================================

How do I install maven?

tar xzvf apache-maven-3.5.0-bin.tar.gz

=========================================

How do I install JDK?

tar xzvf jdk-8u121-linux-x64.tar.gz

=========================================

How to remember git credentials?

git config credential-helper store
The creds are  stored in .git-credentials

=========================================

How to install and uninstall tomcat7?

sudo yum install tomcat
sudo yum install tomcat7-webapps tomcat7-docs-webapp tomcat7-admin-webapps
sudo yum remove tomcat

Also see :
https://www.digitalocean.com/community/tutorials/how-to-install-apache-tomcat-7-on-centos-7-via-yum

===========================================

How to install Jenkins?

sudo su
wget -O /etc/yum.repos.d/jenkins.repo http://pkg.jenkins-ci.org/redhat-stable/jenkins.repo
rpm --import http://pkg.jenkins-ci.org/redhat-stable/jenkins-ci.org.key
yum install jenkins
service jenkins start
chkconfig jenkins on

Open your browser and navigate to http://<Elastic-IP>:8080. You will see jenkins dashboard
============================================

How to install docker?

sudo yum install -y docker
http://docs.aws.amazon.com/AmazonECS/latest/developerguide/docker-basics.html

===========================================

What is the app URL?

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
to print these variables use command printenv

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
