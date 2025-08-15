package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: l2a  reason: default package */
public final class l2a implements ry, sy, y2a {
    public static final byte[] X = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] Y = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object o;

    public l2a(Context context) {
        this.a = 8;
        this.c = 0;
        this.o = context;
    }

    public static void f(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        boolean z2 = false;
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        long j2 = (long) i2;
        if ((j2 >> 8) == 0) {
            z2 = true;
        }
        z04.j(j2, "out of range: %s", z2);
        byteBuffer.put((byte) ((int) j2));
    }

    public x6g P(View view, x6g x6g) {
        int i = x6g.a.f(7).b;
        int i2 = this.b;
        View view2 = (View) this.o;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return x6g;
    }

    public int a() {
        switch (this.a) {
            case 2:
                return this.b;
            default:
                return this.b;
        }
    }

    public int b() {
        switch (this.a) {
            case 2:
                return this.c;
            default:
                return this.c;
        }
    }

    public int c() {
        switch (this.a) {
            case 2:
                int i = this.b;
                return i == -1 ? ((yaf) this.o).y() : i;
            default:
                int i2 = this.b;
                return i2 == -1 ? ((wpa) this.o).y() : i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        defpackage.v3c.i(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(defpackage.ata r5) {
        /*
            r4 = this;
            int r0 = r4.c
            r1 = 1
            int r0 = r0 + r1
            r4.c = r0
            int r2 = r4.b
            if (r0 <= r2) goto L_0x000b
            return
        L_0x000b:
            java.lang.Object r4 = r4.o
            java.io.File r4 = (java.io.File) r4
            if (r4 != 0) goto L_0x0012
            return
        L_0x0012:
            java.io.File r0 = r4.getParentFile()     // Catch:{ IOException -> 0x0039 }
            if (r0 == 0) goto L_0x001b
            defpackage.m6d.y(r0)     // Catch:{ IOException -> 0x0039 }
        L_0x001b:
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0039 }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0039 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0039 }
            r3.<init>(r4, r1)     // Catch:{ IOException -> 0x0039 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0039 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0039 }
            defpackage.rq9.l(r0, r5)     // Catch:{ all -> 0x0032 }
            r4 = 0
            defpackage.v3c.i(r0, r4)     // Catch:{ IOException -> 0x0039 }
            goto L_0x0039
        L_0x0032:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r5 = move-exception
            defpackage.v3c.i(r0, r4)     // Catch:{ IOException -> 0x0039 }
            throw r5     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l2a.d(ata):void");
    }

    public void e(int i) {
        yi3 g = ((dj3) this.o).g(this.c);
        switch (this.b) {
            case 1:
                g.d.F = i;
                return;
            case 2:
                g.d.G = i;
                return;
            case 3:
                g.d.H = i;
                return;
            case 4:
                g.d.I = i;
                return;
            case 5:
                g.d.L = i;
                return;
            case 6:
                g.d.K = i;
                return;
            case 7:
                g.d.J = i;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public synchronized int g() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = ((Context) a9g.a((Context) this.o).b).getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                "Failed to find package ".concat(e.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }

    public synchronized int h() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.o;
        PackageManager packageManager = context.getPackageManager();
        if (((Context) a9g.a(context).b).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
            this.c = 2;
            return 2;
        }
        this.c = 2;
        return 2;
    }

    public /* synthetic */ l2a(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.o = obj;
        this.c = i2;
    }

    public l2a(File file) {
        this.a = 1;
        this.o = file;
        kye kye = kye.a;
        Object obj = kye.c().get(tfg.b);
        hta hta = obj instanceof hta ? (hta) obj : null;
        this.b = (hta == null ? new hta(new sh0(14, (byte) 0)) : hta).b;
    }

    public l2a(Context context, XmlResourceParser xmlResourceParser) {
        this.a = 5;
        this.o = new ArrayList();
        this.c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), i3c.State);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == i3c.State_android_id) {
                this.b = obtainStyledAttributes.getResourceId(index, this.b);
            } else if (index == i3c.State_constraints) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.c);
                this.c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new dj3().c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public l2a(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.o = new l2a[256];
                this.b = 0;
                this.c = 0;
                return;
            default:
                return;
        }
    }

    public l2a(int i, int i2) {
        this.a = 6;
        this.o = null;
        this.b = i;
        int i3 = i2 & 7;
        this.c = i3 == 0 ? 8 : i3;
    }

    public l2a(my myVar, oy5 oy5) {
        this.a = 2;
        yaf yaf = myVar.c;
        this.o = yaf;
        yaf.H(12);
        int y = yaf.y();
        if ("audio/raw".equals(oy5.w0)) {
            int v = maf.v(oy5.L0, oy5.J0);
            if (y == 0 || y % v != 0) {
                y = v;
            }
        }
        this.b = y == 0 ? -1 : y;
        this.c = yaf.y();
    }

    public l2a(ny nyVar, qy5 qy5) {
        this.a = 3;
        wpa wpa = nyVar.c;
        this.o = wpa;
        wpa.G(12);
        int y = wpa.y();
        if ("audio/raw".equals(qy5.n)) {
            int D = oaf.D(qy5.D, qy5.B);
            if (y == 0 || y % D != 0) {
                z04.c0("Audio sample size mismatch. stsd sample size: " + D + ", stsz sample size: " + y);
                y = D;
            }
        }
        this.b = y == 0 ? -1 : y;
        this.c = wpa.y();
    }
}
