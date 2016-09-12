package cn.linkbit.beach.controller.portal;


import cn.linkbit.beach.service.portal.PortalService;
import cn.linkbit.beach.service.workOrder.WorkOrderReportCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by huangbin on 2015/12/23 0023.
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/")
@SessionAttributes("menuList")
public class PortalController {

    @Autowired
    WorkOrderReportCartService workOrderReportCartService;


    @Autowired
    PortalService portalService;





}

