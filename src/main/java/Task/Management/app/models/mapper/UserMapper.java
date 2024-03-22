package Task.Management.app.models.mapper;

import Task.Management.app.models.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.lang.annotation.Target;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userMapper(User user);
}
