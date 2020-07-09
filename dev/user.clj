(ns user
  (:require ;[figwheel.main.api :as figwheel]
            [cljs.build.api :as cljs]
            ))

(defn entry-point-not-using-time []
  (println "compiling entry-point-not-using-time")
  (cljs/build
    {:optimizations :advanced
     ;:pseudo-names true
     :main 'awesome.entry-point-not-using-time
     :process-shim false
     :output-to "target/cljs-out/awesome.entry-point-not-using-time.js"}))

(defn entry-point-using-time []
  (println "compiling entry-point-using-time")
  (cljs/build
    {:optimizations :advanced
     ;:pseudo-names true
     :main 'awesome.entry-point-using-time
     :process-shim false
     :output-to "target/cljs-out/awesome.entry-point-using-time.js"}))

(comment
  (entry-point-not-using-time)
  (entry-point-using-time)

  (defn start-figwheel []
    (figwheel/start  {:mode :serve}
      "dev"))

  (defn stop []
    (figwheel/stop-all))

  (defn repl []
    (figwheel/cljs-repl "dev"))

  (defn refresh []
    (stop)
    (start-figwheel))

  )

(comment
  (stop)
  (start-figwheel)
  (repl)
  )
 