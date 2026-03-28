package com.soumik.loganalyzer.controller;


import com.soumik.loganalyzer.dto.LogRequest;
import com.soumik.loganalyzer.dto.LogResponse;
import com.soumik.loganalyzer.service.LogService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/logs")
public class LogController {
    private final LogService logService;

    public LogController(LogService logService){
        this.logService = logService;
    }
    @PostMapping("/analyze")
    public Mono<LogResponse> analyzeLogs(@RequestBody LogRequest request){
        return logService.analyzeLog(request);
    }
}
