(ns leetclojure.771)

(defn num-jewels-in-stones
  [jewels stones]
  (let [jewels-set (set jewels)]
    (cond
      (zero? (count stones)) 0
      (contains? jewels-set (first stones)) (inc (num-jewels-in-stones jewels (rest stones)))
      :else  (num-jewels-in-stones jewels (rest stones)))))

