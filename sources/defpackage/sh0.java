package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.tamtam.nano.Protos;

/* renamed from: sh0  reason: default package */
public final class sh0 implements u4, edc, agf, ipf {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public /* synthetic */ sh0(char c2, int i) {
        this.a = i;
    }

    public static ng9 H() {
        sm9 sm9 = sm9.a;
        sm9.getClass();
        return new ng9(sm9);
    }

    public void A() {
        p42 p42 = p42.c;
        char[] cArr = (char[]) this.c;
        synchronized (p42) {
            int i = p42.a;
            if (cArr.length + i < vs.a) {
                p42.a = i + cArr.length;
                ((hs) p42.b).b(cArr);
            }
        }
    }

    public synchronized void B(StringBuilder sb) {
        try {
            sb.append("Previously recorded ");
            sb.append(this.b);
            sb.append(" base apk paths.");
            if (this.b > 0) {
                sb.append(" Most recent ones:");
            }
            int i = 0;
            while (true) {
                String[] strArr = (String[]) this.c;
                if (i < strArr.length) {
                    int i2 = (this.b - i) - 1;
                    if (i2 >= 0) {
                        String str = strArr[i2 % strArr.length];
                        sb.append("\n");
                        sb.append(str);
                        sb.append(" (");
                        sb.append(new File(str).exists() ? "exists" : "does not exist");
                        sb.append(")");
                    }
                    i++;
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public l2a C(int i) {
        dj3 dj3 = (dj3) this.c;
        int i2 = this.b;
        dj3.d(i2, 6, i, 7);
        return new l2a(dj3, 6, i2, 4);
    }

    public l2a D(int i) {
        dj3 dj3 = (dj3) this.c;
        int i2 = this.b;
        dj3.d(i2, 6, i, 6);
        return new l2a(dj3, 6, i2, 4);
    }

    public l2a E(int i) {
        dj3 dj3 = (dj3) this.c;
        int i2 = this.b;
        dj3.d(i2, 3, i, 4);
        return new l2a(dj3, 3, i2, 4);
    }

    public void F(long j) {
    }

    public l2a G(int i) {
        dj3 dj3 = (dj3) this.c;
        int i2 = this.b;
        dj3.d(i2, 3, i, 3);
        return new l2a(dj3, 3, i2, 4);
    }

    public void I() {
        ((dj3) this.c).g(this.b).d.W = 2;
    }

    public void J(String str) {
        int length = str.length();
        if (length != 0) {
            r(this.b, length);
            str.getChars(0, str.length(), (char[]) this.c, this.b);
            this.b += length;
        }
    }

    public void K() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void O() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            m1f r0 = (defpackage.m1f) r0
            int r5 = r5.b
            kf4 r0 = r0.A0
            r0.getClass()
            monitor-enter(r0)
            android.util.SparseArray r1 = r0.g     // Catch:{ all -> 0x0045 }
            boolean r1 = defpackage.oaf.l(r1, r5)     // Catch:{ all -> 0x0045 }
            defpackage.fm9.k(r1)     // Catch:{ all -> 0x0045 }
            int r1 = r0.o     // Catch:{ all -> 0x0045 }
            r2 = 1
            r3 = -1
            r4 = 0
            if (r1 == r3) goto L_0x001e
            r1 = r2
            goto L_0x001f
        L_0x001e:
            r1 = r4
        L_0x001f:
            defpackage.fm9.k(r1)     // Catch:{ all -> 0x0045 }
            android.util.SparseArray r1 = r0.g     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            jf4 r1 = (defpackage.jf4) r1     // Catch:{ all -> 0x0045 }
            r1.b = r2     // Catch:{ all -> 0x0045 }
            r1 = r4
        L_0x002d:
            android.util.SparseArray r3 = r0.g     // Catch:{ all -> 0x0045 }
            int r3 = r3.size()     // Catch:{ all -> 0x0045 }
            if (r1 >= r3) goto L_0x0047
            android.util.SparseArray r3 = r0.g     // Catch:{ all -> 0x0045 }
            java.lang.Object r3 = r3.valueAt(r1)     // Catch:{ all -> 0x0045 }
            jf4 r3 = (defpackage.jf4) r3     // Catch:{ all -> 0x0045 }
            boolean r3 = r3.b     // Catch:{ all -> 0x0045 }
            if (r3 != 0) goto L_0x0042
            goto L_0x0048
        L_0x0042:
            int r1 = r1 + 1
            goto L_0x002d
        L_0x0045:
            r5 = move-exception
            goto L_0x008d
        L_0x0047:
            r4 = r2
        L_0x0048:
            r0.h = r4     // Catch:{ all -> 0x0045 }
            android.util.SparseArray r1 = r0.g     // Catch:{ all -> 0x0045 }
            int r3 = r0.o     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x0045 }
            jf4 r1 = (defpackage.jf4) r1     // Catch:{ all -> 0x0045 }
            java.util.ArrayDeque r1 = r1.a     // Catch:{ all -> 0x0045 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x006c
            int r1 = r0.o     // Catch:{ all -> 0x0045 }
            if (r5 != r1) goto L_0x0063
            r0.d()     // Catch:{ all -> 0x0045 }
        L_0x0063:
            if (r4 == 0) goto L_0x006c
            o9g r5 = r0.a     // Catch:{ all -> 0x0045 }
            r5.z()     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)
            goto L_0x008c
        L_0x006c:
            int r1 = r0.o     // Catch:{ all -> 0x0045 }
            if (r5 == r1) goto L_0x008b
            android.util.SparseArray r1 = r0.g     // Catch:{ all -> 0x0045 }
            java.lang.Object r5 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            jf4 r5 = (defpackage.jf4) r5     // Catch:{ all -> 0x0045 }
            java.util.ArrayDeque r5 = r5.a     // Catch:{ all -> 0x0045 }
            int r5 = r5.size()     // Catch:{ all -> 0x0045 }
            if (r5 != r2) goto L_0x008b
            nx0 r5 = r0.f     // Catch:{ all -> 0x0045 }
            ff4 r1 = new ff4     // Catch:{ all -> 0x0045 }
            r2 = 2
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0045 }
            r5.v(r1)     // Catch:{ all -> 0x0045 }
        L_0x008b:
            monitor-exit(r0)
        L_0x008c:
            return
        L_0x008d:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh0.O():void");
    }

