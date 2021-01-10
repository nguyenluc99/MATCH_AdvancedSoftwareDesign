echo "Removing previous .class file"
rm -f *.class
echo "Compiling"
rm -f Class*.java
javac BaseRequest.java
javac DatabaseController.java
javac HTTPController.java
javac LearningTask.java
javac Maintenance.java
javac PrioTask.java
javac Matcher.java
javac ReceptionController.java
javac RequesterClient.java
javac RequestFactory.java
javac RequestResponseMap.java
javac ResponderClient.java
javac SchedulerController.java
javac SchedulerStorage.java
javac ScheduleStrategy.java
echo "Compilation done"