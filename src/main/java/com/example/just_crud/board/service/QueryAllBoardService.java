package com.example.crud_practice.board.service;

import com.example.crud_practice.board.entity.Board;
import com.example.crud_practice.board.repository.BoardRepository;
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