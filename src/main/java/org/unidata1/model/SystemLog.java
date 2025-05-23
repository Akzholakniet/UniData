package org.unidata1.model;

import jakarta.persistence.*;
<<<<<<< HEAD
=======
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
>>>>>>> temp-branch

import java.time.LocalDateTime;

@Entity
@Table(name = "system_logs")
<<<<<<< HEAD
=======
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
>>>>>>> temp-branch
public class SystemLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LogLevel level;

    @Column(length = 100)
    private String username;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String action;

    @Column(name = "ip_address")
    private String ipAddress;

    @Column(name = "user_agent", length = 500)
    private String userAgent;

    @Column(name = "session_id")
    private String sessionId;

    @Column(length = 1000)
    private String details;

    @Column(name = "stack_trace", length = 4000)
    private String stackTrace;

    public enum LogLevel {
        INFO, WARNING, ERROR, DEBUG
    }
<<<<<<< HEAD

    // Базовый конструктор
    public SystemLog() {
    }

    // Полный конструктор
    public SystemLog(Long id, LocalDateTime timestamp, LogLevel level, String username, User user, String action,
                     String ipAddress, String userAgent, String sessionId, String details, String stackTrace) {
        this.id = id;
        this.timestamp = timestamp;
        this.level = level;
        this.username = username;
        this.user = user;
        this.action = action;
        this.ipAddress = ipAddress;
        this.userAgent = userAgent;
        this.sessionId = sessionId;
        this.details = details;
        this.stackTrace = stackTrace;
    }

    // Геттеры
    public Long getId() {
        return id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public LogLevel getLevel() {
        return level;
    }

    public String getUsername() {
        return username;
    }

    public User getUser() {
        return user;
    }

    public String getAction() {
        return action;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getDetails() {
        return details;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    // Сеттеры
    public void setId(Long id) {
        this.id = id;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setLevel(LogLevel level) {
        this.level = level;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    // Реализация шаблона Builder вручную
    public static SystemLogBuilder builder() {
        return new SystemLogBuilder();
    }

    public static class SystemLogBuilder {
        private Long id;
        private LocalDateTime timestamp;
        private LogLevel level;
        private String username;
        private User user;
        private String action;
        private String ipAddress;
        private String userAgent;
        private String sessionId;
        private String details;
        private String stackTrace;

        SystemLogBuilder() {
        }

        public SystemLogBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public SystemLogBuilder timestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public SystemLogBuilder level(LogLevel level) {
            this.level = level;
            return this;
        }

        public SystemLogBuilder username(String username) {
            this.username = username;
            return this;
        }

        public SystemLogBuilder user(User user) {
            this.user = user;
            return this;
        }

        public SystemLogBuilder action(String action) {
            this.action = action;
            return this;
        }

        public SystemLogBuilder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public SystemLogBuilder userAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        public SystemLogBuilder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public SystemLogBuilder details(String details) {
            this.details = details;
            return this;
        }

        public SystemLogBuilder stackTrace(String stackTrace) {
            this.stackTrace = stackTrace;
            return this;
        }

        public SystemLog build() {
            return new SystemLog(id, timestamp, level, username, user, action, ipAddress, userAgent, sessionId, details, stackTrace);
        }
    }
=======
>>>>>>> temp-branch
}