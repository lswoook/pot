package com.my.pot.repository;

import com.my.pot.model.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface bdRepo extends JpaRepository<Board,Long> {
    List<Board> findByTitle(String title);
    List<Board> findByTitleOrContent(String title,String content);
    //검색
    Page<Board> findByTitleContainingOrContentContaining(String title, String content, Pageable pageable);
}