package defpackage;

import android.graphics.Bitmap;
import android.media.Rating;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.Spannable;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.api.http.NoHttpApiEndpointException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: y8  reason: default package */
public final class y8 implements xl7, ws3, JavaAudioDeviceModule.AudioRecordStateCallback, JavaAudioDeviceModule.AudioRecordErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback, JavaAudioDeviceModule.AudioTrackErrorCallback, qj3, vp6, bn4, ah9, isf, a04, lde, w2e {
    public Object a;

    public /* synthetic */ y8(Object obj) {
        this.a = obj;
    }

    public void A(long j, String str) {
        Integer num = (Integer) hd8.c.get(str);
        if (num == null || num.intValue() == 0) {
            ((Bundle) this.a).putLong(str, j);
            return;
        }
        throw new IllegalArgumentException(zr6.i("The ", str, " key cannot be used to put a long"));
    }

    public void B(String str, h5c h5c) {
        Object obj;
        Integer num = (Integer) hd8.c.get(str);
        if (num == null || num.intValue() == 3) {
            if (h5c.c == null) {
                boolean c = h5c.c();
                int i = h5c.a;
                if (c) {
                    boolean z = true;
                    boolean z2 = false;
                    float f = h5c.b;
                    switch (i) {
                        case 1:
                            if (i == 1) {
                                if (f != 1.0f) {
                                    z = false;
                                }
                                z2 = z;
                            }
                            h5c.c = Rating.newHeartRating(z2);
                            break;
                        case 2:
                            if (i == 2) {
                                if (f != 1.0f) {
                                    z = false;
                                }
                                z2 = z;
                            }
                            h5c.c = Rating.newThumbRating(z2);
                            break;
                        case 3:
                        case 4:
                        case 5:
                            h5c.c = Rating.newStarRating(i, h5c.b());
                            break;
                        case 6:
                            if (i != 6 || !h5c.c()) {
                                f = -1.0f;
                            }
                            h5c.c = Rating.newPercentageRating(f);
                            break;
                        default:
                            obj = null;
                            break;
                    }
                } else {
                    h5c.c = Rating.newUnratedRating(i);
                }
            }
            obj = h5c.c;
            ((Bundle) this.a).putParcelable(str, (Parcelable) obj);
            return;
        }
        throw new IllegalArgumentException(zr6.i("The ", str, " key cannot be used to put a Rating"));
    }

