package org.example;

import org.example.domain.Library;
import org.openjdk.jmh.annotations.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.io.Reader;

@State(Scope.Benchmark)
public class JAXBBenchmark extends XMLBenchmark
{
  private Unmarshaller unmarshaller;

  @Benchmark
  @BenchmarkMode(Mode.SampleTime)
  @Fork(0)
  @Measurement(iterations = 5)
  @Warmup(iterations = 5)
  public void benchmarkBufferedReader() throws Exception
  {
    try (final Reader reader = getResourceAsBufferedReader())
    {
      check((Library) unmarshaller.unmarshal(reader));
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
      check((Library) unmarshaller.unmarshal(stream));
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
      check((Library) unmarshaller.unmarshal(reader));
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
      check((Library) unmarshaller.unmarshal(stream));
    }
  }

  @Setup
  public void setup() throws Exception
  {
    unmarshaller = JAXBContext.newInstance(Library.class).createUnmarshaller();
  }
}
