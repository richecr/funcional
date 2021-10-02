(defn impl
    [a b]
    (or (not a) b))


(defn equiv
    [a b]
    (and (impl a b) (impl b a)))

(println (equiv false false))