FROM openjdk:8
COPY ./target/mycalc-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "mycalc-1.0-SNAPSHOT-jar-with-dependencies.jar", "Calc"]