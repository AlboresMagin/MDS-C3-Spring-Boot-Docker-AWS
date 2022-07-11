FROM openjdk:17
ADD target/mantenimiento.jar mantenimiento.jar
ENTRYPOINT ["java", "-jar","mantenimiento.jar"]