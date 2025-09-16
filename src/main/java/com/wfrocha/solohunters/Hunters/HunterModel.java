package com.wfrocha.solohunters.Hunters;


import com.wfrocha.solohunters.Quests.QuestModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
// Ele transforma uma classe Java em uma entidade JPA, que pode ser mapeada para uma tabela no banco de dados.
@Entity
@Table(name = "tb_hunters")
public class HunterModel {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)

    @Column(name = "id_hunter", nullable = false)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private int age;

    private String nationality;

    private String rank;

    private String guild;

    // Relacionamento com QuestModel muitos para um (um caçador pode ter várias missões, mas cada missão pertence a um único caçador)
    @ManyToOne
    @JoinColumn(name = "quests_id") // Chave estrangeira na tabela de caçadores
    private QuestModel quests;

}
