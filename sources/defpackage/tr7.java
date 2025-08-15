package defpackage;

import java.util.Arrays;
import java.util.Locale;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: tr7  reason: default package */
public final class tr7 extends ol implements hua, lme {
    public final long X;
    public final String Y = tr7.class.getName();
    public final long o;

    public tr7(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = j3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        r7 = p().j(r0.a, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0037, code lost:
        r0 = defpackage.vx8.DELETED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onPreExecute: serverChatId = "
            r0.<init>(r1)
            long r1 = r7.o
            r0.append(r1)
            java.lang.String r3 = ", serverMessageId = "
            r0.append(r3)
            long r3 = r7.X
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = r7.Y
            defpackage.hm9.m(r5, r0, new java.lang.Object[0])
            p82 r0 = r7.m()
            e52 r0 = r0.z(r1)
            r1 = 3
            if (r0 != 0) goto L_0x002b
            return r1
        L_0x002b:
            au8 r7 = r7.p()
            long r5 = r0.a
            cu8 r7 = r7.j(r5, r3)
            if (r7 == 0) goto L_0x0040
            vx8 r0 = defpackage.vx8.DELETED
            vx8 r7 = r7.v0
            if (r7 != r0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r7 = 1
            return r7
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tr7.c():int");
    }

    public final void d() {
        hm9.p(this.Y, "onMaxFailCount", (Throwable) null);
        t().d(this.a);
    }

    public final void e(gle gle) {
        ur7 ur7 = (ur7) gle;
        e52 z = m().z(this.o);
        if (z != null) {
            au8 p = p();
            fs8 fs8 = ur7.c;
            long f = p.f(z.a, ((p7b) r()).a.t(), fs8);
            if (f != 0) {
                l().c(new l6f(z.a, f, 0));
                return;
            }
            hm9.p(this.Y, String.format(Locale.ENGLISH, "Can't insert message: response = %s", Arrays.copyOf(new Object[]{ur7}, 1)), (Throwable) null);
        }
    }

    public final byte[] f() {
        Tasks.LocationStop locationStop = new Tasks.LocationStop();
        locationStop.requestId = this.a;
        locationStop.chatId = this.o;
        locationStop.messageId = this.X;
        return qw8.toByteArray(locationStop);
    }

    public final void g(pke pke) {
        l().c(new oi0(this.a, pke));
        if (!f46.U(pke.b)) {
            d();
        }
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_LOCATION_STOP;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        tq2 tq2 = new tq2((sla) null, 16);
        tq2.i(this.o, ApiProtocol.PARAM_CHAT_ID);
        tq2.i(this.X, "messageId");
        return tq2;
    }
}
