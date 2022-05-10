package com.tapli.zaidimuparduotuve.mybatis.dao;

import com.tapli.zaidimuparduotuve.mybatis.model.Kategorija;
import org.mybatis.cdi.Mapper;

import java.util.List;

@Mapper
public interface KategorijaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.KATEGORIJA
     *
     * @mbg.generated Tue Apr 05 17:37:16 EEST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.KATEGORIJA
     *
     * @mbg.generated Tue Apr 05 17:37:16 EEST 2022
     */
    int insert(Kategorija record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.KATEGORIJA
     *
     * @mbg.generated Tue Apr 05 17:37:16 EEST 2022
     */
    Kategorija selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.KATEGORIJA
     *
     * @mbg.generated Tue Apr 05 17:37:16 EEST 2022
     */
    List<Kategorija> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.KATEGORIJA
     *
     * @mbg.generated Tue Apr 05 17:37:16 EEST 2022
     */
    int updateByPrimaryKey(Kategorija record);

    Kategorija selectOneByName(String kategorijaName);
}