package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: g6f  reason: default package */
public final class g6f extends ol implements lme, hua {
    public static final /* synthetic */ int s0 = 0;
    public final long X;
    public final long Y;
    public final boolean Z;
    public final long o;

    public g6f(long j, long j2, long j3, long j4, boolean z) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = z;
    }

    public final int c() {
        long j;
        long j2;
        Object obj;
        List<une> h = t().h(this.a, iua.TYPE_UPDATE_FIRE_TIME);
        ArrayList arrayList = new ArrayList();
        for (une une : h) {
            g6f g6f = (g6f) une.f;
            if (g6f != null) {
                arrayList.add(g6f);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            j = this.X;
            j2 = this.o;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            g6f g6f2 = (g6f) obj;
            if (g6f2.o == j2 && g6f2.X == j) {
                break;
            }
        }
        if (((g6f) obj) != null) {
            hm9.m("g6f", "onPreExecute: found later task, REMOVE", new Object[0]);
            return 3;
        }
        cu8 q = p().q(j);
        e52 C = m().C(j2);
        if (q == null || q.v0 == vx8.DELETED || C == null || (!C.C() && !C.R())) {
            hm9.m("g6f", "onPreExecute: message or chat not found, REMOVE", new Object[0]);
            return 3;
        } else if (q.c == 0) {
            hm9.m("g6f", "onPreExecute: message serverId == 0, REMOVE", new Object[0]);
            return 3;
        } else if (C.b.a != 0 || m().P(C)) {
            return 1;
        } else {
            hm9.m("g6f", "onPreExecute: chat serverId == 0, SKIP", new Object[0]);
            return 2;
        }
    }

    public final void d() {
        t().d(this.a);
        cu8 q = p().q(this.X);
        if (q != null) {
            p().x(q, iu8.ERROR);
            l().c(new l6f(this.o, this.X, 0));
        }
    }

    public final void e(gle gle) {
        hm9.m("g6f", "onSuccess: " + ((we9) gle), new Object[0]);
        cu8 q = p().q(this.X);
        if (q != null && q.v0 != vx8.DELETED) {
            p().x(q, iu8.SENT);
            l().c(new l6f(this.o, this.X, 0));
        }
    }

    public final byte[] f() {
        Tasks.UpdateFireTimeProtoTask updateFireTimeProtoTask = new Tasks.UpdateFireTimeProtoTask();
        updateFireTimeProtoTask.requestId = this.a;
        updateFireTimeProtoTask.chatId = this.o;
        updateFireTimeProtoTask.messageId = this.X;
        updateFireTimeProtoTask.fireTime = this.Y;
        updateFireTimeProtoTask.notifySender = this.Z;
        return qw8.toByteArray(updateFireTimeProtoTask);
    }

    public final void g(pke pke) {
        hm9.m("g6f", "onFail", pke);
        cu8 q = p().q(this.X);
        if (q != null && q.v0 != vx8.DELETED && !f46.U(pke.b)) {
            d();
            l().c(new oi0(this.a, pke));
        }
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_UPDATE_FIRE_TIME;
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dle i() {
        /*
            r12 = this;
            au8 r0 = r12.p()
            long r1 = r12.X
            cu8 r0 = r0.q(r1)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            goto L_0x0049
        L_0x000e:
            p82 r2 = r12.m()
            long r3 = r12.o
            e52 r2 = r2.C(r3)
            if (r2 != 0) goto L_0x001b
            goto L_0x0049
        L_0x001b:
            k92 r2 = r2.b
            long r4 = r2.a
            k8g r2 = r0.z0
            wz r2 = defpackage.iz7.f(r2)
            if (r2 != 0) goto L_0x002c
            wz r2 = new wz
            r2.<init>()
        L_0x002c:
            r9 = r2
            java.util.List r2 = r0.R0
            if (r2 == 0) goto L_0x0035
            java.util.ArrayList r1 = defpackage.iz7.v(r2)
        L_0x0035:
            r10 = r1
            ng4 r11 = new ng4
            long r1 = r12.Y
            boolean r12 = r12.Z
            r11.<init>(r1, r12)
            tq2 r1 = new tq2
            long r6 = r0.c
            java.lang.String r8 = r0.s0
            r3 = r1
            r3.<init>(r4, r6, r8, r9, r10, r11)
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6f.i():dle");
    }
}
