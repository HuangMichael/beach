package cn.linkbit.beach.dao.workOrder;

import cn.linkbit.beach.domain.workOrder.VworkOrderLineNumReport;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by huangbin on 2016/7/24.
 */
public interface VworkOrderLineNumReportRepository extends CrudRepository<VworkOrderLineNumReport, Long> {
    List<VworkOrderLineNumReport> findAll();

}
