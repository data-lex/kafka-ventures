(defproject kafka-ventures "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :managed-dependencies [[commons-logging "1.2"]
                         [cheshire "5.11.0"]
                         [org.apache.kafka/kafka-clients "3.2.0"]
                         [org.clojure/clojure "1.11.1"]
                         [org.slf4j/slf4j-api "2.0.3"]
                         [software.amazon.msk/aws-msk-iam-auth "1.1.4"]]
  :dependencies [[cheshire]
                 [org.apache.kafka/kafka-clients]
                 [org.clojure/clojure]
                 [org.slf4j/slf4j-api]
                 [software.amazon.msk/aws-msk-iam-auth]]
  :main ^:skip-aot kafka-ventures.core
  :resource-paths ["cfg"]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
