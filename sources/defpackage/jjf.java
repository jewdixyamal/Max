package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Path;
import android.graphics.Region;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.OutputStream;
import java.util.List;

/* renamed from: jjf  reason: default package */
public final class jjf implements vuc {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    public jjf() {
        this.c = new Path();
        this.d = new Region();
        this.e = new Region();
        this.a = -1;
        this.b = -1;
    }

    public static String h(fl5 fl5) {
        fl5.a();
        ol5 ol5 = fl5.c;
        String str = ol5.e;
        if (str != null) {
            return str;
        }
        fl5.a();
        String str2 = ol5.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public int a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        defpackage.v3c.i(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.ContentResolver r2, android.net.Uri r3) {
        /*
            r1 = this;
            java.lang.String r0 = "w"
            java.io.OutputStream r2 = r2.openOutputStream(r3, r0)
            if (r2 == 0) goto L_0x0017
            r1.k(r2)     // Catch:{ all -> 0x0010 }
            r1 = 0
            defpackage.v3c.i(r2, r1)
            goto L_0x0017
        L_0x0010:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r3 = move-exception
            defpackage.v3c.i(r2, r1)
            throw r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jjf.b(android.content.ContentResolver, android.net.Uri):void");
    }

    public Uri c() {
        return (Uri) this.e;
    }

    public String d() {
        return (String) this.d;
    }

    public Integer e() {
        return Integer.valueOf(this.b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        defpackage.v3c.i(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.io.File r2) {
        /*
            r1 = this;
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2)
            r1.k(r0)     // Catch:{ all -> 0x000d }
            r1 = 0
            defpackage.v3c.i(r0, r1)
            return
        L_0x000d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x000f }
        L_0x000f:
            r2 = move-exception
            defpackage.v3c.i(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jjf.f(java.io.File):void");
    }

    public synchronized String g() {
        try {
            if (((String) this.d) == null) {
                j();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return (String) this.d;
    }

    public Integer getHeight() {
        return null;
    }

    public Integer getWidth() {
        return null;
    }

    public boolean i() {
        int i;
        synchronized (this) {
            i = this.b;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    i = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        this.b = 2;
                    } else {
                        this.b = 2;
                    }
                    i = 2;
                }
            }
        }
        return i != 0;
    }

    public synchronized void j() {
        PackageInfo packageInfo;
        try {
            packageInfo = ((Context) this.c).getPackageManager().getPackageInfo(((Context) this.c).getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.d = Integer.toString(packageInfo.versionCode);
            this.e = packageInfo.versionName;
        }
    }

    public void k(OutputStream outputStream) {
        int i;
        byte[] bArr = new byte[2048];
        int i2 = 0;
        do {
            i = this.b;
            int min = Math.min(2048, i - i2);
            ((qq8) this.c).S(i2, 0, min, bArr);
            outputStream.write(bArr, 0, min);
            i2 += min;
        } while (i2 < i);
        outputStream.flush();
    }

    public jjf(qq8 qq8, int i, String str) {
        this.c = qq8;
        this.a = i;
        this.d = str;
        this.b = qq8.U();
        this.e = MediaStore.Images.Media.getContentUri("external_primary");
    }

    public jjf(Context context) {
        this.b = 0;
        this.c = context;
    }
}
