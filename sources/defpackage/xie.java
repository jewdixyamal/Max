package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import one.me.sdk.vendor.StoreServicesInfo$ServicesNotAvailableException;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* renamed from: xie  reason: default package */
public final class xie implements qu7 {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final String a = xie.class.getName();
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final ContextScope s0;
    public final je7 t0;

    public xie(je7 je7, je7 je72, je7 je73, p67 p67, je7 je74, je7 je75, ox3 ox3, je7 je76, je7 je77) {
        this.b = je7;
        this.c = je72;
        this.o = je73;
        this.X = je74;
        this.Y = je76;
        this.Z = je77;
        this.s0 = j1e.a(p67.a.limitedParallelism(1, "vendor").plus(ox3));
        this.t0 = je75;
    }

    public final void a() {
        j1e.i(this.s0, (CancellationException) null);
    }

    public final q33 b() {
        return (q33) this.c.getValue();
    }

    public final ty3 c() {
        return (ty3) this.t0.getValue();
    }

    public final String d() {
        String string = ((hyc) b()).g.getString("user.fcmToken", (String) null);
        if (!(string == null || string.length() == 0)) {
            g().getClass();
            if ("GCM".equals(((hyc) b()).g.getString("user.pushDeviceType", (String) null))) {
                return string;
            }
        }
        j47.T(this.s0, (lx3) null, (vx3) null, new sie(this, (SystemServicesManager$PushTokenGeneratedListener) this.X.getValue(), (Continuation) null), 3);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            java.lang.String r0 = "getPushToken: got "
            boolean r1 = r7 instanceof defpackage.tie
            if (r1 == 0) goto L_0x0015
            r1 = r7
            tie r1 = (defpackage.tie) r1
            int r2 = r1.s0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.s0 = r2
            goto L_0x001a
        L_0x0015:
            tie r1 = new tie
            r1.<init>(r5, r7)
        L_0x001a:
            java.lang.Object r7 = r1.Y
            tx3 r2 = defpackage.tx3.a
            int r3 = r1.s0
            r4 = 1
            if (r3 == 0) goto L_0x0038
            if (r3 != r4) goto L_0x0030
            one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener r6 = r1.X
            xie r5 = r1.o
            defpackage.od2.a0(r7)     // Catch:{ Exception -> 0x002d }
            goto L_0x004e
        L_0x002d:
            r6 = move-exception
            goto L_0x00a0
        L_0x0030:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0038:
            defpackage.od2.a0(r7)
            u8e r7 = r5.g()     // Catch:{ Exception -> 0x002d }
            r1.o = r5     // Catch:{ Exception -> 0x002d }
            r1.X = r6     // Catch:{ Exception -> 0x002d }
            r1.s0 = r4     // Catch:{ Exception -> 0x002d }
            xe6 r7 = (defpackage.xe6) r7     // Catch:{ Exception -> 0x002d }
            java.lang.Object r7 = r7.b(r1)     // Catch:{ Exception -> 0x002d }
            if (r7 != r2) goto L_0x004e
            return r2
        L_0x004e:
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x002d }
            java.lang.String r1 = r5.a     // Catch:{ Exception -> 0x002d }
            if (r7 == 0) goto L_0x005e
            int r2 = r7.length()     // Catch:{ Exception -> 0x002d }
            if (r2 != 0) goto L_0x005b
            goto L_0x005e
        L_0x005b:
            java.lang.String r2 = "normal"
            goto L_0x0060
        L_0x005e:
            java.lang.String r2 = "empty"
        L_0x0060:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002d }
            r3.<init>(r0)     // Catch:{ Exception -> 0x002d }
            r3.append(r2)     // Catch:{ Exception -> 0x002d }
            java.lang.String r0 = " token"
            r3.append(r0)     // Catch:{ Exception -> 0x002d }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x002d }
            defpackage.hm9.m(r1, r0, new java.lang.Object[0])     // Catch:{ Exception -> 0x002d }
            q33 r0 = r5.b()     // Catch:{ Exception -> 0x002d }
            hyc r0 = (defpackage.hyc) r0     // Catch:{ Exception -> 0x002d }
            java.lang.String r1 = "user.fcmToken"
            r0.m(r1, r7)     // Catch:{ Exception -> 0x002d }
            q33 r0 = r5.b()     // Catch:{ Exception -> 0x002d }
            u8e r1 = r5.g()     // Catch:{ Exception -> 0x002d }
            r1.getClass()     // Catch:{ Exception -> 0x002d }
            java.lang.String r1 = "GCM"
            hyc r0 = (defpackage.hyc) r0     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = "user.pushDeviceType"
            r0.m(r2, r1)     // Catch:{ Exception -> 0x002d }
            if (r7 == 0) goto L_0x00a7
            int r0 = r7.length()     // Catch:{ Exception -> 0x002d }
            if (r0 != 0) goto L_0x009c
            goto L_0x00a7
        L_0x009c:
            r6.onPushTokenGenerated(r7)     // Catch:{ Exception -> 0x002d }
            goto L_0x00a7
        L_0x00a0:
            java.lang.String r5 = r5.a
            java.lang.String r7 = "getPushToken: failed"
            defpackage.hm9.p(r5, r7, r6)
        L_0x00a7:
            e5f r5 = defpackage.e5f.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xie.e(one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String f() {
        fl5 fl5;
        xe6 xe6 = (xe6) g();
        if (xe6.a()) {
            khe khe = xe6.c;
            ukg ukg = null;
            if (khe.a() && (fl5 = (fl5) khe.getValue()) != null) {
                try {
                    Object obj = il5.m;
                    fl5.a();
                    ukg = ((il5) fl5.d.a(jl5.class)).c();
                } catch (Exception e) {
                    hm9.p(xe6.b, "getInstanceIdTask: failed to get FirebaseInstanceId", e);
                }
            }
            if (ukg != null) {
                try {
                    return (String) j1e.b(ukg);
                } catch (Exception e2) {
                    throw new Exception("getServiceInstanceId: getInstanceId failed", e2);
                }
            } else {
                throw new Exception("failed to get instance id task");
            }
        } else {
            throw new StoreServicesInfo$ServicesNotAvailableException();
        }
    }

    public final u8e g() {
        return (u8e) this.b.getValue();
    }
}
