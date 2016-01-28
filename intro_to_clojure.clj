;; lists
(def l (list :a :b :c))
(first l) ;;> :a  = first element
(last l) ;;> :c = last element
(vec l) ;;> [:a :b :c] = turns into vector

;; map
(def m {:foo "bar" :fizz "buzz"})
(m :foo) ;;> "bar"
(:foo m) ;;> "bar"
(assoc-in m [:foo] "buzz") ;;> {:foo "buzz", :fizz "buzz"} = changed :foo to "buz"
m ;;> {:foo "bar", :fizz "buzz"}  =  The immutability of clojure does not change 'm'

;; example atom
(def app-state (atom {}))

;; mutate state
(swap! app-state assoc-in [:foo] "bar")

;; Dereference
(:foo @app-state)

(js/alert "hello world!") ;;clojurescript
alert("hello world") ;; javascript

(. js/document getElementById "someID") ;; clojurescript
(.getElementById js/document "someID") ;; clojurescript  Use this format until you get comfortable
(js/document.getElementById "someID") ;; Clojurescript
document.getElementById("someID") ;; javascript

(.log js/console "Hello World") ;; ClojureScript
(js/console.log "Hello World") ;; ClojureScript
console.log("Hellow World") ;; Javascript

(set! (.-innerHTML (.item (. js/document getELementById "someID") 0))

