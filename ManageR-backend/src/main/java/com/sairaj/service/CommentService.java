package com.sairaj.service;

import com.sairaj.exception.IssueException;
import com.sairaj.exception.UserException;
import com.sairaj.model.Comment;

import java.util.List;

public interface CommentService {
    Comment createComment(Long issueId,Long userId,String comment) throws UserException, IssueException;

    void  deleteComment(Long commentId, Long userId) throws UserException, IssueException;

    List<Comment> findCommentByIssueId(Long issueId);

}
