# spring-cloud-microservices-practices


Step 1: 

Service Registry(8761), 
User Service (9011), 
Department Service (9012)



1.) git checkout -b step-1-service-reistry main
2.) git add department-service/ user-service/ service-registry/ README.md
3.) git commit -m "Eureka Service Registry implementation with Dept and User Services" -n
4.) git push --set-upstream origin step-1-service-reistry


Step 2:

Service Registry(8761), cloud-gateway(9191), User Service (9011), Department Service (9012)

git checkout -b step-2-api-gateway step-1-service-reistry
git add department-service/ user-service/ service-registry/ cloud-gateway/ assets/
git commit -m "API GW implementation for Dept and User Services" -n
git push --set-upstream origin step-2-api-gateway


Step 3:

 Service Registry(8761), cloud-config-server(9020), cloud-gateway(9191), User Service (9011), Department Service (9012)

 git checkout -b step-3-cloud-config-server step-2-api-gateway
 git add department-service/ user-service/ service-registry/ cloud-gateway/ cloud-config-server/ assets/
 git commit -m "Cloud Config Server implementation for Dept and User Services" -n
 git push --set-upstream origin step-3-cloud-config-server


GIT Help

$ git checkout -b <new_branch> <old_branch>
