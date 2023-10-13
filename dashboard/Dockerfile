FROM openjdk:17

EXPOSE 8080/tcp

# Create directory where the binary lives
RUN mkdir -p /opt/dashboard/bin

# Copy the latest binary to the destination
COPY ./release/dashboard-dev.jar /opt/dashboard/bin
WORKDIR /opt/dashboard/bin

# And run it
CMD ["java", "-jar", "dashboard-dev.jar"]
