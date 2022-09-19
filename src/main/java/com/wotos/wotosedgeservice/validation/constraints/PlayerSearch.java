package com.wotos.wotosedgeservice.validation.constraints;


import com.wotos.wotosedgeservice.validation.PlayerSearchValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Constraint(validatedBy = PlayerSearchValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PlayerSearch {
    String message() default "Invalid Search Type: '${validatedValue[3]}' must be 'exact' with multiple nicknames or 'startswith' with one nickname";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
