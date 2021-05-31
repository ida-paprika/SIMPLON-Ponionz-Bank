package fr.formation.ponionz.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.ponionz.domain.dtos.LoanCreate;

public class MaximumContributionValidator
	implements ConstraintValidator<MaximumContribution, LoanCreate> {

    @Override
    public boolean isValid(LoanCreate value,
	    ConstraintValidatorContext context) {

	if (value.getContribution() == null) {
	    return true;
	}

	int halfAmount = value.getAmount() / 2;

	return value.getContribution() <= halfAmount;
    }

}
