package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: s6f  reason: default package */
public final class s6f extends ffe implements a66 {
    public int X;
    public final /* synthetic */ t6f Y;
    public final /* synthetic */ boolean Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s6f(t6f t6f, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = t6f;
        this.Z = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s6f) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new s6f(this.Y, this.Z, continuation);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, eaf] */
    public final Object o(Object obj) {
        Object obj2 = tx3.a;
        int i = this.X;
        t6f t6f = this.Y;
        if (i == 0) {
            od2.a0(obj);
            ? obj3 = new Object();
            obj3.w = Boolean.valueOf(this.Z);
            tq2 tq2 = new tq2((String) null, 0, new le3(new gaf(obj3)), false);
            this.X = 1;
            obj = ((k4a) ((pk) t6f.a.getValue())).J(tq2, this);
            if (obj == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gaf gaf = ((fe3) obj).o;
        if (gaf != null) {
            ((jp) ((hp) t6f.b.getValue())).z(gaf);
            return e5f.a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
