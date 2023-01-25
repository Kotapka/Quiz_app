package com.example.Quiz_app.questions;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class storing information about question.
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="questions")
public class Questions {

    @Id
    @SequenceGenerator(
            name = "users_id_sequence",
            sequenceName = "users_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "users_id_sequence"
    )
    @Column(name = "id")

    /**
     * Variables:
     *  - id - stores unique identification number of a question,
     *  - question - text of the question being asked to the player,
     *  - r_a - correct answer,
     *  - w_a1, w_a2, w_a3 - wrong answers.
     */
    private Integer id;
    private String question;
    private String r_a;
    private String w_a1;
    private String w_a2;
    private String w_a3;
}
