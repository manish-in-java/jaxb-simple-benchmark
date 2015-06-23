package org.example;

import org.example.domain.Library;
import org.openjdk.jmh.annotations.*;
import org.simpleframework.xml.core.Persister;

import java.io.InputStream;
import java.io.Reader;

public class SimpleXMLBenchmark extends XMLBenchmark
{
  @Benchmark
  @BenchmarkMode(Mode.SampleTime)
  @Fork(0)
  @Measurement(iterations = 5)
  @Warmup(iterations = 5)
  public void benchmarkBufferedReader() throws Exception
  {
    try (final Reader reader = getResourceAsBufferedReader())
    {
      check(new Persister().read(Library.class, reader));
    }
  }

  @Benchmark
  @BenchmarkMode(Mode.SampleTime)
  @Fork(0)
  @Measurement(iterations = 5)
  @Warmup(iterations = 5)
  public void benchmarkBufferedStream() throws Exception
  {
    try (final InputStream stream = getResourceAsBufferedStream())
    {
      check(new Persister().read(Library.class, stream));
    }
  }

  @Benchmark
  @BenchmarkMode(Mode.SampleTime)
  @Fork(0)
  @Measurement(iterations = 5)
  @Warmup(iterations = 5)
  public void benchmarkReader() throws Exception
  {
    try (final Reader reader = getResourceAsReader())
    {
      check(new Persister().read(Library.class, reader));
    }
  }

  @Benchmark
  @BenchmarkMode(Mode.SampleTime)
  @Fork(0)
  @Measurement(iterations = 5)
  @Warmup(iterations = 5)
  public void benchmarkStream() throws Exception
  {
    try (final InputStream stream = getResourceAsStream())
    {
      check(new Persister().read(Library.class, stream));
    }
  }
}
