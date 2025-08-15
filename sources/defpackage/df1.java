package defpackage;

import java.util.function.ToLongFunction;

/* renamed from: df1  reason: default package */
public final /* synthetic */ class df1 implements ToLongFunction {
    public final /* synthetic */ m56 a;

    public /* synthetic */ df1(we1 we1) {
        this.a = we1;
    }

    public final long applyAsLong(Object obj) {
        return ((Number) this.a.invoke(obj)).longValue();
    }
}
