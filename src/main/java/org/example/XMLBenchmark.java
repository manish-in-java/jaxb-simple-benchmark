package org.example;

import org.example.domain.Library;

import java.io.*;

abstract class XMLBenchmark
{
  Reader getResourceAsBufferedReader()
  {
    return new BufferedReader(getResourceAsReader());
  }

  InputStream getResourceAsBufferedStream()
  {
    return new BufferedInputStream(getResourceAsStream());
  }

  Reader getResourceAsReader()
  {
    return new InputStreamReader(getResourceAsStream());
  }

  InputStream getResourceAsStream()
  {
    return getClass().getClassLoader().getResourceAsStream("library.xml");
  }

  void check(final Library library)
  {
    assert library != null;
    assert library.getName() != null;
    assert library.getBooks().size() == 10000;
  }
}
