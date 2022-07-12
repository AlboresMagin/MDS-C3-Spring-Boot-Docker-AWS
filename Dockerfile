FROM openjdk:16
ADD target/mantenimiento.jar mantenimiento.jar
ENTRYPOINT ["java", "-jar","mantenimiento.jar"]