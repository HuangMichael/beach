package cn.linkbit.beach.dao.budget;

import cn.linkbit.beach.domain.budget.BudgetBill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * 采购申请单
 *
 **/
public interface BudgetBillRepository extends PagingAndSortingRepository<BudgetBill, Long>, CrudRepository<BudgetBill, Long> {


    /**
     * @param pageable
     * @return
     */
    Page<BudgetBill> findAll(Pageable pageable);

    /**
     * @return
     */
    List<BudgetBill> findAll();


    /**
     * @param id 根据id查询
     * @return
     */
    BudgetBill findById(Long id);
}
