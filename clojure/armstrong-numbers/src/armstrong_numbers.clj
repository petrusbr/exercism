(ns armstrong-numbers
  (:require [clojure.string :as str]))

(defn armstrong? [number] ;; <- arglist goes here
  (let [tamanho (count (str number))
        vetor-str (str/split (str number) #"")
        vetor-num (map (fn [n] (long (.pow (biginteger n) tamanho))) vetor-str)]
    (= (reduce + vetor-num) number)
    )
  )