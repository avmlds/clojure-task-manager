(defproject clojure-task-manager "0.1.0-SNAPSHOT"
  :description "Simple task-manager written in Clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.9.0"]
                 [compojure "1.7.0"]]
  :main ^:skip-aot clojure-task-manager.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
