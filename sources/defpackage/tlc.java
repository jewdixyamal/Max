package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: tlc  reason: default package */
public final class tlc extends ffe implements a66 {
    public final /* synthetic */ boolean A0;
    public vlc X;
    public Collection Y;
    public Iterator Z;
    public Collection s0;
    public int t0;
    public final /* synthetic */ mg4 u0;
    public final /* synthetic */ vlc v0;
    public final /* synthetic */ long w0;
    public final /* synthetic */ long x0;
    public final /* synthetic */ long y0;
    public final /* synthetic */ int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tlc(mg4 mg4, vlc vlc, long j, long j2, long j3, int i, boolean z, Continuation continuation) {
        super(2, continuation);
        this.u0 = mg4;
        this.v0 = vlc;
        this.w0 = j;
        this.x0 = j2;
        this.y0 = j3;
        this.z0 = i;
        this.A0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tlc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tlc(this.u0, this.v0, this.w0, this.x0, this.y0, this.z0, this.A0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            vlc r4 = r0.v0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r7) goto L_0x0033
            if (r2 == r6) goto L_0x002c
            if (r2 != r5) goto L_0x0024
            java.util.Collection r2 = r0.s0
            java.util.Iterator r3 = r0.Z
            java.util.Collection r4 = r0.Y
            vlc r6 = r0.X
            defpackage.od2.a0(r18)
            r7 = r6
            r6 = r5
            r5 = r18
            goto L_0x0158
        L_0x0024:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002c:
            defpackage.od2.a0(r18)
            r2 = r18
            goto L_0x00b5
        L_0x0033:
            defpackage.od2.a0(r18)
            r2 = r18
            goto L_0x0122
        L_0x003a:
            defpackage.od2.a0(r18)
            mg4 r2 = r0.u0
            int r2 = r2.ordinal()
            boolean r10 = r0.A0
            int r11 = r0.z0
            long r12 = r0.y0
            long r14 = r0.x0
            long r8 = r0.w0
            if (r2 == 0) goto L_0x00be
            if (r2 != r7) goto L_0x00b8
            t19 r2 = r4.d()
            r0.t0 = r6
            ilc r3 = r2.a
            if (r10 == 0) goto L_0x0087
            java.lang.String r10 = "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire ASC LIMIT ?"
            r5 = 5
            xlc r10 = defpackage.xlc.a(r5, r10)
            r10.j(r7, r8)
            r10.j(r6, r14)
            r6 = 3
            defpackage.ey8.m(r10, r6, r12, r2)
            r6 = 10
            long r7 = (long) r6
            r6 = 4
            r10.j(r6, r7)
            long r6 = (long) r11
            r10.j(r5, r6)
            android.os.CancellationSignal r5 = new android.os.CancellationSignal
            r5.<init>()
            r19 r6 = new r19
            r7 = 5
            r6.<init>(r2, r10, r7)
            java.lang.Object r2 = defpackage.ote.i(r3, r5, r6, r0)
            goto L_0x00b2
        L_0x0087:
            java.lang.String r5 = "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?"
            r10 = 5
            xlc r5 = defpackage.xlc.a(r10, r5)
            r5.j(r7, r8)
            r5.j(r6, r14)
            r6 = 3
            defpackage.ey8.m(r5, r6, r12, r2)
            r6 = 10
            long r7 = (long) r6
            r6 = 4
            r5.j(r6, r7)
            long r6 = (long) r11
            r5.j(r10, r6)
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            r19 r7 = new r19
            r8 = 6
            r7.<init>(r2, r5, r8)
            java.lang.Object r2 = defpackage.ote.i(r3, r6, r7, r0)
        L_0x00b2:
            if (r2 != r1) goto L_0x00b5
            return r1
        L_0x00b5:
            java.util.List r2 = (java.util.List) r2
            goto L_0x0124
        L_0x00b8:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00be:
            t19 r2 = r4.d()
            r0.t0 = r7
            ilc r3 = r2.a
            if (r10 == 0) goto L_0x00f4
            java.lang.String r5 = "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC, time_local DESC LIMIT ?"
            r10 = 5
            xlc r5 = defpackage.xlc.a(r10, r5)
            r5.j(r7, r8)
            r5.j(r6, r14)
            r6 = 3
            defpackage.ey8.m(r5, r6, r12, r2)
            r6 = 10
            long r7 = (long) r6
            r6 = 4
            r5.j(r6, r7)
            long r6 = (long) r11
            r5.j(r10, r6)
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            r19 r7 = new r19
            r8 = 4
            r7.<init>(r2, r5, r8)
            java.lang.Object r2 = defpackage.ote.i(r3, r6, r7, r0)
            goto L_0x011f
        L_0x00f4:
            java.lang.String r5 = "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC, time_local ASC LIMIT ?"
            r10 = 5
            xlc r5 = defpackage.xlc.a(r10, r5)
            r5.j(r7, r8)
            r5.j(r6, r14)
            r6 = 3
            defpackage.ey8.m(r5, r6, r12, r2)
            r6 = 10
            long r7 = (long) r6
            r6 = 4
            r5.j(r6, r7)
            long r6 = (long) r11
            r5.j(r10, r6)
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            r19 r7 = new r19
            r8 = 3
            r7.<init>(r2, r5, r8)
            java.lang.Object r2 = defpackage.ote.i(r3, r6, r7, r0)
        L_0x011f:
            if (r2 != r1) goto L_0x0122
            return r1
        L_0x0122:
            java.util.List r2 = (java.util.List) r2
        L_0x0124:
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.z53.S(r2, r5)
            r3.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
            r16 = r3
            r3 = r2
            r2 = r16
        L_0x0138:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0160
            java.lang.Object r5 = r3.next()
            ru8 r5 = (defpackage.ru8) r5
            r0.X = r4
            r0.Y = r2
            r0.Z = r3
            r0.s0 = r2
            r6 = 3
            r0.t0 = r6
            java.lang.Object r5 = r4.h(r5, r0)
            if (r5 != r1) goto L_0x0156
            return r1
        L_0x0156:
            r7 = r4
            r4 = r2
        L_0x0158:
            cu8 r5 = (defpackage.cu8) r5
            r2.add(r5)
            r2 = r4
            r4 = r7
            goto L_0x0138
        L_0x0160:
            java.util.List r2 = (java.util.List) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tlc.o(java.lang.Object):java.lang.Object");
    }
}
