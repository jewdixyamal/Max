package defpackage;

import com.facebook.common.file.FileUtils$CreateDirectoryException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* renamed from: cu4  reason: default package */
public final class cu4 implements dl4 {
    public final int a;
    public final ide b;
    public final String c;
    public final lq9 d;
    public volatile ph4 e = new ph4((Object) null, (Object) null, false);

    public cu4(int i, ide ide, String str, lq9 lq9) {
        this.a = i;
        this.d = lq9;
        this.b = ide;
        this.c = str;
    }

    public final kg5 a(Object obj, String str) {
        return h().a(obj, str);
    }

    public final void b() {
        try {
            h().b();
        } catch (IOException e2) {
            if (ta5.a.i(6)) {
                ta5.a.e(cu4.class.getSimpleName(), "purgeUnexpectedResources", e2);
            }
        }
    }

    public final long c(l94 l94) {
        return h().c(l94);
    }

    public final Collection d() {
        return h().d();
    }

    public final void e() {
        h().e();
    }

    public final vq7 f(Object obj, String str) {
        return h().f(obj, str);
    }

    public final void g() {
        File file = new File((File) this.b.get(), this.c);
        try {
            oag.y(file);
            String absolutePath = file.getAbsolutePath();
            if (ta5.a.i(3)) {
                ft7 ft7 = ta5.a;
                String simpleName = cu4.class.getSimpleName();
                ft7.d(simpleName, "Created cache directory " + absolutePath);
            }
            this.e = new ph4((Object) file, (Object) new o94(file, this.a, this.d), false);
        } catch (FileUtils$CreateDirectoryException e2) {
            this.d.getClass();
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b A[Catch:{ all -> 0x0038 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.dl4 h() {
        /*
            r2 = this;
            monitor-enter(r2)
            ph4 r0 = r2.e     // Catch:{ all -> 0x0038 }
            java.lang.Object r1 = r0.a     // Catch:{ all -> 0x0038 }
            dl4 r1 = (defpackage.dl4) r1     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0018
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0038 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r0 = 0
            goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            if (r0 == 0) goto L_0x003a
            ph4 r0 = r2.e     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.a     // Catch:{ all -> 0x0038 }
            dl4 r0 = (defpackage.dl4) r0     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0034
            ph4 r0 = r2.e     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0038 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0034
            ph4 r0 = r2.e     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0038 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0038 }
            defpackage.mqd.f(r0)     // Catch:{ all -> 0x0038 }
        L_0x0034:
            r2.g()     // Catch:{ all -> 0x0038 }
            goto L_0x003a
        L_0x0038:
            r0 = move-exception
            goto L_0x0045
        L_0x003a:
            ph4 r0 = r2.e     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.a     // Catch:{ all -> 0x0038 }
            dl4 r0 = (defpackage.dl4) r0     // Catch:{ all -> 0x0038 }
            r0.getClass()     // Catch:{ all -> 0x0038 }
            monitor-exit(r2)
            return r0
        L_0x0045:
            monitor-exit(r2)     // Catch:{ all -> 0x0038 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu4.h():dl4");
    }

    public final boolean isExternal() {
        try {
            return h().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }
}
