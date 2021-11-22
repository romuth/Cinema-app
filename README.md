
# **Hello-Movie. Basic cinema app**

## Content

[Overview](#overview)

[Technologies used](#technologies)

[Installation](#installations)

[Other information](#other)

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

<!-- ABOUT THE PROJECT -->
<h2 id="about-the-project"> :pencil: About The Project</h2>

<p align="justify"> 
 Basic implementation of a cinema with all its functions. Introduced authorization and authentication.
 All incoming and outgoing data are converted to json format, also implemented global expection handler.
 </p>

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

<!-- OVERVIEW -->
<a name="overview"></a>
<h2 id="overview"> :cloud: Overview</h2>

<p align="justify"> 
  This project have multiple endpoints with user and admin access.<br/>

### **You can see them here**

POST: /register - all<br/>
GET: /cinema-halls - user/admin<br/>
POST: /cinema-halls - admin<br/>
GET: /movies - user/admin<br/>
POST: /movies - admin<br/>
GET: /movie-sessions/available - user/admin<br/>
GET: /movie-sessions/{id} - user/admin<br/>
POST: /movie-sessions - admin<br/>
PUT: /movie-sessions/{id} - admin<br/>
DELETE: /movie-sessions/{id} - admin<br/>
GET: /orders - user<br/>
POST: /orders/complete - user<br/>
PUT: /shopping-carts/movie-sessions - user<br/>
GET: /shopping-carts/by-user - user<br/>
GET: /users/by-email - admin<br/>

```java
/register  {"email":"mail", "password":"124", "repeatPassword":"124"}  POST

/cinema-halls  {"capacity":40, "description":"Red hall"}  POST

/movies  {"title":"Batman", "description":"A good movie"}  POST
 
/movie-sessions/available  ?movieId={id}&date=dd.MM.yyyy  GET

/movie-sessions  {"movieId":1, "cinemaHallId":1, "showTime":"28.03.2021 22:15"}  POST

/movie-sessions/{id}  {"movieId":1, "cinemaHallId":1, "showTime":"28.03.2021 22:15"}  PUT

/shopping-carts/movie-sessions  ?movieSessionId=1  PUT

/users/by-email  ?email=yourmail  GET
 ```
 <a name="technologies"></a>
</p>

# **Technologies used**

- [x] Java 11
- [x] Hibernate
- [x] Spring Framework
- [x] REST
- [x] MySQL
- [x] Apache Tomcat

<a name="installations"></a>

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

# Installation

### **Clone this project**

Сlone this project, and you are already halfway there :)

### **Apache Tomcat**

You need to install [Apache Tomcat](https://tomcat.apache.org/download-90.cgi)® version 9.0.54 or latest on your computer as a web server.

### **MySQL**

Third things what you need is relational database like MySQL or PostgreSQL.

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

# Other informations and helpful tips
<a name="other"></a>

- You can test this project online on [Heroku](https://basic-cinema.herokuapp.com/). I use free remote db service, so it starts slowly :)

⚠️ If you wanna connect my project to your database, just add all the necessary information in the application.properties


```java
#Database properties
db.driver= DB DRIVER
db.url=DB URL
db.user=YOUR USERNAME
db.password=YOUR PASSWORD

#Hibernate properties
hibernate.show_sql=true
hibernate.hbm2ddl.auto=create
hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)


