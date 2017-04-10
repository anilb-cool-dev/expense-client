What is the URL?

http://localhost:8081/expense/expense

==========================================

where is the tomcat folder?

/usr/share/tomcat7

==========================================

What should be in tomcat-users.xml?

	<role rolename="manager-gui"/>
	<role rolename="manager-script"/>
	<user username="tomcat" password="s3cret" roles="manager-gui,manager-script"/>

=========================================

Where are environment variables persisted in?

/home/ec2-user/.bash_profile

=========================================
