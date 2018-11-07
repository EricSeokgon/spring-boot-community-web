package com.tistory.hadeslee.springbootcommunityweb.repository;

import com.tistory.hadeslee.springbootcommunityweb.domain.Board;
import com.tistory.hadeslee.springbootcommunityweb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}
