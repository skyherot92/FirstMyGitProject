package org.lanmei.commodity.dao.mapper;

import java.util.List;
import org.lanmei.commodity.dao.model.CommoditySkuCollect;

public interface CommoditySkuCollectMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_sku_collect
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer skuCollectId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_sku_collect
	 * @mbg.generated
	 */
	int insert(CommoditySkuCollect record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_sku_collect
	 * @mbg.generated
	 */
	CommoditySkuCollect selectByPrimaryKey(Integer skuCollectId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_sku_collect
	 * @mbg.generated
	 */
	List<CommoditySkuCollect> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_sku_collect
	 * @mbg.generated
	 */
	int updateByPrimaryKey(CommoditySkuCollect record);
}