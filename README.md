![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

<!-- ABOUT THE PROJECT -->
<h2 id="about-the-project"> :pencil: About The Project</h2>

<p align="justify"> 
 Basic implementation of a cinema with all its functions. Introduced authorization and authentication.
 All incoming and outgoing data are converted to json format, also implemented global expection handler.
 </p>

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

<!-- OVERVIEW -->
<h2 id="overview"> :cloud: Overview</h2>

<p align="justify"> 
  This project have multiple endpoints with user and admin access.<br/>
  
### **You can see them here**

POST: /register - all  --> input JSON example  {"email":"mail", "password":"124", "repeatPassword":"124"}<br/>
GET: /cinema-halls - user/admin<br/>
POST: /cinema-halls - admin   --> input JSON example {"capacity":40, "description":"Red hall"}<br/>
GET: /movies - user/admin<br/>
POST: /movies - admin  --> input JSON example {"title":"Batman", "description":"A good movie"}<br/>
GET: /movie-sessions/available - user/admin  example --> ?movieId={id}&date=dd.MM.yyyy<br/>
GET: /movie-sessions/{id} - user/admin<br/>
POST: /movie-sessions - admin  --> input JSON example {"movieId":1, "cinemaHallId":1, "showTime":"28.03.2021 22:15"}<br/>
PUT: /movie-sessions/{id} - admin  --> input JSON example  {"movieId":1, "cinemaHallId":1, "showTime":"28.03.2021 22:15"}<br/>
DELETE: /movie-sessions/{id} - admin<br/>
GET: /orders - user<br/>
POST: /orders/complete - user<br/>
PUT: /shopping-carts/movie-sessions - user  emample --> ?movieSessionId=1<br/>
GET: /shopping-carts/by-user - user<br/>
GET: /users/by-email - admin  --> ?email=yourmail<br/>
</p>

### **Technologies used**

- [x] Java 11
- [x] Hibernate
- [x] Spring Framework
- [x] REST
- [x] MySQL
- [x] Apache Tomcat


![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

## [Installation](#installation)

### **Apache Tomcat**

You need to install [Apache Tomcat](https://tomcat.apache.org/download-90.cgi)® version 9.0.54 or latest on your computer as a web server.

### **MySQL**

Second things what you need is relational database like MySQL or PostgreSQL.

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

## [Other information and helpfull tips](#otherinformationandhelpfulltips)

- You can test this project online on [Heroku](https://basic-cinema.herokuapp.com/). I use free remote db service, so it starts slowly :)

⚠️ If you wanna connect my project to your database, just add all the necessary information in the


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


