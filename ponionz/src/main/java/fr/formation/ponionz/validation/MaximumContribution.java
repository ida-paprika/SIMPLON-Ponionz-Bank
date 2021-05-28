package fr.formation.ponionz.validation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(TYPE)
@Constraint(validatedBy = { MaximumContributionValidator.class })
public @interface MaximumContribution {

    String message() default "L'apport ne doit pas dépasser la moitié du prêt";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
