package defpackage;

import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: gdf  reason: default package */
public final class gdf extends tdc {
    public final long a;
    public final m29 b;
    public final m56 c;
    public final a66 d;
    public final String e = gdf.class.getName();
    public RecyclerView f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final Rect k;
    public final gi9 l;
    public final gi9 m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final float q;
    public boolean r;
    public final id2 s;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x007c, code lost:
        if (r7 != 1) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gdf(defpackage.je7 r15, defpackage.je7 r16, defpackage.w80 r17, defpackage.je7 r18, defpackage.je7 r19, long r20, defpackage.m29 r22, defpackage.o59 r23, defpackage.v59 r24, defpackage.pg7 r25) {
        /*
            r14 = this;
            r8 = r14
            r0 = r17
            r9 = r25
            r14.<init>()
            r1 = r20
            r8.a = r1
            r1 = r22
            r8.b = r1
            r1 = r23
            r8.c = r1
            r1 = r24
            r8.d = r1
            java.lang.Class<gdf> r1 = defpackage.gdf.class
            java.lang.String r1 = r1.getName()
            r8.e = r1
            r1 = r15
            r8.g = r1
            r1 = r16
            r8.h = r1
            r2 = r18
            r8.i = r2
            r10 = r19
            r8.j = r10
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r8.k = r2
            gi9 r2 = new gi9
            r11 = 0
            r2.<init>((java.lang.Object) r11)
            r8.l = r2
            gi9 r2 = new gi9
            r2.<init>((java.lang.Object) r11)
            r8.m = r2
            je7 r2 = r0.a
            java.lang.Object r2 = r2.getValue()
            gh3 r2 = (defpackage.gh3) r2
            boolean r2 = r2.g()
            je7 r3 = r0.a
            java.lang.Object r3 = r3.getValue()
            gh3 r3 = (defpackage.gh3) r3
            zh3 r3 = r3.b()
            zh3 r4 = defpackage.zh3.c
            r5 = 1
            r6 = 0
            if (r3 != r4) goto L_0x0065
            r3 = r5
            goto L_0x0066
        L_0x0065:
            r3 = r6
        L_0x0066:
            je7 r4 = r0.b
            java.lang.Object r7 = r4.getValue()
            m7b r7 = (defpackage.m7b) r7
            p7b r7 = (defpackage.p7b) r7
            jp r7 = r7.c
            ne7 r7 = r7.g
            java.lang.String r12 = "app.video.auto.play"
            int r7 = r7.getInt(r12, r5)
            if (r7 == 0) goto L_0x0080
            if (r7 == r5) goto L_0x0095
        L_0x007e:
            r3 = r6
            goto L_0x0095
        L_0x0080:
            if (r3 != 0) goto L_0x0094
            java.lang.Object r3 = r4.getValue()
            m7b r3 = (defpackage.m7b) r3
            p7b r3 = (defpackage.p7b) r3
            jp r3 = r3.c
            boolean r3 = r3.n()
            if (r3 != 0) goto L_0x0094
            if (r2 != 0) goto L_0x007e
        L_0x0094:
            r3 = r5
        L_0x0095:
            r8.n = r3
            java.lang.Object r2 = r4.getValue()
            m7b r2 = (defpackage.m7b) r2
            p7b r2 = (defpackage.p7b) r2
            jp r2 = r2.c
            ne7 r2 = r2.g
            java.lang.String r3 = "app.media.autoplay.gif"
            boolean r2 = r2.getBoolean(r3, r5)
            r8.o = r2
            je7 r0 = r0.c
            java.lang.Object r2 = r0.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != r5) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r5 = r6
        L_0x00bb:
            r8.p = r5
            if (r5 == 0) goto L_0x00c2
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00c5
        L_0x00c2:
            r2 = 1058642330(0x3f19999a, float:0.6)
        L_0x00c5:
            r8.q = r2
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            id2 r2 = new id2
            r3 = 2
            r2.<init>(r0, r3, r14)
            r8.s = r2
            java.lang.Object r0 = r16.getValue()
            rff r0 = (defpackage.rff) r0
            v7c r12 = r0.k
            shb r13 = new shb
            java.lang.String r5 = "handleFetchEvents(Lone/me/sdk/media/player/fetcher/VideoFetchEvent;)V"
            r6 = 4
            r1 = 2
            java.lang.Class<gdf> r3 = defpackage.gdf.class
            java.lang.String r4 = "handleFetchEvents"
            r7 = 25
            r0 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            zn5 r0 = new zn5
            r1 = 5
            r0.<init>(r12, r13, r1)
            defpackage.od2.L(r0, r9)
            java.lang.Object r0 = r19.getValue()
            vhf r0 = (defpackage.vhf) r0
            v7c r0 = r0.k
            bdf r1 = new bdf
            r1.<init>(r14, r11)
            zn5 r2 = new zn5
            r3 = 5
            r2.<init>(r0, r1, r3)
            defpackage.od2.L(r2, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdf.<init>(je7, je7, w80, je7, je7, long, m29, o59, v59, pg7):void");
    }

    public final void a(RecyclerView recyclerView, int i2) {
        if (i2 == 0) {
            e(recyclerView, false);
        }
    }

    public final void b(RecyclerView recyclerView, int i2, int i3) {
        tz tzVar;
        this.f = recyclerView;
        if (this.n) {
            LinearLayoutManager t = z7.t(recyclerView);
            int W0 = t != null ? t.W0() : -1;
            int Y0 = t != null ? t.Y0() : -1;
            if (W0 == -1 || Y0 == -1) {
                String str = this.e;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, str, wg0.h("Player autoplay. Can't start fetch because invalid positions, first:", W0, ", last:", Y0, "."), (Throwable) null);
                    return;
                }
                return;
            }
            if (W0 <= Y0) {
                int i4 = W0;
                while (true) {
                    dec M = recyclerView.M(i4);
                    if (M == null) {
                        String str2 = this.e;
                        ir6 ir62 = hm9.m;
                        if (ir62 != null && ir62.c()) {
                            us7 us7 = us7.X;
                            StringBuilder j2 = wg0.j("Player autoplay. Can't find viewHolder for fetch, pos:", i4, ", firstPos:", W0, "|lastPos:");
                            j2.append(Y0);
                            ir62.d(us7, str2, j2.toString(), (Throwable) null);
                        }
                    } else if (M instanceof ht8) {
                        ht8 ht8 = (ht8) M;
                        if (ht8.I0 instanceof cmf) {
                            MessageModel d2 = this.b.d(ht8.J0);
                            o00 o00 = (d2 == null || (tzVar = d2.u0) == null) ? null : tzVar.d;
                            zcf zcf = o00 instanceof zcf ? (zcf) o00 : null;
                            if (zcf != null) {
                                if (zcf instanceof wgf) {
                                    this.m.a(((wgf) zcf).a);
                                } else {
                                    this.l.a(zcf.j());
                                }
                            }
                        }
                    }
                    if (i4 == Y0) {
                        break;
                    }
                    i4++;
                }
            }
            if (this.m.j()) {
                vhf vhf = (vhf) this.j.getValue();
                long j3 = this.a;
                List D = oag.D(this.m);
                vhf.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object next : D) {
                    if (vhf.i.add(vhf.c(j3, ((Number) next).longValue()))) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    j47.T(vhf.h, (lx3) null, (vx3) null, new rhf(vhf, D, arrayList, j3, (Continuation) null), 3);
                }
                this.m.c();
            }
            if (this.l.j()) {
                rff rff = (rff) this.h.getValue();
                List D2 = oag.D(this.l);
                long j4 = this.a;
                rff.getClass();
                j47.T(rff.m, (lx3) null, (vx3) null, new off(D2, rff, j4, (Continuation) null), 3);
                this.l.c();
            }
        }
    }

    public final void c() {
        String str = this.e;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, "Player autoplay. onMediaProcessingStarted.", (Throwable) null);
        }
        this.r = true;
        if (!((n4b) this.i.getValue()).a) {
            this.s.j(-1);
        }
    }

    public final void d(cmf cmf, fdf fdf, o00 o00, MessageModel messageModel, dkf dkf, gef gef) {
        cmf.o(fdf, o00, messageModel.a, (messageModel.w0 == null && messageModel.x0 == null && (messageModel.F0 == null || (messageModel.I0 & -2080374787) == 0)) ? false : true, true);
        cmf.setVideoClickListener(new adf(this, fdf, dkf, gef));
        cmf.setVideoLongClickListener(new bk(22, this));
        dkf.L0(true);
        dkf.g(0.0f);
        dkf.I0(gef);
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.recyclerview.widget.RecyclerView r42, boolean r43) {
        /*
            r41 = this;
            r7 = r41
            r8 = r42
            r7.f = r8
            boolean r0 = r7.r
            r9 = 0
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r7.e
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x0012
            goto L_0x001f
        L_0x0012:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x001f
            us7 r2 = defpackage.us7.X
            java.lang.String r3 = "Player autoplay. Can't start autoplay because media transform is ongoing."
            r1.d(r2, r0, r3, r9)
        L_0x001f:
            return
        L_0x0020:
            androidx.recyclerview.widget.LinearLayoutManager r0 = defpackage.z7.t(r42)
            r1 = -1
            if (r0 == 0) goto L_0x002d
            int r2 = r0.W0()
            r10 = r2
            goto L_0x002e
        L_0x002d:
            r10 = r1
        L_0x002e:
            if (r0 == 0) goto L_0x0036
            int r0 = r0.Y0()
            r11 = r0
            goto L_0x0037
        L_0x0036:
            r11 = r1
        L_0x0037:
            if (r10 == r1) goto L_0x003b
            if (r11 != r1) goto L_0x0041
        L_0x003b:
            r0 = r7
            r16 = r10
            r1 = r11
            goto L_0x0535
        L_0x0041:
            if (r10 > r11) goto L_0x0534
            r12 = r10
        L_0x0044:
            dec r0 = r8.M(r12)
            if (r0 != 0) goto L_0x0074
            java.lang.String r0 = r7.e
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x0051
            goto L_0x006d
        L_0x0051:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x006d
            us7 r2 = defpackage.us7.X
            java.lang.String r3 = "Player autoplay. Can't find viewHolder, pos:"
            java.lang.String r4 = ", firstPos:"
            java.lang.String r5 = "|lastPos:"
            java.lang.StringBuilder r3 = defpackage.wg0.j(r3, r12, r4, r10, r5)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r1.d(r2, r0, r3, r9)
        L_0x006d:
            r0 = r7
            r16 = r10
            r1 = r11
            r10 = r12
            goto L_0x0527
        L_0x0074:
            boolean r1 = r0 instanceof defpackage.ht8
            if (r1 == 0) goto L_0x0080
            ht8 r0 = (defpackage.ht8) r0
            android.view.View r1 = r0.I0
            boolean r2 = r1 instanceof defpackage.cmf
            if (r2 != 0) goto L_0x0088
        L_0x0080:
            r0 = r7
            r16 = r10
            r17 = r11
            r10 = r12
            goto L_0x0525
        L_0x0088:
            if (r43 != 0) goto L_0x00b1
            cmf r1 = (defpackage.cmf) r1
            android.view.View r1 = r1.getPreviewView()
            if (r1 != 0) goto L_0x0094
            android.view.View r1 = r0.I0
        L_0x0094:
            android.graphics.Rect r2 = r7.k
            boolean r3 = r1.getLocalVisibleRect(r2)
            if (r3 == 0) goto L_0x00ae
            int r2 = r2.height()
            float r2 = (float) r2
            int r1 = r1.getMeasuredHeight()
            float r1 = (float) r1
            float r3 = r7.q
            float r1 = r1 * r3
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x00ae
            goto L_0x00b1
        L_0x00ae:
            r1 = 0
        L_0x00af:
            r13 = r1
            goto L_0x00b3
        L_0x00b1:
            r1 = 1
            goto L_0x00af
        L_0x00b3:
            android.view.View r1 = r0.I0
            cmf r1 = (defpackage.cmf) r1
            boolean r1 = r1.j()
            java.lang.String r2 = "\n                                |playing:"
            java.lang.String r3 = "\n                                |isVisible:"
            java.lang.String r4 = "\n                                |hasPreview:"
            java.lang.String r5 = "Player autoplay. State already exist, \n                                |msgId:"
            java.lang.String r6 = "\n                                |states count:"
            java.lang.String r14 = "Player autoplay. State doesn't exist, \n                                |msgId:"
            java.lang.String r15 = ", \n                                |attachId:"
            java.lang.String r9 = "\n                                |previewUrl:"
            java.lang.String r8 = "\n                                |attachId:"
            r16 = r10
            java.lang.String r10 = ",\n                                |previewUrl:"
            r17 = r11
            java.lang.String r11 = "Player autoplay. Can't find video content, \n                                |msgId:"
            if (r13 == 0) goto L_0x0320
            r18 = r12
            boolean r12 = r7.n
            if (r12 == 0) goto L_0x031c
            if (r1 != 0) goto L_0x031c
            android.view.View r1 = r0.I0
            cmf r1 = (defpackage.cmf) r1
            m29 r12 = r7.b
            r19 = r2
            r20 = r3
            long r2 = r0.J0
            one.me.messages.list.loader.MessageModel r12 = r12.d(r2)
            if (r12 == 0) goto L_0x00f8
            tz r2 = r12.u0
            if (r2 == 0) goto L_0x00f8
            o00 r2 = r2.d
            goto L_0x00f9
        L_0x00f8:
            r2 = 0
        L_0x00f9:
            boolean r3 = r2 instanceof defpackage.zcf
            if (r3 == 0) goto L_0x0101
            zcf r2 = (defpackage.zcf) r2
            r3 = r2
            goto L_0x0102
        L_0x0101:
            r3 = 0
        L_0x0102:
            if (r3 != 0) goto L_0x0133
            java.lang.String r0 = r7.e
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x010b
            goto L_0x012f
        L_0x010b:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x012f
            us7 r2 = defpackage.us7.X
            if (r12 == 0) goto L_0x011c
            long r3 = r12.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x011d
        L_0x011c:
            r3 = 0
        L_0x011d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Player autoplay. Can't find videoAttach, msgId:"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 0
            r1.d(r2, r0, r3, r4)
        L_0x012f:
            r31 = r13
            goto L_0x0314
        L_0x0133:
            boolean r2 = r3.a()
            if (r2 != 0) goto L_0x016a
            java.lang.String r0 = r7.e
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x0140
            goto L_0x012f
        L_0x0140:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x012f
            us7 r2 = defpackage.us7.X
            if (r12 == 0) goto L_0x0151
            long r3 = r12.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0152
        L_0x0151:
            r3 = 0
        L_0x0152:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Player autoplay. Don't play videoAttach, msgId:"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = " because it's not ready to autoplay"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 0
            r1.d(r2, r0, r3, r4)
            goto L_0x012f
        L_0x016a:
            je7 r2 = r7.h
            java.lang.Object r2 = r2.getValue()
            rff r2 = (defpackage.rff) r2
            java.lang.String r21 = r3.i()
            ief r2 = r2.e
            r2.getClass()
            gef r21 = defpackage.ief.a(r21)
            if (r21 != 0) goto L_0x01c0
            java.lang.String r0 = r7.e
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x0188
            goto L_0x012f
        L_0x0188:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x012f
            us7 r2 = defpackage.us7.X
            long r4 = r3.j()
            wcf r6 = r3.b()
            android.net.Uri r6 = r6.b
            java.lang.String r3 = r3.i()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r11)
            r9.append(r4)
            r9.append(r10)
            r9.append(r6)
            r9.append(r8)
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            java.lang.String r3 = defpackage.x9e.c0(r3)
            r4 = 0
            r1.d(r2, r0, r3, r4)
            goto L_0x012f
        L_0x01c0:
            id2 r2 = r7.s
            java.lang.String r8 = r3.i()
            java.lang.Object r2 = r2.c(r8)
            fdf r2 = (defpackage.fdf) r2
            java.lang.String r8 = "\n                                |videoPos:"
            if (r2 != 0) goto L_0x027a
            java.lang.String r2 = r7.e
            ir6 r4 = defpackage.hm9.m
            if (r4 != 0) goto L_0x01e1
        L_0x01d6:
            r22 = r0
            r33 = r1
            r34 = r3
            r32 = r12
            r31 = r13
            goto L_0x022d
        L_0x01e1:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x01d6
            us7 r5 = defpackage.us7.X
            long r10 = r3.j()
            r31 = r13
            java.lang.String r13 = r3.i()
            r32 = r12
            wcf r12 = r3.b()
            android.net.Uri r12 = r12.b
            r22 = r0
            r33 = r1
            long r0 = r21.d()
            r34 = r3
            id2 r3 = r7.s
            int r3 = r3.g()
            java.lang.StringBuilder r10 = defpackage.z7b.j(r14, r10, r15, r13)
            r10.append(r9)
            r10.append(r12)
            r10.append(r8)
            r10.append(r0)
            r10.append(r6)
            r10.append(r3)
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = defpackage.x9e.c0(r0)
            r1 = 0
            r4.d(r5, r2, r0, r1)
        L_0x022d:
            je7 r0 = r7.g
            java.lang.Object r0 = r0.getValue()
            f4b r0 = (defpackage.f4b) r0
            dkf r5 = r0.get()
            fdf r2 = new fdf
            java.lang.String r23 = r34.i()
            r0 = r22
            long r0 = r0.J0
            je7 r3 = r7.g
            java.lang.Object r3 = r3.getValue()
            r27 = r3
            f4b r27 = (defpackage.f4b) r27
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r6 = r33
            r3.<init>(r6)
            id2 r4 = r7.s
            r22 = r2
            r24 = r0
            r26 = r5
            r28 = r21
            r29 = r3
            r30 = r4
            r22.<init>(r23, r24, r26, r27, r28, r29, r30)
            java.lang.String r0 = r34.i()
            r4.d(r0, r2)
            r0 = r41
            r1 = r6
            r3 = r34
            r4 = r32
            r6 = r21
            r0.d(r1, r2, r3, r4, r5, r6)
            goto L_0x0314
        L_0x027a:
            r6 = r1
            r34 = r3
            r32 = r12
            r31 = r13
            dkf r10 = r2.c
            java.lang.String r0 = r7.e
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x028e
        L_0x0289:
            r24 = r2
            r33 = r6
            goto L_0x02ee
        L_0x028e:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x0289
            us7 r3 = defpackage.us7.X
            long r11 = r2.b
            java.lang.String r13 = r2.a
            wcf r14 = r34.b()
            android.net.Uri r14 = r14.b
            r22 = r0
            r23 = r1
            long r0 = r21.d()
            boolean r7 = r6.s()
            r24 = r2
            boolean r2 = r6.m()
            r33 = r6
            boolean r6 = r10.b()
            java.lang.StringBuilder r5 = defpackage.z7b.j(r5, r11, r15, r13)
            r5.append(r9)
            r5.append(r14)
            r5.append(r8)
            r5.append(r0)
            r5.append(r4)
            r5.append(r7)
            r7 = r20
            r5.append(r7)
            r5.append(r2)
            r2 = r19
            r5.append(r2)
            r5.append(r6)
            java.lang.String r0 = r5.toString()
            java.lang.String r0 = defpackage.x9e.c0(r0)
            r2 = r22
            r4 = r23
            r1 = 0
            r4.d(r3, r2, r0, r1)
        L_0x02ee:
            boolean r0 = r10.b()
            r2 = r24
            if (r0 == 0) goto L_0x0306
            java.lang.ref.WeakReference r0 = r2.Y
            java.lang.Object r0 = r0.get()
            cmf r0 = (defpackage.cmf) r0
            if (r0 == 0) goto L_0x0314
            boolean r0 = r0.s()
            if (r0 != 0) goto L_0x0314
        L_0x0306:
            r0 = r41
            r1 = r33
            r3 = r34
            r4 = r32
            r5 = r10
            r6 = r21
            r0.d(r1, r2, r3, r4, r5, r6)
        L_0x0314:
            r0 = r41
        L_0x0316:
            r10 = r18
            r5 = r31
            goto L_0x0514
        L_0x031c:
            r7 = r3
        L_0x031d:
            r31 = r13
            goto L_0x0324
        L_0x0320:
            r7 = r3
            r18 = r12
            goto L_0x031d
        L_0x0324:
            if (r31 == 0) goto L_0x04e4
            r12 = r41
            boolean r3 = r12.o
            if (r3 == 0) goto L_0x04e4
            if (r1 == 0) goto L_0x04e4
            android.view.View r1 = r0.I0
            cmf r1 = (defpackage.cmf) r1
            m29 r3 = r12.b
            r19 = r4
            r13 = r5
            long r4 = r0.J0
            one.me.messages.list.loader.MessageModel r4 = r3.d(r4)
            if (r4 == 0) goto L_0x0346
            tz r3 = r4.u0
            if (r3 == 0) goto L_0x0346
            o00 r3 = r3.d
            goto L_0x0347
        L_0x0346:
            r3 = 0
        L_0x0347:
            boolean r5 = r3 instanceof defpackage.vqd
            if (r5 == 0) goto L_0x034e
            vqd r3 = (defpackage.vqd) r3
            goto L_0x034f
        L_0x034e:
            r3 = 0
        L_0x034f:
            if (r3 != 0) goto L_0x037d
            java.lang.String r0 = r12.e
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x0358
            goto L_0x0314
        L_0x0358:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0314
            us7 r2 = defpackage.us7.X
            if (r4 == 0) goto L_0x0369
            long r3 = r4.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x036a
        L_0x0369:
            r3 = 0
        L_0x036a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Player autoplay. Can't find imageAttach, msgId:"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 0
            r1.d(r2, r0, r3, r4)
            goto L_0x0314
        L_0x037d:
            yt6 r5 = r3.c
            r20 = r13
            android.net.Uri r13 = r5.l
            r21 = r2
            if (r13 == 0) goto L_0x0394
            xc6 r2 = new xc6
            r22 = r7
            int r7 = r5.c
            int r5 = r5.d
            r2.<init>(r13, r7, r5)
            r7 = r2
            goto L_0x0397
        L_0x0394:
            r22 = r7
            r7 = 0
        L_0x0397:
            if (r7 != 0) goto L_0x03d3
            java.lang.String r0 = r12.e
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x03a1
            goto L_0x0314
        L_0x03a1:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0314
            us7 r2 = defpackage.us7.X
            long r4 = r3.a
            yt6 r6 = r3.c
            android.net.Uri r6 = r6.b
            java.lang.String r3 = r3.b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r11)
            r7.append(r4)
            r7.append(r10)
            r7.append(r6)
            r7.append(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            java.lang.String r3 = defpackage.x9e.c0(r3)
            r4 = 0
            r1.d(r2, r0, r3, r4)
            goto L_0x0314
        L_0x03d3:
            id2 r2 = r12.s
            java.lang.String r5 = r3.b
            java.lang.Object r2 = r2.c(r5)
            fdf r2 = (defpackage.fdf) r2
            if (r2 != 0) goto L_0x0464
            java.lang.String r2 = r12.e
            ir6 r5 = defpackage.hm9.m
            if (r5 != 0) goto L_0x03ea
        L_0x03e5:
            r23 = r4
            r24 = r7
            goto L_0x0420
        L_0x03ea:
            boolean r8 = r5.c()
            if (r8 == 0) goto L_0x03e5
            us7 r8 = defpackage.us7.X
            long r10 = r3.a
            java.lang.String r13 = r3.b
            r23 = r4
            yt6 r4 = r3.c
            android.net.Uri r4 = r4.b
            r24 = r7
            id2 r7 = r12.s
            int r7 = r7.g()
            java.lang.StringBuilder r10 = defpackage.z7b.j(r14, r10, r15, r13)
            r10.append(r9)
            r10.append(r4)
            r10.append(r6)
            r10.append(r7)
            java.lang.String r4 = r10.toString()
            java.lang.String r4 = defpackage.x9e.c0(r4)
            r6 = 0
            r5.d(r8, r2, r4, r6)
        L_0x0420:
            je7 r2 = r12.g
            java.lang.Object r2 = r2.getValue()
            f4b r2 = (defpackage.f4b) r2
            dkf r5 = r2.get()
            fdf r2 = new fdf
            java.lang.String r4 = r3.b
            long r6 = r0.J0
            je7 r0 = r12.g
            java.lang.Object r0 = r0.getValue()
            r37 = r0
            f4b r37 = (defpackage.f4b) r37
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            id2 r8 = r12.s
            r32 = r2
            r33 = r4
            r34 = r6
            r36 = r5
            r38 = r24
            r39 = r0
            r40 = r8
            r32.<init>(r33, r34, r36, r37, r38, r39, r40)
            java.lang.String r0 = r3.b
            r8.d(r0, r2)
            r0 = r41
            r4 = r23
            r6 = r24
            r0.d(r1, r2, r3, r4, r5, r6)
            goto L_0x0314
        L_0x0464:
            r23 = r4
            r24 = r7
            dkf r5 = r2.c
            java.lang.String r0 = r12.e
            ir6 r4 = defpackage.hm9.m
            if (r4 != 0) goto L_0x0473
        L_0x0470:
            r25 = r3
            goto L_0x04c1
        L_0x0473:
            boolean r6 = r4.c()
            if (r6 == 0) goto L_0x0470
            us7 r6 = defpackage.us7.X
            long r7 = r2.b
            java.lang.String r10 = r2.a
            yt6 r11 = r3.c
            android.net.Uri r11 = r11.b
            boolean r13 = r1.s()
            boolean r14 = r1.m()
            boolean r12 = r5.b()
            r25 = r3
            r3 = r20
            java.lang.StringBuilder r3 = defpackage.z7b.j(r3, r7, r15, r10)
            r3.append(r9)
            r3.append(r11)
            r7 = r19
            r3.append(r7)
            r3.append(r13)
            r7 = r22
            r3.append(r7)
            r3.append(r14)
            r7 = r21
            r3.append(r7)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = defpackage.x9e.c0(r3)
            r7 = 0
            r4.d(r6, r0, r3, r7)
        L_0x04c1:
            boolean r0 = r5.b()
            if (r0 == 0) goto L_0x04d7
            java.lang.ref.WeakReference r0 = r2.Y
            java.lang.Object r0 = r0.get()
            cmf r0 = (defpackage.cmf) r0
            if (r0 == 0) goto L_0x0314
            boolean r0 = r0.s()
            if (r0 != 0) goto L_0x0314
        L_0x04d7:
            r0 = r41
            r3 = r25
            r4 = r23
            r6 = r24
            r0.d(r1, r2, r3, r4, r5, r6)
            goto L_0x0314
        L_0x04e4:
            r0 = r41
            java.lang.String r1 = r0.e
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x04ee
            goto L_0x0316
        L_0x04ee:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0316
            us7 r3 = defpackage.us7.X
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Player autoplay. Don't find visible videoViewParent by this pos:"
            r4.<init>(r5)
            r10 = r18
            r4.append(r10)
            java.lang.String r5 = ", inVisibleArea:"
            r4.append(r5)
            r5 = r31
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r6 = 0
            r2.d(r3, r1, r4, r6)
        L_0x0514:
            boolean r1 = r0.p
            if (r1 == 0) goto L_0x0525
            id2 r1 = r0.s
            int r1 = r1.g()
            if (r1 <= 0) goto L_0x0525
            if (r5 == 0) goto L_0x0525
            if (r43 != 0) goto L_0x0525
            return
        L_0x0525:
            r1 = r17
        L_0x0527:
            if (r10 == r1) goto L_0x0534
            int r12 = r10 + 1
            r8 = r42
            r7 = r0
            r11 = r1
            r10 = r16
            r9 = 0
            goto L_0x0044
        L_0x0534:
            return
        L_0x0535:
            java.lang.String r0 = r0.e
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x053c
            goto L_0x0554
        L_0x053c:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0554
            us7 r3 = defpackage.us7.X
            java.lang.String r4 = "Player autoplay. Can't start autoplay because invalid positions, first:"
            java.lang.String r5 = ", last:"
            java.lang.String r6 = "."
            r7 = r16
            java.lang.String r1 = defpackage.wg0.h(r4, r7, r5, r1, r6)
            r4 = 0
            r2.d(r3, r0, r1, r4)
        L_0x0554:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdf.e(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }
}
