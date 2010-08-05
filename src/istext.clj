; A library to tell apart binary and text files using proven heuristics.
;
; Keywords: recognize text file, distinguish text file, text file heuristic, check if text file.

(ns istext
  (:import java.io.FileInputStream))

; ===================================
; private functions
; ===================================

(defn- includes-zeros? [seq]
  (some zero? seq))

(defn- majority-printable? [bytes]
  (let [printable_count (count (filter #(> % 31) bytes))
        all_count       (count bytes)
        printable_ratio (/ printable_count (max all_count 1))]
    (> printable_ratio 0.85)))

; ===================================
; public functions
; ===================================

(defn text-file? [file]
  (let [buffer (byte-array 1024)
        stream (FileInputStream. file)
        size   (.read stream buffer)
        leading_bytes  (take size buffer)]
    (and
      (not (includes-zeros? leading_bytes))
      (majority-printable? leading_bytes))))

(defn bin-file? [file]
  (not (text-file? file)))
