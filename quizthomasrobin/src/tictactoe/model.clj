(ns tictactoe.model
  (:require [noir.session :as session])
    (:import java_classes.Questions))

(defn reset-game! []
  ())

(defn make-question []
  (Questions/getQuestion))

(def good-answers (atom 0))
(def wrong-answers (atom 0))

(def question (atom 0))
(def question-answer (atom {}))
(def total-questions (atom 10))

(defn get-options-panel []
  (:answers (session/get :game-state)))

(defn inc-questionnumber []
  (swap! question inc))

(defn get-options []
  (swap! question-answer assoc :Answer (Questions/getCorrectAnswer))
  (clojure.string/split (Questions/generateOptions) #"/"))
