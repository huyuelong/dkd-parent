package com.dkd.manager.domain.vo;

import com.dkd.manager.domain.Partner;
import lombok.Data;

@Data
public class PartnerVo extends Partner {

    //点位数量
    private Integer nodeCount;
}
