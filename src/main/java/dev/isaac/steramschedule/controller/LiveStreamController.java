package dev.isaac.steramschedule.controller;

import dev.isaac.steramschedule.repository.LiveStreamRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {
    private final LiveStreamRepository repository;

    public LiveStreamController(LiveStreamRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
  public List<LiveStreamController> findAll(){
     return null;
  }
}
