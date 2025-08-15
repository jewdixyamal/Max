package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: to5  reason: default package */
public final class to5 extends ffe implements a66 {
    public mec X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ mec s0;
    public final /* synthetic */ on5 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public to5(mec mec, on5 on5, Continuation continuation) {
        super(2, continuation);
        this.s0 = mec;
        this.t0 = on5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((to5) n(new i42(((i42) obj).a), (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        to5 to5 = new to5(this.s0, this.t0, continuation);
        to5.Z = obj;
        return to5;
    }

    public final Object o(Object obj) {
        mec mec;
        mec mec2;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            Object obj2 = ((i42) this.Z).a;
            boolean z = obj2 instanceof h42;
            mec = this.s0;
            if (!z) {
                mec.a = obj2;
            }
            if (z) {
                Throwable a = i42.a(obj2);
                if (a == null) {
                    Object obj3 = mec.a;
                    if (obj3 != null) {
                        if (obj3 == ay9.a) {
                            obj3 = null;
                        }
                        this.Z = obj2;
                        this.X = mec;
                        this.Y = 1;
                        if (this.t0.a(obj3, this) == tx3) {
                            return tx3;
                        }
                        mec2 = mec;
                    }
                    mec.a = ay9.c;
                } else {
                    throw a;
                }
            }
            return e5f.a;
        } else if (i == 1) {
            mec2 = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mec = mec2;
        mec.a = ay9.c;
        return e5f.a;
    }
}
