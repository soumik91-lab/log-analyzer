package com.soumik.loganalyzer.dto;

public record LogResponse(String summary, String rootCause, String suggestion) {
}
