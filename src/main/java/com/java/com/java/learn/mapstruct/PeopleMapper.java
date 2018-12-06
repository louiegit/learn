package com.java.com.java.learn.mapstruct;

import com.java.com.java.learn.mapstruct.invoce.Invoce;
import com.java.com.java.learn.mapstruct.invoce.InvoiceDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 * Created with IntelliJ IDEA.
 * Description: 要生成一个PeopleDTO与PeopleEntity对象相互转换的映射器，我们需要定义一个mapper接口
 * User: tianxiang.luo
 * Date: 2018-09-26 下午2:33
 */
@Mapper
public interface PeopleMapper {


    PeopleMapper INSTANCE = Mappers.getMapper(PeopleMapper.class);


    PeopleDTO entityToDTO(PeopleEntity entity);

    InvoiceDTO invoice2DTO(Invoce invoce);

}
