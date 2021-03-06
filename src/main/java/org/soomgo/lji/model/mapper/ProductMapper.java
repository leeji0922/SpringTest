package org.soomgo.lji.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.soomgo.lji.domain.ProductVO;
import org.soomgo.lji.domain.UserVO;

@Mapper
public interface ProductMapper {
	public int totalProductNum();
	public List<ProductVO> showProduct();
	public int showAllStock();
	public UserVO addUser();
}
