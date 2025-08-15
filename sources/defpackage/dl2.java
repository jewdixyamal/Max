package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dl2  reason: default package */
public final class dl2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ fl2 Y;
    public final /* synthetic */ fs8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dl2(fl2 fl2, fs8 fs8, Continuation continuation) {
        super(2, continuation);
        this.Y = fl2;
        this.Z = fs8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dl2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dl2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        boolean z = true;
        fl2 fl2 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = od2.A(((il2) fl2.a).a, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj).longValue();
        fs8 fs8 = this.Z;
        cu8 j = ((au8) ((je7) fl2.d).getValue()).j(longValue, fs8.a);
        if (j == null) {
            long t = ((hyc) ((q33) ((je7) fl2.f).getValue())).t();
            je7 je7 = (je7) fl2.d;
            j = ((au8) je7.getValue()).q(((au8) je7.getValue()).f(longValue, t, this.Z));
            p82 p82 = (p82) ((je7) fl2.e).getValue();
            if (fs8.o != t) {
                z = false;
            }
            p82.T(longValue, z, j, false, 0);
        }
        return j;
    }
}
