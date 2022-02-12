# spring-cloud-microservices-practices


Step 1: 

Service Registry(8761), 
User Service (9011), 
Department Service (9012)



git checkout -b step-1-service-reistry main
git add department-service/ user-service/ service-registry/ README.md
git commit -m "Eureka Service Registry implementation with Dept and User Services" -n
git push --set-upstream origin step-1-service-reistry


Step 2:

Service Registry(8761), cloud-gateway(9191), User Service (9011), Department Service (9012)

git checkout -b step-2-api-gateway step-1-service-reistry
git add department-service/ user-service/ service-registry/ cloud-gateway/ assets/
git commit -m "API GW implementation for Dept and User Services" -n
git push --set-upstream origin step-2-api-gateway




GIT Help

$ git checkout -b <new_branch> <old_branch>
