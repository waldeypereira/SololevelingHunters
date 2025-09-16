package com.wfrocha.solohunters.Quests;

import com.wfrocha.solohunters.Hunters.HunterModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_quests")
public class QuestModel {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)

    @Column(name = "id_quest", nullable = false)
    private Long id;
    private String name;
    private String description;
    private String difficulty;
    private String status;

    // Uma missão pode ser atribuída a vários caçadores, mas cada caçador tem uma única missão
    @OneToMany(mappedBy = "quests", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HunterModel> hunters;

}
