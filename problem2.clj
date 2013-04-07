(loop [result (conj #{} 1 2)]
  (if (> (last result) 100) 
      (reduce + 
        (filter 
          even?  
          (drop-last result)))
      (recur 
        (conj result 
          (+ 
            (last result)
            (last (drop-last result)))))))
