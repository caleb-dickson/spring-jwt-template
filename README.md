# spring-jwt-template

This is a working template of how to create a basic backend user flow in a RESTful API to authenticate users of a separate frontend client app such as React or Angular.

## 1. Fork this repo to your machine.
  <hr/>

## 2. Create an ```application.yaml``` file in src/main/resources with the following code:
  Example:
  ```yaml
  authdemo:
    app:
      jwtExpirationMs: 3600000
      jwtSecret: mysecretphrase
  ```
  <hr/>
          
## 3. Create an ```application.properties``` file and set up your database connection.
  Example:
  ```properties
  spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
  spring.datasource.username=postgres
  spring.datasource.password=password

  spring.jpa.hibernate.ddl-auto=create-drop
  ```
  <hr/>
  
## 4. Run the app and use an appropriate client to make requests to the available endpoints.
