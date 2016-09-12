package cn.linkbit.beach.service.budge;

import cn.linkbit.beach.dao.budget.BudgetBillRepository;
import cn.linkbit.beach.dao.locations.VlocationsRepository;
import cn.linkbit.beach.domain.budget.BudgetBill;
import cn.linkbit.beach.domain.budget.VbudgetBill;
import cn.linkbit.beach.service.app.BaseService;
import cn.linkbit.beach.dao.budget.VbudgetBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by huangbin on 2016/5/4.
 * 设备台账业务类
 */
@Service
public class BudgeService extends BaseService {


    @Autowired
    BudgetBillRepository budgetBillRepository;


    @Autowired
    VbudgetBillRepository vbudgetBillRepository;


    @Autowired
    VlocationsRepository vlocationsRepository;



    /**
     * @param pageable
     * @return 分页查询
     */
    public Page<VbudgetBill> findAllV(Pageable pageable) {

        return vbudgetBillRepository.findAll(pageable);
    }


    /**
     * @param pageable
     * @return 分页查询
     */
    public Page<BudgetBill> findAll(Pageable pageable) {
        return budgetBillRepository.findAll(pageable);
    }

    /**
     * @return 查询所有
     */
    public List<BudgetBill> findAll() {
        return budgetBillRepository.findAll();
    }


    /**
     * @return 查询所有
     */
    public BudgetBill findById(Long id) {
        return budgetBillRepository.findById(id);
    }


    /**
     * @return 查询所有
     */
    public List<VbudgetBill> findAllV() {
        return vbudgetBillRepository.findAll();
    }


    /**
     * @return 查询所有
     */
    public BudgetBill save(BudgetBill budgetBill) {
       // budgetBill.setVlocations(vlocationsRepository.findById(budgetBill.getLocations().getId()));
      //  budgetBill.getLocations()
        budgetBill.setApplyDate(new Date());
        return budgetBillRepository.save(budgetBill);
    }


}
