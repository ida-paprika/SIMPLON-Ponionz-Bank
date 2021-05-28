package fr.formation.ponionz.validation;

import java.util.Iterator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.ponionz.domain.dtos.LoanCreate;

public class OptionExistsValidator
	implements ConstraintValidator<OptionExists, LoanCreate> {

    @Override
    public boolean isValid(LoanCreate value,
	    ConstraintValidatorContext context) {

	if (value.getJobLossCoverage() == null) {
	    return true;
	}
	// check if coverage exists in coverageOptions
	Iterator<Integer> options = value.getCoverageOptions().iterator();
	while (options.hasNext()) {
	    System.out.println(options.next());
	    if (value.getJobLossCoverage() == options.next()) {
		return true;
	    }
	}

	return false;
    }

}
