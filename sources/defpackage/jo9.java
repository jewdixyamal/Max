package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* renamed from: jo9  reason: default package */
public final class jo9 extends ffe implements a66 {
    public final /* synthetic */ String X;
    public final /* synthetic */ Rect Y;
    public final /* synthetic */ mo9 Z;
    public final /* synthetic */ RectF s0;
    public final /* synthetic */ int t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jo9(String str, Rect rect, mo9 mo9, RectF rectF, int i, Continuation continuation) {
        super(2, continuation);
        this.X = str;
        this.Y = rect;
        this.Z = mo9;
        this.s0 = rectF;
        this.t0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((jo9) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jo9(this.X, this.Y, this.Z, this.s0, this.t0, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        mo9 mo9 = this.Z;
        String str = this.X;
        mo9.i.m((Object) null, new fd0(c37.i(str, this.Y, (y7d) mo9.d.getValue()), str, c37.h(this.s0), this.t0));
        return e5f.a;
    }
}
