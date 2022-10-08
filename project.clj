(defproject kafka-ventures "0.1.0-SNAPSHOT" 
  :aliases {"producer" ["run" "-m" "kafka-ventures.producer"]}
  :managed-dependencies [[commons-logging "1.2"]
                         [cheshire "5.11.0"]
                         [org.apache.kafka/kafka-clients "3.2.0"]
                         [org.clojure/clojure "1.11.1"]
                         [org.slf4j/slf4j-log4j12 "1.7.36"]
                         [software.amazon.msk/aws-msk-iam-auth "1.1.4"]]
  :dependencies [[cheshire]
                 [org.apache.kafka/kafka-clients]
                 [org.clojure/clojure]
                 [org.slf4j/slf4j-log4j12]
                 [software.amazon.msk/aws-msk-iam-auth]]
  :resource-paths ["cfg"]
  :target-path "target/%s" 
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
