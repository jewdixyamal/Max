package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vrc  reason: default package */
public final class vrc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ wrc Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ long u0;
    public final /* synthetic */ boolean v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vrc(wrc wrc, long j, long j2, String str, long j3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = wrc;
        this.Z = j;
        this.s0 = j2;
        this.t0 = str;
        this.u0 = j3;
        this.v0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vrc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vrc(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            String str = this.Y.a;
            long j = this.s0;
            String str2 = this.t0;
            long j2 = this.u0;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                StringBuilder j3 = z7b.j("Save new position:", j, " for video:", str2);
                j3.append(" in msg:");
                j3.append(j2);
                ir6.d(us7, str, j3.toString(), (Throwable) null);
            }
            long j4 = this.Z;
            long j5 = 0;
            if (j4 == 0) {
                return e5f;
            }
            long j6 = this.s0;
            if (j6 >= j4) {
                String str3 = this.Y.a;
                ir6 ir62 = hm9.m;
                if (ir62 != null && ir62.c()) {
                    ir62.d(us7.X, str3, zr6.k(au1.k(j6, "Can't save this startTime:", " because it's more or equals with duration:"), j4, ". Reset initPos."), (Throwable) null);
                }
            } else {
                j5 = j6;
            }
            String str4 = this.t0;
            ((ief) this.Y.c.getValue()).getClass();
            gef a = ief.a(str4);
            if (a != null) {
                hm9.m(this.Y.a, "Save new position. VideoContent in cache exist", new Object[0]);
                String str5 = this.t0;
                gef a2 = a.a(j5);
                ((ief) this.Y.c.getValue()).getClass();
                ief.a.put(str5, new hef(a2, System.currentTimeMillis()));
            }
            r79 r79 = (r79) this.Y.b.getValue();
            long j7 = this.u0;
            String str6 = this.t0;
            urc urc = new urc(j5, this.Z, this.v0);
            this.X = 1;
            r79.getClass();
            r79.a.n(j7, new y98((Object) str6, 13, (Object) urc));
            if (e5f == tx3) {
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
