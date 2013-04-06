(reduce +
  (filter 
    (fn [x] 
      (or (= 0 (rem x 5))
          (= (rem x 3)))) 
       (range 1 999)))
