package com.movie_security.Demo_security.service;

import com.movie_security.Demo_security.model.UserDTO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private SqlSession session;
    private final String NAMESPACE = "com.movie_security.mappers.UserMapper";

    public UserDTO auth(UserDTO attempt){
        return session.selectOne(NAMESPACE + ".auth", attempt);
    }
    public void register(UserDTO attempt){
        session.insert(NAMESPACE + ".register", attempt);
    }

    public boolean validateUsername(String username){
        return session.selectOne(NAMESPACE + ".selectByUsername", username) == null;
    }

    public UserDTO selectByUsername(String username){
        return session.selectOne(NAMESPACE + ".selectByUsername", username);
    }

}
