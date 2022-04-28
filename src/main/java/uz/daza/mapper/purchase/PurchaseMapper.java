package uz.daza.mapper.purchase;

import org.springframework.stereotype.Component;
import uz.daza.dto.PurchaseDto;
import uz.daza.models.purchase.Purchase;

@Component
public class PurchaseMapper {
    public Purchase toEntity(PurchaseDto dto) {
        Purchase purchase = new Purchase();
        purchase.setProductCount(dto.getProductCount());
        purchase.setPriceOfOne(dto.getPriceOfOne());
        purchase.setTotallyPrice(dto.getTotallyPrice());
        purchase.setPrivilegePeriod(dto.getPrivilegePeriod());
        purchase.setEntryDate(dto.getEntryDate());
        purchase.setReturnDeadline(dto.getReturnDeadline());
        purchase.setReturnPrice(dto.getReturnPrice());
        return purchase;
    }

}
