(ns clojure-test.prod
  (:require [clojure-test.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
