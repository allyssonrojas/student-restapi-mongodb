package com.event.analisis.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document
public class Student {
    @Id
    private String idStudent;
    private String nameStudent;
    private int ageStudent;
}
