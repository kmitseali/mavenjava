# mavenjava

Standalone Maven Java application for Jenkins practice. This folder is the
repository root; `pom.xml` is directly inside it.

## Build and run

Use Maven 3 and JDK 11 or newer (JDK 21 is suitable).

```bat
mvn clean install
java -jar target/mavenjava.jar
```

Run tests separately with `mvn test`. Test reports appear in
`target/surefire-reports/`. The generated executable is `target/mavenjava.jar`.
The `target/` directory is excluded from Git.

## Jenkins Freestyle jobs

- `MavenJava_Build`: check out this repository's `main` branch; use Maven goals
  `clean install`.
- To pass files to a separate Test job using Copy Artifact, archive
  `pom.xml,src/**,target/*.jar` in the Build job. Copy these artifacts into
  `MavenJava_Test`, preserving their directory structure; run Maven goal `test`.
  The POM and sources are needed to run Maven tests in a separate workspace.
- Publish JUnit reports with `target/surefire-reports/*.xml` in both jobs.
  The Test job can also archive `target/surefire-reports/**`.

## Repository

```bat
git clone https://github.com/kmitseali/mavenjava.git
cd mavenjava
```

Use branch `main` in Jenkins and the repository-root `pom.xml`.
