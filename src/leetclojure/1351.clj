(ns leetclojure.1351)

;; Quadratic solution
(defn count-negatives
  [grid]
  (->> grid
       (flatten)
       (filter neg-int?)
       (count)))


(count-negatives [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]])