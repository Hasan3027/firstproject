package com.example.firstproject.controller;

import com.example.firstproject.DB;
import com.example.firstproject.entity.Post;
import com.example.firstproject.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class MyFirstController {


    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public List<User> getUsers(@RequestParam(defaultValue = "", required = false) String firstname) {

        return DB.users.stream().filter(i ->
                i.getFirstname().startsWith(firstname)
        ).toList();
    }

    @GetMapping(path = "/test")
    public String testMe(@RequestParam(defaultValue = "", required = false) String name){

        return name;
    }

    @RequestMapping(path = "/users", method = RequestMethod.POST)
    public void addUser(@RequestBody User user) {
        DB.users.add(user);
    }

    @RequestMapping(path = "/users/{id}", method = RequestMethod.GET)
    public User getOneUser(@PathVariable int id) throws Exception {
        for (int i = 0; i < DB.users.size(); i++) {
            if (DB.users.get(i).getId() == id) {
                return DB.users.get(i);
            }
        }
        throw new Exception("bunaqa user mavjud emas");
    }

    @RequestMapping(path = "/users/{id}/posts", method = RequestMethod.GET)
    public ArrayList<Post> getUserPosts(@PathVariable int id) {
        ArrayList<Post> posts = new ArrayList<>();
        for (int i = 0; i < DB.posts.size(); i++) {
            if (DB.posts.get(i).getUserId() == id) {
                posts.add(DB.posts.get(i));
            }
        }
        return posts;
    }

    @RequestMapping(path = "/users/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable int id) {
        for (User user : DB.users) {
            if (id == user.getId()) {
                System.out.println(user.getFirstname());
                DB.users.remove(user);
                break;
            }
        }
    }

}
