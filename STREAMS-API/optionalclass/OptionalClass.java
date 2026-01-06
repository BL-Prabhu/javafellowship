package optionalclass;

import java.util.Optional;

// DEFINITION OF OPTIONAL CLASS
// ------------------------------
// It is a final class used to deal with NULLPOINTEREXCEPTION
// It was introduced in java 8

// METHODS OF OPTIONAL CLASS
// -----------------------------
// 1. of
// ----------
// It is used to specified non-null value and throws NULLPOINTEREXCEPTION if the value is null

// 2. ofNullable(T value)
// ---------------------------
// It is used to specify the specific value or an empty

// 3. EMPTY
// -------------
// It Returns an empty optional instance with no value present

// 4. isPresent
// ----------------------
// It returns true if a value is present

// 5. get
// ------------
// It return the value if present, otherwise throws NOSUCHELEMENTEXCEPTION

// 6. ifPresent(Consumer<? super T>)
// ------------------------------------
// It accepts consumer predefined functional interface
// It gives value only when it present or it does nothing

// 7. orElse
// -----------
// It returns a value if present, otherwise returns the specified default value

// 8. orElseGet(supplier<? extends T>)
// -----------------------------------------
// It returns value if present, otherwise return a vlaue produced by given supplier

// 9. orElseThrow
// -------------------------
// It returns the value if present, otherwise throws NOSUCHELEMENTEXCEPTION

// 10. orElseThrow(Suplier<? extends x>)
// ----------------------------------------
// It is returns the value if present, otherwise throws an exception provided by the suplier

// 11. map(Funtion<? super T, ? extends U>)
// ----------------------------------------
// It transform the value if present using mapping function
// It returns a new optional

// 12. flatmap(Function<? super T, Optional<U>>)
// -----------------------------------------------------
//

// 13. filter(Predicate<? super T>)
// ----------------------------------------
// It returns the same optional if the value matches the given condition, otherwise return an empty optional


public class OptionalClass
{
    public static void optionalMethod()
    {
        // of(T value) METHOD
        // -------------------------------------
        System.out.println("of()");
        Optional<String> checkOf = Optional.of("Java");
        System.out.println(checkOf.get());

        Optional<String> checkOfEmpty = Optional.of("");
        System.out.println(checkOfEmpty.get());
        System.out.println("----------------------------------------------------------");

        // ofNullable(T value)
        // ---------------------------
        System.out.println("ofNullable(T value)");
        Optional<String> opt = Optional.ofNullable(null);
        System.out.println(opt.isPresent());
        System.out.println("----------------------------------------------------------");

        // empty()
        // ---------------------------
        System.out.println("empty()");
        Optional<String> checkempty = Optional.empty();
        System.out.println(checkempty.isPresent());

        System.out.println("----------------------------------------------------------");

        // isPresent()
        // ---------------------------
        System.out.println("isPresent()");
        Optional<String> checkisPresent = Optional.of("Java");
        if (checkisPresent.isPresent())
        {
            System.out.println(opt.get());
        }
        System.out.println("----------------------------------------------------------");

        // get()
        // ---------------------------
        System.out.println("get()");
        Optional<String> getcheck = Optional.of("Java");
        System.out.println(getcheck.get());

        System.out.println("----------------------------------------------------------");

        // ifPresent(Consumer<? super T>)
        // ---------------------------------
        System.out.println("ifPresent(Consumer<? super T>)");
        Optional<String> checkIsPresent = Optional.of("Java");
        checkIsPresent.ifPresent(System.out::println);

        System.out.println("----------------------------------------------------------");

        // orElse
        // ---------------------------------
        System.out.println("orElse");
        Optional<String> orelsecheck = Optional.empty();
        System.out.println(orelsecheck.orElse("Default"));

        System.out.println("----------------------------------------------------------");

        // orElse(Suplier<? extends T>)
        // ---------------------------------
        System.out.println("orElse(Suplier<? extends T>)");
        Optional<String> checkorelsesupier = Optional.empty();
        System.out.println(checkorelsesupier.orElseGet(() -> "Generated Value"));

        System.out.println("----------------------------------------------------------");

        // orElseThrow
        // ---------------------------------
        System.out.println("orElseThrow");
        Optional<String> checkorelsethrow = Optional.of("Java");
        System.out.println(checkorelsethrow.orElseThrow());

        System.out.println("----------------------------------------------------------");

        // orElseThrow(Suplier<? extends X>)
        // ---------------------------------
        System.out.println("orElseThrow(Suplier<? extends X>)");
        Optional<String> checkorelsethrowsuplier = Optional.empty();
        checkorelsethrowsuplier.orElseThrow(() -> new RuntimeException("Value not found"));

        System.out.println("----------------------------------------------------------");

        // map(Function<? extends T, ? extends U>)
        // -------------------------------------------
        System.out.println("map(Function<? extends T, ? extends U>)");
        Optional<String> checkmap = Optional.of("java");
        Optional<String> result = checkmap.map(String::toUpperCase);
        System.out.println(result.get());

        System.out.println("----------------------------------------------------------");

        // flatMap(Function<? super T, Optional<U>>)
        // -------------------------------------------
        System.out.println("flatMap(Function<? super T, Optional<U>>)");
        Optional<String> checkflatmap = Optional.of("Java");
        Optional<Integer> length = checkflatmap.flatMap(v -> Optional.of(v.length()));
        System.out.println(length.get());

        System.out.println("----------------------------------------------------------");

        // filter(Predicate<? super T>)
        // -------------------------------------------
        System.out.println("filter(Predicate<? super T>)");
        Optional<String> checkfilter = Optional.of("Java");
        checkfilter.filter(v -> v.length() > 3).ifPresent(System.out::println);

        System.out.println("----------------------------------------------------------");

    }

    public static void main(String[] args)
    {
        OptionalClass.optionalMethod();
    }
}
