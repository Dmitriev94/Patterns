package ru.netology;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RegByPhoneAndNameInfo {

    private final String fullName;
    private final String phoneNumber;


}
