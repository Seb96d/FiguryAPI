package shapes.plain.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shapes.plain.Figure;

@RestController
public class UpdateFigure {
    @PutMapping(value = "/figures/{figureId}")
    public ResponseEntity<Object> updateFigure(@PathVariable String figureId,
                                               @RequestBody Figure figure,
                                               @CookieValue(required = false) String canEdit,
                                               @RequestHeader Boolean fromHost,
                                               @RequestParam Boolean isCreator) {
        return ResponseEntity.ok().body(figure);
    }
}
