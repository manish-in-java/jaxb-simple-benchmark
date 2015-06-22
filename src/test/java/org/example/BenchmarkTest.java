package org.example;

import org.junit.Test;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

public class BenchmarkTest
{
  @Test
  public void run() throws RunnerException, JAXBException, FileNotFoundException
  {
    new Runner(new OptionsBuilder()
                   .include(this.getClass().getPackage().getName() + ".*Benchmark.benchmark*")
                   .build()).run();
  }
}
