package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.UserDao;


public interface UserDaoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Aug 02 17:40:58 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Aug 02 17:40:58 CST 2019
     */
    int insert(UserDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Aug 02 17:40:58 CST 2019
     */
    int insertSelective(UserDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Aug 02 17:40:58 CST 2019
     */
    UserDao selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Aug 02 17:40:58 CST 2019
     */
    int updateByPrimaryKeySelective(UserDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Aug 02 17:40:58 CST 2019
     */
    int updateByPrimaryKey(UserDao record);
}