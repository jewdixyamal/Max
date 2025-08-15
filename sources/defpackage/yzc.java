package defpackage;

import java.util.function.Predicate;

/* renamed from: yzc  reason: default package */
public final /* synthetic */ class yzc implements Predicate {
    public final /* synthetic */ b0d a;
    public final /* synthetic */ String b;

    public /* synthetic */ yzc(b0d b0d, String str) {
        this.a = b0d;
        this.b = str;
    }

    public final boolean test(Object obj) {
        String str = (String) obj;
        b0d b0d = this.a;
        b0d.getClass();
        return !oag.t(str) && b0d.h(str, this.b);
    }
}
