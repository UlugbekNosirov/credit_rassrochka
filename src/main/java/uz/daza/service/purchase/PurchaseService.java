package uz.daza.service.purchase;

import org.springframework.stereotype.Service;
import uz.daza.dao.purchase.PurchaseDao;
import uz.daza.dto.PurchaseDto;
import uz.daza.mapper.purchase.PurchaseMapper;
import uz.daza.models.purchase.Purchase;

import java.io.IOException;
import java.util.List;

@Service
public class PurchaseService implements BaseService {

    private final PurchaseDao purchaseDao;
    private final PurchaseMapper purchaseMapper ;

    public PurchaseService(PurchaseDao purchaseDao, PurchaseMapper purchaseMapper) {
        this.purchaseDao = purchaseDao;
        this.purchaseMapper = purchaseMapper;
    }

    @Override
    public uz.daza.models.purchase.Purchase get(String id) {
        return null;
    }

    @Override
    public List<uz.daza.models.purchase.Purchase> getAll() {
        return null;
    }

    @Override
    public Purchase create(PurchaseDto dto) throws IOException {
        Purchase purchase = purchaseMapper.toEntity(dto);
        return purchaseDao.create(purchase);
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public boolean update(PurchaseDto updateDto) {
        return false;
    }
}
