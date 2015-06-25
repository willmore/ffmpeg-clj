(ns ffmpeg-clj.core-test
  (:require [midje.sweet :refer :all]
            [ffmpeg-clj.core :as ffmpeg]))

(fact "Finds ffmpeg version"
      (ffmpeg/version) => truthy)
