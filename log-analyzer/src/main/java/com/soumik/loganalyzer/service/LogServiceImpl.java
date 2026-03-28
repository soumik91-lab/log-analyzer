package com.soumik.loganalyzer.service;

import com.soumik.loganalyzer.dto.LogRequest;
import com.soumik.loganalyzer.dto.LogResponse;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
public class LogServiceImpl implements LogService {

    @Override
    public Mono<LogResponse> analyzeLog(LogRequest request) {
        LogResponse response = new LogResponse(
                "NullPointerException detected",
                        "Object was not initialized before use",
                        "Ensure proper null checks or dependency injection"
        );
        return Mono.just(response);
    }
}
