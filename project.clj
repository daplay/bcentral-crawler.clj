(defproject bcentral-crawler "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.jsoup/jsoup "1.7.2"]]
  :main ^:skip-aot bcentral-crawler.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
