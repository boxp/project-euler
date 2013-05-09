;answered
(defn palindromic? [number]
  (loop [numseq (seq (str number))]
    (cond (<= (count numseq) 1) true
          (= (first numseq) (last numseq)) (recur (drop-last (rest numseq)))
          :else false)))

(def thdigits 
  (range 100 1000))

(println (last (sort (filter palindromic? (for [x thdigits y thdigits] (* x y))))))
