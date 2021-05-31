package fr.formation.ponionz.domain.dtos;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import fr.formation.ponionz.validation.JobLossIsChecked;
import fr.formation.ponionz.validation.MaximumContribution;
import fr.formation.ponionz.validation.OptionExists;

@MaximumContribution
@JobLossIsChecked
@OptionExists
public class LoanCreate {

    @Min(100000)
    @Max(600000)
    @NotNull
    private int amount;

    @Positive
    private Float contribution;

    @Min(2)
    @Max(30)
    @NotNull
    private int term;

    @Positive
    @NotNull
    private Double benefitRate;

    @Positive
    private Double insuranceRate;

    private boolean jobLossInsurance;

    private final Set<Integer> coverageOptions = new HashSet<>();

    private Integer jobLossCoverage;

    private LocalDateTime creationDate;

    public LoanCreate() {
	this.coverageOptions.add(30);
	this.coverageOptions.add(40);
	this.coverageOptions.add(50);
	this.coverageOptions.add(60);
	this.coverageOptions.add(70);
    }

    public int getAmount() {
	return amount;
    }

    public void setAmount(int amount) {
	this.amount = amount;
    }

    public Float getContribution() {
	return contribution;
    }

    public void setContribution(Float contribution) {
	this.contribution = contribution;
    }

    public Double getBenefitRate() {
	return benefitRate;
    }

    public void setBenefitRate(Double benefitRate) {
	this.benefitRate = benefitRate;
    }

    public int getTerm() {
	return term;
    }

    public void setTerm(int term) {
	this.term = term;
    }

    public Double getInsuranceRate() {
	return insuranceRate;
    }

    public void setInsuranceRate(Double insuranceRate) {
	this.insuranceRate = insuranceRate;
    }

    public boolean isJobLossInsurance() {
	return jobLossInsurance;
    }

    public void setJobLossInsurance(boolean jobLossInsurance) {
	this.jobLossInsurance = jobLossInsurance;
    }

    public Set<Integer> getCoverageOptions() {
	return coverageOptions;
    }

    public Integer getJobLossCoverage() {
	return jobLossCoverage;
    }

    public void setJobLossCoverage(Integer jobLossCoverage) {
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
