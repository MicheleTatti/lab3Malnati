package it.ai.polito.esercitazione3_2.esercitazione3_2.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Data
public class Token {

    @Id
    String id;
    Long teamId;
    Timestamp expiryDate;

}