    public cn9 a(int i) {
        cn9 cn9 = (cn9) ((SparseArray) this.c).get(i);
        if (cn9 != null) {
            return cn9;
        }
        throw new IllegalArgumentException(zr6.h(i, "Cannot find the wrapper for global view type "));
    }

    public boolean b(View view) {
        ((BottomSheetBehavior) this.c).K(this.b);
        return true;
    }

    public void c(VideoFrameProcessingException videoFrameProcessingException) {
        m1f m1f = (m1f) this.c;
        m1f.getClass();
        m1f.Y.execute(new vs5(m1f, 28, videoFrameProcessingException));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, c8d, hpf] */
    public hpf d(cn9 cn9) {
        ? obj = new Object();
        obj.o = this;
        obj.a = new SparseIntArray(1);
        obj.b = new SparseIntArray(1);
        obj.c = cn9;
        return obj;
    }

    public l2a e(int i) {
        dj3 dj3 = (dj3) this.c;
        int i2 = this.b;
        dj3.d(i2, 4, i, 4);
        return new l2a(dj3, 4, i2, 4);
    }

    public l2a f(int i) {
        dj3 dj3 = (dj3) this.c;
        int i2 = this.b;
        dj3.d(i2, 4, i, 3);
        return new l2a(dj3, 4, i2, 4);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [pg9, y1] */
    public pg9 g() {
        Map g = ((kq0) this.c).g();
        og9 og9 = new og9(this.b);
        ? y1Var = new y1(g);
        y1Var.Y = og9;
        return y1Var;
    }

    public void h() {
        ((dj3) this.c).g(this.b).d.l0 = true;
    }

    public void i(InputStream inputStream, OutputStream outputStream) {
        ja6 ja6 = (ja6) this.c;
        int i = this.b;
        byte[] bArr = (byte[]) ja6.get(i);
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            } finally {
                ja6.e(bArr);
            }
        }
    }

    public int j() {
        m71 m71 = (m71) this.c;
        int i = m71.L0.a;
        int i2 = this.b;
        if (i != 0) {
            return i2;
        }
        if (m71.I0.j() == 0 || m71.I0.j() == 1) {
            return 1;
        }
        if (m71.I0.j() == 2) {
            return 2;
        }
        return i2;
    }

    public nt9 k(qh8 qh8, c73 c73) {
        y9d y9d = c73.a;
        int i = 0;
        fm9.f(y9d != null && y9d.a == 0);
        y9d.getClass();
        Service service = (Service) this.c;
        IconCompat c2 = IconCompat.c(service, c73.d);
        Intent intent = new Intent("androidx.media3.session.CUSTOM_NOTIFICATION_ACTION");
        intent.setData(qh8.a.b);
        intent.setComponent(new ComponentName(service, service.getClass()));
        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION", y9d.b);
        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS", y9d.c);
        int i2 = this.b + 1;
        this.b = i2;
        if (oaf.a >= 23) {
            i = 67108864;
        }
        return new nt9(c2, c73.f, PendingIntent.getService(service, i2, intent, 134217728 | i));
    }

    public nt9 l(qh8 qh8, IconCompat iconCompat, CharSequence charSequence, int i) {
        return new nt9(iconCompat, charSequence, m(qh8, (long) i));
    }

    public PendingIntent m(qh8 qh8, long j) {
        int i = 0;
        int i2 = (j == 8 || j == 9) ? 87 : (j == 6 || j == 7) ? 88 : j == 3 ? 86 : j == 12 ? 90 : j == 11 ? 89 : j == 1 ? 85 : 0;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(qh8.a.b);
        Service service = (Service) this.c;
        intent.setComponent(new ComponentName(service, service.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i2));
        int i3 = oaf.a;
        if (i3 >= 26 && j == 1 && !qh8.c().u()) {
            return PendingIntent.getForegroundService(service, i2, intent, 67108864);
        }
        if (i3 >= 23) {
            i = 67108864;
        }
        return PendingIntent.getService(service, i2, intent, i);
    }

    public l2a n(int i) {
        dj3 dj3 = (dj3) this.c;
        int i2 = this.b;
        dj3.d(i2, 7, i, 7);
        return new l2a(dj3, 7, i2, 4);
    }

    public void o(int i, int i2) {
    }

    public l2a p(int i) {
        dj3 dj3 = (dj3) this.c;
        int i2 = this.b;
        dj3.d(i2, 7, i, 6);
        return new l2a(dj3, 7, i2, 4);
    }

    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, nud[] nudArr) {
        int i;
        edc[] edcArr;
        do {
            i = this.b;
            edcArr = (edc[]) this.c;
            if (i >= edcArr.length) {
                return false;
            }
            this.b = i + 1;
        } while (!edcArr[i].q(unsatisfiedLinkError, nudArr));
        return true;
    }

    public void r(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public void s(es8 es8, long j) {
        e52 C = ((jyc) ((fke) this.c)).f().C(es8.a.t0);
        List<es8> singletonList = Collections.singletonList(es8);
        if (C == null) {
            hm9.o("sh0", "Chat can't be null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("ru.ok.tamtam.extra.CHAT_ID", C.a);
        bundle.putLong("ru.ok.tamtam.extra.ATTACH_ID", j);
        bundle.putBoolean("ru.ok.tamtam.extra.NOTIFY", true);
        ArrayList arrayList = new ArrayList(singletonList.size());
        for (es8 es82 : singletonList) {
            try {
                arrayList.add(Long.valueOf(es82.a.b));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
    }

    public int t() {
        int i = this.b;
        if (i != 0) {
            return ((int[]) this.c)[i - 1];
        }
        throw new NoSuchElementException();
    }

    public String toString() {
        switch (this.a) {
            case 9:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    public int u() {
        int i = this.b;
        if (i != 0) {
            int i2 = i - 1;
            this.b = i2;
            return ((int[]) this.c)[i2];
        }
        throw new NoSuchElementException();
    }

    public void v(int i) {
        int i2 = this.b;
        if (i2 != 0) {
            ((int[]) this.c)[i2 - 1] = i;
            return;
        }
        throw new NoSuchElementException();
    }

    public void w(int i) {
        int[] iArr = (int[]) this.c;
        int length = iArr.length;
        if (this.b >= length) {
            int[] iArr2 = new int[(length * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.c = iArr2;
            iArr = iArr2;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }

    public long x(ra4 ra4) {
        yaf yaf = (yaf) this.c;
        int i = 0;
        ra4.q(yaf.a, 0, 1, false);
        byte b2 = yaf.a[0] & 255;
        if (b2 == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b2 & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b2 & (~i2);
        ra4.q(yaf.a, 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (yaf.a[i] & 255) + (i4 << 8);
        }
        this.b = i3 + 1 + this.b;
        return (long) i4;
    }

    public long y(sa4 sa4) {
        wpa wpa = (wpa) this.c;
        int i = 0;
        sa4.q(wpa.a, 0, 1, false);
        byte b2 = wpa.a[0] & 255;
        if (b2 == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b2 & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b2 & (~i2);
        sa4.q(wpa.a, 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (wpa.a[i] & 255) + (i4 << 8);
        }
        this.b = i3 + 1 + this.b;
        return (long) i4;
    }

    public synchronized boolean z(String str) {
        for (String equals : (String[]) this.c) {
            if (str.equals(equals)) {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Recording new base apk path: ");
        sb.append(str);
        sb.append("\n");
        B(sb);
        String[] strArr = (String[]) this.c;
        int i = this.b;
        strArr[i % strArr.length] = str;
        this.b = i + 1;
        return true;
    }

    public /* synthetic */ sh0(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public /* synthetic */ sh0(int i, Serializable serializable, int i2) {
        this.a = i2;
        this.b = i;
        this.c = serializable;
    }

    public /* synthetic */ sh0(int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = 0;
    }

    public sh0(kq0 kq0) {
        this.a = 12;
        this.c = kq0;
        this.b = 2;
    }

    public sh0(int i, byte[] bArr) {
        this.a = 17;
        if (bArr == null) {
            throw new IllegalArgumentException("Illegal 'value' value: null");
        } else if (i != 0) {
            this.c = bArr;
            this.b = i;
        } else {
            throw new IllegalArgumentException("Illegal 'format' value: null");
        }
    }

    public sh0(ph3 ph3, int i) {
        this.a = 22;
        fp3.n(ph3);
        this.c = ph3;
        this.b = i;
    }

    public sh0(int i, byte b2) {
        this.a = i;
        switch (i) {
            case 6:
                this.c = new Object();
                this.b = 0;
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                this.b = 50;
                return;
            case 18:
                this.c = new int[8];
                return;
            case 19:
                this.c = new yaf(8);
                return;
            case 20:
                this.c = new wpa(8);
                return;
            default:
                this.c = new String[5];
                this.b = 0;
                return;
        }
    }

    public sh0(ja6 ja6) {
        this.a = 15;
        od2.j(true);
        this.b = 16384;
        this.c = ja6;
    }

    public sh0(int i) {
        this.a = 11;
        ((y8a) vl.b()).p().getClass();
        fke b2 = jke.b();
        this.c = b2;
        this.b = i;
        ((jyc) b2).b();
        ((y8a) vl.b()).g();
    }

    public sh0(Notification notification) {
        this.a = 10;
        this.b = MultiFileUploader.MSG_TRY_UPLOAD_NEXT;
        notification.getClass();
        this.c = notification;
    }
}
