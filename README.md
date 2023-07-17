# springsecurity
Welcome to springsecurity example. In this example I am going to explain how we can authenticate our request and response in spring boot with help of spring default security implementation.

1. you need to add mysql jpa values application.properties

    spring.datasource.url=jdbc:mysql://localhost:3306/test
    spring.datasource.username=root
    spring.datasource.password=root
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true

2. To run this application go to SpringsecurityApplication and right click on that run as java-application. once application
   get successfully started Pls. try to access the application with below url:
    
	http://localhost:8080/login

C:\Users\n521745\Documents\workspace\tutorjava\image\securityloginpage.PNG

