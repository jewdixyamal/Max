package defpackage;

import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* renamed from: ucd  reason: default package */
public final class ucd extends ffe implements a66 {
    public final /* synthetic */ RectF X;
    public final /* synthetic */ add Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ucd(RectF rectF, add add, String str, Continuation continuation) {
        super(2, continuation);
        this.X = rectF;
        this.Y = add;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ucd) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ucd(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        a20 h = c37.h(this.X);
        add add = this.Y;
        add.G0.set(((k4a) ((pk) add.v0.getValue())).F(this.Z, h));
        pnf.o(add.z0, new ahd(new eqe(mha.r), new Integer(woc.m)));
        return e5f.a;
    }
}
