package com.stw.spring5_recipe_app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Usuario
 */
@Getter
@Setter
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;
    private String description;
}
