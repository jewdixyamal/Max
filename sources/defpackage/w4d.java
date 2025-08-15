package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: w4d  reason: default package */
public class w4d implements ah9, e71, cm1, abe, y2a, s7c, do7, wm4, e8, a76, obe, qfd, co7, zu6 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ w4d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void A(String str) {
        h2e h2e = (h2e) this.b;
        h2e.c(h2e.f, new File(str));
    }

    public b11 C(go7 go7, long j, long j2, IOException iOException, int i) {
        bqa bqa = (bqa) go7;
        y14 y14 = (y14) this.b;
        y14.getClass();
        long j3 = bqa.a;
        Uri uri = bqa.o.c;
        y14.q.C(new yn7(j2), bqa.c, iOException, true);
        y14.m.getClass();
        y14.x(iOException);
        return vq7.Y;
    }

    public l4 D(int i) {
        return null;
    }

    public l4 E(int i) {
        return null;
    }

    public boolean F(CharSequence charSequence, pva pva) {
        String str = pva.b;
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = ((qqd) this.b).w(str).matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        return matcher.matches();
    }

    public void G(byte[] bArr, int i, int i2, nbe nbe, pj3 pj3) {
        yz3 yz3;
        wpa wpa = (wpa) this.b;
        wpa.E(i2 + i, bArr);
        wpa.G(i);
        ArrayList arrayList = new ArrayList();
        while (wpa.a() > 0) {
            fm9.e("Incomplete Mp4Webvtt Top Level box header found.", wpa.a() >= 8);
            int g = wpa.g();
            if (wpa.g() == 1987343459) {
                int i3 = g - 8;
                CharSequence charSequence = null;
                wz3 wz3 = null;
                while (i3 > 0) {
                    fm9.e("Incomplete vtt cue box header found.", i3 >= 8);
                    int g2 = wpa.g();
                    int g3 = wpa.g();
                    int i4 = g2 - 8;
                    byte[] bArr2 = wpa.a;
                    int i5 = wpa.b;
                    int i6 = oaf.a;
                    String str = new String(bArr2, i5, i4, b52.c);
                    wpa.H(i4);
                    i3 = (i3 - 8) - i4;
                    if (g3 == 1937011815) {
                        o4g o4g = new o4g();
                        q4g.e(str, o4g);
                        wz3 = o4g.b();
                    } else if (g3 == 1885436268) {
                        charSequence = q4g.f((String) null, str.trim(), Collections.emptyList());
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (wz3 != null) {
                    wz3.a = charSequence;
                    yz3 = wz3.a();
                } else {
                    Pattern pattern = q4g.a;
                    o4g o4g2 = new o4g();
                    o4g2.c = charSequence;
                    yz3 = o4g2.b().a();
                }
                arrayList.add(yz3);
            } else {
                wpa.H(g - 8);
            }
        }
        pj3.accept(new b04(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public void H(Exception exc) {
        fm9.c("Audio sink error", exc);
        ph4 ph4 = ((u78) this.b).R1;
        Handler handler = (Handler) ph4.a;
        if (handler != null) {
            handler.post(new x60(ph4, exc, 1));
        }
    }

    public void I(Object obj, boolean z) {
        ww0 ww0 = (ww0) obj;
        die die = (die) this.b;
        synchronized (die) {
            if (z) {
                try {
                    ((LinkedHashSet) die.o).add(ww0);
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            } else {
                ((LinkedHashSet) die.o).remove(ww0);
            }
        }
    }

    public int J() {
        return 2;
    }

    public boolean K(int i, int i2, Bundle bundle) {
        return false;
    }

    public Long L(Long l) {
        if (l.longValue() < 0) {
            this.b = null;
            return null;
        }
        Long l2 = (Long) this.b;
        this.b = l;
        if (l2 != null && l.longValue() >= l2.longValue()) {
            return Long.valueOf(l.longValue() - l2.longValue());
        }
        return null;
    }

    public x6g P(View view, x6g x6g) {
        w53 w53 = (w53) this.b;
        w53.getClass();
        WeakHashMap weakHashMap = zmf.a;
        x6g x6g2 = w53.getFitsSystemWindows() ? x6g : null;
        if (!Objects.equals(w53.O0, x6g2)) {
            w53.O0 = x6g2;
            w53.requestLayout();
        }
        return x6g.a.c();
    }

    public Object T0(Object obj, bc7 bc7) {
        return (x77) ((AtomicReference) this.b).get();
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
    }

    public void b() {
        u5e u5e = (u5e) ((zm4) this.b).e;
        u5e.getClass();
        bc7[] bc7Arr = VideoViewerWidget.u0;
        dmf o0 = ((VideoViewerWidget) u5e.a).o0();
        if (o0 != null) {
            ((ChatMediaViewerScreen) o0).G0(true);
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c() {
        /*
            r4 = this;
            java.lang.Object r4 = r4.b
            h71 r4 = (defpackage.h71) r4
            androidx.viewpager2.widget.ViewPager2 r4 = r4.J0
            int r0 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            r3 = 0
            if (r2 == 0) goto L_0x0016
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L_0x0017
        L_0x0016:
            r1 = r3
        L_0x0017:
            r2 = 0
            if (r1 == 0) goto L_0x001d
            int r1 = r1.topMargin
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            int r0 = r0 - r1
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r1 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x002a
            r3 = r4
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
        L_0x002a:
            if (r3 == 0) goto L_0x002e
            int r2 = r3.bottomMargin
        L_0x002e:
            int r0 = r0 - r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w4d.c():int");
    }

    public void d(Throwable th) {
        ((ut6) this.b).close();
    }

    public void e(long j, boolean z) {
        ((a66) this.b).invoke(Long.valueOf(j), Boolean.valueOf(z));
    }

    public void f(int i) {
        zm4.a((zm4) this.b, true, i * 10);
    }

    public int g(long j) {
        return j < 0 ? 0 : -1;
    }

    public void h() {
        c50.f((c50) this.b);
    }

    public long i(int i) {
        np8.d(i == 0);
        return 0;
    }

    public void j() {
        c50.f((c50) this.b);
    }

    public void k() {
        h2e h2e = (h2e) this.b;
        h2e.b(h2e.f, new Exception("onDownloadFailed"));
    }

    public void l() {
        c50.f((c50) this.b);
    }

    public void m(go7 go7, long j, long j2, boolean z) {
        ((y14) this.b).w((bqa) go7, j, j2);
    }

    public void o(fo7 fo7, long j, long j2, boolean z) {
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, java.util.function.BinaryOperator] */
    public void o1(Object obj, bc7 bc7, Object obj2) {
        x77 x77 = (x77) ((AtomicReference) this.b).accumulateAndGet((x77) obj2, new Object());
        if (x77 != null) {
            x77.start();
        }
    }

    public List p(long j) {
        return j >= 0 ? (List) this.b : Collections.emptyList();
    }

    public void q() {
        c50.f((c50) this.b);
    }

    public void r() {
        c50.f((c50) this.b);
    }

    public void s() {
        c50.f((c50) this.b);
    }

    public void t() {
        c50.f((c50) this.b);
    }

    public String toString() {
        switch (this.a) {
            case 27:
                return wg0.g(((long[]) this.b).length, "Subject{organizationIds=", "}");
            default:
                return super.toString();
        }
    }

    public int u() {
        return 1;
    }

    public void v(go7 go7, long j, long j2) {
        bqa bqa = (bqa) go7;
        y14 y14 = (y14) this.b;
        y14.getClass();
        long j3 = bqa.a;
        Uri uri = bqa.o.c;
        yn7 yn7 = new yn7(j2);
        y14.m.getClass();
        y14.q.z(yn7, bqa.c, -1, (qy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        y14.L = ((Long) bqa.Y).longValue() - j;
        y14.y(true);
    }

    public void x(Object obj) {
        a c;
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        c cVar = (c) this.b;
        i16 i16 = (i16) cVar.F.pollFirst();
        if (i16 != null && (c = cVar.c.c(i16.a)) != null) {
            c.J0(i16.b, strArr, iArr);
        }
    }

    public void y(fo7 fo7, long j, long j2) {
        boolean z;
        y8 y8Var = (y8) this.b;
        if (y8Var != null) {
            synchronized (nu0.A0) {
                z = nu0.B0;
            }
            if (!z) {
                IOException iOException = new IOException(new ConcurrentModificationException());
                x14 x14 = (x14) y8Var.a;
                x14.getClass();
                fm9.c("Failed to resolve time offset.", iOException);
                x14.s(true);
                return;
            }
            y8Var.y();
        }
    }

    public b11 z(fo7 fo7, long j, long j2, IOException iOException, int i) {
        y8 y8Var = (y8) this.b;
        if (y8Var != null) {
            x14 x14 = (x14) y8Var.a;
            x14.getClass();
            fm9.c("Failed to resolve time offset.", iOException);
            x14.s(true);
        }
        return jo7.X;
    }

    public /* synthetic */ w4d(int i, boolean z) {
        this.a = i;
    }

    public w4d(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = 0;
        this.b = oneMeRoomDatabase;
        new sh(oneMeRoomDatabase, 22);
    }

    public w4d(bj6 bj6) {
        this.a = 29;
        this.b = (TorchFlashRequiredFor3aUpdateQuirk) bj6.e(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public w4d(int i) {
        this.a = i;
        switch (i) {
            case 20:
                this.b = new wpa();
                return;
            case 22:
                this.b = new qqd(100);
                return;
            default:
                this.b = new m4(this);
                return;
        }
    }

    public w4d(je3 je3) {
        this.a = 28;
        this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), je3);
    }

    public w4d(v4 v4Var) {
        this.a = 21;
        this.b = new khe(new ot2(v4Var, 11));
    }
}
