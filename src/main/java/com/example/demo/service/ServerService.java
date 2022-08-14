package com.example.demo.service;

import com.example.demo.domain.Server;
import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress);
    Collection<Server> List(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
