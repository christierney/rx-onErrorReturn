import rx.*
class Main {
    static void main(String[] args) {
        Observable.merge([
            Observable.just("b"),
            Observable.just("b"),
            Observable.error(new RuntimeException()),
            Observable.just("a") ])
        .onErrorReturn({ e -> "err" })
        .subscribe({ s -> println "emitted $s"}, { println "errored" }, { println "complete" })
    }
}
