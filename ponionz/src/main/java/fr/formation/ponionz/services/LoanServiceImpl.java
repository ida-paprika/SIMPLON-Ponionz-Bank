package fr.formation.ponionz.services;

import java.time.LocalDateTime;

import org.apache.commons.math3.util.Precision;
import org.springframework.stereotype.Service;

import fr.formation.ponionz.domain.dtos.LoanCreate;
import fr.formation.ponionz.domain.entities.Loan;
import fr.formation.ponionz.repositories.LoanRepository;

@Service
public class LoanServiceImpl implements LoanService {

    private final LoanRepository repo;

    public LoanServiceImpl(LoanRepository repo) {
	this.repo = repo;
    }

    @Override
    public void create(LoanCreate dto) {
	Loan entity = new Loan();
	entity.setAmount(dto.getAmount());
	entity.setContribution(dto.getContribution());
	entity.setTerm(dto.getTerm());
	entity.setBenefitRate(Precision.round(dto.getBenefitRate(), 2));
	entity.setInsuranceRate(Precision.round(dto.getInsuranceRate(), 2));
	entity.setJobLossCoverage(dto.getJobLossCoverage());
	entity.setCreationDate(LocalDateTime.now());
	repo.save(entity);
    }

}
