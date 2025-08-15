package defpackage;

import android.os.ConditionVariable;
import com.google.android.exoplayer2.upstream.cache.Cache$CacheException;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* renamed from: rpd  reason: default package */
public final class rpd implements hw0 {
    public static final HashSet i = new HashSet();
    public final File a;
    public final re7 b;
    public final x99 c;
    public final HashMap d;
    public final Random e;
    public final boolean f;
    public long g;
    public Cache$CacheException h;

    public rpd(File file, re7 re7) {
        boolean add;
        x99 x99 = new x99(file);
        synchronized (rpd.class) {
            add = i.add(file.getAbsoluteFile());
        }
        if (add) {
            this.a = file;
            this.b = re7;
            this.c = x99;
            this.d = new HashMap();
            this.e = new Random();
            this.f = true;
            this.g = -1;
            ConditionVariable conditionVariable = new ConditionVariable();
            new n74(this, conditionVariable, 1).start();
            conditionVariable.block();
            return;
        }
        String valueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(valueOf.length() + 46);
        sb.append("Another SimpleCache instance uses the folder: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.io.IOException, com.google.android.exoplayer2.upstream.cache.Cache$CacheException] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.io.IOException, com.google.android.exoplayer2.upstream.cache.Cache$CacheException] */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.io.IOException, com.google.android.exoplayer2.upstream.cache.Cache$CacheException] */
    public static void a(rpd rpd) {
        long j;
        x99 x99 = rpd.c;
        File file = rpd.a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (Cache$CacheException e2) {
                rpd.h = e2;
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(valueOf.length() + 38);
            sb.append("Failed to list cache directory files: ");
            sb.append(valueOf);
            rpd.h = new IOException(sb.toString());
            return;
        }
        int length = listFiles.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                j = -1;
                break;
            }
            File file2 = listFiles[i2];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    new StringBuilder(String.valueOf(file2).length() + 20);
                    file2.delete();
                }
            } else {
                i2++;
            }
        }
        rpd.g = j;
        if (j == -1) {
            try {
                rpd.g = f(file);
            } catch (IOException e3) {
                String valueOf2 = String.valueOf(file);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 28);
                sb2.append("Failed to create cache UID: ");
                sb2.append(valueOf2);
                String sb3 = sb2.toString();
                fm9.c(sb3, e3);
                rpd.h = new IOException(sb3, e3);
                return;
            }
        }
        try {
            x99.k(rpd.g);
            rpd.getClass();
            rpd.h(file, true, listFiles);
            m5f g2 = jx6.j(((HashMap) x99.a).keySet()).iterator();
            while (g2.hasNext()) {
                x99.l((String) g2.next());
            }
            try {
                x99.n();
            } catch (IOException e4) {
                fm9.c("Storing index file failed", e4);
            }
        } catch (IOException e5) {
            String valueOf3 = String.valueOf(file);
            StringBuilder sb4 = new StringBuilder(valueOf3.length() + 36);
            sb4.append("Failed to initialize cache indices: ");
            sb4.append(valueOf3);
            String sb5 = sb4.toString();
            fm9.c(sb5, e5);
            rpd.h = new IOException(sb5, e5);
        }
    }

    public static void e(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(valueOf.length() + 34);
            sb.append("Failed to create cache directory: ");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
    }

    public static long f(File file) {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0 : Math.abs(nextLong);
        String valueOf = String.valueOf(Long.toString(abs, 16));
        File file2 = new File(file, ".uid".length() != 0 ? valueOf.concat(".uid") : new String(valueOf));
        if (file2.createNewFile()) {
            return abs;
        }
        String valueOf2 = String.valueOf(file2);
        StringBuilder sb = new StringBuilder(valueOf2.length() + 27);
        sb.append("Failed to create UID file: ");
        sb.append(valueOf2);
        throw new IOException(sb.toString());
    }

    public final void b(upd upd) {
        x99 x99 = this.c;
        String str = upd.a;
        x99.j(str).c.add(upd);
        ArrayList arrayList = (ArrayList) this.d.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((re7) arrayList.get(size)).b(this, upd);
            }
        }
        this.b.b(this, upd);
    }

    public final synchronized void c(String str, h7b h7b) {
        d();
        x99 x99 = this.c;
        lx0 j = x99.j(str);
        a94 a94 = j.e;
        a94 b2 = a94.b(h7b);
        j.e = b2;
        if (!b2.equals(a94)) {
            ((nx0) x99.X).q(j);
        }
        try {
            this.c.n();
        } catch (IOException e2) {
            throw new IOException(e2);
        }
    }

    public final synchronized void d() {
        Cache$CacheException cache$CacheException = this.h;
        if (cache$CacheException != null) {
            throw cache$CacheException;
        }
    }

    public final synchronized a94 g(String str) {
        lx0 i2;
        i2 = this.c.i(str);
        return i2 != null ? i2.e : a94.c;
    }

    public final void h(File file, boolean z, File[] fileArr) {
        if (fileArr != null && fileArr.length != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    h(file2, false, file2.listFiles());
                } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                    upd b2 = upd.b(file2, -1, this.c);
                    if (b2 != null) {
                        b(b2);
                    } else {
                        file2.delete();
                    }
                }
            }
        } else if (!z) {
            file.delete();
        }
    }

    public final synchronized void i(upd upd) {
        lx0 i2 = this.c.i(upd.a);
        i2.getClass();
        long j = upd.b;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = i2.d;
            if (i3 >= arrayList.size()) {
                throw new IllegalStateException();
            } else if (((jx0) arrayList.get(i3)).a == j) {
                arrayList.remove(i3);
                this.c.l(i2.b);
                notifyAll();
            } else {
                i3++;
            }
        }
    }

    public final void j(dx0 dx0) {
        String str = dx0.a;
        x99 x99 = this.c;
        lx0 i2 = x99.i(str);
        if (i2 != null && i2.c.remove(dx0)) {
            File file = dx0.X;
            if (file != null) {
                file.delete();
            }
            x99.l(i2.b);
            ArrayList arrayList = (ArrayList) this.d.get(dx0.a);
            long j = dx0.c;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    re7 re7 = (re7) arrayList.get(size);
                    re7.a.remove(dx0);
                    re7.b -= j;
                }
            }
            re7 re72 = this.b;
            re72.a.remove(dx0);
            re72.b -= j;
        }
    }

    public final void k() {
        ArrayList arrayList = new ArrayList();
        for (lx0 lx0 : Collections.unmodifiableCollection(((HashMap) this.c.a).values())) {
            Iterator it = lx0.c.iterator();
            while (it.hasNext()) {
                dx0 dx0 = (dx0) it.next();
                if (dx0.X.length() != dx0.c) {
                    arrayList.add(dx0);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            j((dx0) arrayList.get(i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: upd} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r1v5, types: [dx0] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        return null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.upd l(long r11, java.lang.String r13, long r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.d()     // Catch:{ all -> 0x003f }
            x99 r0 = r10.c     // Catch:{ all -> 0x003f }
            lx0 r0 = r0.i(r13)     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x001c
            upd r0 = new upd     // Catch:{ all -> 0x003f }
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            r1 = r0
            r2 = r13
            r3 = r11
            r5 = r14
            r1.<init>(r2, r3, r5, r7, r9)     // Catch:{ all -> 0x003f }
            goto L_0x0035
        L_0x001c:
            upd r1 = r0.a(r11, r14)     // Catch:{ all -> 0x003f }
            boolean r2 = r1.o     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x0034
            java.io.File r2 = r1.X     // Catch:{ all -> 0x003f }
            long r2 = r2.length()     // Catch:{ all -> 0x003f }
            long r4 = r1.c     // Catch:{ all -> 0x003f }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0034
            r10.k()     // Catch:{ all -> 0x003f }
            goto L_0x001c
        L_0x0034:
            r0 = r1
        L_0x0035:
            boolean r14 = r0.o     // Catch:{ all -> 0x003f }
            if (r14 == 0) goto L_0x0041
            upd r11 = r10.m(r13, r0)     // Catch:{ all -> 0x003f }
            monitor-exit(r10)
            return r11
        L_0x003f:
            r11 = move-exception
            goto L_0x0087
        L_0x0041:
            x99 r14 = r10.c     // Catch:{ all -> 0x003f }
            lx0 r13 = r14.j(r13)     // Catch:{ all -> 0x003f }
            long r14 = r0.c     // Catch:{ all -> 0x003f }
            r1 = 0
        L_0x004a:
            java.util.ArrayList r2 = r13.d     // Catch:{ all -> 0x003f }
            int r3 = r2.size()     // Catch:{ all -> 0x003f }
            if (r1 >= r3) goto L_0x007d
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x003f }
            jx0 r2 = (defpackage.jx0) r2     // Catch:{ all -> 0x003f }
            long r3 = r2.a     // Catch:{ all -> 0x003f }
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            r6 = -1
            if (r5 > 0) goto L_0x006c
            long r8 = r2.b     // Catch:{ all -> 0x003f }
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x007a
            long r3 = r3 + r8
            int r2 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x0077
            goto L_0x007a
        L_0x006c:
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x007a
            long r5 = r11 + r14
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0077
            goto L_0x007a
        L_0x0077:
            int r1 = r1 + 1
            goto L_0x004a
        L_0x007a:
            monitor-exit(r10)
            r10 = 0
            return r10
        L_0x007d:
            jx0 r13 = new jx0     // Catch:{ all -> 0x003f }
            r13.<init>(r11, r14)     // Catch:{ all -> 0x003f }
            r2.add(r13)     // Catch:{ all -> 0x003f }
            monitor-exit(r10)
            return r0
        L_0x0087:
            monitor-exit(r10)     // Catch:{ all -> 0x003f }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpd.l(long, java.lang.String, long):upd");
    }

    public final upd m(String str, upd upd) {
        File file;
        if (!this.f) {
            return upd;
        }
        File file2 = upd.X;
        file2.getClass();
        file2.getName();
        long currentTimeMillis = System.currentTimeMillis();
        lx0 i2 = this.c.i(str);
        TreeSet treeSet = i2.c;
        np8.f(treeSet.remove(upd));
        file2.getClass();
        File parentFile = file2.getParentFile();
        parentFile.getClass();
        File c2 = upd.c(parentFile, i2.a, upd.b, currentTimeMillis);
        if (file2.renameTo(c2)) {
            file = c2;
        } else {
            new StringBuilder(String.valueOf(c2).length() + String.valueOf(file2).length() + 21);
            file = file2;
        }
        np8.f(upd.o);
        dx0 dx0 = new dx0(upd.a, upd.b, upd.c, currentTimeMillis, file);
        treeSet.add(dx0);
        ArrayList arrayList = (ArrayList) this.d.get(upd.a);
        long j = upd.c;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                re7 re7 = (re7) arrayList.get(size);
                re7.a.remove(upd);
                re7.b -= j;
                re7.b(this, dx0);
            }
        }
        re7 re72 = this.b;
        re72.a.remove(upd);
        re72.b -= j;
        re72.b(this, dx0);
        return dx0;
    }
}
