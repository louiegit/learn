package com.java.com.java.learn.mapstruct;

import java.awt.SystemColor;
import org.springframework.beans.BeanUtils;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: tianxiang.luo
 * Date: 2018-09-26 下午2:35
 */
public class MapperTestApplication {


    public static void main(String[] args) {

        //PO转DTO
        PeopleEntity peopleEntity
            = new PeopleEntity(18, "yoyo",
            "13215849", "shanghai ", "fdhf@163.com");

        for (int i = 0; i < 5; i++) {
            long start = System.nanoTime();
            PeopleMapper.INSTANCE.entityToDTO(peopleEntity);
            long end = System.nanoTime() - start;
            System.out.println("mapStruct耗时:" + i +"->"+end);
        }




        for (int i = 0; i < 5; i++) {
            long start1 = System.nanoTime();
            PeopleDTO peopleDTO = new PeopleDTO();
            BeanUtils.copyProperties(peopleEntity,peopleDTO);
            long end1 = System.nanoTime() - start1;
            System.out.println("BeanUtils.copyProperties耗时:"+ i +"->"+end1);
        }



    }



}
