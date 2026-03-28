package com.soumik.loganalyzer.service;

import com.soumik.loganalyzer.dto.LogRequest;
import com.soumik.loganalyzer.dto.LogResponse;
import reactor.core.publisher.Mono;

public interface LogService {
    Mono<LogResponse> analyzeLog(LogRequest request);
}
