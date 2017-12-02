#!/bin/sh

function printMsg() {
	echo 
	echo "###################################################"
	echo "## $1 ##"
	echo "###################################################"
}

function stopContainers() {
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
        gradle build
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
	*)
		echo "Sorry, I don't understand"
		;;
  esac

