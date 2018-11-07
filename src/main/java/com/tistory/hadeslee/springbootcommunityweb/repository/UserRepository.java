package com.tistory.hadeslee.springbootcommunityweb.repository;

import com.tistory.hadeslee.springbootcommunityweb.domain.Board;
import com.tistory.hadeslee.springbootcommunityweb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Board findByUser(User user);
}
