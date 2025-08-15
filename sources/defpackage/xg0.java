package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xg0  reason: default package */
public final class xg0 extends ffe implements c66 {
    public /* synthetic */ boolean X;

    /* JADX WARNING: type inference failed for: r1v2, types: [xg0, ffe] */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lg0 lg0 = (lg0) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ? ffe = new ffe(3, (Continuation) obj3);
        ffe.X = booleanValue;
        return ffe.o(e5f.a);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        return Boolean.valueOf(this.X);
    }
}
