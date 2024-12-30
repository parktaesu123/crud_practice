package com.example.just_crud.comment.api;

import com.example.just_crud.comment.dto.request.CommentRequest;
import com.example.just_crud.comment.dto.response.CommentResponse;
import com.example.just_crud.comment.entity.Comment;
import com.example.just_crud.comment.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {
    private final CreateCommentService createCommentService;
    private final QueryCommentService queryCommentService;
    private final QueryCommentByUserNameService queryCommentByUserNameService;
    private final TestService testService;
    private final DeleteCommentService deleteCommentService;
    private final UpdateCommentService updateCommentService;

    @PostMapping("")
    public void createComment(@RequestBody CommentRequest request) {
        createCommentService.createComment(request);
    }

    @GetMapping("")
    public List<CommentResponse> queryComment() {
        return queryCommentService.queryComment();
    }

    @GetMapping("/{userName}")
    public List<CommentResponse> queryCommentByUserName(@PathVariable String userName) {
        return queryCommentByUserNameService.queryCommentByUserName(userName);
    }

    @GetMapping("/test")
    public List<Comment> query() {
        return testService.query();
    }

    @DeleteMapping("/{userName}")
    public void deleteComment(@PathVariable String userName) {
        deleteCommentService.deleteComment(userName);
    }

    @PatchMapping("/{id}")
    public void updateComment(@PathVariable Long id, @RequestBody CommentRequest request) {
        updateCommentService.updateComment(request, id);
    }
}
