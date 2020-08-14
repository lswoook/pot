package com.my.pot.repository;

import com.my.pot.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bdRepo extends JpaRepository<Board,Long> {
}