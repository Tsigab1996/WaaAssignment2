package edu.miu.waaassignment1.controller;

import edu.miu.waaassignment1.entity.Post;
import edu.miu.waaassignment1.entity.User;
import edu.miu.waaassignment1.service.PostService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")

public class PostController {

   private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }


    @GetMapping

    public List<User> findAll(){
        return postService.findAll();
    }

    @GetMapping("/{id}")

    public User findById(Long id){
       return  postService.findById(id);
    }

    @PostMapping

    public void save(User user){
        postService.save(user);
    }

    @GetMapping("/posts")
    public List<Post> findAllPost(Long id){
       return  postService.findAllById(id);
    }
}
