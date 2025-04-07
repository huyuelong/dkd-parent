package com.dkd.manager.domain.vo;

import com.dkd.manager.domain.Region;
import lombok.Data;

@Data
public class RegionVo extends Region {

    // 点位数量
    private Integer nodeCount;
}
