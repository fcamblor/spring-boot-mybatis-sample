package com.samples;

import java.util.List;
import javax.annotation.security.PermitAll;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleResource {

  private final SampleRepository repository;

  public SampleResource(SampleRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/samples")
  @PermitAll
  public List<String> findAllSampleNames() {
    return this.repository.selectAllNames();
  }
}
