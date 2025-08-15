package defpackage;

import android.app.Activity;
import android.hardware.camera2.CameraCharacteristics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;

/* renamed from: ync  reason: default package */
public final /* synthetic */ class ync implements NativeDoubleArrayConsumer.Consumer, o3a, qj3, mq1, o1d, za7, m7a, gp1, VideoTracker, CallsAudioManager.OnAudioDeviceInfoChangeListener, wu, pv6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ync(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 18:
                no1.I((no1) obj, z);
                return;
            default:
                ap1.w((ap1) obj, z);
                return;
        }
    }

    public void accept(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 3:
                Long l = (Long) obj;
                rz rzVar = (rz) this.b;
                LiveVideoPlaceHolderView liveVideoPlaceHolderView = rzVar.s;
                if (liveVideoPlaceHolderView != null && liveVideoPlaceHolderView.getVisibility() == 0) {
                    if (!s5c.b0(((y8a) vl.b()).n(), rzVar.i)) {
                        rzVar.s.setVisibility(8);
                    } else {
                        rzVar.s.x();
                    }
                    qz qzVar = rzVar.h;
                    if (qzVar != null) {
                        qzVar.g();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Throwable th = (Throwable) obj;
                hm9.p("l00", "Can't download attach", (Throwable) null);
                ((l00) this.b).a.C(false);
                return;
            case 5:
                ((hc3) this.b).a((zl4) obj);
                return;
            case 6:
                ((Map) this.b).putAll((Map) obj);
                return;
            case 7:
                j10 j10 = (j10) obj;
                if (j10.e != null) {
                    z = true;
                }
                if (!z && j10.d == null && j10.r == null) {
                    hm9.p("t20", "Attach is not audio/video/file. Ignore", (Throwable) null);
                    return;
                } else if (j10.x == z10.c) {
                    hm9.p("t20", "Try to update processingOnServerStatus from PROCESSED. Ignore", (Throwable) null);
                    return;
                } else {
                    j10.x = (z10) this.b;
                    return;
                }
            case 9:
                xi0 xi0 = (xi0) this.b;
                xi0.a.G((sn0) obj);
                xi0.a.I();
                return;
            default:
                fd1 fd1 = (fd1) this.b;
                List list = (List) obj;
                synchronized (fd1) {
                    hm9.m("fd1", "onLoaded: " + list.size(), new Object[0]);
                    Iterator it = fd1.e.iterator();
                    if (it.hasNext()) {
                        au1.r(it.next());
                        throw null;
                    }
                }
                return;
        }
    }

    public bm7 apply(Object obj) {
        su1 su1 = (su1) this.b;
        su1.getClass();
        if (!Boolean.TRUE.equals((Boolean) obj)) {
            return dw6.c;
        }
        long j = su1.g;
        un0 un0 = new un0(11);
        long millis = TimeUnit.NANOSECONDS.toMillis(j);
        uu1 uu1 = new uu1(un0);
        st1 st1 = su1.d;
        st1.p(uu1);
        wt1 wt1 = new wt1(st1, 4, uu1);
        oq1 oq1 = uu1.b;
        oq1.b.d(wt1, st1.c);
        return f8.g(new vg4(oq1, su1.c, millis));
    }

    public Object b(CameraCharacteristics.Key key) {
        return ((xv1) this.b).a(key);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x012f, code lost:
        r11 = (defpackage.yz0) ((defpackage.ez0) r11.r0().t0.getValue());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(int r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            bc7[] r2 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.H0
            int r2 = defpackage.y7a.f1
            java.lang.Object r11 = r11.b
            one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget r11 = (one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget) r11
            if (r12 != r2) goto L_0x0031
            of1 r11 = r11.r0()
            r11.getClass()
            ej1 r12 = new ej1
            ir1 r0 = r11.Y
            q0e r0 = r0.b()
            java.lang.Object r0 = r0.getValue()
            d04 r0 = (defpackage.d04) r0
            java.lang.String r0 = r0.d
            java.lang.String r0 = defpackage.c37.D(r0)
            r12.<init>(r0)
            s35 r11 = r11.E0
            defpackage.pnf.o(r11, r12)
            goto L_0x0150
        L_0x0031:
            int r2 = defpackage.y7a.d1
            if (r12 != r2) goto L_0x0082
            of1 r11 = r11.r0()
            b31 r12 = r11.b
            l31 r12 = (defpackage.l31) r12
            q0e r12 = r12.k
            java.lang.Object r12 = r12.getValue()
            y21 r12 = (defpackage.y21) r12
            java.lang.Long r12 = r12.a
            if (r12 == 0) goto L_0x0150
            long r2 = r12.longValue()
            je7 r12 = r11.w0
            java.lang.Object r12 = r12.getValue()
            q33 r12 = (defpackage.q33) r12
            t33 r12 = (defpackage.t33) r12
            ne7 r12 = r12.g
            java.lang.String r0 = "app.call.add.dontshowconfirmation"
            boolean r12 = r12.getBoolean(r0, r1)
            s35 r11 = r11.E0
            if (r12 == 0) goto L_0x007b
            je1 r12 = defpackage.je1.c
            r12.getClass()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = ":profile/add-members?chat_id="
            r12.<init>(r0)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            defpackage.wg0.k(r12, r11)
            goto L_0x0150
        L_0x007b:
            gj1 r12 = defpackage.gj1.D
            defpackage.pnf.o(r11, r12)
            goto L_0x0150
        L_0x0082:
            int r2 = defpackage.y7a.e1
            if (r12 != r2) goto L_0x00ab
            of1 r11 = r11.r0()
            r11.getClass()
            qj1 r12 = new qj1
            ir1 r0 = r11.Y
            q0e r0 = r0.b()
            java.lang.Object r0 = r0.getValue()
            d04 r0 = (defpackage.d04) r0
            java.lang.String r0 = r0.d
            java.lang.String r0 = defpackage.c37.D(r0)
            r12.<init>(r0)
            s35 r11 = r11.E0
            defpackage.pnf.o(r11, r12)
            goto L_0x0150
        L_0x00ab:
            int r2 = defpackage.y7a.b
            rd8 r3 = defpackage.rd8.b
            if (r12 != r2) goto L_0x00eb
            of1 r11 = r11.r0()
            je7 r12 = r11.t0
            java.lang.Object r12 = r12.getValue()
            ez0 r12 = (defpackage.ez0) r12
            yz0 r12 = (defpackage.yz0) r12
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r4 = r12.e()
            if (r4 == 0) goto L_0x00e3
            ky7 r1 = new ky7
            r1.<init>()
            qd8 r2 = defpackage.qd8.b
            r1.put(r2, r3)
            ky7 r5 = r1.b()
            kz0 r7 = new kz0
            r7.<init>(r12, r0)
            lz0 r8 = new lz0
            r8.<init>(r12, r0)
            r6 = 0
            r9 = 2
            r10 = 0
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.updateMediaOptionsForAll$default(r4, r5, r6, r7, r8, r9, r10)
        L_0x00e3:
            aj1 r12 = defpackage.aj1.D
            s35 r11 = r11.E0
            defpackage.pnf.o(r11, r12)
            goto L_0x0150
        L_0x00eb:
            int r0 = defpackage.y7a.d
            if (r12 != r0) goto L_0x012b
            of1 r11 = r11.r0()
            je7 r12 = r11.t0
            java.lang.Object r12 = r12.getValue()
            ez0 r12 = (defpackage.ez0) r12
            yz0 r12 = (defpackage.yz0) r12
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r4 = r12.e()
            if (r4 == 0) goto L_0x0123
            ky7 r0 = new ky7
            r0.<init>()
            qd8 r1 = defpackage.qd8.a
            r0.put(r1, r3)
            ky7 r5 = r0.b()
            kz0 r7 = new kz0
            r0 = 4
            r7.<init>(r12, r0)
            lz0 r8 = new lz0
            r0 = 2
            r8.<init>(r12, r0)
            r6 = 0
            r9 = 2
            r10 = 0
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.updateMediaOptionsForAll$default(r4, r5, r6, r7, r8, r9, r10)
        L_0x0123:
            aj1 r12 = defpackage.aj1.D
            s35 r11 = r11.E0
            defpackage.pnf.o(r11, r12)
            goto L_0x0150
        L_0x012b:
            int r0 = defpackage.y7a.c
            if (r12 != r0) goto L_0x0150
            of1 r11 = r11.r0()
            je7 r11 = r11.t0
            java.lang.Object r11 = r11.getValue()
            ez0 r11 = (defpackage.ez0) r11
            yz0 r11 = (defpackage.yz0) r11
            ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager r12 = r11.f()
            if (r12 == 0) goto L_0x0150
            kz0 r0 = new kz0
            r0.<init>(r11, r1)
            lz0 r2 = new lz0
            r2.<init>(r11, r1)
            r12.lowerHandForAll(r0, r2)
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ync.c(int):void");
    }

    public void consume(Double[] dArr) {
        ((AtomicInteger) ((kad) ((bg4) this.b).o).Z).incrementAndGet();
    }

    public void d() {
        znc znc = (znc) this.b;
        if (znc.f) {
            Iterator it = znc.e().iterator();
            int i = 0;
            while (it.hasNext()) {
                a3a a3a = ((coc) it.next()).a.onBackPressedCallback;
                int i2 = i + 1;
                boolean z = true;
                if (i <= 0 && znc.e == 1) {
                    z = false;
                }
                a3a.f(z);
                i = i2;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.camera.core.ImageCaptureException, java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r1v2, types: [androidx.camera.core.ImageCaptureException, java.lang.Exception] */
    public void f(qv6 qv6) {
        l84 l84 = (l84) this.b;
        l84.getClass();
        try {
            ov6 g = qv6.g();
            if (g != null) {
                l84.H(g);
                return;
            }
            x9b x9b = (x9b) l84.a;
            if (x9b != null) {
                l84.L(new ec0(x9b.a, new Exception("Failed to acquire latest image", (Throwable) null)));
            }
        } catch (IllegalStateException e) {
            x9b x9b2 = (x9b) l84.a;
            if (x9b2 != null) {
                l84.L(new ec0(x9b2.a, new Exception("Failed to acquire latest image", e)));
            }
        }
    }

    public int i(int i) {
        switch (this.a) {
            case 13:
                h01 h01 = (h01) ((ol7) ((CallAdminSettingsScreen) this.b).c.C(i));
                int a2 = h01.a();
                if (h01.g()) {
                    return a2;
                }
                return 0;
            default:
                return ((jc1) ((ol7) ((CallLinkInfoScreen) this.b).z0.C(i))).v();
        }
    }

    public void onAudioDeviceChanged(CallsAudioManager.AudioDeviceInfoChangedEvent audioDeviceInfoChangedEvent) {
        Object value;
        ti9 ti9 = (ti9) ((ir1) this.b).p.getValue();
        do {
            value = ti9.getValue();
            CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) value;
        } while (!ti9.c(value, audioDeviceInfoChangedEvent.getNewDevice()));
    }

    public void onFailure(Exception exc) {
        up.a.getClass();
        nd7.A((Activity) this.b, tp.b);
    }

    public Object parse(db7 db7) {
        return ((CallAnalyticsApiRequest) this.b).lambda$getOkParser$0(db7);
    }

    public boolean preferSpeakerOverEarpiece() {
        return ((Boolean) ((ni9) ((vb7) this.b)).invoke()).booleanValue();
    }

    public String q(lq1 lq1) {
        switch (this.a) {
            case 8:
                e70 e70 = (e70) this.b;
                e70.a.execute(new c(e70, 10, lq1));
                return "AudioSource-release";
            case 22:
                st1 st1 = (st1) this.b;
                st1.getClass();
                st1.c.execute(new c(st1, 28, lq1));
                return "updateSessionConfigAsync";
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                nu1 nu1 = (nu1) this.b;
                nu1.a.h.d(lq1);
                nu1.b.b = true;
                return "AePreCapture";
            case 25:
                ((pu1) this.b).b.i.c();
                lq1.b((Object) null);
                return "invokePostCaptureFuture";
            default:
                ((uu1) this.b).a = lq1;
                return "waitFor3AResult";
        }
    }
}
