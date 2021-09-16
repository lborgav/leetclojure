(ns leetclojure.771-test
  (:require [clojure.test :refer :all])
  (:require [leetclojure.771 :refer :all]))

(deftest num-jewels-in-stones-test
  (testing "leetcode tests"
    (is (= 3 (num-jewels-in-stones "aA" "aAAbbbb")))
    (is (= 0 (num-jewels-in-stones "z" "ZZ"))))

  (testing "other tests"
    (is (= 7 (num-jewels-in-stones "aA" "aAAbbbbBBaAAa")))
    (is (= 0 ( num-jewels-in-stones "" "aAbBcC")))))