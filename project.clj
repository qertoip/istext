; tested on leiningen 1.3.0-snapshot

(defproject org.clojars.qertoip/istext "1.0"
  :description "A library to tell apart binary and text files using proven heuristics."
  :dependencies [[org.clojure/clojure "1.1.0"]]

  :jar-dir "dist/"
  :jar-name "istext-1.0.jar"
  :uberjar-name "istext-standalone-1.0.jar"
  :main istext)
