package com.wotos.wotosedgeservice.validation.constraints;


import com.wotos.wotosedgeservice.validation.VehicleTypeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.PARAMETER})
@Constraint(validatedBy = VehicleTypeValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface VehicleType {
    String message() default "Invalid Vehicle Type";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}