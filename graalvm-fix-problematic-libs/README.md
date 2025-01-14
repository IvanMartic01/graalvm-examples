# Fix Broken Spring-Boot GraalVM

## Prerequisites

1. Install GraalVM JAVA

## Task

Run a native executable that will return data when a request is made to: `http://localhost:8080/books`

## Steps to Build Native Executable WAY 1

1. **Run Docker:**
    - Navigate to the `docker` directory.
    - Execute: `docker compose up -d`

2. **GitHub Repository:**
    - Go to the GitHub repo: [link](https://github.com/oracle/graalvm-reachability-metadata/tree/master/metadata/)
    - Find the library and version of a library causing issues (e.g., Liquibase 4.23).
    - Create a folder: `src/main/resources/META-INF/native-image`
    - Copy the relevant files from the GitHub repo into this folder.

3. **Build the Image:**
    - Navigate to the root directory.
    - Run: `./mvnw clean package -Pnative`

4. **Run the Application:**
    - Navigate to the `target` directory.
    - Execute: `./app-name`
