(ns tictactoe.controller
  (:use compojure.core)
  (:require [compojure.core :as compojure]
            [tictactoe.view :as view]
            [tictactoe.model :as model]))

(defn start-page []
  (model/reset-game!)
  (view/play-screen))

;(defn answer [button]
  ;(let [button-id (name (first (keys button)))]
    ;(model/check-answer
    ;  (clojure.string/split button-id #"answer"))
    ;(println button)
    
    
    ;(if (> @model/wrong-answers 2)
    ;  (view/lose-screen)
    ;  (if (> (model/inc-questionnumber) 10)
     ;        (view/win-screen)
      ;      (view/play-screen) 
      ;))
      ;))
      (defn answer [button]
  (println button)
  (let [button-id (name (first (keys button)))]
<snip>
 ))

(defn turn-page [button-pressed]
  (model/reset-game!)
  (view/play-screen))

(defroutes tictactoe-routes
  (GET "/" [] (start-page))
    (POST "/" {button :params} (answer button)))
