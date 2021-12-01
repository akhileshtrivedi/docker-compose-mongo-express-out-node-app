## Here is demo app - developing with Docker Compose

This is user's profile demo app
- index.html with js and css 
- nodejs backend and express module
- mongodb for No SQL Database

All components are here

### Step by step with Docker Compose

#### To start the application

Step 1: start mongodb and mongo-express

    docker-compose -f docker-compose.yaml up
    
_You can access the mongo-express under localhost:8080 from your browser_
         
Step 2: start node server 

    npm install
    node app.js
    
Step 3: access the js application from browser 

    http://localhost:3000

#### To build a docker image from the application
     Note- You must comment localhost connection and comment out mongodb connection.

    docker build -t my-app:1.0 .       
    
The dot "." at the end of the command denotes location of the Dockerfile.

## continue  https://github.com/akhileshtrivedi/docker-compose-mongo-express-in-node-app#readme

