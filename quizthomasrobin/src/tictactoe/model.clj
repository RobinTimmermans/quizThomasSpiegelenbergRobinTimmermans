(ns tictactoe.model
  (:require [noir.session :as session])
    (:import java_classes.Questions))

(defn reset-game! []
  ())

(defn make-question []
  (Questions/getQuestion))

(def question (atom 0))

(defn get-options-panel []
  (:answers (session/get :game-state)))

(def question-answer (atom {}))

(defn get-options []
  (swap! question-answer assoc :Answer (Questions/getCorrectAnswer))
  (clojure.string/split (Questions/generateOptions) #"/"))
