package com.example.crud_practice.board.service;

import com.example.crud_practice.board.dto.request.BoardRequest;
import com.example.crud_practice.board.entity.Board;
import com.example.crud_practice.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateBoardService {
    private final BoardRepository boardRepository;
    public void createBoard(BoardRequest boardRequest) {
        Board board = new Board(
                boardRequest.getTitle(),
                boardRequest.getContent(),
                boardRequest.getUserName()
        );

        boardRepository.save(board);
    }
}
