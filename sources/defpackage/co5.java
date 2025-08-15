package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: co5  reason: default package */
public final class co5 extends ffe implements a66 {
    public mec X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ int s0;
    public final /* synthetic */ mn5 t0;
    public final /* synthetic */ m56 u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public co5(int i, zn5 zn5, jy2 jy2, Continuation continuation) {
        super(2, continuation);
        this.s0 = i;
        this.t0 = zn5;
        this.u0 = jy2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((co5) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        co5 co5 = new co5(this.s0, (zn5) this.t0, (jy2) this.u0, continuation);
        co5.Z = obj;
        return co5;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, mec] */
    public final Object o(Object obj) {
        mec mec;
        on5 on5;
        Object obj2 = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            on5 on52 = (on5) this.Z;
            int i2 = this.s0;
            if (i2 > 0) {
                ? obj3 = new Object();
                try {
                    mn5 mn5 = this.t0;
                    bo5 bo5 = new bo5(obj3, i2, on52, 0);
                    this.Z = on52;
                    this.X = obj3;
                    this.Y = 1;
                    if (mn5.d(bo5, this) == obj2) {
                        return obj2;
                    }
                    on5 = on52;
                    mec = obj3;
                } catch (CancellationException e) {
                    e = e;
                    mec = obj3;
                    ArrayList arrayList = (ArrayList) mec.a;
                    if (arrayList != null) {
                        this.u0.invoke(arrayList);
                    }
                    throw e;
                }
            } else {
                throw new IllegalArgumentException("Chunk size must be greater than 0".toString());
            }
        } else if (i == 1) {
            mec = this.X;
            on5 = (on5) this.Z;
            try {
                od2.a0(obj);
            } catch (CancellationException e2) {
                e = e2;
            }
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList2 = (ArrayList) mec.a;
        if (arrayList2 != null) {
            this.Z = null;
            this.X = null;
            this.Y = 2;
            if (on5.a(arrayList2, this) == obj2) {
                return obj2;
            }
        }
        return e5f.a;
    }
}
