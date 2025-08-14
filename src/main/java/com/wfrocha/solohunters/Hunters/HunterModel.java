package com.wfrocha.solohunters.Hunters;


import com.wfrocha.solohunters.Quests.QuestModel;
import jakarta.persistence.*;

import java.util.List;

// Ele transforma uma classe Java em uma entidade JPA, que pode ser mapeada para uma tabela no banco de dados.
@Entity
@Table(name = "tb_hunters")
public class HunterModel {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)

    @Column(name = "id_hunter", nullable = false)
    private Long id;
    private String name;
    private int age;
    private String nationality;
    private String rank;
    private String guild;

    // Relacionamento com QuestModel muitos para um (um caçador pode ter várias missões, mas cada missão pertence a um único caçador)
    @ManyToOne
    @JoinColumn(name = "quests_id") // Chave estrangeira na tabela de caçadores
    private QuestModel quests;

    public HunterModel() {
    }

    public HunterModel(String name, int age, String nationality, String rank, String guild) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getGuild() {
        return guild;
    }

    public void setGuild(String guild) {
        this.guild = guild;
    }
}
