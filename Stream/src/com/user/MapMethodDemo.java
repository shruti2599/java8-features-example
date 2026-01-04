package com.user;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapMethodDemo {

    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();
        users.add(new User(1,"Shruti","Secrete","shruti@gmail.com"));
        users.add(new User(2,"Rocky","rocks","rocky@gmail.com"));
        users.add(new User(3,"Leo","laaaa","lea@gmail.com"));

        //Traditional Way

        List<UserDTO> userDTOS = new ArrayList<UserDTO>();
        for( User user : users){
            userDTOS.add(new UserDTO(user.getId(), user.getUserName(),user.getEmail()));
        }
        for(UserDTO dto : userDTOS){
            System.out.println(dto);
        }
        System.out.println("***************************************************************");
        //Using stream amd map

        users.stream().map(new Function<User, UserDTO>() {
            @Override
            public UserDTO apply(User user) {
                return new UserDTO(user.getId(), user.getUserName(),user.getEmail());
            }
        }).collect(Collectors.toList()).forEach(dto-> System.out.println(dto));

        System.out.println("***************************************************************");
        //Using lambda expression ,stream amd map

        List<UserDTO> userDTOList = users.stream().map((User user)->
                new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
                .collect(Collectors.toList());
        userDTOList.forEach(System.out::println);

    }
}
