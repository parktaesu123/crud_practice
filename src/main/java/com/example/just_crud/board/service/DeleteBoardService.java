package com.example.crud_practice.board.service;

import com.example.crud_practice.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteBoardService {
    private final BoardRepository boardRepository;

    public void deleteBoard(Long id) {
        boardRepository.deleteById(id);
    }
}
