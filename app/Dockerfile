FROM clojure:lein-2.9.8-alpine

EXPOSE 8000

# App Config
WORKDIR /app

COPY . .

RUN lein deps

RUN lein uberjar

RUN cp ./target/uberjar/sample_app-0.1.0-SNAPSHOT-standalone.jar ./uberjar.jar

ENTRYPOINT ["java", "-jar", "uberjar.jar"]
