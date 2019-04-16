(ns armstrong-numbers
  (:require [clojure.string :as str]))

(defn num->str [number]
  (str number))

(defn number-length [number]
  (count (str number)))

(defn str->bigintvector [strnum]
  (map biginteger (str/split strnum #"")))

(defn pow-biginteger-vector 
  [bigintvec exponent]
  (map (fn [n] (.pow n exponent)) bigintvec))

(defn sum-vector 
  [powered-vec]
  (reduce + powered-vec))

(defn armstrong? [number] ;; <- arglist goes here
  (let [strnum (num->str number)
        numlength (number-length strnum)
        bigint-vec (str->bigintvector strnum)
        powered-vec (pow-biginteger-vector bigint-vec numlength)
        numcalculated (sum-vector powered-vec)]
    (= number numcalculated)
  ))