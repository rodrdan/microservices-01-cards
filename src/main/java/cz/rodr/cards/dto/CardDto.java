package cz.rodr.cards.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CardDto {

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits.")
    private String mobileNumber;

    @NotEmpty
    @Size(min = 12, max = 12, message = "Card number must be exactly 12 numbers.")
    private String cardNumber;

    private String cardType;

    @Min(value = 0, message = "Limit must be between 0 and 100 000.")
    @Max(value = 100000, message = "Limit must be between 0 and 100 000.")
    private Integer totalLimit;

    @Min(value = 0, message = "Amount must be between 0 and 100 000.")
    @Max(value = 100000, message = "Amount must be between 0 and 100 000.")
    private Integer amountUsed;

    @Min(value = 0, message = "Amount must be between 0 and 100 000.")
    @Max(value = 100000, message = "Amount must be between 0 and 100 000.")
    private Integer availableAmount;
}
