runserver:
	mvn -Dmaven.test.skip=true package
	docker-compose up --build -d
