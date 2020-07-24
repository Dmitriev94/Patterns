package ru.netology;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor


public class RegByPhoneAndNameInfo {

    private final String fullName;
    private final String phoneNumber;


}
