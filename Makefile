all: build run
run: 
	java -cp ./jars/KarelJRobot.jar: Main
build:
	javac -cp ./jars/KarelJRobot.jar: Main.java