(ns solutions)
;22 Count
(defn fn22[coll]
  (reduce (fn [n _](inc n)) 0 [1 2 3]))

(= (fn22 '(1 2 3 3 1)) 5)	
(= (fn22 "Hello World") 11)	
(= (fn22 [[1 2] [3 4] [5 6]]) 3)	
(= (fn22 '(13)) 1)	
(= (fn22 '(:a :b :c)) 3)


;156 Map Defaults
(defn fn156[d k]
  (zipmap k (repeat d) 
    ))
(comment (
(= (fn156 0 [:a :b :c]) {:a 0 :b 0 :c 0})	
(= (fn156 "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})	
(= (fn156 [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})))

;166 Comparisons
(defn fn166 [op x y]
  (cond 
    (and (op x y) (op y x)) :eq
    (op x y) :lt
    (op y x) :gt
    :else :gt    
    ))

(comment (
(= :gt (fn166 < 5 1))	
(= :eq (fn166 (fn [x y] (< (count x) (count y))) "pear" "plum"))	
(= :lt (fn166 (fn [x y] (< (mod x 5) (mod y 5))) 21 3))	
(= :gt (fn166 > 0 2))))
