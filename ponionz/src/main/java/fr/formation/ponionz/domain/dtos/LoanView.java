package fr.formation.ponionz.domain.dtos;

import java.time.LocalDateTime;

public class LoanView {

    private int amount;
    private float contribution;
    private int term;
    private float benefitRate;
    private float insuranceRate;
    private boolean jobLossInsurance;
    private int jobLossCoverage;
    private LocalDateTime creationDate;

    public int getAmount() {
	return amount;
    }

    public void setAmount(int amount) {
	this.amount = amount;
    }

    public float getContribution() {
	return contribution;
    }

    public void setContribution(float contribution) {
	this.contribution = contribution;
    }

    public int getTerm() {
	return term;
    }

    public void setTerm(int term) {
	this.term = term;
    }

    public float getBenefitRate() {
	return benefitRate;
    }

    public void setBenefitRate(float benefitRate) {
	this.benefitRate = benefitRate;
    }

    public float getInsuranceRate() {
	return insuranceRate;
    }

    public void setInsuranceRate(float insuranceRate) {
	this.insuranceRate = insuranceRate;
    }

    public boolean isJobLossInsurance() {
	return jobLossInsurance;
    }

    public void setJobLossInsurance(boolean jobLossInsurance) {
	this.jobLossInsurance = jobLossInsurance;
    }

    public int getJobLossCoverage() {
	return jobLossCoverage;
    }

    public void setJobLossCoverage(int jobLossCoverage) {
	this.jobLossCoverage = jobLossCoverage;
    }

    public LocalDateTime getCreationDate() {
	return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
	this.creationDate = creationDate;
    }

    @Override
    public String toString() {
	return "LoanView ------------\n" + "[ amount = " + amount + " ]\n"
		+ "[ contribution = " + contribution + " ]\n" + "[ term = "
		+ term + " ]\n" + "[ benefitRate = " + benefitRate + " ]\n"
		+ "[ insuranceRate = " + insuranceRate + " ]\n"
		+ "[ jobLossInsurance = " + jobLossInsurance + " ]\n"
		+ "[ jobLossCoverage = " + jobLossCoverage + " ]\n"
		+ "[ creationDate = " + creationDate + " ]";
    }

}
