(ns tictactoe.view
  (:use hiccup.form
        [hiccup.def :only [defhtml]]
        [hiccup.element :only [link-to]]
        [hiccup.page :only [html5 include-css]])
  (:require [tictactoe.model :as model]))

(defhtml layout [& content]
  (html5
   [:head
    [:title "The game!"]
    (include-css "/css/tictactoe.css")]
   [:body [:div#wrapper content]]))

(defn current-question [question]
  [:p (str question)
   ])

(defn generate-options [answerlist]
  [:p
   [:ol
    (for [item answerlist]
      [:li item])
  ]])

(defn cell-html [rownum colnum cell with-submit?] 
  [:td 
   [:input {:name (str "Answer" cell) 
            :value (str cell)
            :type (if with-submit? 
                    "submit" 
                    "button")}]])

(defn row-html [rownum row with-submit?]
  [:tr (map-indexed (fn [colnum cell]
                      (cell-html rownum colnum cell with-submit?))
                    row)])

(defn generate-options-panel [board]
  (form-to [:post "/"]
           [:table 
            (map-indexed (fn [rownum row]
                           (row-html rownum row true)) 
                         board)]))

(defn play-screen []
  (layout
    [:div 
     (current-question (clojure.string/join ["Vraag " @model/question ".<br />" (model/make-question)]))
     (generate-options (model/get-options))
     (generate-options-panel (model/get-options-panel))
    ; [:p 
    ;  "Correct answers: " @model/good-answers "<br />"
      ;"Wrong answers: " @model/wrong-answers
     ;]
     ]))


