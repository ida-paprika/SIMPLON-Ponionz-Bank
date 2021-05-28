package fr.formation.ponionz.services;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import fr.formation.ponionz.domain.dtos.LoanCreate;
import fr.formation.ponionz.domain.dtos.LoanView;
import fr.formation.ponionz.repositories.LoanRepository;

@Service
public class LoanServiceImpl implements LoanService {

    private final LoanRepository repo;

    public LoanServiceImpl(LoanRepository repo) {
	this.repo = repo;
    }

    @Override
    public void create(LoanCreate dto) {
	LoanView loan = new LoanView();
	loan.setAmount(dto.getAmount());
	loan.setContribution(dto.getContribution());
	loan.setTerm(dto.getTerm());
	loan.setBenefitRate(dto.getBenefitRate());
	loan.setInsuranceRate(dto.getInsuranceRate());
	loan.setJobLossInsurance(dto.isJobLossInsurance());
	loan.setJobLossCoverage(dto.getJobLossCoverage());
	loan.setCreationDate(LocalDateTime.now());
	System.out.println(loan.toString());
    }

}
