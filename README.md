W głównym katalogu:

docker clean -> clean build
docker build -> create jar
docker stop $(docker ps -a -q) -> stop containers
docker-compose build -> create containers
docker-compose up -> start application


port 8080 -> mysql (MYSQL_ROOT_PASSWORD: ammunation, MYSQL_DATABASE: app)
port 8989 -> spring backend (admin, admin)
port 7080 -> frontend website