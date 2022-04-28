package uz.daza.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseDto {
    private Integer productCount;
    private double priceOfOne;
    private double totallyPrice;
    private Integer privilegePeriod;
    private Date entryDate;
    private Date returnDeadline;
    private double returnPrice;
}
