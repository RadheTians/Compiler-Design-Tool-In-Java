# Compiler-Design-Tool-In-Java
		
This is the Tool which can implement the phages of Compiler-Design which has been developed in Java programming lanuage.


# About

This is the tool which can calculate First, Follow and FirstAndFollow of given grammar, perform string validation of Recursive Descent parser, remove left recursion & left factoring from grammar, SLR string validation for fixed grammar,implementation of conanical collection of LR(0) items and SLR tabel, tokenized the given input file which can be in C/C++, JAVA, PYTHON and so on... 

<p align="center">
  <img src="Screenshot/111001.png">
</p>

<p align="center">
  <img src="Screenshot/111002.png">
</p>

# Add Features

The implemented tool has following features...

1. Added the feature that lexical analysis phage of compiler in which just need to provide the path of input file(file can be C/C++, JAVA, PYTHON, etc...) and this tool will be tokenized each in line of given input file.

2. Added the feature of removable of left recursion for the given input grammar.
 
3. Added the feature of removable of left factoring for the given input grammar.

4. Added the feature of string validation of Recursive Descent parser for the following fixed grammar...
		
		1.) E--> E + T
		2.) E--> T
		3.) T--> T * F
		4.) T--> F
		5.) F--> (E)
		6.) F--> a

		The string will be something like a+a$, a+a*a$, a+(a+a*a) and so on...	
		

5. Added the feature of calculation of first for the given input grammar.

6. Added the feature of calculation of follow for the given input grammar.

7. Added the feature of calculation of firstAndFollow simultaneously for the given input grammar.

8. Added the feature of string validation of SLR parser for the following fixed grammar...

		1.) E--> a E a
		2.) E--> b E b
		3.) E--> c
		
		The string wiil be something like c, aca,aabbcbbaa, bacab and so on...

9. Added the feature of Canonical collection of LR(0) items and Tabel of SLR parser for the given grammar.

# How to Use

1. Use the Admin Panel to set up quiz questions. Quiz won't be enabled unless you click the "Start Test" button. Click on the same to start an added quiz.

2. Scores are updated realtime on the server, however the result will be shown only when the user finishes the quiz, or there is a time out or the admin ends the quiz by clicking on "is_staff" attribute of Normal User.

3. Once the admin clicks on the individual user "is_staff" attribute, the quiz ends for that particular user taking that quiz. 

4. Once the quiz is disabled for that particular user, the quiz becomes inaccessible for that user. If the quiz is enabled again for that particular user by Admin then, user will be able to start quiz.

5. All the questions in quiz exam will come with individual time depands upon difficulty of question(i.e 20sec, 40sec, 600sec, etc).

6. User can skill questions during quiz exam period.

7. There is one text field where user can go to any question from any question to some any question.

## USAGE
   
   Python3, Django, Postgresql, psycopg2.
   
## REQUIREMENT
 
### Environment:
  
   Source code to this project is coded in Python3, with its GUI running in Django framework.
 
 
### Packages:

   pip3, os, postgres, psycopg2.


### Command Line Interface(CLI):
  
   Terminal.
 
 
## INSTALLATION 
 
   Use the package manager [pip](https://pip.pypa.io/en/stable/) to install packages subprocess, os and set env for Python3.
 
### Packages :  

	$ pip install virtualenv
   	$ pip install subprocess
   	$ pip install os 

 
### Python3 env :

   	$ pip install python3.7 python-pip


### Setting up Django framework for Python3 :

   	$ pip install Django


   Installing Django from https://docs.djangoproject.com/en/2.2/intro/install/

## Postgres Install :

### Install PostgreSQL on Ubuntu :

	$ sudo apt-get update
	$ sudo apt-get install postgresql postgresql-contrib

To connect with PostgreSQL.
	
	$ sudo su - postgres
	$ psql
	$ postgres-# \conninfo

And create database name called "exam"

	$ postgres-# create database exam
	$ \l


### Install PostgreSQL on Window :

	To insatll on Window go throught this [postgres](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads).

### Install PostgreSQL connect to Python :
	
	$ pip install psycopg2

### Clone repository :

	https://github.com/RadheTians/MCQ-Quiz-System.git
	cd MCQ-System-System

### Migrations :

To run migrations.

	$ python manage.py makemigrations
	$ python manage.py migrate

### Create superuser :

To create super user run.

	$ python manage.py createsuperuser

After running this command it will ask for username, password. You can access admin panel from (localhost:8000/admin/)

## Running locally :
 
To run at localhost. It will run on port 8000 by default.

	$ python manage.py runserver

To access this project go to any browser and type in url (localhost:8000)

<p align="center">
  <img src="Snapshot/112.png">
</p>

<p align="center">
  <img src="Snapshot/113.png">
</p>

<p align="center">
  <img src="Snapshot/114.png">
</p>

<p align="center">
  <img src="Snapshot/116.png">
</p>

<p align="center">
  <img src="Snapshot/117.png">
</p>

<p align="center">
  <img src="Snapshot/118.png">
</p>

<p align="center">
  <img src="Snapshot/119.png">
</p>
