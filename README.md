# Jakarta EE Starter Project

This is a starter project for Jakarta EE applications using Maven. It includes basic configurations and dependencies to get you started with Jakarta EE development.

## Project Structure

- `src/main/webapp/WEB-INF/beans.xml`: Configuration file for CDI (Contexts and Dependency Injection).
- `src/main/webapp/WEB-INF/web.xml`: Deployment descriptor for the web application.
- `pom.xml`: Maven configuration file.

## Prerequisites

- Java 17
- Maven 3.6.0 or higher

## Building the Project

To build the project, run the following command:

```sh
mvn clean install
```

## Running the Project

To run the project, you can deploy the generated WAR file to a Jakarta EE compatible application server such as WildFly, Payara, or TomEE.

## Dependencies

- Jakarta EE API version 10.0.0 (provided scope)

## Maven Plugins

- `maven-compiler-plugin` version 3.13.0
- `maven-war-plugin` version 3.4.0

## Configuration

### `pom.xml`

The `pom.xml` file includes the necessary dependencies and plugins for building and packaging the Jakarta EE application.

### `beans.xml`

The `beans.xml` file is used for configuring CDI in the application.

### `web.xml`

The `web.xml` file is the deployment descriptor for the web application.

## License

This project is licensed under the MIT License.
```