package br.com.javadevweek.gestao_custos.custom_messages;

public class ErrorMessage {

    private String message;
    private String type;

    public ErrorMessage(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public ErrorMessage setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getType() {
        return type;
    }

    public ErrorMessage setType(String type) {
        this.type = type;
        return this;
    }
}
