package org.lanmei.commodity.dao.mapper;

import java.util.List;
import org.lanmei.commodity.dao.model.CommodityImage;
import org.springframework.stereotype.Repository;

@Repository
public interface CommodityImageMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_image
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer imageId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_image
	 * @mbg.generated
	 */
	int insert(CommodityImage record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_image
	 * @mbg.generated
	 */
	CommodityImage selectByPrimaryKey(Integer imageId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_image
	 * @mbg.generated
	 */
	List<CommodityImage> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_image
	 * @mbg.generated
	 */
	int updateByPrimaryKey(CommodityImage record);
	
	
}