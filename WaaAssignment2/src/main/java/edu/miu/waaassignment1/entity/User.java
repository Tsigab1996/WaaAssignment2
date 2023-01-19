package edu.miu.waaassignment1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany
    @JoinColumn(name="user-id")
    private List<Post> posts;
}
