package com.movie_security.Demo_security.service;

import com.movie_security.Demo_security.model.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final SqlSession session;
    private final String NAMESPACE = "com.movie_security.mappers.BoardMapper";

    public List<BoardDTO> showList(){
        return session.selectList(NAMESPACE + ".selectList");
    }

    public BoardDTO selectOne(BoardDTO attempt){
        return session.selectOne(NAMESPACE + ".selectOne", attempt);
    }

    public void insert(BoardDTO attempt){
        session.insert(NAMESPACE + ".insert" , attempt);
    }

}
