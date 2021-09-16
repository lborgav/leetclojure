(ns leetclojure.1351-test
  (:require [clojure.test :refer :all])
  (:require [leetclojure.1351 :refer [count-negatives]]))

(deftest count-negatives-test
  (testing "leetcode tests"
    (is (= 8 (count-negatives [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]])))
    (is (= 0 (count-negatives [[3,2],[1,0]])))
    (is (= 3 (count-negatives [[1,-1],[-1,-1]])))
    (is (= 1 (count-negatives [[-1]])))))
