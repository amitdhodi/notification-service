# notification-service
Notification service(Routing incoming Kafka messages to web socket)

There might be a need of propagating the messages received by an application on a Kafka topic to the clients using Websocket. 
Since, websockets receive messages without the need of refreshing the page. This use case fits well if we want to enable real 
time notifications in our application.

# How to test the functionality
1. Clone the repo https://github.com/amitdhodi/notification-service.git and download the code locally
2. Import the project as Maven project in your IDE
3. Download(if not done) and start local Kafka cluster. Reference link to do the same(http://kafka.apache.org/quickstart).
Only perform Step 1(Download the code) & 2(Start the server) using the above link.
4. Start the application by running NotificationApplication.java
5. Application will start on port 8080. Once it is up, browse URL http://localhost:8080
6. This would render an empty text area.
7. Send message to kafka topic "inbound". Either Kafka Tool can be used (http://www.kafkatool.com/download.html) or command line
producer can be used to send the message. The message json format is:
{
 "firstName":"foo",
 "lastName":"bar"
}
8. Once the message is posted successfully, the URL http://localhost:8080 must reflect the json message inside the text area
without the need of refreshing the page.
9. This shows the real time notifications on browser originated by a kafka message. 
