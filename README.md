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

 ![securityloginpage](https://github.com/vikuSingh/springsecurity/assets/20941580/68f81a34-2366-4188-a522-e37e086540c2)

     1. if user not exists Register user
        http://localhost:8080/register

![securityregistrationpage](https://github.com/vikuSingh/springsecurity/assets/20941580/bb54cd60-579b-404d-8045-e47722310c04)

     2. provide username password correct it redirect to dashboard page.

 ![securitydashboardpage](https://github.com/vikuSingh/springsecurity/assets/20941580/22cc9ce8-98a8-40d2-9f52-28e410b2ecba)

     3. if username ans password is not correct then it say Invalid username and password !


![springsecurityerrorpage](https://github.com/vikuSingh/springsecurity/assets/20941580/59d3d8af-bdf8-4da8-b37f-8afacc7517d6)

 That's all. Thanks.

