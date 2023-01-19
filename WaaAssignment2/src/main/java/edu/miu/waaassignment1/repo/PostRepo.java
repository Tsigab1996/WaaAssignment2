package edu.miu.waaassignment1.repo;

import edu.miu.waaassignment1.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PostRepo extends CrudRepository<Post, Long> {



}
