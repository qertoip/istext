# istext

A library to tell apart binary and text files using proven heuristics.

Uses the same [heuristics as Subversion](http://subversion.apache.org/faq.html#binary-files):

*   take the first 1KB of a file

*   if zero byte is found, the file is considered binary

*   if less than 85% bytes are ASCII-printable, the file is considered binary

*   otherwise the file is considered text

Contrary to naive implementations, file extension is not taken into account.

## Usage from Clojure

Like any other Clojure library, download and put istext.jar in your CLASSPATH. Then:

    (use 'istext)

    (text-file? "path/to/the/file")   ; true | false

    (bin-file? "path/to/the/file")    ; true | false

## Usage from Java

Like any other Java library, download and put istext-stanadalone.jar in your CLASSPATH.
The 'standalone' version is self contained. You don't need any other dependencies, even the Clojure is embedded.

    import clojure.lang.*;

    public class IsTextJavaClient {

        public static void main( String[] args ) throws Exception {
            // Load the Clojure script -- as a side effect this initializes Clojure runtime.
            RT.loadResourceScript( "istext.clj" );

            // Get a reference to the foo function.
            Var text_file = RT.var( "istext", "text-file?" );

            // Call it!
            boolean result = (Boolean) text_file.invoke( "d:/pik.bat" );
            System.out.println( result );
        }
    }

## Installation

Download jar and put it on your CLASSPATH.

## Development

istext is built with Leiningen:
    lein deps
    lein test
    lein uberjar

## License

Copyright (C) 2010 Piotr 'Qertoip' Włodarek. Distributed under the MIT License.