maven-install:
	mvn clean install

docker-up:
	docker-compose up -d --build

k8s-up:
	kubectl apply -f k8s/deployment.yml
