(ns istext_tests
  (:use clojure.test istext))

(deftest text-file?-test
  (is (text-file? "resources/test/README"))
  (is (text-file? "resources/test/text_file"))
  (is (not (text-file? "resources/test/bin_file")))
  (is (not (text-file? "resources/test/tiny_bin_file"))))

(deftest bin-file?-test
  (is (bin-file? "resources/test/bin_file"))
  (is (bin-file? "resources/test/tiny_bin_file"))
  (is (bin-file? "resources/test/empty_file"))
  (is (not (bin-file? "resources/test/README")))
  (is (not (bin-file? "resources/test/text_file"))))
