package coderiverside.annotations;

@Label(value = "CODE")
@Info(author = "Alice", reviewers = {"Bob"}, version = 1)
public class InfoService {
    //@Info(author = "Alice", version = 1) // ❌ Error: not allowed on methods
    public void doSomething() {
        // ...
    }
}
