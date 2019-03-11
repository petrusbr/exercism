(ns armstrong-numbers
  (:require [clojure.string :as str]))

(defn armstrong? [num] ;; <- arglist goes here
  (let [tamanho (count (str num))
        vetor-str (str/split (str num) #"")
        vetor-num (map (fn [n] (Math/pow (Long/parseLong n) tamanho)) vetor-str)]
    (= (long (reduce + vetor-num)) num)
    )
)
