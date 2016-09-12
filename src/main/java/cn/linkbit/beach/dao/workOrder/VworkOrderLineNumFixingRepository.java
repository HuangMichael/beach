package cn.linkbit.beach.dao.workOrder;

import cn.linkbit.beach.domain.workOrder.VworkOrderLineNumFixing;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by huangbin on 2016/7/24.
 */
public interface VworkOrderLineNumFixingRepository extends CrudRepository<VworkOrderLineNumFixing, Long> {
    List<VworkOrderLineNumFixing> findAll();

}
