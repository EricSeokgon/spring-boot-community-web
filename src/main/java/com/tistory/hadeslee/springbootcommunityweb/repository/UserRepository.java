package com.tistory.hadeslee.springbootcommunityweb.repository;


import com.tistory.hadeslee.springbootcommunityweb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by KimYJ on 2017-07-12.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
