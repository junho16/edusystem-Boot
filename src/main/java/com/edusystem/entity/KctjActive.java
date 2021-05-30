package com.edusystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class KctjActive {
    private String studentId;

    private Integer kctjId;

    private Long hits;

}