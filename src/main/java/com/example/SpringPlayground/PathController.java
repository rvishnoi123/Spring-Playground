package com.example.SpringPlayground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathController {

    @GetMapping("/math/volume/{length}/{width}/{height}")
    public int getIndividualParams(@PathVariable int length, @PathVariable int width,@PathVariable int height) 
    {
    	int volume=length*width*height;
        return volume;
    }

}