    public void C(String str, String str2) {
        Integer num = (Integer) hd8.c.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.a).putCharSequence(str, str2);
            return;
        }
        throw new IllegalArgumentException(zr6.i("The ", str, " key cannot be used to put a String"));
    }

    public void D(String str, CharSequence charSequence) {
        Integer num = (Integer) hd8.c.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.a).putCharSequence(str, charSequence);
            return;
        }
        throw new IllegalArgumentException(zr6.i("The ", str, " key cannot be used to put a CharSequence"));
    }

    public int E(int i) {
        int i2;
        cvd cvd;
        cvd[] cvdArr = (cvd[]) this.a;
        int length = cvdArr.length - 1;
        int i3 = 0;
        while (i3 <= length && (cvd = cvdArr[i2]) != null) {
            int i4 = cvd.b;
            int i5 = cvd.a;
            if (i >= i5 && i < i4) {
                return i2;
            }
            if (i4 <= i) {
                i3 = (i2 = (i3 + length) >>> 1) + 1;
            } else if (i5 > i) {
                length = i2 - 1;
            }
        }
        return -1;
    }

    public void F() {
        b08 b08 = (b08) this.a;
        b08.getClass();
        try {
            jfg jfg = (jfg) b08.a;
            jfg.H0(jfg.G0(), 1);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void G(sn0 sn0) {
        lfg lfg = ((b08) this.a).a;
        rxd rxd = sn0.a;
        if (rxd == null) {
            try {
                jfg jfg = (jfg) lfg;
                Parcel G0 = jfg.G0();
                agg.c(G0, (IInterface) null);
                jfg.H0(G0, 18);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            jfg jfg2 = (jfg) lfg;
            Parcel G02 = jfg2.G0();
            agg.c(G02, (xr6) rxd.b);
            jfg2.H0(G02, 18);
        }
    }

    public void H(Long l) {
        b08 b08 = (b08) this.a;
        b08.getClass();
        try {
            lfg lfg = b08.a;
            oy9 oy9 = new oy9(l);
            jfg jfg = (jfg) lfg;
            Parcel G0 = jfg.G0();
            agg.c(G0, oy9);
            jfg.H0(G0, 29);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void I() {
        b08 b08 = (b08) this.a;
        b08.getClass();
        try {
            jfg jfg = (jfg) b08.a;
            Parcel G0 = jfg.G0();
            int i = agg.a;
            G0.writeInt(1);
            jfg.H0(G0, 14);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void a(int i, int i2) {
        ((hdc) this.a).n(i, i2);
    }

    public void accept(Object obj) {
        ss2 ss2 = (ss2) obj;
        s12 s12 = (s12) this.a;
        s12.getClass();
        if (ss2.c != null) {
            s12.b().W(s12.o, v82.b);
            e8d e8d = s12.a;
            if (e8d == null) {
                e8d = null;
            }
            ((jz2) ((iy2) e8d.J.getValue())).l().c0(Collections.singletonList(ss2.c));
        }
        av0 t = s12.t();
        long j = s12.b;
        t.c(new pi0(j));
        s12.s().d(j);
    }

    public void b() {
        wk9 wk9 = ((oj9) this.a).u0;
        if (wk9 != null) {
            wk9.n(new fj0(18));
        }
    }

    public long c(long j) {
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((b04) arrayList.get(0)).b) {
            return ((b04) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            b04 b04 = (b04) arrayList.get(i);
            if (j < b04.b) {
                long j2 = ((b04) arrayList.get(i - 1)).d;
                int i2 = (j2 > -9223372036854775807L ? 1 : (j2 == -9223372036854775807L ? 0 : -1));
                long j3 = b04.b;
                return (i2 == 0 || j2 <= j || j2 >= j3) ? j3 : j2;
            }
        }
        long j4 = ((b04) mqd.m(arrayList)).d;
        if (j4 == -9223372036854775807L || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    public void clear() {
        ((ArrayList) this.a).clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(defpackage.b04 r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x000f
            r4 = r6
            goto L_0x0010
        L_0x000f:
            r4 = r5
        L_0x0010:
            defpackage.fm9.f(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x0023
            long r7 = r10.d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0021
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0023
        L_0x0021:
            r2 = r6
            goto L_0x0024
        L_0x0023:
            r2 = r5
        L_0x0024:
            java.lang.Object r9 = r9.a
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r3 = r9.size()
            int r3 = r3 - r6
        L_0x002d:
            if (r3 < 0) goto L_0x0050
            java.lang.Object r4 = r9.get(r3)
            b04 r4 = (defpackage.b04) r4
            long r7 = r4.b
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x0040
            int r3 = r3 + r6
            r9.add(r3, r10)
            return r2
        L_0x0040:
            java.lang.Object r4 = r9.get(r3)
            b04 r4 = (defpackage.b04) r4
            long r7 = r4.b
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x004d
            r2 = r5
        L_0x004d:
            int r3 = r3 + -1
            goto L_0x002d
        L_0x0050:
            r9.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y8.d(b04, long):boolean");
    }

    public void e(int i, int i2) {
        ((hdc) this.a).p(i, i2);
    }

    public void f(int i) {
        oj9 oj9 = (oj9) this.a;
        oj9.o.c = 0;
        oj9.Z1(oj9, false, i * 10);
    }

    public void g(z2e z2e) {
        ((m4e) this.a).Y.a(z2e);
    }

    public Object get() {
        return Boolean.valueOf(((jp) ((hp) ((v4) this.a).c(hp.class))).u());
    }

    public void h() {
        ((z3b) this.a).b();
    }

    public zw6 i(long j) {
        int x = x(j);
        if (x == 0) {
            ls5 ls5 = zw6.b;
            return ffc.X;
        }
        b04 b04 = (b04) ((ArrayList) this.a).get(x - 1);
        long j2 = b04.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return b04.a;
        }
        ls5 ls52 = zw6.b;
        return ffc.X;
    }

    public void j() {
        ((z3b) this.a).b();
    }

    public void k(z2e z2e) {
        cc8 cc8 = (cc8) ((m4e) this.a).Y.a.b.getValue();
        cc8.getClass();
        zb8 zb8 = new zb8(z2e.a);
        s35 s35 = cc8.X;
        pnf.o(s35, zb8);
        pnf.o(s35, yb8.a);
    }

    public void l() {
        ((z3b) this.a).b();
    }

    public void m(int i, int i2) {
        ((hdc) this.a).a.f(i, i2);
    }

    public long n(long j) {
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList.isEmpty() || j < ((b04) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((b04) arrayList.get(i)).b;
            int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            if (i2 == 0) {
                return j2;
            }
            if (i2 < 0) {
                b04 b04 = (b04) arrayList.get(i - 1);
                long j3 = b04.d;
                return (j3 == -9223372036854775807L || j3 > j) ? b04.b : j3;
            }
        }
        b04 b042 = (b04) mqd.m(arrayList);
        long j4 = b042.d;
        return (j4 == -9223372036854775807L || j < j4) ? b042.b : j4;
    }

    public void o(int i, int i2, Object obj) {
        ((hdc) this.a).o(i, i2, obj);
    }

    public void onWebRtcAudioRecordError(String str) {
        ((a4c) this.a).log("AudioRecordCallback", "Audio record error: " + str);
    }

    public void onWebRtcAudioRecordInitError(String str) {
        ((a4c) this.a).log("AudioRecordCallback", "Audio record init error: " + str);
    }

    public void onWebRtcAudioRecordStart() {
        ((a4c) this.a).log("AudioRecordCallback", "Audio record did start");
    }

    public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        ((a4c) this.a).log("AudioRecordCallback", "Audio record start error: [" + audioRecordStartErrorCode + "] " + str);
    }

    public void onWebRtcAudioRecordStop() {
        ((a4c) this.a).log("AudioRecordCallback", "Audio record did stop");
    }

    public void onWebRtcAudioTrackError(String str) {
        ((a4c) this.a).log("AudioRecordCallback", "Audio track error: " + str);
    }

    public void onWebRtcAudioTrackInitError(String str) {
        ((a4c) this.a).log("AudioRecordCallback", "Audio track init error: " + str);
    }

    public void onWebRtcAudioTrackStart() {
        ((a4c) this.a).log("AudioRecordCallback", "Audio track did start");
    }

    public void onWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        ((a4c) this.a).log("AudioRecordCallback", "Audio track start error: [" + audioTrackStartErrorCode + "] " + str);
    }

    public void onWebRtcAudioTrackStop() {
        ((a4c) this.a).log("AudioRecordCallback", "Audio track did stop");
    }

    public Uri p(String str) {
        str.getClass();
        if (str.equals("api")) {
            return ((a95) this.a).c().a();
        }
        throw new NoHttpApiEndpointException(str);
    }

    public void q() {
        ((z3b) this.a).b();
    }

    public void r() {
        ((z3b) this.a).b();
    }

    public void s() {
        ((z3b) this.a).b();
    }

    public void t() {
        ((z3b) this.a).b();
    }

    public void u(long j) {
        int x = x(j);
        if (x > 0) {
            ((ArrayList) this.a).subList(0, x).clear();
        }
    }

    public hi5 v() {
        jo7 jo7 = (jo7) this.a;
        String str = ((Long) jo7.a) == null ? " fileSizeLimit" : "";
        if (((Long) jo7.b) == null) {
            str = str.concat(" durationLimitMillis");
        }
        if (((File) jo7.c) == null) {
            str = au1.g(str, " file");
        }
        if (str.isEmpty()) {
            return new hi5(new ma0(((Long) jo7.a).longValue(), ((Long) jo7.b).longValue(), (File) jo7.c));
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = defpackage.j92.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String w(defpackage.bq0 r2, defpackage.wm3 r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0019
            j92 r0 = defpackage.j92.a
            java.lang.Object r1 = r1.a
            j92 r1 = (defpackage.j92) r1
            if (r1 == r0) goto L_0x0019
            java.lang.String r1 = r3.w0
            java.lang.String r1 = defpackage.bre.c(r1)
            java.lang.String r2 = r2.b
            java.lang.String r3 = " /"
            java.lang.String r1 = defpackage.rh4.j(r1, r3, r2)
            return r1
        L_0x0019:
            java.lang.String r1 = r2.b
            java.lang.String r2 = "/"
            java.lang.String r1 = defpackage.wg0.i(r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y8.w(bq0, wm3):java.lang.String");
    }

    public int x(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((b04) arrayList.get(i)).b) {
                return i;
            }
            i++;
        }
    }

    public void y() {
        long j;
        x14 x14 = (x14) this.a;
        synchronized (nu0.A0) {
            try {
                j = nu0.B0 ? nu0.C0 : -9223372036854775807L;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        x14.L = j;
        x14.s(true);
    }

    public void z(String str, Bitmap bitmap) {
        Integer num = (Integer) hd8.c.get(str);
        if (num == null || num.intValue() == 2) {
            ((Bundle) this.a).putParcelable(str, bitmap);
            return;
        }
        throw new IllegalArgumentException(zr6.i("The ", str, " key cannot be used to put a Bitmap"));
    }

    public y8(xr6 xr6) {
        fp3.n(xr6);
        this.a = xr6;
    }

    public y8(Spannable spannable) {
        Object obj;
        try {
            obj = spannable.getSpans(0, spannable.length(), ey4.class);
        } catch (Throwable unused) {
            obj = null;
        }
        ey4[] ey4Arr = (ey4[]) (obj == null ? new ey4[0] : obj);
        this.a = new cvd[ey4Arr.length];
        int length = ey4Arr.length;
        for (int i = 0; i < length; i++) {
            ((cvd[]) this.a)[i] = new cvd(spannable.getSpanStart(ey4Arr[i]), spannable.getSpanEnd(ey4Arr[i]));
        }
        Arrays.sort((cvd[]) this.a);
    }

    public y8(int i) {
        switch (i) {
            case Protos.Attaches.Attach.LOCATION /*14*/:
                this.a = null;
                return;
            case 19:
                this.a = new Bundle();
                return;
            case 25:
                this.a = new ArrayList();
                return;
            case 27:
                this.a = new khe(new xid(4));
                return;
            default:
                this.a = Handler.createAsync(Looper.getMainLooper());
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [jo7, java.lang.Object] */
    public y8(File file) {
        ? obj = new Object();
        obj.a = 0L;
        obj.b = 0L;
        c54.o(file, "File can't be null.");
        this.a = obj;
        obj.c = file;
    }
}
