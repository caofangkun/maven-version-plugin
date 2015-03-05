(ns version.clj.utils)

(def on-windows?
  (= "Windows_NT" (System/getenv "OS")))
