package com.sairaj.service;

import com.sairaj.exception.ChatException;
import com.sairaj.exception.ProjectException;
import com.sairaj.exception.UserException;
import com.sairaj.model.Message;

import java.util.List;

public interface MessageService {

    Message sendMessage(Long senderId, Long chatId, String content) throws UserException, ChatException, ProjectException;

    List<Message> getMessagesByProjectId(Long projectId) throws ProjectException, ChatException;
}

