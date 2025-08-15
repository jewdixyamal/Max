package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: e96  reason: default package */
public final class e96 extends ffe implements a66 {
    public final /* synthetic */ z96 X;
    public final /* synthetic */ boolean Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e96(z96 z96, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = z96;
        this.Y = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((e96) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new e96(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        z96 z96 = this.X;
        Iterable<u86> iterable = (Iterable) z96.w0.getValue();
        ArrayList arrayList = new ArrayList(z53.S(iterable, 10));
        for (u86 u86 : iterable) {
            if (u86.h != 0) {
                u86 = u86.b(u86, (awa) null, (ref) null, (Uri) null, 0, false, 0, (Uri) null, 1983);
            }
            u86 u862 = u86;
            if (this.Y) {
                u862 = u86.b(u862, (awa) null, (ref) null, (Uri) null, 0, false, 0, u862.c.v0, 991);
            }
            arrayList.add(u862);
        }
        z96.w0.m((Object) null, arrayList);
        return e5f.a;
    }
}
