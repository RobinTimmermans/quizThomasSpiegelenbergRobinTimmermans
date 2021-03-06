(ns tictactoe.view
  (:use hiccup.form
        [hiccup.def :only [defhtml]]
        [hiccup.element :only [link-to]]
        [hiccup.page :only [html5 include-css]])
  (:require [tictactoe.model :as model]))

(defhtml layout [& content]
  (html5
   [:head
    [:title "The Game!"]
    (include-css "/css/tictactoe.css")]   
   [:body [:h1#main-message "Welkom bij de opperquiz!"][:div#wrapper content]]))

(defn current-question [question]
  [:p (str question)
   ])

(defn generate-options [answerlist]
  (form-to [:post "/"]
   [:ol
   (for [item answerlist]
     [:li [:button {:name (str "answer" (swap! model/buttonNumber inc))
                    :value @model/buttonNumber
                    :type "submit" 
                    } 
           item]])   
  ]))

(defn cell-html [rownum colnum cell with-submit?] 
  [:td 
   [:input {:name (str "answer" cell) 
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
     (current-question (clojure.string/join ["<b>Vraag " @model/question ".</b><hr>" (model/make-question)]))
     (generate-options (model/get-options))
     (generate-options-panel (model/get-options-panel))
     [:p 
      "Tot nu toe goed: " @model/good-answers "<br />"
     "Vraag " (- @model/question 1) " uit " @model/total-questions
     ]]))

(defn lose-screen []
  (layout
    [:div 
     [:p "Je hebt drie antwoorden fout en dus verloren. Jammer joh!"]
     ]
     (link-to "/" "Restart")))

(defn win-screen []
  (layout
    [:div
     [:p "Damn! Je hebt gewonnen!"]
     ]
    (link-to "/" "Restart")))
