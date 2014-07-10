(ns tictactoe.model
  (:require [noir.session :as session])
    (:import java_classes.Questions))

(defn reset-game! []
  ())

(def buttonNumber (atom 0))

(def question (atom 1))

(def answers [])

(defn inc-questionnumber []
  (swap! question inc))

(defn inc-buttonNumber []
  (swap! buttonNumber inc))

(defn make-question []
  (inc-questionnumber)
  (inc-buttonNumber)
  (reset! buttonNumber 0)  
  (Questions/getQuestion))

(def good-answers (atom 0))
(def wrong-answers (atom 0))

(def question-answer (atom {}))
(def total-questions (atom 10))

(defn get-options-panel []
  (:answers (session/get :game-state)))

(defn get-options []
  (swap! question-answer assoc :Answer (Questions/getCorrectAnswer))
  (clojure.string/split (Questions/generateOptions) #"/"))

(defn check-answer [answer]
  (if (= (clojure.string/join answer) (get @question-answer :Answer))
    (swap! good-answers inc)
    (swap! wrong-answers inc)))