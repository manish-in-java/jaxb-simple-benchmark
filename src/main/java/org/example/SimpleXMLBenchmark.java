package org.example;

import org.example.domain.Library;
import org.openjdk.jmh.annotations.*;
import org.simpleframework.xml.core.Persister;

public class SimpleXMLBenchmark
{
  @Benchmark
  @BenchmarkMode(Mode.SampleTime)
  @Fork(0)
  @Measurement(iterations = 5)
  @Warmup(iterations = 5)
  public void benchmark() throws Exception
  {
    new Persister()
        .read(Library.class, getClass().getClassLoader().getResourceAsStream("library.xml"));
  }
}
