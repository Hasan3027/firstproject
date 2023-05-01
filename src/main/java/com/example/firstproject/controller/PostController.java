package com.example.firstproject.controller;

import com.example.firstproject.DB;
import com.example.firstproject.entity.Post;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PostController {

    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    public List<Post> getPosts(
            @RequestParam(defaultValue = "") Integer userId,
            @RequestParam(defaultValue = "") String title
    ) {
        if (userId == null || title == null) {
            return DB.posts;
        } else {
            return DB.posts.stream().filter(i -> i.getUserId() == userId
            ).toList();
        }
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    public Post getOnePost(@PathVariable Integer id){
        return DB.posts.stream().filter(i->i.getId()==id).findFirst().get();
    }

    @RequestMapping(path = "/posts",method = RequestMethod.POST)
    public Post send(@RequestBody Post post){
        System.out.println(post);
        return post;
    }
}
