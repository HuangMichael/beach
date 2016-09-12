package cn.linkbit.beach.dao.workOrder;

import cn.linkbit.beach.domain.workOrder.VworkOrderFixBill;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.persistence.OrderBy;
import java.util.List;

/**
 * Created by huangbin on 2016/9/2.
 */
public interface VworkOrderFixBillRepository extends PagingAndSortingRepository<VworkOrderFixBill, Long>, JpaSpecificationExecutor<VworkOrderFixBill> {

    List<VworkOrderFixBill> findAll();

    /**
     * @param location 位置编号
     * @param nodeState 节点状态
     * @return 根据用户位置和节点状态查询
     */
    @OrderBy("nodeTime desc,dealLine desc,id desc")
    List<VworkOrderFixBill>  findByLocationStartingWithAndNodeState(String location, String nodeState);


}
