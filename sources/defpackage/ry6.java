package defpackage;

import android.os.SystemClock;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ry6  reason: default package */
public final class ry6 extends ffe implements a66 {
    public long X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ fz6 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ry6(fz6 fz6, Continuation continuation) {
        super(2, continuation);
        this.s0 = fz6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ry6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ry6 ry6 = new ry6(this.s0, continuation);
        ry6.Z = obj;
        return ry6;
    }

    public final Object o(Object obj) {
        sx3 sx3;
        long j;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        fz6 fz6 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx32 = (sx3) this.Z;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String str = fz6.E0;
            int i2 = fz6.x0.get();
            hm9.m(str, "prefetch " + i2 + ": start load real albums", new Object[0]);
            qy6 qy6 = new qy6(fz6, (Continuation) null);
            this.Z = sx32;
            this.X = elapsedRealtime;
            this.Y = 1;
            Object k = j1e.k(qy6, this);
            if (k == tx3) {
                return tx3;
            }
            j = elapsedRealtime;
            sx3 sx33 = sx32;
            obj = k;
            sx3 = sx33;
        } else if (i == 1) {
            j = this.X;
            sx3 = (sx3) this.Z;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj;
        boolean z = j1e.z(sx3);
        e5f e5f = e5f.a;
        if (!z) {
            return e5f;
        }
        fz6.v0.m((Object) null, new p35(list));
        String str2 = fz6.E0;
        int i3 = fz6.x0.get();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - j;
        hm9.m(str2, "prefetch " + i3 + ": finish load real albums, time = " + elapsedRealtime2 + "ms", new Object[0]);
        return e5f;
    }
}
