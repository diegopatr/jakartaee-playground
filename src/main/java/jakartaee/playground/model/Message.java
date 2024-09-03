package jakartaee.playground.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(nullable = false)
    private @NotNull String text;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public @NotNull String getText() {
        return text;
    }

    public void setText(@NotNull String text) {
        this.text = text;
    }
}
