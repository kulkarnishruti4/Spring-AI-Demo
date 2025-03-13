#Spring AI Chat Client

A Spring Boot 3 application that integrates with OpenAI using Spring AI to provide a simple console-based chat client.
Users can enter prompts via the console and receive AI-generated responses.

##Features

Uses Spring AI to interact with OpenAI models
Accepts user input from the console and returns AI-generated responses
Built with Spring Boot 3 and Java 17
Configurable via application.properties
Prerequisites

##Ensure you have the following installed:

Java 17+
Maven 3+
An OpenAI API Key (see instructions below)
Getting an OpenAI API Key

##To use OpenAI services, obtain an API key by following these steps:

Visit OpenAI’s API platform at https://platform.openai.com/signup/
Sign up for an account or log in if you already have one
Click on your profile icon in the top-right corner and select View API Keys
Click Create new secret key and copy the key (it will not be visible again)
Open src/main/resources/application.properties and update the API key:
spring.ai.openai.api-key=your_openai_api_key_here
Save the file and ensure the key is kept secure
Installation and Setup

##Clone the Repository
git clone  https://github.com/kulkarnishruti4/Spring-AI-Demo.git
cd Spring-AI-Demo
Update API Key
Modify application.properties with your OpenAI API key.

##Build and Run the Application
mvn spring-boot:run
Using the Chat Client

Once the application starts, it will prompt you to enter text. Type a message and press Enter to receive a response from OpenAI.

Example:

Spring AI Chat Client - Type 'exit' to stop
You: What is Java?
AI: Java is a high-level, object-oriented programming language...
You: Explain polymorphism.
AI: Polymorphism is a concept in object-oriented programming...
You: exit
Exiting...


##This project uses the following dependencies in pom.xml:

<dependency>
    <groupId>org.springframework.ai</groupId>
    <artifactId>spring-ai-openai-spring-boot-starter</artifactId>
    <version>1.0.0-M6</version>
</dependency>

License

This project is open-source and can be used for educational and development purposes.

Contributing

Contributions are welcome. If you find an issue or have an improvement suggestion, open an issue or submit a pull request.

Support

For any questions or issues, open an issue in the repository.
