package org.lanmei.commodity.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lanmei.commodity.dao.model.Commodity;
import org.springframework.stereotype.Repository;

@Repository
public interface CommodityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer commodityId);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity
	 * @mbg.generated
	 */
	int insert(Commodity record);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity
	 * @mbg.generated
	 */
	Commodity selectByPrimaryKey(Integer commodityId);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity
	 * @mbg.generated
	 */
	List<Commodity> selectAll();
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Commodity record);
	/**
	 * 通过商品名称查询
	 * @param name
	 * @return
	 */

	Commodity selectByName(String name);
	/**
	 * 通过分类表的品牌id进行查询
	 * @param categoryIdList
	 * @return
	 */
	List<Commodity> selectByCategoryId(@Param("categoryIdList") List<Integer> categoryIdList );
	/**
	 * 更新商品描述
	 * @param commodityId　商品id
	 * @param description 商品描述
	 * @return
	 */
	int updateDescByPrimaryKey(@Param("commodityId") Integer commodityId ,@Param("description") String description );
	
	/**
	 * 查询商品描述
	 * @param commodityId　商品id
	 * @return
	 */
	String selectDescByPrimaryKey(Integer commodityId);
	
}