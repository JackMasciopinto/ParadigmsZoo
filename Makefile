all: clean simple

%.class: %.java
	@javac $^
			#replace the names of the files here with the files you will have in your program

simple: ZooTest.class 
		@echo Running instance of the ZooTest system...
			@java ZooTest

clean:
		rm -rf *.class

