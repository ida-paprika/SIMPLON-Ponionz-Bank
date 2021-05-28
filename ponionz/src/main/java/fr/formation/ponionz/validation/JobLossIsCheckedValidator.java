package fr.formation.ponionz.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.ponionz.domain.dtos.LoanCreate;

public class JobLossIsCheckedValidator
	implements ConstraintValidator<JobLossIsChecked, LoanCreate> {

    @Override
    public boolean isValid(LoanCreate value,
	    ConstraintValidatorContext context) {

	if (value.isJobLossInsurance() == true) {
	    return value.getJobLossCoverage() != null;
	}

	return true;
    }

}
