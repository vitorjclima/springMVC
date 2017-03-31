/**
 * 
 */
package com.algaworks.party.repository;

import com.algaworks.party.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author vitor
 *
 */
public interface Guests extends JpaRepository<Guest, Long> {

}
