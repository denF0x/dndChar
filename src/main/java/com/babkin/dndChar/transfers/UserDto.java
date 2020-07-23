package com.babkin.dndChar.transfers;

import com.babkin.dndChar.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@Builder
public class UserDto {
    private String fullname;
    private String moto;

    public static UserDto from(User user){
        return UserDto.builder()
                                .fullname(user.getFullname())
                                .moto(user.getMoto())
                                .build();
    }
}
