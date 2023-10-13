FROM openjdk:17

EXPOSE 8080/tcp

# Create directory where the binary lives
RUN mkdir -p /opt/aggregator/bin

# Copy the latest binary to the destination
COPY ./release/aggregator-dev.jar /opt/aggregator/bin
WORKDIR /opt/aggregator/bin

# And run it
CMD ["java", "-jar", "aggregator-dev.jar"]
