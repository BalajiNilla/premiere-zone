# Player Stats Management Application

## Overview

This application is a Spring Boot project designed to manage player statistics in a sports database. It connects to an existing PostgreSQL database and performs read operations on the `player_stats` table without altering its structure.

## Features

- Retrieve all player statistics.
- Fetch individual player details by name.
- Log SQL queries for debugging purposes.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL

## Prerequisites

- Java 11 or higher
- PostgreSQL database
- Maven or Gradle for dependency management

## Setup

### 1. Clone the Repository

```bash
git clone https://github.com/BalajiNilla/premiere-zone.git
```

### 2. Configure Database Connection

Update the `src/main/resources/application.properties` file with your PostgreSQL database credentials:

```properties
spring.application.name=Primere Zone
spring.datasource.url=jdbc:postgresql://localhost:5432/yourdatabasename
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql=true
```

### 3. Build the Project

For Maven:

```bash
mvn clean install
```

For Gradle:

```bash
./gradlew build
```

### 4. Run the Application

You can run the application using the following command:

```bash
mvn spring-boot:run
```

or if you built a JAR file:

```bash
java -jar target/player-stats.jar
```

## API Endpoints

### Get All Players

- **URL**: `/players`
- **Method**: GET
- **Description**: Retrieves a list of all players' statistics.

### Get Player by Name

- **URL**: `http://localhost:8080/players?name={name}`
- **Method**: GET
- **Description**: Retrieves statistics for a specific player by name.
- **Example**: `http://localhost:8080/players?name=Mouli Nilla`

  ### Get Player by Team

- **URL**: `http://localhost:8080/players?team={team}`
- **Method**: GET
- **Description**: Retrieves statistics for a specific players by team.
- **Example**: `http://localhost:8080/players?team=Arsenal`

   ### Get Player by Nation

- **URL**: `http://localhost:8080/players?nation={nation}`
- **Method**: GET
- **Description**: Retrieves statistics for a specific players by nation.
- **Example**: `http://localhost:8080/players?team=Arsenal`

  ### Create Player 

- **URL**: `http://localhost:8080/players/save`
- **Method**: GET
- **Description**: Retrieves statistics for a specific players by team.
-**Body Example : 
    {
        "playerName": "Mouli Nilla",
        "nation": "br BRA",
        "position": "DF",
        "age": 24,
        "matchesPlayed": 14,
        "starts": 14,
        "minutesPlayed": 1260.0,
        "goals": 2.0,
        "assists": 0.0,
        "penaltiesScored": 0.0,
        "yellowCards": 2.0,
        "redCards": 0.0,
        "expectedGoals": 2.3,
        "expectedAssists": 0.2,
        "teamName": "Arsenal"
    }

## Logging

SQL queries will be logged in the console for debugging purposes, thanks to the following configuration:

```properties
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

## Contributing

Feel free to submit issues and pull requests. Contributions are welcome!

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
