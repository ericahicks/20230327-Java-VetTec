# DTO is a Data Transfer Object

Sometimes we don't want to pull all the fields from the database, just some of them.

In order to do this, we need a different JPA model to use as the return type of our query method in the @Repository class.

1. Define a model class that has the fields you want

```
public interface EntityADto {
    // Define getters for the properties you want to retrieve from EntityA
    Long getId();
    String getName();
    // ...
}

```