(defproject kafka-ventures "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :managed-dependencies [[commons-logging "1.2"]
                         [cheshire "5.11.0"]
                         [com.fzakaria/slf4j-timbre "0.3.21"]
                         [org.apache.kafka/kafka-clients "3.2.0"]
                         [org.clojure/clojure "1.11.1"]
                         [software.amazon.msk/aws-msk-iam-auth "1.1.4"]]
  :dependencies [[cheshire]
                 [com.fzakaria/slf4j-timbre]
                 [org.apache.kafka/kafka-clients]
                 [org.clojure/clojure]
                 [software.amazon.msk/aws-msk-iam-auth]]
  :main ^:skip-aot kafka-ventures.core
  :resource-paths ["cfg"]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
