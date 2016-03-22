package service;

public interface DentistSearch {

    String findByNickname(String nickname);
    String findByEmail(String email);
    String findByName(String name);
    String findByPhone(String phone);
}
