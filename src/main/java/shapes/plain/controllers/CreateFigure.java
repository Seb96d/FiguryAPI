package shapes.plain.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateFigure {
    @PostMapping(value = "/figures/createFigure")
    public ResponseEntity<Object>createFigure(@RequestBody CreateFigure createFigure) {
        return ResponseEntity.ok().body(createFigure);
    }
}
