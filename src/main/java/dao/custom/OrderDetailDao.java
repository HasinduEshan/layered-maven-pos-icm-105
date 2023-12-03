package dao.custom;

import dto.OrderDetailDto;

import java.sql.SQLException;
import java.util.List;

public interface OrderDetailDao {
    boolean saveOrderDetails(List<OrderDetailDto> list) throws SQLException, ClassNotFoundException;
}
