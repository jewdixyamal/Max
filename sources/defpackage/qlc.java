package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* renamed from: qlc  reason: default package */
public final class qlc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vlc Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qlc(vlc vlc, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = vlc;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qlc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qlc(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        vlc vlc = this.Y;
        if (i == 0) {
            od2.a0(obj);
            t19 d = vlc.d();
            this.X = 1;
            d.getClass();
            xlc a = xlc.a(1, "SELECT * FROM messages WHERE id = ?");
            a.j(1, this.Z);
            obj = ote.i(d.a, new CancellationSignal(), new r19(d, a, 0), this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return (cu8) obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ru8 ru8 = (ru8) obj;
        if (ru8 == null) {
            return null;
        }
        this.X = 2;
        obj = vlc.h(ru8, this);
        if (obj == tx3) {
            return tx3;
        }
        return (cu8) obj;
    }
}
