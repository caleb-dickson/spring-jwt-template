# spring-jwt-template

This is a working template of how to create a basic backend user flow in a RESTful API to authenticate users of a separate frontend client app such as React or Angular.

1. Fork this repo to your machine.
  <hr/>

2. Create an application.yaml file in src/main/resources with the following code:
  <code>
    authdemo:
  app:
    jwtExpirationMs: /*Enter an Expiration Time in Milliseconds*/
    jwtSecret: /*Enter a Secret Phrase Here*/
  </code>
  <hr/>
          
3. Set up your database connection in the application.properties file.
  <hr/>
  
4. Run the app and use an appropriate client to make requests to the available endpoints.
