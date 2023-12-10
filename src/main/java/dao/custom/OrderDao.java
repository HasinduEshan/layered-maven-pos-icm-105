package dao.custom;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import dao.CrudDao;
import dto.OrderDto;
import entity.Orders;

import java.sql.SQLException;

public interface OrderDao extends CrudDao<OrderDto> {
    OrderDto getLastOrder() throws SQLException, ClassNotFoundException;
}
