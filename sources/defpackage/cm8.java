package defpackage;

import android.content.Context;
import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: cm8  reason: default package */
public final class cm8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ Uri Y;
    public final /* synthetic */ dm8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cm8(Uri uri, dm8 dm8, Continuation continuation) {
        super(2, continuation);
        this.Y = uri;
        this.Z = dm8;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((cm8) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cm8 cm8 = new cm8(this.Y, this.Z, continuation);
        cm8.X = obj;
        return cm8;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        sx3 sx3 = (sx3) this.X;
        dm8 dm8 = this.Z;
        Context context = dm8.o;
        Uri uri = this.Y;
        if (!tfg.x(uri, context, (o45) null)) {
            bm8 bm8 = dm8.b;
            pnf.o(bm8.b, new yl8(uri));
            pnf.o(bm8.b, wl8.a);
        } else {
            hm9.m0(sx3.getClass().getName(), "try to share internal file!", new Object[0]);
        }
        return e5f.a;
    }
}
