package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: pz8  reason: default package */
public final class pz8 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xz8 Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ cz5 s0;
    public final /* synthetic */ CharSequence t0;
    public final /* synthetic */ boolean u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pz8(xz8 xz8, Long l, cz5 cz5, CharSequence charSequence, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = xz8;
        this.Z = l;
        this.s0 = cz5;
        this.t0 = charSequence;
        this.u0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pz8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pz8(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    public final Object o(Object obj) {
        cz5 cz5;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        xz8 xz8 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            e52 e52 = (e52) xz8.b.getValue();
            if (e52 != null) {
                Long l = this.Z;
                long j = e52.a;
                if (l != null || (cz5 = this.s0) == null) {
                    CharSequence charSequence = this.t0;
                    if (charSequence != null && !w9e.C0(charSequence)) {
                        this.X = 3;
                        if (((o89) xz8.Y.getValue()).a(j, this.t0, this.Z, this.s0, this.u0, this) == tx3) {
                            return tx3;
                        }
                    }
                } else {
                    List singletonList = Collections.singletonList(new Long(j));
                    if (cz5.b == null || !cz5.c) {
                        bz5 bz5 = (bz5) xz8.s0.getValue();
                        this.X = 2;
                        bz5.getClass();
                        Object k = j1e.k(new az5(bz5, cz5, singletonList, (Continuation) null), this);
                        if (k != tx3) {
                            k = e5f;
                        }
                        if (k == tx3) {
                            return tx3;
                        }
                    } else {
                        sy5 sy5 = (sy5) xz8.Z.getValue();
                        this.X = 1;
                        sy5.getClass();
                        Object k2 = j1e.k(new ry5(sy5, cz5, singletonList, (Continuation) null), this);
                        if (k2 != tx3) {
                            k2 = e5f;
                        }
                        if (k2 == tx3) {
                            return tx3;
                        }
                    }
                }
            }
            return e5f;
        } else if (i == 1 || i == 2 || i == 3) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xz8.I0.setValue((Object) null);
        xz8.s();
        return e5f;
    }
}
