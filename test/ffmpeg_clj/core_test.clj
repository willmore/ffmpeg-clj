(ns ffmpeg-clj.core-test
  (:require [midje.sweet :refer :all]
            [ffmpeg-clj.core :as ffmeg]))

(fact "Finds ffmpeg version"
      (ffmeg/version) => truthy)
