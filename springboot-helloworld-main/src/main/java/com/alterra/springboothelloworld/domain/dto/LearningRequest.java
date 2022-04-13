package com.alterra.springboothelloworld.domain.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LearningRequest implements Serializable {
    
    private static final long serialVersionUID = -42256424879551154L;

    private String material;
    
}
