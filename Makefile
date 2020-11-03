runserver:
	mvn -Dmaven.test.skip=true package
	docker-compose up --build -d

stopserver:
	docker-compose down

log-server:
	docker logs alumnos-app -f
