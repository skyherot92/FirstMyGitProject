package org.lanmei.commodity.dao.mapper;

import java.util.List;

import org.lanmei.commodity.dao.model.CommoditySku;
import org.springframework.stereotype.Repository;
	

@Repository
public interface CommoditySkuMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_sku
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer skuId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_sku
	 * @mbg.generated
	 */
	int insert(CommoditySku record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_sku
	 * @mbg.generated
	 */
	CommoditySku selectByPrimaryKey(Integer skuId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_sku
	 * @mbg.generated
	 */
	List<CommoditySku> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_sku
	 * @mbg.generated
	 */
	int updateByPrimaryKey(CommoditySku record);

	List<CommoditySku> selectByCommodityId(Integer commodityId );
}