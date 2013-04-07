;(loop [result '(1 2)]
;  (if (> (last result) 2) 
;      (reduce + 
;        (filter 
;          even?  
;          (drop-last result)))
;      (recur 
;        (lazy-seq
;          (cons
;            (+ 
;              (last result)
;              (last (drop-last result)))
;            result)))))
(defn lazy-seq-fib
  ([] (concat [0 1] (lazy-seq-fib 0 1)))
  ([a b] 
    (let [n (+ a b)]
      (lazy-seq (cons n (lazy-seq-fib b n))))))

(defn upper-4000000? [n] (> n 4000000))

(reduce +
  (filter even?
    (take-while upper-4000000? lazy-seq-fib)))
