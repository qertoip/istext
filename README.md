# istext

A library to tell apart binary and text files using proven heuristics.

Uses the same [heuristics as Subversion](http://subversion.apache.org/faq.html#binary-files):

*   take the first 1KB of a file

*   if zero byte is found, file is considered binary

*   if less than 85% bytes are ASCII-printable, file is considered binary

*   otherwise file is considered text file

Contrary to naive implementations, file extension is not taken into account.

## Usage

(text-file? "path\\to\\the\\file")   ; true | false

(bin-file? "path\\to\\the\\file")    ; true | false

## Installation

Like any other Clojure library, either put source istext.clj in src/ __or__ put compiled version istext.jar in your CLASSPATH. Then use it:

(use 'istext)

## License

Copyright (C) 2010 Piotr 'Qertoip' Włodarek. Distributed under the MIT License.