package org.example;

import org.example.domain.Library;
import org.openjdk.jmh.annotations.*;

import javax.xml.bind.JAXBContext;

public class JAXBBenchmark
{
  @Benchmark
  @BenchmarkMode(Mode.SampleTime)
  @Fork(0)
  @Measurement(iterations = 5)
  @Warmup(iterations = 5)
  public void benchmark() throws Exception
  {
    JAXBContext.newInstance(Library.class)
        .createUnmarshaller()
        .unmarshal(getClass().getClassLoader().getResourceAsStream("library.xml"));
  }
}
