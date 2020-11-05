# Alumno app demo
[![Build Status](https://travis-ci.com/niconunez96/springboot-app-demo.svg?branch=develop)](https://travis-ci.com/niconunez96/springboot-app-demo)
##### Link aplicación
[Heroku app](https://app-alumno.herokuapp.com/api/v1/alumnos)
##### Link documento
[Documento Drive](https://docs.google.com/document/d/12PRIqCHs3IRWR-Vs16hX2VLF_d2pKQXB3I3Wryk1X-A/edit?usp=sharing)

## Descripción
Demo de despliegue de una aplicación springboot, con Docker y Kubernetes

## Desarrollo

### Docker
1. Empaquetar la API (`mvn clean package`)
2. Correr containers (`docker-compose up --build -d`)
3. Cuando finalice el proceso de desarrollo utilizar (`docker-compose down`)
#### Ver Logs y estado de los containers
4. Para ver Logs de la aplicacion, correr: `docker logs -f alumnos-app`
5. Para ver el estado de los contenedores: `docker-compose ps`
#### Como entrar a un container
6. Para la aplicacion Spring: `docker exec -it alumnos-app bash`
7. Para la BD mysql: `docker exec -it mysql-client mysql -u dev_user --password=1234`


### Kubernetes
1. Levantar cluster de Minikube con: `minikube start`
2. Si es la primera vez que se corre la aplicacion: `kubectl apply -f mysql-persistent-volume.yml`
3. Correr deployment de la BD MySql: `kubectl apply -f mysql-server.yml`
4. Para correr deployment de la Aplicacion Spring: `kubectl apply -f alumnos-server.yml`
5. Para correr la aplicacion verificar la IP, puertos: `minikube service alumnos-server-port --url`
#### Ver logs y estado de los PODS
6. Para ver el estado de los PODS: `kubectl get pods`
7. Para ver el estado particular de un POD: `kubectl describe pod -namepod-`
8. Para ver los logs de la aplicacion correr: `kubectl logs -f -namepod-`
#### Como entrar a un POD
6. Para la aplicacion Spring: `kubectl exec -it -namepod- bash`
7. Para la BD mysql: `kubectl exec -it -mysql-namepod- mysql -u apirest-user --password=1234`

## Proceso de desarrollo
1. Moverte a la rama `develop`. (`git checkout develop`)
2. Crear una rama issue. (`git checkout -b issue#1`)
3. Realizar commits.
4. Pushear rama issue. (`git push origin issue#1`)
5. Crear `Pull request`
6. Mergear rama issue a `develop`

## Proceso de release
1. Moverte a la rama `develop`. (`git checkout develop`)
2. Crear una rama release. (`git checkout -b release-vX.X.X`)
3. Crear una tag. (`git tag -a vX.X.X-release -m "msg"`)
4. Pushear tag (`git push origin vX.X.X-release`)
5. Borrar main y crear main a partir de la branch release (`git branch -D main; git checkout -b main`)
6. Hacer push force de main (`git push origin main -f`)


