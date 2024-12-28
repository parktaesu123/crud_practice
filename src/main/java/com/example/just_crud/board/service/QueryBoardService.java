package com.example.crud_practice.board.service;

import com.example.crud_practice.board.entity.Board;
import com.example.crud_practice.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QueryBoardService {
    private final BoardRepository boardRepository;

    public Board queryBoard(Long id) {
        return boardRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("존재하지 않는 글입니다."));
    }
}
