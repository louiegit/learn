package com.java.com.java.learn.mapstruct;

import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 * Created with IntelliJ IDEA.
 * Description: 要生成一个PeopleDTO与PeopleEntity对象相互转换的映射器，我们需要定义一个mapper接口
 * User: tianxiang.luo
 * Date: 2018-09-26 下午2:33
 */
public interface PeopleMapper {


    PeopleMapper INSTANCE = Mappers.getMapper(PeopleMapper.class);

    /**
     * PO转DTO
     *
     * @param entity PO
     * @return DTO
     */
    @Mapping(target = "phoneNumber", source = "callNumber")
    @Mapping(target = "user.name", source = "name")
    @Mapping(target = "user.age", source = "age")
    PeopleDTO entityToDTO(PeopleEntity entity);

    /**
     * DTO转PO
     *
     * @param peopleDTO DTO
     * @param entity    PO
     */
    @Mapping(target = "callNumber", source = "phoneNumber")
    @Mapping(target = "name", source = "user.name")
    @Mapping(target = "age", source = "user.age")
    void updateEntityFromDto(PeopleDTO peopleDTO, @MappingTarget PeopleEntity entity);

}
