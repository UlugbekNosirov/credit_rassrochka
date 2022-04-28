package uz.daza.dao.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Component;
import uz.daza.models.purchase.Purchase;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class PurchaseDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PurchaseDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Purchase create(Purchase purchase) {
        jdbcTemplate.execute("insert into purchase(poduct_count, price_of_one,totally_price,privilege_period,entry_date,return_deadline,return_price) values(?,?,?,?,?,?,?)",
                new PreparedStatementCallback<Boolean>() {
                    @Override
                    public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                        ps.setInt(2, purchase.getProductCount());
                        ps.setDouble(3, purchase.getPriceOfOne());
                        ps.setDouble(4, purchase.getTotallyPrice());
                        ps.setInt(5, purchase.getPrivilegePeriod());
                        ps.setDate(6, purchase.getEntryDate());
                        ps.setDate(7, purchase.getReturnDeadline());
                        ps.setDouble(8, purchase.getReturnPrice());
                        return ps.execute();
                    }
                });
        return purchase ;
    }



}
