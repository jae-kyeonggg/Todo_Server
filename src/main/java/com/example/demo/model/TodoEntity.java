package com.example.demo.model;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoEntity {

    private String id;
    private String userId;
    private String title;
    private boolean done;
}
