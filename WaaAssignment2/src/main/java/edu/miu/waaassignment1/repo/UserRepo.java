package edu.miu.waaassignment1.repo;

import edu.miu.waaassignment1.entity.Post;
import edu.miu.waaassignment1.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Long> {

    List<Post> findAllById(Long id);
}
