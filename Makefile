maven-install:
	mvn clean install

docker-up:
	docker-compose up -d --build