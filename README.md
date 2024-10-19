# Player Stats Management Application

## Overview

This application is a Spring Boot project designed to manage player statistics in a sports database. It connects to an existing PostgreSQL database and performs read operations on the `player_stats` table without altering its structure.

## Features

- Retrieve all player statistics.
- Create new player and statistics.
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
git clone https://github.com/yourusername/player-stats-management.git
cd player-stats-management
