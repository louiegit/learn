package com.java.com.java.learn.mapstruct;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: tianxiang.luo
 * Date: 2018-09-26 下午2:35
 */
public class MapperTestApplication {


    public static void main(String[] args) {

        //PO转DTO
        PeopleEntity peopleEntity = new PeopleEntity(18, "yoyo", "13215849", "shanghai ", "fdhf@163.com");
        PeopleDTO peopleDTO = PeopleMapper.INSTANCE.entityToDTO(peopleEntity);

        //DTO转PO
        User user = new User(21, "jack");
        PeopleDTO newP = new PeopleDTO("000000", "changsha ", "jack@163.com", user);
        PeopleEntity newEntity = new PeopleEntity();
        PeopleMapper.INSTANCE.updateEntityFromDto(newP, newEntity);
    }
}
