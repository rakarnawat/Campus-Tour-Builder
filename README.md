# cs542-fall-22-assign3

## Name: Rohit Karnawat

- Number of Slack Days used: 0
-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in myCampusTour/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile myCampusTour/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile myCampusTour/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile myCampusTour/src/build.xml run -Darg0=campusTourError.txt -Darg1=<UPDATE_VALUE>

## you can run it in the following manner:

ant -buildfile myCampusTour/src/build.xml run -Darg0=campusTourError.txt -Darg1=2

UPDATE_VALUE: 
- 1 : FILE_PROCESSOR
- 2 : CONSTRUCTOR
- 3 : ERROR
- Default : NONE

Note: Arguments accept the absolute path of the files.

-----------------------------------------------------------------------
## Time Complexicity: O(1)
-----------------------------------------------------------------------
## Description:
1. Created the interface for each activities with a method to get the results.
2. Added enums for all the activities.
3. Added a class to select the options using builder pattern for each of the activities such as:
    - visitBuilding SOM / visitBuildingWatson
        - busRide
        - onFoot
    - packGift
        - eventCenter
        - UniversityUnion
    - selectCafeteria
        - CIW
        - MountainView 
    - attendLecture
        - CS540
        - CS542
4. Implemented getters and setters in the given options for the respective activies.
5. Used Results class to get the total of the measures.
7. An interface is defined to get all the measures, the measures and their respective units are:
    - duration - minutes
    - cost - USD
    - Carbon Footprint - tonnes of CO2
    - effort - calories
6. Created builder interface to define build activites.
7. Utilized builder to obtain the results. 
8. Finally used the logger with the help debug level provided from the command line argument.
9. Used File writer to log any error into the campusTourError.txt file

-----------------------------------------------------------------------
#### Citations
-----------------------------------------------------------------------
- ####code for builder pattern :https://www.geeksforgeeks.org/builder-pattern-in-java/ 
-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.""

Date: 17th November 2022 



