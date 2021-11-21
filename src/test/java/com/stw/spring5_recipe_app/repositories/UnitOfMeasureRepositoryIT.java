package com.stw.spring5_recipe_app.repositories;

import com.stw.spring5_recipe_app.domain.UnitOfMeasure;
import java.util.Optional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 *
 * @author Usuario
 */
@ExtendWith(SpringExtension.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {
    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;
    
    public UnitOfMeasureRepositoryIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of findByDescription method, of class UnitOfMeasureRepository.
     */
    @Test
    @DirtiesContext //Restart spring boot after this test
    public void testFindByDescription() {
      
        
        Optional<UnitOfMeasure> uomOptional = 
                unitOfMeasureRepository.findByDescription("Teaspoon");
        
        assertEquals("Teaspoon",uomOptional.get().getDescription());
    }
    
    @Test
    public void testFindByDescriptionCups() {
                
        Optional<UnitOfMeasure> uomOptional = 
                unitOfMeasureRepository.findByDescription("Cups");
        
        assertEquals("Cups",uomOptional.get().getDescription());
    }
    
}
