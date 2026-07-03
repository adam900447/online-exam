package com.example.saas.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Question{
@ID@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(lenth =100)
private String QuestionText;
private String optionA;
private String optionB;
private String optionC;
private String optionD;
private String correctAnswer;
}