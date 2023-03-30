package com.pract.domain;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@With
@Table(name = "anime")
public class Anime {

    @Id
    private  Integer id;

    @NotNull
    @NotEmpty(message = "name cannot be empty")
    private  String name;


}
