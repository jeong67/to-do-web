package com.example.demo.user;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor //쓰는 이유 찾기
@Entity(name = "USERS")
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column
    private String userName;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    public User(String userName) {
        this.userName = userName;


    }
}
