(defn factors [x]
  (filter 
    #(= 0 (mod x %))
    (range 2 (+ 1 x))))

(defn prime-factors [x]
  (filter
    #(= 1 (count (factors %)))
    (range 2 (+ 1 x))))

(println (last (prime-factors 600851475143)))
