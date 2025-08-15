package defpackage;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.messages.list.loader.MessageModel;
import one.me.rlottie.RLottieImageView;
import one.me.sdk.transfer.exceptions.HttpErrorException;
import org.apache.http.util.LangUtils;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VpxEncoderWrapper;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: v05  reason: default package */
public final /* synthetic */ class v05 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ v05(m29 m29, List list) {
        this.a = 20;
        this.c = m29;
        this.o = list;
        this.b = null;
    }

    private final void a() {
        p9c p9c = (p9c) this.c;
        p9c.getClass();
        d9c M = ((OneMeRoomDatabase) this.o).M();
        List list = (List) new e0a(qy9.j((List) this.b), new y98((Object) p9c, 27, (Object) M), 0).v().e();
        if (!list.isEmpty()) {
            M.getClass();
            new sa3(2, new c9c(M, list, 1)).a();
        }
    }

    private final void b() {
        adc adc = (adc) this.c;
        see see = adc.y;
        if (see != null && !see.a()) {
            adc.y.d();
        }
        see see2 = (see) this.o;
        adc.y = see2;
        bue bue = (bue) this.b;
        adc.z = bue;
        adc.h(see2, bue, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        if (r8.o() == false) goto L_0x00dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c() {
        /*
            r11 = this;
            java.lang.Object r0 = r11.c
            wj4 r0 = (defpackage.wj4) r0
            r0.getClass()
            java.lang.Object r1 = r11.o
            r4 = r1
            see r4 = (defpackage.see) r4
            boolean r1 = r4.a()
            java.lang.Object r2 = r0.g
            r8 = r2
            adc r8 = (defpackage.adc) r8
            if (r1 != 0) goto L_0x00dc
            zm4 r1 = r8.a0
            int r2 = r1.b
            int r2 = defpackage.au1.s(r2)
            r3 = 2
            if (r2 == 0) goto L_0x005b
            r5 = 1
            if (r2 == r5) goto L_0x004d
            if (r2 == r3) goto L_0x005b
            r5 = 3
            if (r2 == r5) goto L_0x004d
            r5 = 4
            if (r2 != r5) goto L_0x002e
            goto L_0x005b
        L_0x002e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "State "
            r0.<init>(r2)
            int r1 = r1.b
            java.lang.String r1 = defpackage.h4f.v(r1)
            r0.append(r1)
            java.lang.String r1 = " is not handled"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        L_0x004d:
            java.lang.Object r1 = r1.h
            see r1 = (defpackage.see) r1
            if (r1 != r4) goto L_0x005b
            boolean r1 = r8.o()
            if (r1 != 0) goto L_0x005b
            goto L_0x00dc
        L_0x005b:
            zm4 r1 = new zm4
            av1 r2 = r8.f
            java.util.concurrent.Executor r5 = r8.d
            q6d r9 = r8.e
            r1.<init>(r2, r9, r5)
            cd6 r2 = r8.D
            java.lang.Object r2 = defpackage.adc.l(r2)
            r7 = r2
            ab0 r7 = (defpackage.ab0) r7
            nc0 r6 = r8.u
            int r2 = r1.b
            int r2 = defpackage.au1.s(r2)
            if (r2 == 0) goto L_0x0091
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            int r2 = r1.b
            java.lang.String r2 = defpackage.h4f.v(r2)
            java.lang.String r3 = "configure() shouldn't be called in "
            java.lang.String r2 = r3.concat(r2)
            r11.<init>(r2)
            dw6 r2 = new dw6
            r3 = 1
            r2.<init>(r3, r11)
            goto L_0x00d0
        L_0x0091:
            r1.b = r3
            r1.h = r4
            r1.toString()
            gff r2 = new gff
            r3 = 0
            r2.<init>(r1, r3)
            oq1 r2 = defpackage.f8.g(r2)
            r1.k = r2
            gff r2 = new gff
            r3 = 1
            r2.<init>(r1, r3)
            oq1 r2 = defpackage.f8.g(r2)
            r1.m = r2
            yjc r10 = new yjc
            java.lang.Object r11 = r11.b
            r5 = r11
            bue r5 = (defpackage.bue) r5
            r2 = r10
            r3 = r1
            r2.<init>((defpackage.zm4) r3, (defpackage.see) r4, (defpackage.bue) r5, (defpackage.nc0) r6, (defpackage.ab0) r7)
            oq1 r11 = defpackage.f8.g(r10)
            ece r2 = new ece
            r2.<init>(r1)
            java.lang.Object r3 = r1.d
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3
            defpackage.kq0.a(r11, r2, r3)
            bm7 r2 = defpackage.kq0.w(r11)
        L_0x00d0:
            r8.a0 = r1
            djb r11 = new djb
            r3 = 2
            r11.<init>((java.lang.Object) r0, (int) r3, (java.lang.Object) r1)
            defpackage.kq0.a(r2, r11, r9)
            goto L_0x00e4
        L_0x00dc:
            r4.a()
            zm4 r11 = r8.a0
            java.util.Objects.toString(r11)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v05.c():void");
    }

    private final void d() {
        vg8 vg8 = (vg8) this.c;
        vg8.getClass();
        Objects.toString((qt1) this.o);
        vg8.c.remove((bm7) this.b);
    }

    private final void e() {
        for (cu8 cu8 : (List) this.c) {
            ((vlc) this.o).d().n(cu8.b, (iu8) this.b);
        }
    }

    public final void run() {
        boolean z;
        int L;
        int i;
        Object obj;
        m5d m5d;
        xx0 xx0;
        zuc zuc;
        boolean z2;
        xlc xlc;
        String str;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        String str2;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        Long l;
        int i9;
        Boolean bool;
        switch (this.a) {
            case 0:
                z05 z05 = (z05) this.c;
                LinkedHashMap linkedHashMap = z05.a;
                py9 py9 = (py9) this.o;
                py9.getClass();
                Executor executor = (Executor) this.b;
                executor.getClass();
                linkedHashMap.put(py9, executor);
                executor.execute(new kl4((Object) py9, 11, (Object) z05.b));
                return;
            case 1:
                Executor executor2 = (Executor) this.b;
                o05 o05 = (o05) this.o;
                if (((b15) this.c).k.D != 8) {
                    try {
                        Objects.requireNonNull(o05);
                        executor2.execute(new a15(o05, 1));
                        return;
                    } catch (RejectedExecutionException unused) {
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                Intent intent = (Intent) this.o;
                qne qne = (qne) this.b;
                f25 f25 = (f25) this.c;
                f25.getClass();
                try {
                    f25.b(intent);
                    qne.b((Object) null);
                    return;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    qne.b((Object) null);
                    throw th2;
                }
            case 3:
                FeedbackListenerManagerImpl.onFeedback$lambda$1((FeedbackListenerManagerImpl) this.c, (List) this.o, (ArrayList) ((List) this.b));
                return;
            case 4:
                ((Runnable) this.c).run();
                for (TextView textView : ((wl5) this.o).a.keySet()) {
                    boolean isCurrentThread = Looper.getMainLooper().isCurrentThread();
                    yl5 yl5 = (yl5) this.b;
                    if (isCurrentThread) {
                        qqe.b(textView, yl5);
                    } else {
                        Handler handler = textView.getHandler();
                        if (handler != null) {
                            handler.postAtFrontOfQueue(new i76((Object) textView, 4, (Object) yl5));
                        } else {
                            textView.post(new h76(textView, 7, yl5));
                        }
                    }
                }
                return;
            case 5:
                h26 h26 = (h26) this.c;
                Intent intent2 = (Intent) this.o;
                Size size = (Size) this.b;
                if (h26.X == null) {
                    h26.X = SurfaceTextureHelper.create("SSFCTextureHelper", h26.a);
                }
                h26.Y = new ScreenCapturerAndroid(intent2, h26);
                h26.Y.initialize(h26.X, h26.b, h26);
                h26.t0 = true;
                h26.b(size, 1);
                return;
            case 6:
                l26 l26 = (l26) this.c;
                z26 z26 = (z26) this.o;
                VideoFrame videoFrame = (VideoFrame) this.b;
                if (l26.x0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (z26 != null) {
                        boolean z5 = z26.h;
                        z = false;
                        z26.h = false;
                        if (z5) {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    if (elapsedRealtime > l26.t0 + l26.a) {
                        z = true;
                    }
                    if (z) {
                        l26.t0 = elapsedRealtime;
                    }
                    VpxEncoderWrapper vpxEncoderWrapper = l26.Y;
                    if (vpxEncoderWrapper != null) {
                        vpxEncoderWrapper.encode(videoFrame, z);
                    }
                }
                l26.w0.decrementAndGet();
                videoFrame.release();
                return;
            case 7:
                tq6 tq6 = (tq6) this.c;
                if (!tq6.s0.get()) {
                    String str4 = (String) this.o;
                    eq6 eq6 = (eq6) this.b;
                    hm9.q("uq6", "onFileUploadFailed: message =%s, httpError=%s", str4, eq6);
                    tq6.Z.onError(new HttpErrorException(str4, eq6));
                    tq6.a(false);
                    return;
                }
                return;
            case 8:
                ((xt6) ((qqd) this.c).b).b((Bitmap) this.o, (qy5) this.b);
                return;
            case 9:
                ((fu6) this.c).J((Executor) this.b, (ey1) this.o);
                return;
            case 10:
                ci9 ci9 = (ci9) ((va8) this.c).b;
                zm7 zm7 = (zm7) this.o;
                if (zm7 != null) {
                    ci9.j(zm7);
                }
                ci9.f((zm7) this.b);
                return;
            case 11:
                fe8 fe8 = (fe8) this.c;
                fe8.getClass();
                ffc j = ((ww6) this.o).j();
                h74 h74 = fe8.c;
                u2 u2Var = h74.Z;
                u2Var.getClass();
                z23 z23 = h74.o;
                z23.getClass();
                z23.a = zw6.j(j);
                if (!j.isEmpty()) {
                    z23.e = (xj8) j.get(0);
                    xj8 xj8 = (xj8) this.b;
                    xj8.getClass();
                    z23.f = xj8;
                }
                if (((xj8) z23.d) == null) {
                    z23.d = z23.d(u2Var, (zw6) z23.a, (xj8) z23.e, (gue) z23.b);
                }
                z23.j(u2Var.O1());
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ge8 ge8 = (ge8) this.c;
                ge8.getClass();
                ffc j2 = ((ww6) this.o).j();
                i74 i74 = ge8.c;
                q3b q3b = i74.Z;
                q3b.getClass();
                ai3 ai3 = i74.o;
                ai3.getClass();
                ai3.b = zw6.j(j2);
                if (!j2.isEmpty()) {
                    ai3.X = (yj8) j2.get(0);
                    yj8 yj8 = (yj8) this.b;
                    yj8.getClass();
                    ai3.Y = yj8;
                }
                if (((yj8) ai3.o) == null) {
                    ai3.o = ai3.d(q3b, (zw6) ai3.b, (yj8) ai3.X, (hue) ai3.a);
                }
                ai3.i(q3b.x0());
                return;
            case 13:
                ii8 ii8 = (ii8) this.c;
                ii8.getClass();
                ((Runnable) this.o).run();
                ii8.g.e.w((oh8) this.b);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                m68 m68 = (m68) this.c;
                ii8 ii82 = (ii8) m68.c;
                oh8 oh8 = (oh8) this.o;
                if (ii82.h(oh8)) {
                    ii82.a((KeyEvent) this.b, false);
                } else {
                    vi8 vi8 = oh8.a;
                    vi8.getClass();
                    si8 si8 = ii82.h;
                    si8.getClass();
                    si8.N(1, new ji8(si8, 7), vi8, true);
                }
                m68.b = null;
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                bj8 bj8 = (bj8) this.c;
                bj8.getClass();
                ue ueVar = (ue) this.o;
                HashMap hashMap = (HashMap) ueVar.i;
                qh8 qh8 = (qh8) this.b;
                if (!hashMap.containsKey(qh8)) {
                    bj8 bj82 = (bj8) ueVar.c;
                    pd8 pd8 = new pd8(bj82, qh8);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("androidx.media3.session.MediaNotificationManager", true);
                    obd obd = qh8.a.j;
                    bj82.getClass();
                    obd.getClass();
                    Bundle bundle2 = Bundle.EMPTY;
                    oaf.w();
                    Bundle bundle3 = new Bundle(bundle);
                    Looper mainLooper = Looper.getMainLooper();
                    mainLooper.getClass();
                    i98 i98 = new i98(mainLooper);
                    oaf.W(new Handler(mainLooper), new w88(i98, new a98(bj82, obd, bundle3, pd8, mainLooper, i98, obd.a.e() ? new imc(new v24(bj82)) : null), 0));
                    hashMap.put(qh8, i98);
                    i98.d(new yg3((Object) ueVar, (Object) i98, (Object) pd8, (Object) qh8, 7), (a84) ueVar.g);
                }
                qh8.a.v = new w4d(19, (Object) bj8);
                return;
            case 16:
                ii8 ii83 = (ii8) this.c;
                if (!ii83.i()) {
                    ((hj8) this.o).e(ii83.s, (ph8) this.b);
                    return;
                }
                return;
            case LangUtils.HASH_SEED /*17*/:
                gk8 gk8 = (gk8) this.c;
                ((hk8) this.o).E(gk8.b, (xj8) gk8.c, (pc8) this.b);
                return;
            case 18:
                jn jnVar = (jn) this.c;
                ((ik8) this.o).L(jnVar.b, (yj8) jnVar.c, (pc8) this.b);
                return;
            case 19:
                Pair pair = (Pair) this.o;
                ((i74) ((vk8) ((imc) this.c).c).j).s(((Integer) pair.first).intValue(), (yj8) pair.second, (Exception) this.b);
                return;
            case 20:
                List list = (List) this.o;
                int size2 = (list == null || list.isEmpty()) ? 0 : list.size();
                m29 m29 = (m29) this.c;
                yh9 yh9 = m29.w0;
                yh9.e = 0;
                long[] jArr = yh9.a;
                if (jArr != usc.a) {
                    ys.b0(jArr);
                    long[] jArr2 = yh9.a;
                    int i10 = yh9.d;
                    int i11 = i10 >> 3;
                    long j3 = 255 << ((7 & i10) << 3);
                    jArr2[i11] = (jArr2[i11] & (~j3)) | j3;
                }
                yh9.f = usc.a(yh9.d) - yh9.e;
                ArrayList arrayList = m29.x0;
                arrayList.clear();
                arrayList.ensureCapacity(size2);
                if (list != null && !list.isEmpty() && (L = y53.L(list)) >= 0) {
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        ol7 ol7 = (ol7) list.get(i12);
                        if (ol7 instanceof MessageModel) {
                            arrayList.add(ol7);
                            yh9.e(i13, i12);
                            i = 1;
                            i13++;
                        } else {
                            i = 1;
                        }
                        if (i12 != L) {
                            i12 += i;
                        }
                    }
                }
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 21:
                uh9 uh9 = (uh9) this.c;
                try {
                    a98 a98 = (a98) ((bm7) this.o).get();
                    uh9.m = a98;
                    if (a98 != null && a98.c.isConnected()) {
                        uh9.i(uh9);
                        Runnable runnable2 = (Runnable) this.b;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    obj = e5f.a;
                } catch (Throwable th3) {
                    obj = new njc(th3);
                }
                if (pjc.a(obj) != null) {
                    uh9.k(true);
                    hm9.m("uh9", "retry connect", new Object[0]);
                    int i14 = uh9.l;
                    if (i14 < 5) {
                        uh9.l = i14 + 1;
                        uh9.h();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                ji9 ji9 = (ji9) this.o;
                yuc yuc = (yuc) this.b;
                kq7 kq7 = (kq7) ((nsa) this.c).E0.a().b;
                if (kq7 != null) {
                    boolean z6 = ji9.b;
                    boolean z7 = ji9.c;
                    kq7.n.log("OKRTCLmsAdapter", "startScreenVideoCapture, start=" + z6 + ", isFast=" + z7);
                    if (kq7.e == null) {
                        kq7.n.log("OKRTCLmsAdapter", kq7 + ": has no video capturer factory");
                    } else {
                        if (z6 && (xx0 = kq7.b) != null) {
                            if (!z7 ? !xx0.a.u0.i : true) {
                                if (kq7.t == null) {
                                    kq7.a();
                                    xs1 xs1 = (xs1) ((r61) yuc).a.getValue();
                                    Intent intent3 = xs1.a;
                                    xs1.a = null;
                                    if (intent3 != null) {
                                        i50 i50 = kq7.e;
                                        Executor executor3 = kq7.g;
                                        a4c a4c = (a4c) i50.o;
                                        try {
                                            zuc = new zuc(intent3, executor3, a4c);
                                        } catch (Exception e) {
                                            a4c.reportException("OKRTCSvcFactory", "screen.capture.adapter", new RuntimeException("Cant create screen capturer", e));
                                            zuc = null;
                                        }
                                        kq7.t = zuc;
                                        if (kq7.t == null) {
                                            kq7.n.log("OKRTCLmsAdapter", kq7 + ": cant get screen capturer from factory");
                                        } else {
                                            try {
                                                kq7.f(kq7.t.a);
                                                z2 = true;
                                            } catch (RuntimeException e2) {
                                                kq7.n.reportException("OKRTCLmsAdapter", "screen.video.track.create", e2);
                                                z2 = false;
                                            }
                                            if (z2) {
                                                kq7.e();
                                                Size size3 = kq7.B;
                                                DisplayMetrics displayMetrics = kq7.A;
                                                int i15 = displayMetrics.widthPixels;
                                                size3.width = i15;
                                                int i16 = displayMetrics.heightPixels;
                                                size3.height = i16;
                                                Point a2 = jb9.a(i15, i16);
                                                kq7.t.a(a2.x, a2.y);
                                                zuc zuc2 = kq7.t;
                                                zuc2.b.log("ScreenCapturerAdapter", "start");
                                                if (zuc2.d) {
                                                    zuc2.b.log("ScreenCapturerAdapter", "Screen capturer is already started");
                                                } else if (zuc2.c) {
                                                    zuc2.b.log("ScreenCapturerAdapter", "Screen capture session stopped");
                                                } else {
                                                    try {
                                                        zuc2.a.startCapture(zuc2.g, zuc2.f, zuc2.e);
                                                        zuc2.d = true;
                                                    } catch (Exception e3) {
                                                        zuc2.b.reportException("ScreenCapturerAdapter", "screen.capture.start", new RuntimeException("Start screen capture failed", e3));
                                                    }
                                                }
                                                kq7.z.o(true);
                                                kq7.b(new iq7(kq7));
                                            } else {
                                                m5d m5d2 = kq7.D;
                                                if (m5d2 != null) {
                                                    m5d2.b = null;
                                                    ((Handler) m5d2.c).removeCallbacks((gwe) m5d2.o);
                                                    ((kq7) m5d2.X).n.log("OKRTCLmsAdapter", "Periodical screen dimensions check cancelled");
                                                }
                                                kq7.t.b();
                                                kq7.t = null;
                                                kq7.z.o(false);
                                            }
                                        }
                                        Iterator it = kq7.c.iterator();
                                        while (it.hasNext()) {
                                            ((mq7) it.next()).b(kq7);
                                        }
                                    }
                                }
                            }
                        }
                        if (kq7.t != null) {
                            m5d m5d3 = kq7.D;
                            if (m5d3 != null) {
                                m5d3.b = null;
                                ((Handler) m5d3.c).removeCallbacks((gwe) m5d3.o);
                                ((kq7) m5d3.X).n.log("OKRTCLmsAdapter", "Periodical screen dimensions check cancelled");
                            }
                            kq7.t.b();
                            kq7.t = null;
                            kq7.z.o(false);
                            Iterator it2 = kq7.c.iterator();
                            while (it2.hasNext()) {
                                ((mq7) it2.next()).b(kq7);
                            }
                        }
                    }
                    boolean z8 = ji9.b;
                    boolean z9 = ji9.c;
                    fwc fwc = kq7.u;
                    if (fwc == null) {
                        kq7.n.log("OKRTCLmsAdapter", "Data channel screen share sender doesn't exist");
                        return;
                    } else if (!z8 || z9) {
                        if (!z8 && (m5d = kq7.D) != null) {
                            m5d.b = null;
                            ((Handler) m5d.c).removeCallbacks((gwe) m5d.o);
                            ((kq7) m5d.X).n.log("OKRTCLmsAdapter", "Periodical screen dimensions check cancelled");
                        }
                        if (fwc.Z) {
                            fwc.Z = false;
                            fwc.b.c(new dwc(fwc, 1));
                            ((Handler) fwc.b.b).removeCallbacks(fwc.s0);
                            return;
                        }
                        return;
                    } else {
                        kq7.e();
                        Size size4 = kq7.B;
                        DisplayMetrics displayMetrics2 = kq7.A;
                        int i17 = displayMetrics2.widthPixels;
                        size4.width = i17;
                        int i18 = displayMetrics2.heightPixels;
                        size4.height = i18;
                        Size size5 = new Size(i17, i18);
                        if (!fwc.Z && yuc != null) {
                            xs1 xs12 = (xs1) ((r61) yuc).a.getValue();
                            Intent intent4 = xs12.a;
                            xs12.a = null;
                            if (intent4 != null) {
                                fwc.Z = true;
                                fwc.b.c(new ewc(fwc, size5, intent4, 0));
                                ((Handler) fwc.b.b).postDelayed(fwc.s0, 1000);
                            }
                        }
                        kq7.b(fwc);
                        return;
                    }
                } else {
                    return;
                }
            case 23:
                ((g6c) this.c).a = true;
                ((h6c) this.o).removeView((RLottieImageView) this.b);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                a();
                return;
            case 25:
                b();
                return;
            case 26:
                c();
                return;
            case 27:
                d();
                return;
            case 28:
                e();
                return;
            default:
                vlc vlc = (vlc) this.c;
                t19 d = vlc.d();
                d.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM messages WHERE media_type in (");
                Set<Integer> set = (Set) this.o;
                int size6 = set.size();
                a14.c(sb, size6);
                sb.append(")");
                xlc a3 = xlc.a(size6, sb.toString());
                int i19 = 1;
                for (Integer num : set) {
                    if (num == null) {
                        a3.W(i19);
                    } else {
                        a3.j(i19, (long) num.intValue());
                    }
                    i19++;
                }
                ilc ilc = d.a;
                ilc.b();
                Cursor o2 = ilc.o(a3, (CancellationSignal) null);
                try {
                    int n = tfg.n(o2, "id");
                    int n2 = tfg.n(o2, "server_id");
                    int n3 = tfg.n(o2, "time");
                    int n4 = tfg.n(o2, "update_time");
                    int n5 = tfg.n(o2, "sender");
                    int n6 = tfg.n(o2, "cid");
                    int n7 = tfg.n(o2, "text");
                    int n8 = tfg.n(o2, "delivery_status");
                    int n9 = tfg.n(o2, "status");
                    int n10 = tfg.n(o2, "time_local");
                    int n11 = tfg.n(o2, "error");
                    vlc vlc2 = vlc;
                    int n12 = tfg.n(o2, "localized_error");
                    int n13 = tfg.n(o2, "attaches");
                    xlc = a3;
                    try {
                        int n14 = tfg.n(o2, "media_type");
                        int n15 = tfg.n(o2, "detect_share");
                        int n16 = tfg.n(o2, "msg_link_type");
                        int n17 = tfg.n(o2, "msg_link_id");
                        int n18 = tfg.n(o2, "inserted_from_msg_link");
                        int n19 = tfg.n(o2, "msg_link_chat_id");
                        int n20 = tfg.n(o2, "msg_link_chat_name");
                        int n21 = tfg.n(o2, "msg_link_chat_link");
                        int n22 = tfg.n(o2, "msg_link_out_chat_id");
                        int n23 = tfg.n(o2, "msg_link_out_msg_id");
                        int n24 = tfg.n(o2, "type");
                        int n25 = tfg.n(o2, "chat_id");
                        int n26 = tfg.n(o2, "ttl");
                        int n27 = tfg.n(o2, "channel_views");
                        int n28 = tfg.n(o2, "channel_forwards");
                        int n29 = tfg.n(o2, "view_time");
                        int n30 = tfg.n(o2, "zoom");
                        int n31 = tfg.n(o2, "options");
                        int n32 = tfg.n(o2, "live_until");
                        int n33 = tfg.n(o2, "elements");
                        int n34 = tfg.n(o2, "reactions");
                        int n35 = tfg.n(o2, "delayed_attrs_time_to_fire");
                        int n36 = tfg.n(o2, "delayed_attrs_notify_sender");
                        int i20 = n13;
                        ArrayList arrayList2 = new ArrayList(o2.getCount());
                        while (o2.moveToNext()) {
                            long j4 = o2.getLong(n);
                            long j5 = o2.getLong(n2);
                            long j6 = o2.getLong(n3);
                            long j7 = o2.getLong(n4);
                            long j8 = o2.getLong(n5);
                            long j9 = o2.getLong(n6);
                            String string = o2.isNull(n7) ? null : o2.getString(n7);
                            int i21 = o2.getInt(n8);
                            d.a().getClass();
                            iu8.b.getClass();
                            iu8 n37 = oz7.n(i21);
                            int i22 = o2.getInt(n9);
                            d.a().getClass();
                            vx8 b2 = v89.b(i22);
                            long j10 = o2.getLong(n10);
                            String string2 = o2.isNull(n11) ? null : o2.getString(n11);
                            if (o2.isNull(n12)) {
                                i2 = i20;
                                str = null;
                            } else {
                                str = o2.getString(n12);
                                i2 = i20;
                            }
                            byte[] blob = o2.isNull(i2) ? null : o2.getBlob(i2);
                            d.a().getClass();
                            k8g b3 = iz7.b(blob);
                            i20 = i2;
                            int i23 = n14;
                            int i24 = o2.getInt(i23);
                            n14 = i23;
                            int i25 = n15;
                            if (o2.getInt(i25) != 0) {
                                n15 = i25;
                                i3 = n16;
                                z3 = true;
                            } else {
                                n15 = i25;
                                i3 = n16;
                                z3 = false;
                            }
                            int i26 = o2.getInt(i3);
                            n16 = i3;
                            int i27 = n17;
                            long j11 = o2.getLong(i27);
                            n17 = i27;
                            int i28 = n18;
                            if (o2.getInt(i28) != 0) {
                                n18 = i28;
                                i4 = n19;
                                z4 = true;
                            } else {
                                n18 = i28;
                                i4 = n19;
                                z4 = false;
                            }
                            long j12 = o2.getLong(i4);
                            n19 = i4;
                            int i29 = n20;
                            if (o2.isNull(i29)) {
                                n20 = i29;
                                i5 = n21;
                                str2 = null;
                            } else {
                                str2 = o2.getString(i29);
                                n20 = i29;
                                i5 = n21;
                            }
                            if (o2.isNull(i5)) {
                                n21 = i5;
                                i6 = n22;
                                str3 = null;
                            } else {
                                str3 = o2.getString(i5);
                                n21 = i5;
                                i6 = n22;
                            }
                            long j13 = o2.getLong(i6);
                            n22 = i6;
                            int i30 = n23;
                            long j14 = o2.getLong(i30);
                            n23 = i30;
                            int i31 = n24;
                            int i32 = o2.getInt(i31);
                            d.a().getClass();
                            int a4 = ey8.a(i32);
                            n24 = i31;
                            int i33 = n25;
                            long j15 = o2.getLong(i33);
                            n25 = i33;
                            int i34 = n26;
                            int i35 = o2.getInt(i34);
                            n26 = i34;
                            int i36 = n27;
                            int i37 = o2.getInt(i36);
                            n27 = i36;
                            int i38 = n28;
                            int i39 = o2.getInt(i38);
                            n28 = i38;
                            int i40 = n29;
                            long j16 = o2.getLong(i40);
                            n29 = i40;
                            int i41 = n30;
                            int i42 = o2.getInt(i41);
                            n30 = i41;
                            int i43 = n31;
                            int i44 = o2.getInt(i43);
                            n31 = i43;
                            int i45 = n32;
                            long j17 = o2.getLong(i45);
                            n32 = i45;
                            int i46 = n33;
                            byte[] blob2 = o2.isNull(i46) ? null : o2.getBlob(i46);
                            d.a().getClass();
                            List a5 = v89.a(blob2);
                            n33 = i46;
                            int i47 = n34;
                            if (o2.isNull(i47)) {
                                i7 = i47;
                                i8 = n12;
                                bArr = null;
                            } else {
                                i7 = i47;
                                bArr = o2.getBlob(i47);
                                i8 = n12;
                            }
                            ix8 c2 = d.a().c(bArr);
                            int i48 = n35;
                            if (o2.isNull(i48)) {
                                i9 = n36;
                                l = null;
                            } else {
                                l = Long.valueOf(o2.getLong(i48));
                                i9 = n36;
                            }
                            Integer valueOf = o2.isNull(i9) ? null : Integer.valueOf(o2.getInt(i9));
                            if (valueOf == null) {
                                n35 = i48;
                                bool = null;
                            } else {
                                bool = Boolean.valueOf(valueOf.intValue() != 0);
                                n35 = i48;
                            }
                            arrayList2.add(new ru8(j4, j5, j6, j7, j8, j9, string, n37, b2, j10, string2, str, b3, i24, z3, i26, j11, z4, j12, str2, str3, j13, j14, a4, j15, i35, i37, i39, j16, i42, i44, j17, a5, c2, l, bool));
                            n36 = i9;
                            n12 = i8;
                            n34 = i7;
                        }
                        o2.close();
                        xlc.n();
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            ru8 ru8 = (ru8) it3.next();
                            m20 C = ru8.m.C();
                            ((qj3) this.b).accept(C);
                            k8g c3 = C.c();
                            vlc2.d().m(new b6f(ru8.a, c3, iz7.c(c3)));
                        }
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        o2.close();
                        xlc.n();
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    xlc = a3;
                    o2.close();
                    xlc.n();
                    throw th;
                }
        }
    }

    public /* synthetic */ v05(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = obj3;
    }

    public /* synthetic */ v05(Object obj, Executor executor, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = executor;
        this.o = obj2;
    }

    public /* synthetic */ v05(List list, vlc vlc) {
        this.a = 28;
        iu8 iu8 = iu8.READ;
        this.c = list;
        this.o = vlc;
        this.b = iu8;
    }
}
