package fr.formation.ponionz.domain.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private int amount;

    @Column(name = "contribution")
    private float contribution;

    @Column(name = "term")
    private int term;

    @Column(name = "benefit_rate")
    private float benefitRate;

    @Column(name = "insurance_rate")
    private float insuranceRate;

    @Column(name = "job_loss_coverage")
    private int jobLossCoverage;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

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

}
