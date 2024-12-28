package com.example.just_crud.board.service;

import com.example.just_crud.board.repository.BoardRepository;
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
