package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;

/* renamed from: v4a  reason: default package */
public final class v4a extends ffe implements a66 {
    public int X;
    public final /* synthetic */ OneMeApplication Y;
    public final /* synthetic */ x4a Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v4a(OneMeApplication oneMeApplication, x4a x4a, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeApplication;
        this.Z = x4a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v4a) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new v4a(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            qp4 b = qp4.u0.b(this.Y);
            u4a u4a = new u4a(0, 0, x4a.class, this.Z, "weakActivities", "getWeakActivities()Ljava/util/concurrent/CopyOnWriteArrayList;");
            this.X = 1;
            b.getClass();
            Object k = j1e.k(new f13(b, u4a, (Continuation) null), this);
            if (k != tx3) {
                k = e5f;
            }
            if (k == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
