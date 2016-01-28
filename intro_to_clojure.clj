# lists
(def l (list :a :b :c))
(first l) #> :a  = first element
(last l) #> :c = last element
(vec l) #> [:a :b :c] = turns into vector

# map
(def m {:foo "bar" :fizz "buzz"})
(m :foo) #> "bar"
(:foo m) #> "bar"
(assoc-in m [:foo] "buzz") #> {:foo "buzz", :fizz "buzz"} = changed :foo to "buz"
m #> {:foo "bar", :fizz "buzz"}  =  The immutability of clojure does not change 'm'



