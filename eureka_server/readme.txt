https://spring.io/projects/spring-cloud

Adding Spring Cloud To An Existing Spring Boot Application
If you an existing Spring Boot app you want to add Spring Cloud to that app, the first step is to determine the version of Spring Cloud you should use. The version you use in your app will depend on the version of Spring Boot you are using.

The table below outlines which version of Spring Cloud maps to which version of Spring Boot.

Table 1. Release train Spring Boot compatibility (see here for more detailed information).

Release Train	Spring Boot Generation
2025.1.x aka Oakwood	4.0.x
2025.0.x aka Northfields	3.5.x
2024.0.x aka Moorgate	3.4.x
2023.0.x aka Leyton	3.3.x, 3.2.x
2022.0.x aka Kilburn	3.0.x, 3.1.x (Starting with 2022.0.3)
2021.0.x aka Jubilee	2.6.x, 2.7.x (Starting with 2021.0.3)
2020.0.x aka Ilford	2.4.x, 2.5.x (Starting with 2020.0.3)
Hoxton	2.2.x, 2.3.x (Starting with SR5)
Greenwich	2.1.x
Finchley	2.0.x
Edgware	1.5.x
Dalston	1.5.x


curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar