package fr.formation.ponionz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.ponionz.domain.entities.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

}
