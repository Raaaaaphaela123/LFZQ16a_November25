package woche3._12_tag_exceptions.beispiel2;

public class NameZuKurzException extends RuntimeException {
    public NameZuKurzException(String message) {
        super(message);
    }
}
