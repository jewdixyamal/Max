package defpackage;

import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: ve9  reason: default package */
public final class ve9 extends ol implements lme, hua {
    public static final /* synthetic */ int y0 = 0;
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final vx8 s0;
    public final List t0;
    public final List u0;
    public final boolean v0;
    public final String w0;
    public final String x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ve9(long j, long j2, long j3, long j4, long j5, String str, String str2, vx8 vx8, List list, List list2, boolean z) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
        this.s0 = vx8;
        this.t0 = list;
        this.u0 = list2;
        this.v0 = z;
        String str3 = "";
        this.w0 = str == null ? str3 : str;
        this.x0 = str2 != null ? str2 : str3;
    }

    public final int c() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        au8 d = plVar.d();
        long j = this.X;
        cu8 q = d.q(j);
        pl plVar2 = this.c;
        if (plVar2 == null) {
            plVar2 = null;
        }
        p82 c = plVar2.c();
        long j2 = this.o;
        e52 C = c.C(j2);
        pl plVar3 = this.c;
        if (plVar3 == null) {
            plVar3 = null;
        }
        eoe e = plVar3.e();
        iua iua = iua.TYPE_MSG_EDIT;
        long j3 = this.a;
        for (une une : e.h(j3, iua)) {
            ve9 ve9 = (ve9) une.f;
            if (ve9.o == j2 && ve9.X == j) {
                hm9.m("ve9", "onPreExecute: later edit task found, REMOVE", new Object[0]);
                return 3;
            }
        }
        if (q == null || q.v0 == vx8.DELETED || C == null || (!C.C() && !C.R())) {
            hm9.m("ve9", "onPreExecute: message or chat not found, REMOVE", new Object[0]);
            return 3;
        }
        long j4 = this.Z;
        if (j4 == 0) {
            hm9.m("ve9", "onPreExecute: message serverId == 0, REMOVE", new Object[0]);
            return 3;
        }
        k8g k8g = q.z0;
        String str = "onPreExecute: attaches not ready, SKIP";
        boolean z = this.v0;
        if (z && q.m(g20.c)) {
            List<l20> list = k8g != null ? (List) k8g.a : null;
            if (list == null) {
                list = nz4.a;
            }
            for (l20 l20 : list) {
                if (l20.f()) {
                    x10 x10 = l20.b;
                    String str2 = str;
                    if (x10.s0 == 0 || !oag.t(x10.Z)) {
                        str = str2;
                    } else {
                        pl plVar4 = this.c;
                        if (plVar4 == null) {
                            plVar4 = null;
                        }
                        if (plVar4.e().j(j3).c > 20) {
                            hm9.m("ve9", "onPreExecute: taskDb.failsCount > 20, REMOVE", new Object[0]);
                            d();
                            return 3;
                        }
                        pl plVar5 = this.c;
                        if (plVar5 == null) {
                            plVar5 = null;
                        }
                        ((k4a) plVar5.a()).D(this.Y, Collections.singletonList(Long.valueOf(j4)));
                        pl plVar6 = this.c;
                        (plVar6 != null ? plVar6 : null).e().c(j3);
                        hm9.m("ve9", str2, new Object[0]);
                        return 2;
                    }
                }
            }
        }
        String str3 = str;
        if (z) {
            if (!((!q.p() && q.n()) ? t20.a(k8g) : true)) {
                hm9.m("ve9", str3, new Object[0]);
                return 2;
            }
        }
        return 1;
    }

    public final void d() {
        pl plVar = this.c;
        pl plVar2 = null;
        if (plVar == null) {
            plVar = null;
        }
        plVar.e().d(this.a);
        pl plVar3 = this.c;
        if (plVar3 == null) {
            plVar3 = null;
        }
        cu8 q = plVar3.d().q(this.X);
        if (q != null) {
            pl plVar4 = this.c;
            if (plVar4 == null) {
                plVar4 = null;
            }
            plVar4.d().x(q, iu8.SENT);
            pl plVar5 = this.c;
            if (plVar5 != null) {
                plVar2 = plVar5;
            }
            ((bv4) plVar2.E.getValue()).a(this.X, this.o, this.x0, this.u0, this.s0, this.t0, this.v0);
        }
    }

    public final void e(gle gle) {
        fs8 fs8;
        we9 we9 = (we9) gle;
        pl plVar = this.c;
        pl plVar2 = null;
        if (plVar == null) {
            plVar = null;
        }
        au8 d = plVar.d();
        long j = this.X;
        cu8 q = d.q(j);
        if (q != null && q.v0 != vx8.DELETED && (fs8 = we9.c) != null) {
            pl plVar3 = this.c;
            if (plVar3 == null) {
                plVar3 = null;
            }
            au8 d2 = plVar3.d();
            ((OneMeRoomDatabase) ((k24) d2.a).c.a.m()).p(new dlc(1, new bp((Object) d2, (Object) fs8, (Object) q, (Object) this, 4)));
            pl plVar4 = this.c;
            if (plVar4 == null) {
                plVar4 = null;
            }
            p82 c = plVar4.c();
            long j2 = this.o;
            e52 C = c.C(j2);
            if (q.U0.b() && C != null && C.b.j == j) {
                pl plVar5 = this.c;
                if (plVar5 == null) {
                    plVar5 = null;
                }
                plVar5.c().w(j2);
            }
            pl plVar6 = this.c;
            if (plVar6 != null) {
                plVar2 = plVar6;
            }
            plVar2.b().c(new l6f(this.o, q.b, 0));
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, m20] */
    public final byte[] f() {
        Tasks.MsgEdit msgEdit = new Tasks.MsgEdit();
        msgEdit.requestId = this.a;
        msgEdit.chatId = this.o;
        msgEdit.messageId = this.X;
        msgEdit.chatServerId = this.Y;
        msgEdit.messageServerId = this.Z;
        msgEdit.text = this.w0;
        msgEdit.oldText = this.x0;
        msgEdit.oldStatus = this.s0.a;
        msgEdit.editAttaches = this.v0;
        List list = this.t0;
        if (list != null) {
            ? obj = new Object();
            obj.a = list;
            msgEdit.oldAttaches = b.f(obj.c());
        }
        List list2 = this.u0;
        if (list2 != null) {
            msgEdit.oldElements = ou8.c(list2);
        }
        return qw8.toByteArray(msgEdit);
    }

    public final void g(pke pke) {
        pl plVar = this.c;
        pl plVar2 = null;
        if (plVar == null) {
            plVar = null;
        }
        cu8 q = plVar.d().q(this.X);
        if (q != null && q.v0 != vx8.DELETED) {
            String str = pke.b;
            if (!f46.U(str)) {
                if ("attachment.not.ready".equals(str)) {
                    pl plVar3 = this.c;
                    if (plVar3 == null) {
                        plVar3 = null;
                    }
                    ((t20) plVar3.C.getValue()).b(q);
                } else {
                    d();
                    pl plVar4 = this.c;
                    if (plVar4 == null) {
                        plVar4 = null;
                    }
                    plVar4.b().c(new oi0(this.a, pke));
                }
            }
            pl plVar5 = this.c;
            if (plVar5 != null) {
                plVar2 = plVar5;
            }
            plVar2.b().c(new l6f(this.o, q.b, 0));
        }
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_MSG_EDIT;
    }

    public final int h() {
        return 1000000;
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dle i() {
        /*
            r13 = this;
            pl r0 = r13.c
            r1 = 0
            if (r0 == 0) goto L_0x0006
            goto L_0x0007
        L_0x0006:
            r0 = r1
        L_0x0007:
            p82 r0 = r0.c()
            long r2 = r13.o
            e52 r0 = r0.C(r2)
            pl r2 = r13.c
            if (r2 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r2 = r1
        L_0x0017:
            au8 r2 = r2.d()
            long r3 = r13.X
            cu8 r2 = r2.q(r3)
            if (r0 == 0) goto L_0x0053
            if (r2 != 0) goto L_0x0026
            goto L_0x0053
        L_0x0026:
            boolean r3 = r13.v0
            if (r3 == 0) goto L_0x0039
            k8g r3 = r2.z0
            wz r3 = defpackage.iz7.f(r3)
            if (r3 != 0) goto L_0x0037
            wz r3 = new wz
            r3.<init>()
        L_0x0037:
            r10 = r3
            goto L_0x003a
        L_0x0039:
            r10 = r1
        L_0x003a:
            java.util.List r3 = r2.R0
            if (r3 == 0) goto L_0x0042
            java.util.ArrayList r1 = defpackage.iz7.v(r3)
        L_0x0042:
            r11 = r1
            tq2 r1 = new tq2
            k92 r0 = r0.b
            long r5 = r0.a
            ng4 r12 = r2.T0
            long r7 = r13.Z
            java.lang.String r9 = r13.w0
            r4 = r1
            r4.<init>(r5, r7, r9, r10, r11, r12)
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve9.i():dle");
    }
}
