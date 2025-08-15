package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: ns9  reason: default package */
public final class ns9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ ks9 Z;
    public final /* synthetic */ ps9 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ns9(long j, ks9 ks9, ps9 ps9, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = ks9;
        this.s0 = ps9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ns9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ns9(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        ps9 ps9 = this.s0;
        ks9 ks9 = this.Z;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                } else if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            od2.a0(obj);
            return e5f;
        }
        od2.a0(obj);
        if (System.currentTimeMillis() - this.Y >= CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS) {
            hm9.m0("ps9", "handle " + ks9, new Object[0]);
        }
        fs8 fs8 = ks9.Y;
        int s = au1.s(ks9.X);
        if (s != 0) {
            long j = ks9.c;
            if (s == 1) {
                ((js9) ps9.b.getValue()).a(ps9.b(ps9, ks9), mg4.DELAYED);
                if (fs8 != null && fs8.X == wx8.o) {
                    hm9.m0("ps9", "delayed message has error status", new Object[0]);
                    this.X = 1;
                    if (ps9.a(ps9, j, fs8, this) == tx3) {
                        return tx3;
                    }
                }
            } else if (s == 2) {
                hm9.m("ps9", "handle delete", new Object[0]);
                this.X = 2;
                obj = ps9.c(j, this);
                if (obj == tx3) {
                    return tx3;
                }
            } else if (s != 3) {
                if (s == 4) {
                    hm9.m0("ps9", "handle unknown type! " + ks9, new Object[0]);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (fs8 == null) {
                hm9.m0("ps9", "message is null", new Object[0]);
                return e5f;
            } else {
                this.X = 3;
                if (ps9.a(ps9, j, fs8, this) == tx3) {
                    return tx3;
                }
            }
        } else {
            ((js9) ps9.b.getValue()).a(ps9.b(ps9, ks9), mg4.DELAYED);
        }
        return e5f;
        e52 e52 = (e52) obj;
        if (e52 != null) {
            ((rs9) ps9.c.getValue()).b(e52, ks9.Z, mg4.DELAYED);
        }
        return e5f;
    }
}
