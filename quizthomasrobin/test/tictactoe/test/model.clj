(ns tictactoe.model
  (:require [noir.session :as session])
  (:import java_classes.Questions))


(def good-answers (atom 0))
(def wrong-answers (atom 0))

(def question (atom 0))
(def question-answer (atom {}))
(def answers [[\1 \2 \3]
              [\4]])
  (def init-state {:answers answers})
  
  (defn reset-game! []
  (session/put! :game-state init-state)
  (reset! good-answers 0)
  (reset! wrong-answers 0)
  (reset! question 1)
  (Questions/reset))