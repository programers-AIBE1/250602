package aibe1.proj2.t250602.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/fish")
public class FishController {
    @GetMapping
    public ResponseEntity<List<Fish>> getFishList() {
        List<Fish> fishList = List.of(new Fish("광어"), new Fish("연어"), new Fish("참치"));
        return ResponseEntity.ok().body(fishList);
    }

    public record Fish(String name) {}
}
