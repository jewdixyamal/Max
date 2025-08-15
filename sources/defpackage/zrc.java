package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: zrc  reason: default package */
public final class zrc implements j0e {
    public final /* synthetic */ j0e a;

    public zrc(iy2 iy2) {
        ty2 ty2 = ((jz2) iy2).b;
        this.a = (j0e) ((ConcurrentHashMap) ty2.Z).computeIfAbsent(0L, new di(4, new jy2(0, ty2)));
    }

    public final List b() {
        return this.a.b();
    }

    public final Object d(on5 on5, Continuation continuation) {
        return this.a.d(on5, continuation);
    }

    public final Object getValue() {
        return (e52) this.a.getValue();
    }
}
