/*
 *  Copyright 1999-2021 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.bean.samples.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bean.samples.common.dto.OrderDTO;
import com.bean.samples.common.response.ObjectResponse;
import com.bean.samples.order.entity.TOrder;

/**
 * <p>
 * 创建订单
 * </p>
 *
 * @author heshouyou
 * @since 2019-01-13
 */
public interface ITOrderService extends IService<TOrder> {

    /**
     * 创建订单
     */
    ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO);
}
