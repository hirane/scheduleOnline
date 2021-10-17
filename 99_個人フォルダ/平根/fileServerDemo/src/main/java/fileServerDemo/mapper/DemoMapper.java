package fileServerDemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import fileServerDemo.entity.DemoEntity;

@Mapper
public interface DemoMapper {
	List<DemoEntity> selectAll();
}
