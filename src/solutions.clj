(ns solutions)

;156 Map Defaults
(defn fn156[d k]
  (apply hash-map (interleave k (repeat 10 d)) 
    ))

(= (fn156 0 [:a :b :c]) {:a 0 :b 0 :c 0})	
(= (fn156 "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})	
(= (fn156 [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})