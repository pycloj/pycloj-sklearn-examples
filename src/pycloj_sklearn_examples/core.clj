(ns pycloj-sklearn-examples.core
  (:require [sklearn]
            [sklearn.datasets :as datasets :refer [load-iris]]
            [libpython-clj :as py]
            ))




(defn -main
  (def iris  (datasets/load-iris))
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
