package com.nhnacademy.board.repository;

import com.nhnacademy.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface BoardRepository extends JpaRepository<Board, Integer> {

    @Transactional
    @Modifying
    @Query("update Board b set b.commentCount = :amount where b.boardId = :boardId")
    void updateBoard(@Param("boardId") Integer boardId, @Param("amount") Integer amount);
}