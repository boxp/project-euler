(loop [result #{}]
  (if (> (last result) 4000000) 
    (reduce + 
      (filter 
        (even? (drop-last result)) 
        (drop-last result))))
  (if (= result #{}) 
    (conj result 1 2)
    (recur 
      (conj 
        result 
        (reduce + 
          (drop 
            (- (count result) 2)) 
            result)))))
