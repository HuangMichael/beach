package cn.linkbit.beach.domain.budget;

import cn.linkbit.beach.domain.locations.Vlocations;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.persistence.Id;
import java.util.Date;

/**
 * 采购申请单
 *
 **/
@Entity
@Table(name = "T_BUDGET_BILL")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BudgetBill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;  //id

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date applyDate;// 申购日期

    @Column(length = 50)
    private String accessoryName; //配件名称

    @Column(length = 50)
    private String applicant; //申请人

    @Column(length = 50)
    private String purpose; //用途

    @Column(length = 50)
    private String specifications; //规格

    @Column(length = 10)
    private Long amount; //采购数量

    @Column(length = 10)
    private String approver; //批准人

    @Column(length = 10)
    private String handler; //经办人

    @Column(length = 10)
    private String receiver; //接收人

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "vlocations_id", referencedColumnName = "id")
    private Vlocations vlocations; //位置

}
