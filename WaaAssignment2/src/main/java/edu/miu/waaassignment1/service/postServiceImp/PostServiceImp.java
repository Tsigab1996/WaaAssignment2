package edu.miu.waaassignment1.service.postServiceImp;

import edu.miu.waaassignment1.entity.Post;
import edu.miu.waaassignment1.entity.User;
import edu.miu.waaassignment1.repo.PostRepo;
import edu.miu.waaassignment1.repo.UserRepo;
import edu.miu.waaassignment1.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImp implements PostService {
    @Autowired
    private UserRepo userRepo;


    @Override
    public List<User> findAll() {
        return (List<User>) userRepo.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepo.findById(id).get();
    }

    @Override
    public void save(User user) {
     userRepo.save(user);
    }

    @Override
    public void delete(Long id) {
      userRepo.deleteById(id);
    }

    @Override
    public List<Post> findAllById(Long id) {
        return userRepo.findAllById(id);
    }
}



