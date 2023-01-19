package edu.miu.waaassignment1.service;

import edu.miu.waaassignment1.entity.Post;

import edu.miu.waaassignment1.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {

    public List<User> findAll();
   public  User findById(Long id);
   public void save(User p);
   public void delete(Long id);
   public List<Post> findAllById(Long id);

}
