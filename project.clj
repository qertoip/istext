; tested on leiningen 1.3.0-snapshot

(defproject istext "1.0"
  :description "A library to tell apart binary and text files using proven heuristics."
  :dependencies [[org.clojure/clojure "1.1.0"]]

  :jar-dir "dist/"
  :jar-name "istext.jar"
  :main istext)
