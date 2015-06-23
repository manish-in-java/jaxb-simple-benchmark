[![Build status](https://drone.io/github.com/manish-in-java/jaxb-simple-benchmark/status.png)](https://drone.io/github.com/manish-in-java/jaxb-simple-benchmark/latest)

# Overview
A collection of micro-benchmarks comparing [Java Architecture for XML Binding (JAXB)](https://jaxb.java.net)
against [Simple XML](http://simple.sourceforge.net/home.php).

# Sample output
The following output was obtained by running the benchmarks on a machine with:

* Quad-core Intel Core-i5 2450M processor @ 2.50Ghz
* 6GB DDR3 RAM @ 1333Mhz
* 64-bit Windows 7 Professional
* 64-bit Oracle Java Development Kit 1.8 patch 45

Each benchmark tries to read an XML file containing 10,000 book records into a
Java object graph.

Framework | Input                         | Time
--------- | ----------------------------- | -------------
JAXB      | `java.io.BufferedReader`      | 0.027 seconds
JAXB      | `java.io.BufferedInputStream` | 0.025 seconds
JAXB      | `java.io.Reader`              | 0.027 seconds
JAXB      | `java.io.InputStream`         | 0.025 seconds
SimpleXML | `java.io.BufferedReader`      | 0.063 seconds
SimpleXML | `java.io.BufferedInputStream` | 0.061 seconds
SimpleXML | `java.io.Reader`              | 0.061 seconds
SimpleXML | `java.io.InputStream`         | 0.062 seconds

# License
This sample application and its associated source code in its entirety is being made
available under the following licensing terms.

    Copyright (C) 2014

    Permission is hereby granted, free of charge, to any person obtaining a copy of
    this software and associated documentation files (the "Software"), to deal in the
    Software without restriction, including without limitation the rights to use, copy,
    modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
    and to permit persons to whom the Software is furnished to do so, subject to the
    following conditions:

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
    INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
    PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
    HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
    CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
    OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
