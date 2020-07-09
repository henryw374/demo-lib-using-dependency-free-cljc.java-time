(ns awesome.entry-point-not-using-time
  (:require [awesome.lib :as lib]))

(lib/lib-fn-not-using-time (rand-int 10))
