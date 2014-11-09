package org.jperf.test;

import org.jperf.PerfTestConfig;
import org.jperf.JPerf;
import org.jperf.PerfTest;
import org.jperf.noop.NoOpTest;

public class Test {

  @org.junit.Test
  public void test() throws Exception {

    // create config
    PerfTestConfig config = JPerf.newConfigBuilder()
        .minThreads(1)
        .maxThreads(10)
        .duration(100)
        .testFactory(() -> new NoOpTest())
        .build();

    // run test
    JPerf.run(config);
  }

}
