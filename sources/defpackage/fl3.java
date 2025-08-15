package defpackage;

import java.util.Objects;
import java.util.function.Predicate;

/* renamed from: fl3  reason: default package */
public final /* synthetic */ class fl3 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ fl3(int i) {
        this.a = i;
    }

    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return Objects.isNull((jl3) obj);
            case 1:
                return ((kzc) obj).o != null;
            case 2:
                return ((kzc) obj).X != null;
            case 3:
                return ((kzc) obj).o != null;
            default:
                return ((kzc) obj).X != null;
        }
    }
}
