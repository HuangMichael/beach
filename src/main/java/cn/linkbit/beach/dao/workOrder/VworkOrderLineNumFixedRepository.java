package cn.linkbit.beach.dao.workOrder;

import cn.linkbit.beach.domain.workOrder.VworkOrderLineNumFixed;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by huangbin on 2016/7/24.
 */
public interface VworkOrderLineNumFixedRepository extends CrudRepository<VworkOrderLineNumFixed, Long> {
    List<VworkOrderLineNumFixed> findAll();

}
