#!/bin/sh

printMsg()  {
	echo 
	echo "###################################################"
	echo "## $1 ##"
	echo "###################################################"
}

stopContainers() {
	docker stop ammunationwebstore_ammunation-backend_1
	docker stop ammunationwebstore_frontend_1
	docker stop ammunationwebstore_database_1
}

PARAMETER=$1
printMsg "AmmuNation application"

case $PARAMETER in
	start)
		printMsg "Start application"
		docker-compose up -d
		printMsg "Done!"
		break
		;;
	restart)
		printMsg "Clean jar"
        gradle clean
        printMsg "Build jar"
        gradle build -x test
        printMsg "Stop docker containers"
		stopContainers
		printMsg "Rebuild docker containers"
		docker-compose build
		printMsg "Start application"
		docker-compose up -d
		printMsg "Done!"
		break
		;;
    stop)
		printMsg "Stop docker containers"
		stopContainers
        break
        ;;
    tests)
        printMsg "Start DB"
        docker run -d --name testdb -p 8080:3306 mysql:5.6
        printMsg "Tests"
        gradle build
        docker stop testdb
        docker rm --force testdb
        break
        ;;
	*)
		echo "Sorry, I don't understand"
		;;
  esac

