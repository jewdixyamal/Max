package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import one.me.sdk.tasks.MsgSendNotFoundException;
import ru.ok.tamtam.ExceptionHandler$HandledException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: jf9  reason: default package */
public final class jf9 extends ol implements lme, hua {
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final boolean s0;
    public final long t0;

    public jf9(long j, long j2, long j3, long j4, long j5, boolean z, long j6) {
        super(j);
        this.Y = j4;
        this.Z = j5;
        this.o = j3;
        this.X = j2;
        this.s0 = z;
        this.t0 = j6;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, kna] */
    public static lna v(cu8 cu8) {
        int i;
        nna nna = null;
        wz f = !cu8.p() ? iz7.f(cu8.z0) : null;
        if (cu8.C0 != null) {
            int i2 = 2;
            int i3 = cu8.A0;
            if (i3 != 1) {
                if (i3 != 2) {
                    i = 1;
                    nna = new nna(i, cu8.J0, cu8.K0);
                } else {
                    i2 = 3;
                }
            }
            i = i2;
            nna = new nna(i, cu8.J0, cu8.K0);
        }
        ArrayList v = iz7.v(cu8.R0);
        ? obj = new Object();
        obj.a = cu8.Z;
        obj.b = cu8.s0;
        obj.c = f;
        obj.d = nna;
        obj.e = cu8.G0;
        obj.f = cu8.M0;
        obj.h = v;
        obj.i = cu8.T0;
        return obj.a();
    }

    public static jf9 x(byte[] bArr) {
        try {
            Tasks.MsgSend msgSend = (Tasks.MsgSend) qw8.mergeFrom(new Tasks.MsgSend(), bArr);
            return new jf9(msgSend.requestId, msgSend.messageId, msgSend.chatId, msgSend.chatServerId, msgSend.userId, msgSend.notify, msgSend.lastKnownDraftTime);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }

    public final void A(long j, long j2) {
        if (j != 0) {
            ((sna) this.c.z.getValue()).getClass();
            sna.b(j, j2);
        }
    }

    public final int c() {
        hm9.m("MsgSendApiTask", "onPreExecute", new Object[0]);
        cu8 q = this.c.d().q(this.X);
        e52 C = q != null ? this.c.c().C(q.t0) : this.c.c().C(this.o);
        long j = this.Y;
        if (j == 0 && C != null) {
            j = C.b.a;
        }
        vx8 vx8 = vx8.DELETED;
        if (q != null && q.v0 == vx8 && q.c == 0) {
            au8 d = this.c.d();
            long j2 = this.o;
            long j3 = this.X;
            d.getClass();
            d.c(j2, Collections.singletonList(Long.valueOf(j3)));
            A(j, this.X);
            return 3;
        } else if (q == null || q.v0 == vx8 || q.u0 == iu8.ERROR) {
            A(j, this.X);
            return 3;
        } else if (C == null) {
            ((cba) ((o45) this.c.u.getValue())).c(new Exception("chat is null"), true);
            A(j, this.X);
            return 3;
        } else {
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                Locale locale = Locale.ROOT;
                long j4 = C.a;
                long j5 = q.b;
                StringBuilder k = au1.k(j4, "onPreExecute: chat = ", ", messageId = ");
                k.append(j5);
                k.append(", serverMessageId = ");
                k.append(q.c);
                ir6.d(us7, "MsgSendApiTask", k.toString(), (Throwable) null);
            }
            if (!C.M() && C.b.a == 0 && (!q.x() || q.f().a != p10.b)) {
                return 2;
            }
            if (!((!q.p() && q.n()) ? t20.a(q.z0) : true)) {
                hm9.m("MsgSendApiTask", "onPreExecute: attaches not ready, SKIP", new Object[0]);
                return 2;
            }
            if (q.z()) {
                d20 d20 = q.a(g20.x0).o;
                if (d20.d() || d20.a()) {
                    return 2;
                }
            }
            lna v = v(q);
            wz wzVar = v.c;
            if ((wzVar != null && !wzVar.isEmpty()) || !oag.t(v.b) || v.d != null) {
                return 1;
            }
            hm9.m("MsgSendApiTask", "createRequest: empty outgoing message chatId = %s, messageId = %s", Long.valueOf(this.o), Long.valueOf(this.X));
            g(new pke("android.empty.message.and.attach", "MsgSend with empty text and attaches", (String) null));
            return 3;
        }
    }

