(defn lenght-list
    "Function that calculated lenght list."
    [list]
    (cond
        (= list []) 0
        :else (+ 1 (lenght-list (subvec list 1)))))

(println (lenght-list [1 2 3 4 5 6 7 8]))