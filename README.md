Step 1:

Services:
1.	Service Registry (8761), 
2.	User Service (9011), 
3.	Department Service (9012)

GIT Commands:
1.	git checkout -b step-1-service-reistry main 
2.	git add department-service/ user-service/ service-registry/
3.	git commit -m "Eureka Service Registry implementation with Dept and User Services" -n 
4.	git push --set-upstream origin step-1-service-reistry

Step 2:

Services:
1.	Service Registry (8761),
2.	cloud-gateway (9191), 
3.	User Service (9011), 
4.	Department Service (9012)

GIT Commands:
1.	git checkout -b step-2-api-gateway step-1-service-reistry 
2.	git add department-service/ user-service/ service-registry/ cloud-gateway/ assets/ 
3.	git commit -m "API GW implementation for Dept and User Services" -n 
4.	git push --set-upstream origin step-2-api-gateway


Step 3:

Services:
1.	Service Registry (8761), 
2.	cloud-config-server (9020), 
3.	cloud-gateway (9191), 
4.	User Service (9011), 
5.	Department Service (9012)

GIT Commands:
1.	git checkout -b step-3-cloud-config-server step-2-api-gateway 
2.	git add department-service/ user-service/ service-registry/ cloud-gateway/ cloud-config-server/ assets/ 
3.	git commit -m "Cloud Config Server implementation for Dept and User Services" -n 
4.	git push --set-upstream origin step-3-cloud-config-server

Step 4:
1.	Service Registry (8761),
2.	cloud-config-server (9020),
3.	cloud-gateway (9191), 
4.	user Service (9011), 
5.	department Service (9012) with Slueth and Zipkin

Zipkin Download and Run commands:
1.	curl -sSL https://zipkin.io/quickstart.sh | bash -s java -jar zipkin.jar
2.	Zipkin URL: http://127.0.0.1:9411/zipkin/

 

 

 

User & Department Service Logs:
2022-02-12 13:13:15.462 INFO [USER-SERVICE,33b5c8c18ed0b27f, 33b5c8c18ed0b27f] 3600 --- [nio-9012-exec-5] c.sivasankar.users.service.UserService : Inside getUserWithDepartment of UserService 
2022-02-12 13:13:15.466 INFO [DEPARTMENT-SERVICE,33b5c8c18ed0b27f, 442aa729e15c4ab9] 17664 --- [nio-9011-exec-5] c.s.d.service.DepartmentService : Inside saveDepartment of DepartmentService

TraceId: 33b5c8c18ed0b27f 
SpanId (for Department Service):  442aa729e15c4ab9

 