    public final void d() {
        cu8 q = this.c.d().q(this.X);
        if (q != null) {
            this.c.d().x(q, iu8.ERROR);
            this.c.b().c(new l6f(q.t0, q.b));
        }
    }

    public final void e(gle gle) {
        vx8 vx8;
        mf9 mf9 = (mf9) gle;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, "MsgSendApiTask", "onSuccess: chat=" + this.Y + ", messageId=" + this.X, (Throwable) null);
        }
        cu8 q = this.c.d().q(this.X);
        fs8 fs8 = mf9.o;
        if (fs8 == null || q == null || fs8.D0 != null || !q.o()) {
            if (q != null && !q.o()) {
                A(mf9.c, this.X);
            }
            if (q != null && q.v0 == (vx8 = vx8.DELETED) && q.c == 0) {
                au8 d = this.c.d();
                fs8 fs82 = mf9.o;
                long j = this.o;
                oz7 oz7 = iu8.b;
                ((k24) d.a).c.o(fs82, j, false, vx8);
                ((k4a) this.c.a()).B(this.o, this.Y, Collections.singletonList(Long.valueOf(q.b)), Collections.singletonList(Long.valueOf(mf9.o.a)), (da3) null, false, q.o() ? mg4.DELAYED : mg4.REGULAR);
                hm9.m("MsgSendApiTask", "onSuccess: sent api request for deletion locally deleted message", new Object[0]);
            } else if (q == null || !q.x()) {
                ((of9) this.c.B.getValue()).a(this.o, mf9.c, mf9.o);
            } else {
                ir6 ir62 = hm9.m;
                if (ir62 != null && ir62.c()) {
                    us7 us72 = us7.o;
                    ir62.d(us72, "MsgSendApiTask", "onSuccessControlMessage, messageDb.event = " + q.f().a, (Throwable) null);
                }
                if (q.f().a.ordinal() == 1) {
                    ArrayList arrayList = q.f().c;
                    List list = ((ju3) mf9.o.s0.get(0)).Y;
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    arrayList2.removeAll(list);
                    if (!arrayList2.isEmpty()) {
                        this.c.b().c(new h9b(q.t0, arrayList2));
                    }
                }
                ((of9) this.c.B.getValue()).a(this.o, mf9.c, mf9.o);
                ((k4a) this.c.a()).j(mf9.c);
            }
        } else {
            hm9.l0("MsgSendApiTask", "look's like delayed attrs is not supported!", new IllegalStateException("receive message without delayed attrs but send as delayed"));
            au8 d2 = this.c.d();
            long j2 = q.b;
            d2.getClass();
            hm9.m("au8", "clearDelayedAttrs %d", Long.valueOf(j2));
            ((k24) d2.a).c.q(j2, (Long) null, (Boolean) null);
            d2.f.c.remove(Long.valueOf(j2));
            ((of9) this.c.B.getValue()).a(this.o, mf9.c, mf9.o);
            this.c.b().c(new su(4));
        }
    }

    public final byte[] f() {
        Tasks.MsgSend msgSend = new Tasks.MsgSend();
        msgSend.requestId = this.a;
        msgSend.messageId = this.X;
        msgSend.chatId = this.o;
        long j = this.Y;
        if (j != 0) {
            msgSend.chatServerId = j;
        }
        long j2 = this.Z;
        if (j2 != 0) {
            msgSend.userId = j2;
        }
        msgSend.notify = this.s0;
        msgSend.lastKnownDraftTime = this.t0;
        return qw8.toByteArray(msgSend);
    }

    public final void g(pke pke) {
        long j;
        long j2;
        long j3;
        k8g k8g;
        uj3 l;
        pke pke2 = pke;
        StringBuilder sb = new StringBuilder("onFail: chat=");
        long j4 = this.Y;
        sb.append(j4);
        sb.append(", messageId=");
        long j5 = this.X;
        sb.append(j5);
        hm9.l("MsgSendApiTask", sb.toString(), pke2.X);
        cu8 q = this.c.d().q(j5);
        if (q != null) {
            p82 c = this.c.c();
            long j6 = this.o;
            e52 C = c.C(j6);
            long j7 = C != null ? C.b.a : 0;
            t19 d = ((k24) this.c.d().a).c.d();
            ilc ilc = d.a;
            ilc.b();
            th thVar = d.i;
            q36 f = thVar.f();
            long j8 = j7;
            String str = pke2.b;
            f.f(1, str);
            f.j(2, j5);
            try {
                ilc.c();
                f.n();
                ilc.r();
                ilc.l();
                thVar.t(f);
                au8 d2 = this.c.d();
                String str2 = pke2.o;
                if (str2 == null) {
                    str2 = "";
                }
                t19 d3 = ((k24) d2.a).c.d();
                ilc ilc2 = d3.a;
                ilc2.b();
                th thVar2 = d3.j;
                q36 f2 = thVar2.f();
                f2.f(1, str2);
                f2.j(2, j5);
                try {
                    ilc2.c();
                    f2.n();
                    ilc2.r();
                    ilc2.l();
                    thVar2.t(f2);
                    boolean U = f46.U(str);
                    long j9 = this.a;
                    long j10 = q.b;
                    if (!U) {
                        boolean x = q.x();
                        mg4 mg4 = q.U0;
                        if (x) {
                            if ("error.phone.binding.required".equals(str)) {
                                w(q);
                            } else {
                                hm9.p("MsgSendApiTask", "onFailControlMessage, in event = " + q.f().a, (Throwable) null);
                                p82 c2 = this.c.c();
                                c2.getClass();
                                hm9.m("p82", "deleteAndUpdateLastMessage, chatId = " + j6, new Object[0]);
                                rm4 rm4 = c2.s;
                                au8 au8 = (au8) rm4.get();
                                au8.getClass();
                                au8.c(j6, Collections.singletonList(Long.valueOf(j10)));
                                c2.m.c(new re9(j6, Collections.singletonList(Long.valueOf(j10)), (mg4) null));
                                c2.k0(j6, ((au8) rm4.get()).p(j6, mg4), true);
                                ((k4a) this.c.a()).j(j4);
                                this.c.b().c(new vz2(Collections.singletonList(Long.valueOf(j6)), false));
                            }
                        } else if ("user.not.found".equals(str)) {
                            u(q);
                            e52 C2 = this.c.c().C(j6);
                            if (!(C2 == null || (l = C2.l()) == null)) {
                                ((el3) this.c.k.getValue()).o(l.n());
                                this.c.b().c(new vz2(Collections.singletonList(Long.valueOf(j6)), true));
                            }
                            A(j8, j5);
                        } else {
                            long j11 = j8;
                            long j12 = j6;
                            if ("not.found".equals(str)) {
                                u(q);
                                pl plVar = this.c;
                                if (plVar == null) {
                                    plVar = null;
                                }
                                ((cba) ((o45) plVar.u.getValue())).c(new ExceptionHandler$HandledException((String) null, "ONEME-17243", new MsgSendNotFoundException("got \"not.found\" error on send message, with causeMessage=" + pke.c)), true);
                                A(j11, j5);
                                j = j9;
                                j3 = j12;
                            } else {
                                long j13 = j9;
                                mg4 mg42 = mg4;
                                long j14 = j13;
                                if ("privacy.restricted".equals(str)) {
                                    StringBuilder sb2 = new StringBuilder("onFailPrivacyRestricted, message send to dialog, chatId = ");
                                    j = j14;
                                    sb2.append(q.t0);
                                    hm9.p("MsgSendApiTask", sb2.toString(), (Throwable) null);
                                    u(q);
                                    j3 = j12;
                                    h9b h9b = new h9b(j3, Collections.singletonList(Long.valueOf(this.Z)));
                                    this.c.b().c(h9b);
                                    ((k4a) this.c.a()).j(j4);
                                    this.c.b().c(new vz2(Collections.singletonList(Long.valueOf(j3)), true, false, mg4.REGULAR, h9b, 96));
                                    A(j11, j5);
                                } else {
                                    j = j14;
                                    j3 = j12;
                                    if ("error.phone.binding.required".equals(str)) {
                                        w(q);
                                        A(j11, j5);
                                    } else {
                                        if (("video.not.found".equalsIgnoreCase(str) || "photo.not.found".equalsIgnoreCase(str) || "file.not.found".equalsIgnoreCase(str) || "sticker.not.found".equalsIgnoreCase(str)) && (k8g = q.z0) != null && k8g.i() > 0 && k8g.i() != 0) {
                                            int i = 0;
                                            while (i < k8g.i()) {
                                                if (!oag.t(k8g.h(i).s)) {
                                                    i++;
                                                }
                                            }
                                            if (y(q)) {
                                                for (int i2 = 0; i2 < k8g.i(); i2++) {
                                                    l20 h = k8g.h(i2);
                                                    this.c.d().v(j10, h.r, new yt8(7, (Object) h));
                                                }
                                                ((s8g) this.c.g.getValue()).a(new v8d(j3, j5));
                                                long j15 = j;
                                                this.c.e().d(j15);
                                                j2 = j10;
                                                j9 = j15;
                                            } else {
                                                u(q);
                                                j2 = j10;
                                                nf9 nf9 = r1;
                                                av0 b = this.c.b();
                                                j9 = j;
                                                nf9 nf92 = new nf9(this.a, pke, this.o);
                                                b.c(nf9);
                                                A(j4, j5);
                                            }
                                            j = j9;
                                        }
                                        j2 = j10;
                                        long j16 = j;
                                        if ("attachment.not.ready".equals(str)) {
                                            z(q, j11);
                                            ((t20) this.c.C.getValue()).b(q);
                                        } else if ("android.empty.message.and.attach".equals(str)) {
                                            try {
                                                y(q);
                                            } catch (Throwable unused) {
                                            }
                                            A(j11, j5);
                                            ((k24) this.c.d().a).c.d().o(j3, Collections.singletonList(Long.valueOf(j5)), vx8.DELETED);
                                            av0 b2 = this.c.b();
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(Long.valueOf(j2));
                                            b2.c(new re9(this.o, arrayList, mg42));
                                            this.c.e().d(j16);
                                        } else {
                                            u(q);
                                            av0 b3 = this.c.b();
                                            j = j16;
                                            nf9 nf93 = r1;
                                            nf9 nf94 = new nf9(this.a, pke, this.o);
                                            b3.c(nf93);
                                            A(j11, j5);
                                        }
                                        j = j16;
                                    }
                                }
                            }
                            j2 = j10;
                        }
                        j2 = j10;
                        j3 = j6;
                        j = j9;
                    } else {
                        j3 = j6;
                        long j17 = j8;
                        j = j9;
                        j2 = j10;
                        z(q, j17);
                    }
                    this.c.b().c(new l6f(j3, j2, 0));
                    this.c.b().c(new oi0(j, pke));
                } catch (Throwable th) {
                    thVar2.t(f2);
                    throw th;
                }
            } catch (Throwable th2) {
                thVar.t(f);
                throw th2;
            }
        }
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_MSG_SEND;
    }

    public final int h() {
        return 1000000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dle i() {
        /*
            r22 = this;
            r0 = r22
            java.lang.String r1 = "MsgSendApiTask"
            java.lang.String r2 = "createRequest"
            defpackage.hm9.m(r1, r2, new java.lang.Object[0])
            pl r2 = r0.c
            au8 r2 = r2.d()
            long r3 = r0.X
            cu8 r2 = r2.q(r3)
            r5 = 0
            if (r2 != 0) goto L_0x0022
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "messageDb is null"
            defpackage.hm9.H(r1, r2, r0)
            goto L_0x00ac
        L_0x0022:
            pl r6 = r0.c
            p82 r6 = r6.c()
            long r7 = r2.t0
            e52 r6 = r6.C(r7)
            long r7 = r0.Y
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0048
            if (r6 == 0) goto L_0x0048
            boolean r11 = r6.M()
            if (r11 != 0) goto L_0x0048
            k92 r11 = r6.b
            long r11 = r11.a
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x0048
            r14 = r11
            goto L_0x0049
        L_0x0048:
            r14 = r7
        L_0x0049:
            if (r6 == 0) goto L_0x005a
            boolean r6 = r6.I()
            if (r6 == 0) goto L_0x005a
            boolean r6 = r0.s0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r19 = r6
            goto L_0x005c
        L_0x005a:
            r19 = r5
        L_0x005c:
            lna r2 = v(r2)
            wz r6 = r2.c
            if (r6 == 0) goto L_0x006a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x009c
        L_0x006a:
            java.lang.String r6 = r2.b
            boolean r6 = defpackage.oag.t(r6)
            if (r6 == 0) goto L_0x009c
            nna r6 = r2.d
            if (r6 == 0) goto L_0x0077
            goto L_0x009c
        L_0x0077:
            long r6 = r0.o
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "createRequest: empty outgoing message chatId = %s, messageId = %s"
            defpackage.hm9.m(r1, r3, r2)
            pke r1 = new pke
            java.lang.String r2 = "android.empty.message.and.attach"
            java.lang.String r3 = "MsgSend with empty text and attaches"
            r1.<init>(r2, r3, r5)
            r0.g(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x009c:
            tq2 r5 = new tq2
            long r3 = r0.Z
            long r0 = r0.t0
            r13 = r5
            r16 = r3
            r18 = r2
            r20 = r0
            r13.<init>(r14, r16, r18, r19, r20)
        L_0x00ac:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf9.i():dle");
    }

    public final void u(cu8 cu8) {
        this.c.d().x(cu8, iu8.ERROR);
        this.c.c().k0(this.o, cu8, false);
        this.c.e().d(this.a);
    }

    public final void w(cu8 cu8) {
        hm9.p("MsgSendApiTask", "onFailPhoneBindingRequired, message send to dialog, chatId = " + cu8.t0, (Throwable) null);
        u(cu8);
        this.c.b().c(new oi0(tua.c));
        ((k4a) this.c.a()).j(this.Y);
        this.c.b().c(new vz2(Collections.singletonList(Long.valueOf(this.o)), true));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x000b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean y(defpackage.cu8 r8) {
        /*
            r7 = this;
            k8g r8 = r8.z0
            java.lang.Object r8 = r8.a
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
        L_0x000b:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0082
            java.lang.Object r1 = r8.next()
            l20 r1 = (defpackage.l20) r1
            g20 r2 = r1.a
            int r2 = r2.ordinal()
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L_0x0042
            r3 = 3
            if (r2 == r3) goto L_0x003b
            r3 = 5
            r6 = 0
            if (r2 == r3) goto L_0x0036
            r3 = 9
            if (r2 == r3) goto L_0x002f
        L_0x002d:
            r2 = r4
            goto L_0x0047
        L_0x002f:
            s10 r1 = r1.j
            long r2 = r1.a
            java.lang.String r6 = r1.e
            goto L_0x0047
        L_0x0036:
            f20 r1 = r1.f
            long r2 = r1.a
            goto L_0x0047
        L_0x003b:
            k20 r1 = r1.d
            long r2 = r1.a
            java.lang.String r6 = r1.m
            goto L_0x0047
        L_0x0042:
            x10 r1 = r1.b
            java.lang.String r6 = r1.Z
            goto L_0x002d
        L_0x0047:
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0051
            boolean r4 = defpackage.oag.t(r6)
            if (r4 != 0) goto L_0x000b
        L_0x0051:
            if (r1 == 0) goto L_0x0067
            pl r0 = r7.c     // Catch:{ all -> 0x0065 }
            je7 r0 = r0.A     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0065 }
            y8f r0 = (defpackage.y8f) r0     // Catch:{ all -> 0x0065 }
            pa3 r0 = r0.b(r2)     // Catch:{ all -> 0x0065 }
            r0.a()     // Catch:{ all -> 0x0065 }
            goto L_0x0080
        L_0x0065:
            r0 = move-exception
            goto L_0x0079
        L_0x0067:
            pl r0 = r7.c     // Catch:{ all -> 0x0065 }
            je7 r0 = r0.A     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0065 }
            y8f r0 = (defpackage.y8f) r0     // Catch:{ all -> 0x0065 }
            pa3 r0 = r0.e(r6)     // Catch:{ all -> 0x0065 }
            r0.a()     // Catch:{ all -> 0x0065 }
            goto L_0x0080
        L_0x0079:
            java.lang.String r1 = "MsgSendApiTask"
            java.lang.String r2 = "onAttachNotFound: failed"
            defpackage.hm9.p(r1, r2, r0)
        L_0x0080:
            r0 = 1
            goto L_0x000b
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf9.y(cu8):boolean");
    }

    public final void z(cu8 cu8, long j) {
        this.c.d().x(cu8, iu8.SENDING);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i != 0) {
            sna sna = (sna) this.c.z.getValue();
            sna.getClass();
            if (i != 0) {
                sna.f(j, cu8.A() ? b10.PHOTO : cu8.u() ? b10.AUDIO : cu8.m(g20.o) ? b10.VIDEO : cu8.t() ? b10.VIDEO_MSG : cu8.m(g20.u0) ? b10.FILE : cu8.D() ? b10.STICKER : null, cu8.b);
            }
        }
    }
}
