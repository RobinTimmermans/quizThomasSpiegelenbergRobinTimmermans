(ns tictactoe.model
  (:require [noir.session :as session])
    (:import java_classes.Questions))

(defn reset-game! []
  ())

(def question (atom 1))

(defn inc-questionnumber []
  (swap! question inc))

(defn make-question []
  (inc-questionnumber)
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
