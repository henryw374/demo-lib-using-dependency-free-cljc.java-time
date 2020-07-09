(ns awesome.lib
  (:require [cljc.java-time.duration :as d]))

(defn lib-fn-not-using-time [x]
  (inc x))

(defn lib-fn-using-time [x]
  (d/of-days x))
