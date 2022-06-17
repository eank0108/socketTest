package com.example.sockettest;

import lombok.*;

@Getter
@Setter
public class ChatMessageDTO {

    private String roomId;
    private String writer;
    private String message;
}