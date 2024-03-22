package Task.Management.app.models.mapper;

import Task.Management.app.models.entity.Account;
import org.mapstruct.Mapper;

@Mapper
public interface AccountMapper {
    Account accountMapper(Account account);
}
