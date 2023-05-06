# Use the official Tomcat 9 image as the base image
FROM tomcat:9

# Copy the helloworld.war file to the webapps directory of the Tomcat container
COPY /target/helloworld.war /usr/local/tomcat/webapps/

# Expose port 8080, which is the default port that Tomcat uses
EXPOSE 8080
