package com.example.crud_practice.board.controller;

import com.example.crud_practice.board.dto.request.BoardRequest;
import com.example.crud_practice.board.entity.Board;
import com.example.crud_practice.board.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final CreateBoardService createBoardService;
    private final QueryAllBoardService queryAllBoardService;
    private final QueryBoardService queryBoardService;
    private final DeleteBoardService deleteBoardService;
    private final UpdateBoardService updateBoardService;


    @PostMapping("/create")
    public void createBoard(@RequestBody BoardRequest boardRequest) {
        createBoardService.createBoard(boardRequest);
    }

    @GetMapping("/all")
    public List<Board> queryAllBoard() {
        return queryAllBoardService.queryAllBoard();
    }

    @GetMapping("/{id}")
    public Board queryBoard(@PathVariable Long id) {
        return queryBoardService.queryBoard(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBoard(@PathVariable Long id) {
        deleteBoardService.deleteBoard(id);
    }

    @PatchMapping("/{id}")
    public void updateBoard(@PathVariable Long id, @RequestBody BoardRequest boardRequest) {
        updateBoardService.updateBoard(boardRequest, id);
    }
}
