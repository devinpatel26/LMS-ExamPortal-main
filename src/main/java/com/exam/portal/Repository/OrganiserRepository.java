package com.exam.portal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.exam.portal.Model.Organiser;

@Repository
public interface OrganiserRepository extends JpaRepository<Organiser, Long> {

	@Query(value = "SELECT u FROM Organiser u WHERE u.email = ?1", nativeQuery = true)
	Organiser findByEmail(String email);
	
}
