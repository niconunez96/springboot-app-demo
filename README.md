# Alumno app demo
[![Build Status](https://travis-ci.com/niconunez96/springboot-app-demo.svg?branch=develop)](https://travis-ci.com/niconunez96/springboot-app-demo)
##### Link aplicación
[Heroku app](https://app-alumno.herokuapp.com/api/v1/alumnos)

## Descripción
Demo de despliegue de una aplicación springboot

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

## Desarrollo
- Para correr los test: `./mvnw test`
- Para correr la aplicación en local: `./mvnw spring-boot:run`
