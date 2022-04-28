package uz.daza.service.purchase;


import uz.daza.dto.PurchaseDto;
import uz.daza.models.purchase.Purchase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface BaseService {

    List<Purchase> PURCHASE_LIST = new ArrayList<>();

    Purchase get(String id);

    List<Purchase> getAll();

    Purchase create(PurchaseDto dto) throws IOException;

    void delete(String id);

    boolean update(PurchaseDto updateDto);

}
