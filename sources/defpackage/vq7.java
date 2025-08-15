package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.common.file.FileUtils$ParentDirNotFoundException;
import com.facebook.common.file.FileUtils$RenameException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: vq7  reason: default package */
public final class vq7 implements sff, lo7, mq1, r2a, a76, bbe {
    public static final b11 X = new b11(-9223372036854775807L, 0, 5, false);
    public static final b11 Y = new b11(-9223372036854775807L, 2, 5, false);
    public static final b11 Z = new b11(-9223372036854775807L, 3, 5, false);
    public static vq7 s0;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ vq7() {
        this.a = 2;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 10:
                Void voidR = (Void) obj;
                ((k8b) this.o).e = null;
                return;
            default:
                Surface surface = (Surface) obj;
                kq0.y((bm7) this.c, (lq1) this.o);
                return;
        }
    }

    public void b() {
        ((a95) this.b).b();
        ((th4) this.c).e = true;
    }

    public void c() {
        IOException iOException;
        IOException iOException2 = (IOException) this.o;
        if (iOException2 == null) {
            eo7 eo7 = (eo7) this.c;
            if (eo7 != null && (iOException = eo7.o) != null && eo7.X > eo7.b) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public void d(Throwable th) {
        switch (this.a) {
            case 10:
                ((k8b) this.o).e = null;
                List<iv1> list = (List) this.b;
                if (!list.isEmpty()) {
                    for (iv1 s : list) {
                        ((yw1) this.c).s(s);
                    }
                    list.clear();
                    return;
                }
                return;
            default:
                boolean z = th instanceof CancellationException;
                lq1 lq1 = (lq1) this.o;
                if (z) {
                    c54.p((String) null, lq1.d(new RuntimeException(zr6.l(new StringBuilder(), (String) this.b, " cancelled."), th)));
                    return;
                } else {
                    lq1.b((Object) null);
                    return;
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        r1 = r0;
        r9 = r2;
        r2 = r4;
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        defpackage.m6d.c(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        throw r6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:15:0x0042, B:25:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            java.lang.Object r12 = r11.c
            java.lang.String r12 = (java.lang.String) r12
            ir6 r0 = defpackage.hm9.m
            r1 = 0
            if (r0 != 0) goto L_0x000a
            goto L_0x001f
        L_0x000a:
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x001f
            us7 r2 = defpackage.us7.X
            java.lang.Object r3 = r11.b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "Fetch video. Local fetcher, path "
            java.lang.String r3 = defpackage.wg0.i(r4, r3)
            r0.d(r2, r12, r3, r1)
        L_0x001f:
            r2 = 0
            android.media.MediaMetadataRetriever r12 = new android.media.MediaMetadataRetriever     // Catch:{ all -> 0x005d }
            r12.<init>()     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r11.o     // Catch:{ all -> 0x0052 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x0052 }
            java.lang.Object r4 = r11.b     // Catch:{ all -> 0x0052 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0052 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x0052 }
            r12.setDataSource(r0, r4)     // Catch:{ all -> 0x0052 }
            android.graphics.Point r0 = defpackage.s36.v(r12)     // Catch:{ all -> 0x0052 }
            int r4 = defpackage.s36.r(r12)     // Catch:{ all -> 0x004f }
            long r4 = (long) r4
            long r2 = defpackage.s36.t(r12)     // Catch:{ all -> 0x004d }
            defpackage.m6d.c(r12, r1)     // Catch:{ all -> 0x0047 }
            r6 = r2
            goto L_0x007b
        L_0x0047:
            r12 = move-exception
            r1 = r0
            r9 = r2
            r2 = r4
            r4 = r9
            goto L_0x005f
        L_0x004d:
            r1 = move-exception
            goto L_0x0057
        L_0x004f:
            r1 = move-exception
            r4 = r2
            goto L_0x0057
        L_0x0052:
            r0 = move-exception
            r4 = r2
            r9 = r1
            r1 = r0
            r0 = r9
        L_0x0057:
            throw r1     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r6 = move-exception
            defpackage.m6d.c(r12, r1)     // Catch:{ all -> 0x0047 }
            throw r6     // Catch:{ all -> 0x0047 }
        L_0x005d:
            r12 = move-exception
            r4 = r2
        L_0x005f:
            java.lang.Object r0 = r11.c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r6 = r11.b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Can't get video params for path "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            defpackage.hm9.p(r0, r6, r12)
            r0 = r1
            r6 = r4
            r4 = r2
        L_0x007b:
            ef5 r12 = new ef5
            java.lang.Object r11 = r11.b
            r8 = r11
            java.lang.String r8 = (java.lang.String) r8
            r11 = 0
            if (r0 == 0) goto L_0x0089
            int r1 = r0.x
            r3 = r1
            goto L_0x008a
        L_0x0089:
            r3 = r11
        L_0x008a:
            if (r0 == 0) goto L_0x008e
            int r11 = r0.y
        L_0x008e:
            int r5 = (int) r4
            r2 = 3
            r1 = r12
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6, r8)
            gf5 r11 = new gf5
            java.util.List r12 = java.util.Collections.singletonList(r12)
            r11.<init>(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq7.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void f(hl hlVar) {
        ((up6) this.o).e = hlVar;
    }

    public int g(long j) {
        long[] jArr = (long[]) this.o;
        int b2 = oaf.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    public void h(Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("filters must not be null");
        } else if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                IntentFilter intentFilter = (IntentFilter) it.next();
                if (intentFilter != null) {
                    if (((ArrayList) this.o) == null) {
                        this.o = new ArrayList();
                    }
                    if (!((ArrayList) this.o).contains(intentFilter)) {
                        ((ArrayList) this.o).add(intentFilter);
                    }
                }
            }
        }
    }

    public long i(int i) {
        boolean z = false;
        fm9.f(i >= 0);
        long[] jArr = (long[]) this.o;
        if (i < jArr.length) {
            z = true;
        }
        fm9.f(z);
        return jArr[i];
    }

    public hc0 j() {
        String str = ((String) this.b) == null ? " backendName" : "";
        if (((z8b) this.o) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new hc0((String) this.b, (byte[]) this.c, (z8b) this.o);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public zf8 k() {
        ArrayList arrayList = (ArrayList) this.o;
        Bundle bundle = (Bundle) this.b;
        if (arrayList != null) {
            bundle.putParcelableArrayList("controlFilters", arrayList);
        }
        ArrayList arrayList2 = (ArrayList) this.c;
        if (arrayList2 != null) {
            bundle.putStringArrayList("groupMemberIds", arrayList2);
        }
        return new zf8(bundle);
    }

    public void l() {
        eo7 eo7 = (eo7) this.c;
        fm9.l(eo7);
        eo7.a(false);
    }

    public kg5 m() {
        o94 o94 = (o94) this.o;
        o94.e.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        File h = o94.h((String) this.b);
        try {
            oag.A((File) this.c, h);
            if (h.exists()) {
                h.setLastModified(currentTimeMillis);
            }
            return new kg5(h);
        } catch (FileUtils$RenameException e) {
            Throwable cause = e.getCause();
            if (cause != null && !(cause instanceof FileUtils$ParentDirNotFoundException)) {
                boolean z = cause instanceof FileNotFoundException;
            }
            int i = o94.g;
            o94.d.getClass();
            throw e;
        }
    }

    public boolean n() {
        return ((IOException) this.o) != null;
    }

    public boolean o() {
        return ((eo7) this.c) != null;
    }

    public List p(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            List list = (List) this.b;
            if (i2 >= list.size()) {
                break;
            }
            int i3 = i2 * 2;
            long[] jArr = (long[]) this.c;
            if (jArr[i3] <= j && j < jArr[i3 + 1]) {
                h4g h4g = (h4g) list.get(i2);
                yz3 yz3 = h4g.a;
                if (yz3.e == -3.4028235E38f) {
                    arrayList2.add(h4g);
                } else {
                    arrayList.add(yz3);
                }
            }
            i2++;
        }
        Collections.sort(arrayList2, new ye4(29));
        while (i < arrayList2.size()) {
            yz3 yz32 = ((h4g) arrayList2.get(i)).a;
            ArrayList arrayList3 = arrayList2;
            yz3 yz33 = r4;
            yz3 yz34 = new yz3(yz32.a, yz32.b, yz32.c, yz32.d, (float) (-1 - i), 1, yz32.g, yz32.h, yz32.i, yz32.n, yz32.o, yz32.j, yz32.k, yz32.l, yz32.m, yz32.p, yz32.q);
            arrayList.add(yz33);
            i++;
            arrayList2 = arrayList3;
        }
        return arrayList;
    }

    public String q(lq1 lq1) {
        lq1.a(new re(27, this), ju0.k());
        ((yh6) this.o).a.set(lq1);
        return "HandlerScheduledFuture-" + ((Callable) this.c).toString();
    }

    public void r(eg7 eg7) {
        du1 du1 = (du1) this.o;
        if (du1 != null) {
            du1.run();
        }
        du1 du12 = new du1((gh7) this.b, eg7);
        this.o = du12;
        ((Handler) this.c).postAtFrontOfQueue(du12);
    }

    public void s(io7 io7) {
        eo7 eo7 = (eo7) this.c;
        if (eo7 != null) {
            eo7.a(true);
        }
        ExecutorService executorService = (ExecutorService) this.b;
        if (io7 != null) {
            executorService.execute(new q57(6, io7));
        }
        executorService.shutdown();
    }

    public void t(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public int u() {
        return ((long[]) this.o).length;
    }

    public long v(go7 go7, do7 do7, int i) {
        Looper myLooper = Looper.myLooper();
        fm9.l(myLooper);
        this.o = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        eo7 eo7 = new eo7(this, myLooper, go7, do7, i, elapsedRealtime, 1);
        fm9.k(((eo7) this.c) == null);
        this.c = eo7;
        eo7.o = null;
        ((ExecutorService) this.b).execute(eo7);
        return elapsedRealtime;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.io.OutputStream, ky3, java.io.FilterOutputStream] */
    public void w(f9 f9Var) {
        File file = (File) this.c;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ? filterOutputStream = new FilterOutputStream(fileOutputStream);
                filterOutputStream.a = 0;
                InputStream n = ((g05) f9Var.b).n();
                if (n != null) {
                    ((du0) f9Var.c).c.i(n, filterOutputStream);
                    filterOutputStream.flush();
                    long j = filterOutputStream.a;
                    fileOutputStream.close();
                    if (file.length() != j) {
                        long length = file.length();
                        StringBuilder k = au1.k(j, "File was not written completely. Expected: ", ", found: ");
                        k.append(length);
                        throw new IOException(k.toString());
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e) {
            lq9 lq9 = ((o94) this.o).d;
            int i = o94.g;
            lq9.getClass();
            throw e;
        }
    }

    public /* synthetic */ vq7(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.a = i;
        this.o = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ vq7(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public vq7(a4c a4c, d4c d4c) {
        this.a = 3;
        this.b = a4c;
        this.c = d4c;
        this.o = new Object();
    }

    public vq7(Context context, String str) {
        this.a = 0;
        this.b = str;
        this.o = context;
        this.c = vq7.class.getName();
    }

    public vq7(eh7 eh7) {
        this.a = 11;
        this.b = new gh7(eh7);
        this.c = new Handler();
    }

    public vq7(nw4 nw4) {
        this.a = 6;
        ArrayList arrayList = (ArrayList) nw4.b;
        this.b = arrayList != null ? new ArrayList(arrayList) : null;
        ide ide = (ide) nw4.c;
        this.o = ide == null ? new x24(3, Boolean.FALSE) : ide;
        this.c = (ty2) nw4.o;
    }

    public vq7(ArrayList arrayList) {
        this.a = 14;
        this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[(arrayList.size() * 2)];
        for (int i = 0; i < arrayList.size(); i++) {
            h4g h4g = (h4g) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.c;
            jArr[i2] = h4g.b;
            jArr[i2 + 1] = h4g.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.o = copyOf;
        Arrays.sort(copyOf);
    }

    public vq7(Context context, LocationManager locationManager) {
        this.a = 13;
        this.c = new Object();
        this.o = context;
        this.b = locationManager;
    }

    public vq7(String str) {
        this.a = 1;
        String concat = "ExoPlayer:Loader:".concat(str);
        int i = oaf.a;
        this.b = Executors.newSingleThreadExecutor(new pd3(2, concat));
    }

    public vq7(bm7 bm7, lq1 lq1, String str) {
        this.a = 12;
        this.c = bm7;
        this.o = lq1;
        this.b = str;
    }

    public vq7(String str, String str2) {
        this.a = 8;
        Bundle bundle = new Bundle();
        this.b = bundle;
        if (str != null) {
            bundle.putString("id", str);
            if (str2 != null) {
                bundle.putString("name", str2);
                return;
            }
            throw new NullPointerException("name must not be null");
        }
        throw new NullPointerException("id must not be null");
    }
}
