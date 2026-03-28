# 🚀 AI Log Analyzer

> AI-powered backend service that analyzes application logs and provides root cause insights and suggested fixes.

---

## 🧠 Problem Statement

Debugging application logs is time-consuming and often requires deep system knowledge. Engineers spend significant time identifying root causes from large volumes of logs.

This project leverages AI to automate log analysis by:
- Identifying errors
- Summarizing issues
- Suggesting possible fixes

---

## ⚙️ Features

- 🔍 Analyze raw application logs
- 🧠 AI-powered root cause detection
- 📄 Error summarization
- 💡 Suggested fixes and recommendations
- ⚡ REST API-based backend service

---

## 🏗️ Architecture

```
Client → REST API → Log Processing Service → AI Engine (LLM)
```

**Components:**
- Controller Layer → Handles API requests
- Service Layer → Processes logs & prepares AI prompts
- AI Layer → Integrates with LLM (OpenAI / Claude)
- Utility Layer → Log parsing and formatting

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- REST APIs
- OpenAI / Claude API
- Gradle
- Docker (optional)

---

## 📦 API Endpoints

### Analyze Logs

```
POST /logs/analyze
```

### Request

```json
{
  "log": "Exception in thread main java.lang.NullPointerException..."
}
```

### Response

```json
{
  "summary": "Null pointer due to missing object initialization",
  "rootCause": "Object was not initialized before use",
  "suggestion": "Ensure proper dependency injection or initialization"
}
```

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/soumik91-lab/log-analyzer.git
cd log-analyzer
```

### 2. Configure API Key

Add your AI API key in `application.properties`:

```properties
ai.api.key=YOUR_API_KEY
```

### 3. Run the application

```bash
./gradlew bootRun
```

### 4. Test API

```bash
curl -X POST http://localhost:8080/logs/analyze \
  -H "Content-Type: application/json" \
  -d '{"log":"NullPointerException at Service.java:45"}'
```

---

## 📁 Project Structure

```
src/main/java/com/soumik/loganalyzer/
├── controller/
├── service/
├── ai/
├── dto/
├── util/
├── config/
```

---

## 🔥 Future Enhancements

- 📊 Log classification (error types)
- 🧾 Log history storage
- 🌐 Simple frontend UI
- ⚡ Real-time log streaming (Kafka)
- 📈 Observability integration

---

## 👨‍💻 Author

**Soumik Sen**
Senior Java Backend Engineer
10+ years of experience in building scalable distributed systems, microservices, and backend platforms.

---

## ⭐ Why this project?

This project demonstrates:
- Backend system design
- AI integration in real-world use cases
- Practical problem-solving for production systems

---

> 📌 This project is built as a portfolio project to demonstrate modern backend engineering practices with AI integration.