package com.example.just_crud.board.service;

import com.example.just_crud.board.entity.Board;
import com.example.just_crud.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QueryAllBoardService {
    private final BoardRepository boardRepository;

    public List<Board> queryAllBoard() {
        return boardRepository.findAll();
    }
}
