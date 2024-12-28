package com.example.crud_practice.board.service;

import com.example.crud_practice.board.dto.request.BoardRequest;
import com.example.crud_practice.board.entity.Board;
import com.example.crud_practice.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdateBoardService {
    private final BoardRepository boardRepository;

    @Transactional
    public void updateBoard(BoardRequest boardRequest, Long id) {

        Board board = boardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("존재하지 않은 글입니다."));

        board.updateBoard(boardRequest.getTitle(), boardRequest.getContent());

    }
}
