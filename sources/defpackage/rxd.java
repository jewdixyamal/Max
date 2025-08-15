package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Provider;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.pip.PipScreen;
import one.me.chatmedia.viewer.photo.GifViewerWidget;
import one.me.sdk.arch.Widget;
import ru.ok.tamtam.nano.Protos;

/* renamed from: rxd  reason: default package */
public class rxd implements uq8, y2a, t70, ye1, xo1, qj3, xha, i6d, Provider, cj9, abe, e8, tlf, vt, hlf, agf, q1b, cx1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ rxd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static hqd V(rxd rxd, Context context, int i) {
        rxd.getClass();
        int i2 = tga.j;
        w2e w2e = (w2e) rxd.b;
        return i == i2 ? new jw7(context, w2e, 81, 2) : i == tga.i ? new jw7(context, w2e, 81, 0) : new jw7(context, w2e, 81, 1);
    }

    public xt B(lv4 lv4, Looper looper, wt wtVar, md3 md3) {
        return new xt6(lv4, wtVar, (v24) ((ao0) this.b), md3.a);
    }

    public boolean C(long j) {
        boolean z;
        long j2 = j;
        boolean z2 = false;
        do {
            long f = f();
            if (f == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (i6d i6d : (i6d[]) this.b) {
                long f2 = i6d.f();
                boolean z3 = f2 != Long.MIN_VALUE && f2 <= j2;
                if (f2 == f || z3) {
                    z |= i6d.C(j2);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    public fj9 D(String str) {
        return new o9g(13, (Object) ((lh4) this.b).D(str));
    }

    public void E(VideoSink$VideoSinkException videoSink$VideoSinkException) {
        t88 t88 = (t88) this.b;
        t88.K1 = t88.e(videoSink$VideoSinkException, videoSink$VideoSinkException.a, false, 7001);
    }

    public void F(long j) {
        if (j == 0) {
            ((m1f) this.b).G0 = true;
        }
        ((m1f) this.b).F0 = j;
    }

    public void G(Surface surface) {
        String str = ((GifViewerWidget) this.b).a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str, "Media viewer. Video viewer, set surface " + surface, (Throwable) null);
        }
        dkf p0 = ((GifViewerWidget) this.b).p0();
        if (p0 != null) {
            p0.M0(surface);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: gg1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: gg1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: gg1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: gg1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void H(defpackage.gg1 r5) {
        /*
            r4 = this;
            int r5 = r4.a
            switch(r5) {
                case 5: goto L_0x0062;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r4.b
            mm1 r4 = (defpackage.mm1) r4
            km1 r4 = r4.Y0
            if (r4 == 0) goto L_0x0061
            ui1 r4 = (defpackage.ui1) r4
            yxc r5 = one.me.calls.ui.ui.call.CallScreen.R0
            one.me.calls.ui.ui.call.CallScreen r4 = r4.a
            el1 r4 = r4.D0()
            la1 r5 = r4.s()
            q0e r0 = r4.D0
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            boolean r1 = r5.g
            w7c r2 = r4.w0
            j0e r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            to1 r2 = (defpackage.to1) r2
            gg1 r2 = r2.b
            r3 = 0
            if (r1 == 0) goto L_0x0036
            r2 = r3
            goto L_0x005c
        L_0x0036:
            boolean r5 = r5.m
            if (r5 != 0) goto L_0x003b
            goto L_0x005c
        L_0x003b:
            java.util.Set r5 = r0.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0043:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r5.next()
            r1 = r0
            gg1 r1 = (defpackage.gg1) r1
            boolean r1 = defpackage.tpa.f(r1, r2)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0043
            r3 = r0
        L_0x0059:
            r2 = r3
            gg1 r2 = (defpackage.gg1) r2
        L_0x005c:
            ir1 r4 = r4.c
            r4.j(r2)
        L_0x0061:
            return
        L_0x0062:
            java.lang.Object r4 = r4.b
            m71 r4 = (defpackage.m71) r4
            l71 r4 = r4.J0
            if (r4 == 0) goto L_0x008d
            qqd r4 = (defpackage.qqd) r4
            java.lang.Object r4 = r4.b
            h71 r4 = (defpackage.h71) r4
            g71 r4 = r4.O0
            if (r4 == 0) goto L_0x008d
            ki1 r4 = (defpackage.ki1) r4
            yxc r5 = one.me.calls.ui.ui.call.CallScreen.R0
            one.me.calls.ui.ui.call.CallScreen r4 = r4.a
            el1 r5 = r4.D0()
            uv3 r0 = r4.z0()
            boolean r0 = r0.g
            boolean r5 = r5.q(r0)
            if (r5 == 0) goto L_0x008d
            one.me.calls.ui.ui.call.CallScreen.q0(r4)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxd.H(gg1):void");
    }

    public void I(yha yha) {
        ((cnd) ((tt2) this.b)).b.invoke(yha);
    }

    public void K() {
        m1f m1f = (m1f) this.b;
        m1f.C0 = true;
        m1f.b();
    }

    public void M() {
        ((t88) this.b).L0(0, 1);
    }

    public int M0() {
        gef gef = ((GifViewerWidget) this.b).s0;
        if (gef != null) {
            return gef.getHeight();
        }
        return 0;
    }

    public void N() {
        g71 g71;
        switch (this.a) {
            case 5:
                l71 l71 = ((m71) this.b).J0;
                if (l71 != null && (g71 = ((h71) ((qqd) l71).b).O0) != null) {
                    yxc yxc = CallScreen.R0;
                    ((ki1) g71).a.D0().Z.e();
                    return;
                }
                return;
            default:
                km1 km1 = ((mm1) this.b).Y0;
                if (km1 != null) {
                    yxc yxc2 = CallScreen.R0;
                    ((ui1) km1).a.D0().Z.e();
                    return;
                }
                return;
        }
    }

    public void O() {
        ((m1f) this.b).Y.execute(new nn6(16, this));
    }

    public x6g P(View view, x6g x6g) {
        fm fmVar = (fm) this.b;
        fmVar.getClass();
        WeakHashMap weakHashMap = zmf.a;
        x6g x6g2 = fmVar.getFitsSystemWindows() ? x6g : null;
        if (!Objects.equals(fmVar.u0, x6g2)) {
            fmVar.u0 = x6g2;
            fmVar.setWillNotDraw(!(fmVar.J0 != null && fmVar.getTopInset() > 0));
            fmVar.requestLayout();
        }
        return x6g;
    }

    public void Q(wq8 wq8) {
        uq8 uq8 = ((ActionMenuView) this.b).u0;
        if (uq8 != null) {
            uq8.Q(wq8);
        }
    }

    public int R() {
        gef gef = ((GifViewerWidget) this.b).s0;
        if (gef != null) {
            return gef.getWidth();
        }
        return 0;
    }

    public void S(gg1 gg1) {
        g71 g71;
        switch (this.a) {
            case 5:
                l71 l71 = ((m71) this.b).J0;
                if (l71 != null && (g71 = ((h71) ((qqd) l71).b).O0) != null) {
                    yxc yxc = CallScreen.R0;
                    ((ki1) g71).a.D0().v(gg1);
                    return;
                }
                return;
            default:
                km1 km1 = ((mm1) this.b).Y0;
                if (km1 != null) {
                    yxc yxc2 = CallScreen.R0;
                    ((ui1) km1).a.D0().v(gg1);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [cdg] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.y8 T(defpackage.h08 r6) {
        /*
            r5 = this;
            g08 r6 = r6.a
            java.lang.Object r5 = r5.b
            y7g r5 = (defpackage.y7g) r5
            r5.getClass()
            java.lang.String r0 = "MarkerOptions must not be null."
            defpackage.fp3.o(r6, r0)     // Catch:{ RemoteException -> 0x004e }
            java.lang.Object r5 = r5.b     // Catch:{ RemoteException -> 0x004e }
            eig r5 = (defpackage.eig) r5     // Catch:{ RemoteException -> 0x004e }
            android.os.Parcel r0 = r5.G0()     // Catch:{ RemoteException -> 0x004e }
            defpackage.agg.b(r0, r6)     // Catch:{ RemoteException -> 0x004e }
            r1 = 11
            android.os.Parcel r5 = r5.R(r0, r1)     // Catch:{ RemoteException -> 0x004e }
            android.os.IBinder r0 = r5.readStrongBinder()     // Catch:{ RemoteException -> 0x004e }
            int r1 = defpackage.kfg.d     // Catch:{ RemoteException -> 0x004e }
            r1 = 0
            if (r0 != 0) goto L_0x002a
            r3 = r1
            goto L_0x003d
        L_0x002a:
            java.lang.String r2 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
            android.os.IInterface r3 = r0.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x004e }
            boolean r4 = r3 instanceof defpackage.lfg     // Catch:{ RemoteException -> 0x004e }
            if (r4 == 0) goto L_0x0037
            lfg r3 = (defpackage.lfg) r3     // Catch:{ RemoteException -> 0x004e }
            goto L_0x003d
        L_0x0037:
            jfg r3 = new jfg     // Catch:{ RemoteException -> 0x004e }
            r4 = 3
            r3.<init>(r0, r2, r4)     // Catch:{ RemoteException -> 0x004e }
        L_0x003d:
            r5.recycle()     // Catch:{ RemoteException -> 0x004e }
            if (r3 == 0) goto L_0x0056
            int r5 = r6.B0     // Catch:{ RemoteException -> 0x004e }
            r6 = 1
            if (r5 != r6) goto L_0x0050
            hc r5 = new hc     // Catch:{ RemoteException -> 0x004e }
            r5.<init>(r3)     // Catch:{ RemoteException -> 0x004e }
        L_0x004c:
            r1 = r5
            goto L_0x0056
        L_0x004e:
            r5 = move-exception
            goto L_0x005c
        L_0x0050:
            b08 r5 = new b08     // Catch:{ RemoteException -> 0x004e }
            r5.<init>(r3)     // Catch:{ RemoteException -> 0x004e }
            goto L_0x004c
        L_0x0056:
            y8 r5 = new y8
            r5.<init>((java.lang.Object) r1)
            return r5
        L_0x005c:
            com.google.android.gms.maps.model.RuntimeRemoteException r6 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxd.T(h08):y8");
    }

    public void U() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(((HashMap) this.b).values());
            ((HashMap) this.b).clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            g05 g05 = (g05) arrayList.get(i);
            if (g05 != null) {
                g05.close();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized defpackage.g05 W(defpackage.tpd r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.Object r0 = r5.b     // Catch:{ all -> 0x0047 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0047 }
            g05 r0 = (defpackage.g05) r0     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0049
            monitor-enter(r0)     // Catch:{ all -> 0x0047 }
            boolean r1 = defpackage.g05.m0(r0)     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x003e
            java.lang.Object r1 = r5.b     // Catch:{ all -> 0x003c }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x003c }
            r1.remove(r6)     // Catch:{ all -> 0x003c }
            java.lang.Class<rxd> r1 = defpackage.rxd.class
            java.lang.String r2 = "Found closed reference %d for key %s (%d)"
            int r3 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x003c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x003c }
            java.lang.String r4 = r6.a     // Catch:{ all -> 0x003c }
            int r6 = java.lang.System.identityHashCode(r6)     // Catch:{ all -> 0x003c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x003c }
            java.lang.Object[] r6 = new java.lang.Object[]{r3, r4, r6}     // Catch:{ all -> 0x003c }
            defpackage.ta5.j(r1, r2, r6)     // Catch:{ all -> 0x003c }
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            monitor-exit(r5)
            r5 = 0
            return r5
        L_0x003c:
            r6 = move-exception
            goto L_0x0045
        L_0x003e:
            g05 r6 = defpackage.g05.a(r0)     // Catch:{ all -> 0x003c }
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            r0 = r6
            goto L_0x0049
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r6     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r6 = move-exception
            goto L_0x004b
        L_0x0049:
            monitor-exit(r5)
            return r0
        L_0x004b:
            monitor-exit(r5)     // Catch:{ all -> 0x0047 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxd.W(tpd):g05");
    }

    public o9g X() {
        y7g y7g = (y7g) this.b;
        y7g.getClass();
        try {
            eig eig = (eig) y7g.b;
            Parcel R = eig.R(eig.G0(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i = agg.a;
            CameraPosition cameraPosition = (CameraPosition) (R.readInt() == 0 ? null : creator.createFromParcel(R));
            R.recycle();
            return new o9g(7, (Object) cameraPosition);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public int Y() {
        y7g y7g = (y7g) this.b;
        y7g.getClass();
        try {
            eig eig = (eig) y7g.b;
            Parcel R = eig.R(eig.G0(), 15);
            int readInt = R.readInt();
            R.recycle();
            if (readInt == 0) {
                return 0;
            }
            if (readInt == 1) {
                return 1;
            }
            int i = 2;
            if (readInt != 2) {
                i = 3;
                if (readInt != 3) {
                    i = 4;
                    if (readInt != 4) {
                        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unknown google map type = %d", Arrays.copyOf(new Object[]{Integer.valueOf(readInt)}, 1)));
                    }
                }
            }
            return i;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void Z() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public boolean a() {
        for (i6d a2 : (i6d[]) this.b) {
            if (a2.a()) {
                return true;
            }
        }
        return false;
    }

    public synchronized void a0() {
        ta5.d(rxd.class, Integer.valueOf(((HashMap) this.b).size()), "Count = %d");
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 8:
                v6f v6f = (v6f) obj;
                s12 s12 = (s12) this.b;
                s12.getClass();
                if (v6f.a()) {
                    String str = v6f.h.a;
                    e8d e8d = s12.a;
                    if (e8d == null) {
                        e8d = null;
                    }
                    long j = s12.o;
                    e52 e52 = (e52) ((jz2) ((iy2) e8d.J.getValue())).m(j).a.getValue();
                    if (e52 != null) {
                        tq2 tq2 = r2;
                        tq2 tq22 = new tq2(e52.b.a, 0, (String) null, false, (String) null, (HashMap) null, (String) null, str, s12.X, (Long) null, false, 0);
                        hc3 hc3 = s12.s0;
                        if (hc3 != null) {
                            drd K = ((k4a) s12.a()).K(tq2, ((jle) s12.q()).a());
                            e8d e8d2 = s12.a;
                            if (e8d2 == null) {
                                e8d2 = null;
                            }
                            fme fme = (fme) e8d2.I.getValue();
                            fme.getClass();
                            ds5 j2 = K.j(new dme(fme, 3, 0));
                            iq1 iq1 = new iq1(new y8((Object) s12), 2, new bkg(7, s12));
                            j2.k(iq1);
                            hc3.a(iq1);
                            return;
                        }
                        return;
                    }
                    hm9.p(s12.Z, ey8.h(j, "updateChatAvatar: chat not found, chatId="), (Throwable) null);
                    s12.y();
                    return;
                }
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                Integer num = (Integer) obj;
                r44 r44 = (r44) this.b;
                r44.getClass();
                r44.b.run();
                return;
            default:
                for (iy8 d : (List) obj) {
                    ((dg5) ((jy8) this.b).c.getValue()).d(d);
                }
                return;
        }
    }

    public void b() {
        PipScreen pipScreen = (PipScreen) this.b;
        if (pipScreen.getRouter().n()) {
            im requireActivity = pipScreen.requireActivity();
            Intent intent = new Intent(pipScreen.requireActivity(), pipScreen.requireActivity().getClass());
            intent.setFlags(131072);
            requireActivity.startActivity(intent);
            return;
        }
        pipScreen.requireActivity().finish();
    }

    public void b0(pw1 pw1) {
        urb urb = ((rrb) this.b).o;
        if (urb == null) {
            urb = null;
        }
        urb.getClass();
        hm9.q("QuickCameraViewModel", "onCameraError", pw1);
    }

    public void c(VideoFrameProcessingException videoFrameProcessingException) {
        m1f m1f = (m1f) this.b;
        m1f.getClass();
        m1f.Y.execute(new vs5(m1f, 28, videoFrameProcessingException));
    }

    public synchronized void c0(ww0 ww0, g05 g05) {
        ww0.getClass();
        if (g05.m0(g05)) {
            g05.d((g05) ((HashMap) this.b).put(ww0, g05.a(g05)));
            a0();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void d() {
        g71 g71;
        l71 l71 = ((m71) this.b).J0;
        if (l71 != null && (g71 = ((h71) ((qqd) l71).b).O0) != null) {
            yxc yxc = CallScreen.R0;
            CallScreen callScreen = ((ki1) g71).a;
            callScreen.y0().d(3, 2);
            String str = o37.a;
            o37.d(callScreen.getContext(), c37.D(callScreen.D0().s().k), (Uri) null);
        }
    }

    /* JADX INFO: finally extract failed */
    public synchronized void d0(ww0 ww0, g05 g05) {
        ww0.getClass();
        g05.getClass();
        if (g05.m0(g05)) {
            g05 g052 = (g05) ((HashMap) this.b).get(ww0);
            if (g052 != null) {
                o43 o = o43.o(g052.a);
                o43 o2 = o43.o(g05.a);
                if (!(o == null || o2 == null)) {
                    try {
                        if (o.e0() == o2.e0()) {
                            ((HashMap) this.b).remove(ww0);
                            o43.S(o2);
                            o43.S(o);
                            g05.d(g052);
                            a0();
                            return;
                        }
                    } catch (Throwable th) {
                        o43.S(o2);
                        o43.S(o);
                        g05.d(g052);
                        throw th;
                    }
                }
                o43.S(o2);
                o43.S(o);
                g05.d(g052);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void e() {
        g71 g71;
        l71 l71 = ((m71) this.b).J0;
        if (l71 != null && (g71 = ((h71) ((qqd) l71).b).O0) != null) {
            yxc yxc = CallScreen.R0;
            CallScreen callScreen = ((ki1) g71).a;
            callScreen.y0().d(1, 2);
            tpa.o(callScreen.getContext(), c37.D(callScreen.D0().s().k));
            if (tpa.s()) {
                String string = callScreen.getContext().getString(f0c.call_link_share_dialog_share_link_copy);
                wha wha = new wha((Widget) callScreen);
                wha.h(string);
                wha.d(new ho1(3, (k56) null));
                wha.c(new eia(0, 0, 0, 3));
                wha.i();
            }
        }
    }

    public void e0(boolean z) {
        y7g y7g = (y7g) this.b;
        y7g.getClass();
        try {
            eig eig = (eig) y7g.b;
            Parcel G0 = eig.G0();
            int i = agg.a;
            G0.writeInt(z ? 1 : 0);
            eig.H0(G0, 22);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public long f() {
        long j = Long.MAX_VALUE;
        for (i6d f : (i6d[]) this.b) {
            long f2 = f.f();
            if (f2 != Long.MIN_VALUE) {
                j = Math.min(j, f2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public void f0() {
        View view;
        View view2 = (View) this.b;
        if (view2 != null) {
            if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
                view2.requestFocus();
                view = view2;
            } else {
                view = view2.getRootView().findFocus();
            }
            if (view == null) {
                view = view2.getRootView().findViewById(16908290);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new mg(view, 6));
            }
        }
    }

    public int g(long j) {
        return -1;
    }

    public Object get() {
        return ((k56) this.b).invoke();
    }

    public void h() {
        g71 g71;
        l71 l71 = ((m71) this.b).J0;
        if (l71 != null && (g71 = ((h71) ((qqd) l71).b).O0) != null) {
            yxc yxc = CallScreen.R0;
            ((ki1) g71).a.D0().r();
        }
    }

    public long i(int i) {
        return 0;
    }

    public int j() {
        gef gef = ((GifViewerWidget) this.b).s0;
        return 2;
    }

    public void m() {
        g71 g71;
        l71 l71 = ((m71) this.b).J0;
        if (l71 != null && (g71 = ((h71) ((qqd) l71).b).O0) != null) {
            yxc yxc = CallScreen.R0;
            CallScreen callScreen = ((ki1) g71).a;
            callScreen.y0().d(2, 2);
            el1 D0 = callScreen.D0();
            D0.getClass();
            pnf.o(D0.M0, new qj1(c37.D(D0.s().k)));
        }
    }

    public void o(int i, int i2) {
        ((m1f) this.b).Y.execute(new ft0(this, i, i2, 2));
    }

    public void onFirstFrameRendered() {
        t88 t88 = (t88) this.b;
        fm9.l(t88.d2);
        Surface surface = t88.d2;
        aab aab = t88.S1;
        Handler handler = (Handler) aab.a;
        if (handler != null) {
            handler.post(new tb2((Object) aab, (Object) surface, SystemClock.elapsedRealtime(), 8));
        }
        t88.g2 = true;
    }

    public void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String str = ((GifViewerWidget) this.b).a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str, "Media viewer. Video viewer, surface destroyed " + surfaceTexture, (Throwable) null);
        }
    }

    public List p(long j) {
        return (List) this.b;
    }

    public long r() {
        long j = Long.MAX_VALUE;
        for (i6d r : (i6d[]) this.b) {
            long r2 = r.r();
            if (r2 != Long.MIN_VALUE) {
                j = Math.min(j, r2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public void t(long j) {
        for (i6d t : (i6d[]) this.b) {
            t.t(j);
        }
    }

    public int u() {
        return 1;
    }

    public void v(gg1 gg1, Point point) {
        g71 g71;
        gg1 gg12;
        km1 km1;
        switch (this.a) {
            case 5:
                l71 l71 = ((m71) this.b).J0;
                if (l71 != null && (g71 = ((h71) ((qqd) l71).b).O0) != null) {
                    yxc yxc = CallScreen.R0;
                    ((ki1) g71).a.D0().x(gg1, point);
                    return;
                }
                return;
            default:
                mm1 mm1 = (mm1) this.b;
                qma qma = mm1.W0;
                if (qma != null && (gg12 = qma.c) != null && (km1 = mm1.Y0) != null) {
                    yxc yxc2 = CallScreen.R0;
                    ((ui1) km1).a.D0().x(gg12, (Point) null);
                    return;
                }
                return;
        }
    }

    public zw6 w(int i) {
        return ((lh4) this.b).w(i);
    }

    public void x(Object obj) {
        a c;
        d8 d8Var = (d8) obj;
        c cVar = (c) this.b;
        i16 i16 = (i16) cVar.F.pollFirst();
        if (i16 != null && (c = cVar.c.c(i16.a)) != null) {
            c.s0(i16.b, d8Var.a, d8Var.b);
        }
    }

    public void y(gg1 gg1) {
        g71 g71;
        switch (this.a) {
            case 5:
                l71 l71 = ((m71) this.b).J0;
                if (l71 != null && (g71 = ((h71) ((qqd) l71).b).O0) != null) {
                    yxc yxc = CallScreen.R0;
                    ((ki1) g71).a.D0().Z.c(gg1);
                    return;
                }
                return;
            default:
                km1 km1 = ((mm1) this.b).Y0;
                if (km1 != null) {
                    yxc yxc2 = CallScreen.R0;
                    ((ui1) km1).a.D0().Z.c(gg1);
                    return;
                }
                return;
        }
    }

    public boolean z(wq8 wq8, MenuItem menuItem) {
        boolean z;
        boolean z2;
        h7 h7Var = ((ActionMenuView) this.b).z0;
        if (h7Var == null) {
            return false;
        }
        Toolbar toolbar = (Toolbar) ((bkg) h7Var).b;
        Iterator it = ((CopyOnWriteArrayList) toolbar.U0.b).iterator();
        while (true) {
            if (it.hasNext()) {
                if (((e16) it.next()).a.p(menuItem)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            z2 = true;
        } else {
            kwe kwe = toolbar.W0;
            z2 = kwe != null ? kwe.onMenuItemClick(menuItem) : false;
        }
        return z2;
    }

    public rxd(xr6 xr6) {
        this.a = 4;
        fp3.n(xr6);
        this.b = xr6;
    }

    public rxd(int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = new lh4(4);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                this.b = (ExtraSupportedSurfaceCombinationsQuirk) zi4.a.e(ExtraSupportedSurfaceCombinationsQuirk.class);
                return;
            default:
                return;
        }
    }

    public rxd(CameraDevice cameraDevice) {
        this.a = 7;
        cameraDevice.getClass();
        this.b = new dle(cameraDevice, (tfg) null);
    }
}
