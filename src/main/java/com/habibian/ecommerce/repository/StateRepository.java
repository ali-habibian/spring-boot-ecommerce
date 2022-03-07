package com.habibian.ecommerce.repository;

import com.habibian.ecommerce.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * @author Ali
 */

@CrossOrigin
@RepositoryRestResource
public interface StateRepository extends JpaRepository<State, Integer> {

    /**
     * find all states by country code and return them as a list
     *
     * @param code (country code like: US)
     * @return (list of states)
     */
    List<State> findByCountryCode(@Param("code") String code);

}
