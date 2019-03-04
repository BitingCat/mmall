package com.mmall.service;

import com.mmall.common.ServerResponse;
import org.springframework.stereotype.Service;

@Service("iCartService")
public interface ICartService {

    ServerResponse add(Integer userId, Integer productId, Integer count);

}
