(ns sample-app.core
  (:gen-class)
  (:require [ring.adapter.jetty :as jetty]))

(def port 8000)

(defn handler [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello, World!"})

(defn -main
  "Start server application."
  []
  (jetty/run-jetty (var handler) {:port port :join? false})
  (println (str "Server started on port " port " inside docker, but you can only access it through nginx on port 80")))
