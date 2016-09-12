package cn.linkbit.beach.dao.workOrder;

import cn.linkbit.beach.domain.workOrder.VworkOrderNumReport;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by huangbin on 2016/7/24.
 */
public interface VworkOrderNumReportRepository extends CrudRepository<VworkOrderNumReport,Long> {



    List<VworkOrderNumReport> findAll();

}
