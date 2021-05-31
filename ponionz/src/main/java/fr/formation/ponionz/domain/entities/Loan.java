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
    private Integer amount;

    @Column(name = "contribution")
    private Float contribution;

    @Column(name = "term")
    private int term;

    @Column(name = "benefit_rate")
    private Double benefitRate;

    @Column(name = "insurance_rate")
    private Double insuranceRate;

    @Column(name = "job_loss_coverage")
    private Integer jobLossCoverage;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Integer getAmount() {
	return amount;
    }

    public void setAmount(Integer amount) {
	this.amount = amount;
    }

    public Float getContribution() {
	return contribution;
    }

    public void setContribution(Float contribution) {
	this.contribution = contribution;
    }

    public int getTerm() {
	return term;
    }

    public void setTerm(int term) {
	this.term = term;
    }

    public Double getBenefitRate() {
	return benefitRate;
    }

    public void setBenefitRate(Double benefitRate) {
	this.benefitRate = benefitRate;
    }

    public Double getInsuranceRate() {
	return insuranceRate;
    }

    public void setInsuranceRate(Double insuranceRate) {
	this.insuranceRate = insuranceRate;
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

}
