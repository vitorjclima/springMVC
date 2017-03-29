/**
 * 
 */
package com.algaworks.party.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.party.model.Guest;

/**
 * @author vitor
 *
 */
public interface Guests extends JpaRepository<Guest, Long> {

}
