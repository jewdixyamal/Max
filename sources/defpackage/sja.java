package defpackage;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;

/* renamed from: sja  reason: default package */
public final class sja implements efe {
    public static final Pattern e = Pattern.compile("^bytes \\*/([0-9]+)");
    public static final Pattern f = Pattern.compile(".*filename=\".*\\.(\\w+)\".*");
    public final w0f a;
    public final je7 b;
    public final String c = sja.class.getName();
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public sja(je7 je7, w0f w0f) {
        this.a = w0f;
        this.b = je7;
    }

    public static String e(yic yic) {
        String a2 = yic.a(yic, "Content-Disposition");
        if (!(a2 == null || a2.length() == 0)) {
            Matcher matcher = f.matcher(a2);
            if (matcher.matches()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static File f(File file, String str) {
        if (file != null) {
            return new File(file.getParent(), rh4.j(file.getName(), "_part_", str));
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: mhc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: sja} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x025c, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c9, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r4 = (defpackage.yic) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b5, code lost:
        r0 = r1;
        r1 = r2;
        r2 = r7;
        r3 = r13;
        r13 = r15;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r19, java.io.File r20, defpackage.cfe r21, java.lang.String r22, boolean r23, kotlin.coroutines.Continuation r24) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            r3 = r21
            r4 = r24
            boolean r5 = r4 instanceof defpackage.mja
            if (r5 == 0) goto L_0x001d
            r5 = r4
            mja r5 = (defpackage.mja) r5
            int r6 = r5.x0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.x0 = r6
            goto L_0x0022
        L_0x001d:
            mja r5 = new mja
            r5.<init>(r1, r4)
        L_0x0022:
            java.lang.Object r4 = r5.v0
            tx3 r6 = defpackage.tx3.a
            int r7 = r5.x0
            bfe r8 = defpackage.bfe.c
            r10 = 0
            r11 = 1
            e5f r12 = defpackage.e5f.a
            switch(r7) {
                case 0: goto L_0x0090;
                case 1: goto L_0x008b;
                case 2: goto L_0x0087;
                case 3: goto L_0x007e;
                case 4: goto L_0x005c;
                case 5: goto L_0x0047;
                case 6: goto L_0x0042;
                case 7: goto L_0x0039;
                default: goto L_0x0031;
            }
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            java.lang.Object r0 = r5.o
            sja r0 = (defpackage.sja) r0
            defpackage.od2.a0(r4)
            goto L_0x022e
        L_0x0042:
            defpackage.od2.a0(r4)
            goto L_0x0208
        L_0x0047:
            boolean r0 = r5.u0
            java.lang.Object r1 = r5.s0
            kja r1 = (defpackage.kja) r1
            java.io.File r2 = r5.Z
            cfe r3 = r5.Y
            java.io.File r7 = r5.X
            java.lang.Object r13 = r5.o
            sja r13 = (defpackage.sja) r13
            defpackage.od2.a0(r4)
            goto L_0x01ec
        L_0x005c:
            boolean r1 = r5.u0
            kja r2 = r5.t0
            java.lang.Object r0 = r5.s0
            r3 = r0
            mhc r3 = (defpackage.mhc) r3
            java.io.File r7 = r5.Z
            cfe r13 = r5.Y
            java.io.File r14 = r5.X
            java.lang.Object r0 = r5.o
            r15 = r0
            sja r15 = (defpackage.sja) r15
            defpackage.od2.a0(r4)     // Catch:{ IOException -> 0x0075 }
            goto L_0x01b3
        L_0x0075:
            r0 = move-exception
            r9 = r2
            r4 = r3
            r3 = r13
            r2 = r14
            r14 = r1
            r1 = r15
            goto L_0x01c0
        L_0x007e:
            java.lang.Object r0 = r5.o
            java.io.File r0 = (java.io.File) r0
            defpackage.od2.a0(r4)
            goto L_0x0246
        L_0x0087:
            defpackage.od2.a0(r4)
            goto L_0x00c9
        L_0x008b:
            defpackage.od2.a0(r4)
            goto L_0x025c
        L_0x0090:
            defpackage.od2.a0(r4)
            java.lang.String r4 = r1.c
            ir6 r7 = defpackage.hm9.m
            if (r7 != 0) goto L_0x009a
            goto L_0x00ab
        L_0x009a:
            boolean r13 = r7.c()
            if (r13 == 0) goto L_0x00ab
            us7 r13 = defpackage.us7.X
            java.lang.String r14 = "File download. url = "
            java.lang.String r14 = defpackage.wg0.i(r14, r0)
            r7.d(r13, r4, r14, r10)
        L_0x00ab:
            if (r0 == 0) goto L_0x024b
            int r4 = r19.length()
            if (r4 != 0) goto L_0x00b5
            goto L_0x024b
        L_0x00b5:
            if (r2 != 0) goto L_0x00ca
            java.lang.String r0 = r1.c
            java.lang.String r1 = "File download. Output file is null"
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
            if (r3 == 0) goto L_0x00c9
            r0 = 2
            r5.x0 = r0
            r21.a()
            if (r12 != r6) goto L_0x00c9
            return r6
        L_0x00c9:
            return r8
        L_0x00ca:
            r4 = r22
            java.io.File r7 = f(r2, r4)
            java.util.concurrent.ConcurrentHashMap r4 = r1.d
            java.lang.String r13 = r7.getAbsolutePath()
            java.lang.Object r4 = r4.get(r13)
            kja r4 = (defpackage.kja) r4
            if (r4 == 0) goto L_0x0112
            java.util.concurrent.CopyOnWriteArrayList r4 = r4.b
            int r13 = r4.size()
            r14 = 0
        L_0x00e5:
            if (r14 >= r13) goto L_0x0112
            java.lang.Object r15 = r4.get(r14)
            cfe r15 = (defpackage.cfe) r15
            if (r15 == 0) goto L_0x00f4
            java.lang.String r15 = r15.getDownloadContext()
            goto L_0x00f5
        L_0x00f4:
            r15 = r10
        L_0x00f5:
            if (r3 == 0) goto L_0x00fe
            java.lang.String r16 = r21.getDownloadContext()
            r9 = r16
            goto L_0x00ff
        L_0x00fe:
            r9 = r10
        L_0x00ff:
            boolean r9 = defpackage.tpa.f(r15, r9)
            if (r9 == 0) goto L_0x010f
            java.lang.String r0 = "File download. File already downloading in listener context, do nothing"
            java.lang.String r1 = r1.c
            defpackage.hm9.m(r1, r0, new java.lang.Object[0])
            bfe r0 = defpackage.bfe.a
            return r0
        L_0x010f:
            int r14 = r14 + 1
            goto L_0x00e5
        L_0x0112:
            java.lang.String r4 = r1.c     // Catch:{ IllegalArgumentException -> 0x0238 }
            java.lang.String r9 = "File download. Start"
            defpackage.hm9.m(r4, r9, new java.lang.Object[0])     // Catch:{ IllegalArgumentException -> 0x0238 }
            l84 r4 = new l84     // Catch:{ IllegalArgumentException -> 0x0238 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x0238 }
            r4.S(r0)     // Catch:{ IllegalArgumentException -> 0x0238 }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ IllegalArgumentException -> 0x0238 }
            java.lang.String r0 = r0.toString()     // Catch:{ IllegalArgumentException -> 0x0238 }
            r4.Q(r0)     // Catch:{ IllegalArgumentException -> 0x0238 }
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x0168
            long r13 = r7.length()
            r15 = 0
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0168
            java.lang.String r0 = r1.c
            long r13 = r7.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r15 = "File download. resume download file, downloaded size: "
            r9.<init>(r15)
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            defpackage.hm9.m(r0, r9, new java.lang.Object[0])
            long r13 = r7.length()
            java.lang.String r0 = "bytes="
            java.lang.String r9 = "-"
            java.lang.String r0 = defpackage.ey8.i(r13, r0, r9)
            java.lang.Object r9 = r4.c
            bj6 r9 = (defpackage.bj6) r9
            java.lang.String r13 = "Range"
            r9.a(r13, r0)
        L_0x0168:
            mhc r4 = r4.r()
            je7 r0 = r1.b
            java.lang.Object r0 = r0.getValue()
            u2a r0 = (defpackage.u2a) r0
            b8c r0 = r0.b(r4)
            kja r9 = new kja
            r9.<init>(r0)
            java.util.concurrent.CopyOnWriteArrayList r13 = r9.b
            r13.add(r3)
            java.util.concurrent.ConcurrentHashMap r13 = r1.d
            java.lang.String r14 = r7.getAbsolutePath()
            r13.put(r14, r9)
            zj7 r13 = new zj7     // Catch:{ IOException -> 0x01bd }
            r14 = 19
            r13.<init>(r14, r0)     // Catch:{ IOException -> 0x01bd }
            r5.o = r1     // Catch:{ IOException -> 0x01bd }
            r5.X = r2     // Catch:{ IOException -> 0x01bd }
            r5.Y = r3     // Catch:{ IOException -> 0x01bd }
            r5.Z = r7     // Catch:{ IOException -> 0x01bd }
            r5.s0 = r4     // Catch:{ IOException -> 0x01bd }
            r5.t0 = r9     // Catch:{ IOException -> 0x01bd }
            r14 = r23
            r5.u0 = r14     // Catch:{ IOException -> 0x01bb }
            r0 = 4
            r5.x0 = r0     // Catch:{ IOException -> 0x01bb }
            java.lang.Object r0 = defpackage.ema.C(r13, r5)     // Catch:{ IOException -> 0x01bb }
            if (r0 != r6) goto L_0x01ac
            return r6
        L_0x01ac:
            r15 = r1
            r13 = r3
            r3 = r4
            r1 = r14
            r4 = r0
            r14 = r2
            r2 = r9
        L_0x01b3:
            yic r4 = (defpackage.yic) r4     // Catch:{ IOException -> 0x0075 }
            r0 = r1
            r1 = r2
            r2 = r7
            r3 = r13
            r13 = r15
            goto L_0x01ee
        L_0x01bb:
            r0 = move-exception
            goto L_0x01c0
        L_0x01bd:
            r0 = move-exception
            r14 = r23
        L_0x01c0:
            r5.o = r1
            r5.X = r2
            r5.Y = r3
            r5.Z = r7
            r5.s0 = r9
            r5.t0 = r10
            r5.u0 = r14
            r13 = 5
            r5.x0 = r13
            r18 = r1
            r19 = r0
            r20 = r4
            r21 = r9
            r22 = r7
            r23 = r5
            java.lang.Object r0 = r18.h(r19, r20, r21, r22, r23)
            if (r0 != r6) goto L_0x01e4
            return r6
        L_0x01e4:
            r13 = r1
            r1 = r9
            r0 = r14
            r17 = r7
            r7 = r2
            r2 = r17
        L_0x01ec:
            r14 = r7
            r4 = r10
        L_0x01ee:
            if (r4 != 0) goto L_0x0209
            if (r3 == 0) goto L_0x0208
            r5.o = r10
            r5.X = r10
            r5.Y = r10
            r5.Z = r10
            r5.s0 = r10
            r5.t0 = r10
            r0 = 6
            r5.x0 = r0
            r1 = 0
            r3.e(r11, r1)
            if (r12 != r6) goto L_0x0208
            return r6
        L_0x0208:
            return r8
        L_0x0209:
            r5.o = r13
            r5.X = r10
            r5.Y = r10
            r5.Z = r10
            r5.s0 = r10
            r5.t0 = r10
            r3 = 7
            r5.x0 = r3
            r18 = r13
            r19 = r4
            r20 = r1
            r21 = r2
            r22 = r14
            r23 = r0
            r24 = r5
            java.lang.Object r0 = r18.i(r19, r20, r21, r22, r23, r24)
            if (r0 != r6) goto L_0x022d
            return r6
        L_0x022d:
            r0 = r13
        L_0x022e:
            java.lang.String r0 = r0.c
            java.lang.String r1 = "File download. Stop"
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
            bfe r0 = defpackage.bfe.b
            return r0
        L_0x0238:
            if (r3 == 0) goto L_0x0247
            r5.o = r7
            r0 = 3
            r5.x0 = r0
            r21.a()
            if (r12 != r6) goto L_0x0245
            return r6
        L_0x0245:
            r0 = r7
        L_0x0246:
            r7 = r0
        L_0x0247:
            r7.delete()
            return r8
        L_0x024b:
            java.lang.String r0 = r1.c
            java.lang.String r1 = "File download. Error empty url"
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
            if (r3 == 0) goto L_0x025c
            r5.x0 = r11
            r21.a()
            if (r12 != r6) goto L_0x025c
            return r6
        L_0x025c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sja.a(java.lang.String, java.io.File, cfe, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.io.File r8, java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.lja
            if (r0 == 0) goto L_0x0013
            r0 = r10
            lja r0 = (defpackage.lja) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            lja r0 = new lja
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.util.Iterator r7 = r0.o
            defpackage.od2.a0(r10)
            goto L_0x007f
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            defpackage.od2.a0(r10)
            java.util.concurrent.ConcurrentHashMap r10 = r7.d
            java.io.File r8 = f(r8, r9)
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.Object r8 = r10.get(r8)
            kja r8 = (defpackage.kja) r8
            java.lang.String r7 = r7.c
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto L_0x004b
            goto L_0x0072
        L_0x004b:
            boolean r2 = r10.c()
            if (r2 == 0) goto L_0x0072
            us7 r2 = defpackage.us7.X
            if (r8 == 0) goto L_0x0057
            r4 = r3
            goto L_0x0058
        L_0x0057:
            r4 = 0
        L_0x0058:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "File download. Cancel download, attachId:"
            r5.<init>(r6)
            r5.append(r9)
            java.lang.String r9 = ", task exist:"
            r5.append(r9)
            r5.append(r4)
            java.lang.String r9 = r5.toString()
            r4 = 0
            r10.d(r2, r7, r9, r4)
        L_0x0072:
            if (r8 == 0) goto L_0x0098
            b8c r7 = r8.a
            r7.d()
            java.util.concurrent.CopyOnWriteArrayList r7 = r8.b
            java.util.Iterator r7 = r7.iterator()
        L_0x007f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0098
            java.lang.Object r8 = r7.next()
            cfe r8 = (defpackage.cfe) r8
            if (r8 == 0) goto L_0x007f
            r0.o = r7
            r0.Z = r3
            java.lang.Object r8 = r8.d(r0)
            if (r8 != r1) goto L_0x007f
            return r1
        L_0x0098:
            e5f r7 = defpackage.e5f.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sja.b(java.io.File, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object c(File file, String str, Continuation continuation) {
        String absolutePath = f(file, str).getAbsolutePath();
        kja kja = (kja) this.d.get(absolutePath);
        String str2 = this.c;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            boolean z = kja != null;
            ir6.d(us7, str2, "File download. Silent cancel download, attachId:" + str + ", task exist:" + z, (Throwable) null);
        }
        if (kja != null) {
            kja.a.d();
            j(kja, absolutePath);
        }
        return e5f.a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0124, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0128, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0129, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012a, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        defpackage.v3c.i(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012d, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0130, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        defpackage.v3c.i(r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0134, code lost:
        throw r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:58:0x0113, B:64:0x0127, B:71:0x012e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6 A[Catch:{ IOException -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b3 A[SYNTHETIC, Splitter:B:38:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00de A[Catch:{ all -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0135 A[Catch:{ IOException -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.io.File r20, java.io.File r21, java.lang.String r22, kotlin.coroutines.Continuation r23) {
        /*
            r19 = this;
            r1 = r19
            r0 = r22
            r2 = r23
            boolean r3 = r2 instanceof defpackage.nja
            if (r3 == 0) goto L_0x0019
            r3 = r2
            nja r3 = (defpackage.nja) r3
            int r4 = r3.A0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.A0 = r4
            goto L_0x001e
        L_0x0019:
            nja r3 = new nja
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.y0
            tx3 r4 = defpackage.tx3.a
            int r5 = r3.A0
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x0057
            if (r5 != r8) goto L_0x004f
            long r0 = r3.x0
            byte[] r5 = r3.w0
            java.io.OutputStream r9 = r3.v0
            java.io.Closeable r10 = r3.u0
            java.io.InputStream r11 = r3.t0
            java.io.Closeable r12 = r3.s0
            java.io.File r13 = r3.Z
            java.io.File r14 = r3.Y
            java.io.File r15 = r3.X
            sja r6 = r3.o
            defpackage.od2.a0(r2)     // Catch:{ all -> 0x004a }
            r2 = r5
            r17 = r0
            r1 = r6
            r0 = r15
            r15 = r17
            goto L_0x0104
        L_0x004a:
            r0 = move-exception
            r2 = r0
            r1 = r6
            goto L_0x0127
        L_0x004f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0057:
            defpackage.od2.a0(r2)
            java.lang.String r2 = r1.c     // Catch:{ IOException -> 0x009c }
            java.lang.String r5 = "File download. Start copy data from temp file to output"
            defpackage.hm9.m(r2, r5, new java.lang.Object[0])     // Catch:{ IOException -> 0x009c }
            if (r0 == 0) goto L_0x009e
            int r2 = r22.length()     // Catch:{ IOException -> 0x009c }
            if (r2 != 0) goto L_0x006a
            goto L_0x009e
        L_0x006a:
            java.lang.String r2 = r21.getName()     // Catch:{ IOException -> 0x009c }
            r5 = 6
            r6 = 46
            int r5 = defpackage.w9e.E0(r2, r6, r7, r5)     // Catch:{ IOException -> 0x009c }
            if (r5 < 0) goto L_0x007b
            java.lang.String r2 = r2.substring(r7, r5)     // Catch:{ IOException -> 0x009c }
        L_0x007b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009c }
            r5.<init>()     // Catch:{ IOException -> 0x009c }
            r5.append(r2)     // Catch:{ IOException -> 0x009c }
            java.lang.String r2 = "."
            r5.append(r2)     // Catch:{ IOException -> 0x009c }
            r5.append(r0)     // Catch:{ IOException -> 0x009c }
            java.lang.String r0 = r5.toString()     // Catch:{ IOException -> 0x009c }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x009c }
            java.io.File r5 = r21.getParentFile()     // Catch:{ IOException -> 0x009c }
            r2.<init>(r5, r0)     // Catch:{ IOException -> 0x009c }
            goto L_0x00a0
        L_0x0099:
            r14 = 0
            goto L_0x0141
        L_0x009c:
            r0 = move-exception
            goto L_0x0099
        L_0x009e:
            r2 = r21
        L_0x00a0:
            java.io.File r0 = r2.getParentFile()     // Catch:{ IOException -> 0x009c }
            if (r0 == 0) goto L_0x00b0
            java.lang.String r2 = r2.getName()     // Catch:{ IOException -> 0x009c }
            java.io.File r0 = defpackage.kj6.p(r0, r2)     // Catch:{ IOException -> 0x009c }
            r14 = r0
            goto L_0x00b1
        L_0x00b0:
            r14 = 0
        L_0x00b1:
            if (r14 == 0) goto L_0x0135
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00c4 }
            r0 = r20
            r12.<init>(r0)     // Catch:{ IOException -> 0x00c4 }
            java.io.File r2 = r14.getParentFile()     // Catch:{ IOException -> 0x00c4 }
            if (r2 == 0) goto L_0x00c7
            r2.mkdirs()     // Catch:{ IOException -> 0x00c4 }
            goto L_0x00c7
        L_0x00c4:
            r0 = move-exception
            goto L_0x0141
        L_0x00c7:
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00c4 }
            r10.<init>(r14, r8)     // Catch:{ IOException -> 0x00c4 }
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x010c }
            java.lang.System.nanoTime()     // Catch:{ all -> 0x010c }
            int r5 = r12.read(r2)     // Catch:{ all -> 0x010c }
            r15 = 0
            r9 = r10
            r11 = r12
            r13 = r14
        L_0x00dc:
            if (r5 < 0) goto L_0x010f
            java.lang.System.nanoTime()     // Catch:{ all -> 0x010c }
            r9.write(r2, r7, r5)     // Catch:{ all -> 0x010c }
            long r5 = (long) r5     // Catch:{ all -> 0x010c }
            long r5 = r5 + r15
            r3.o = r1     // Catch:{ all -> 0x010c }
            r3.X = r0     // Catch:{ all -> 0x010c }
            r3.Y = r14     // Catch:{ all -> 0x010c }
            r3.Z = r13     // Catch:{ all -> 0x010c }
            r3.s0 = r12     // Catch:{ all -> 0x010c }
            r3.t0 = r11     // Catch:{ all -> 0x010c }
            r3.u0 = r10     // Catch:{ all -> 0x010c }
            r3.v0 = r9     // Catch:{ all -> 0x010c }
            r3.w0 = r2     // Catch:{ all -> 0x010c }
            r3.x0 = r5     // Catch:{ all -> 0x010c }
            r3.A0 = r8     // Catch:{ all -> 0x010c }
            java.lang.Object r15 = defpackage.i24.L(r3)     // Catch:{ all -> 0x010c }
            if (r15 != r4) goto L_0x0103
            return r4
        L_0x0103:
            r15 = r5
        L_0x0104:
            java.lang.System.nanoTime()     // Catch:{ all -> 0x010c }
            int r5 = r11.read(r2)     // Catch:{ all -> 0x010c }
            goto L_0x00dc
        L_0x010c:
            r0 = move-exception
            r2 = r0
            goto L_0x0127
        L_0x010f:
            r9.flush()     // Catch:{ all -> 0x010c }
            r2 = 0
            defpackage.v3c.i(r10, r2)     // Catch:{ all -> 0x0124 }
            defpackage.v3c.i(r12, r2)     // Catch:{ IOException -> 0x00c4 }
            r0.delete()     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r0 = r1.c     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r2 = "File download. Finish copy data"
            defpackage.hm9.m(r0, r2, new java.lang.Object[0])     // Catch:{ IOException -> 0x00c4 }
            goto L_0x014b
        L_0x0124:
            r0 = move-exception
            r2 = r0
            goto L_0x012e
        L_0x0127:
            throw r2     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r0 = move-exception
            r3 = r0
            defpackage.v3c.i(r10, r2)     // Catch:{ all -> 0x0124 }
            throw r3     // Catch:{ all -> 0x0124 }
        L_0x012e:
            throw r2     // Catch:{ all -> 0x012f }
        L_0x012f:
            r0 = move-exception
            r3 = r0
            defpackage.v3c.i(r12, r2)     // Catch:{ IOException -> 0x00c4 }
            throw r3     // Catch:{ IOException -> 0x00c4 }
        L_0x0135:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x00c4 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x00c4 }
            throw r2     // Catch:{ IOException -> 0x00c4 }
        L_0x0141:
            java.lang.String r1 = r1.c
            java.lang.String r0 = r0.getMessage()
            r2 = 0
            defpackage.hm9.p(r1, r0, r2)
        L_0x014b:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sja.d(java.io.File, java.io.File, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.io.File} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0262 A[SYNTHETIC] */
    public final java.lang.Object g(defpackage.i8c r19, long r20, java.io.File r22, defpackage.yic r23, defpackage.kja r24, java.io.File r25, boolean r26, kotlin.coroutines.Continuation r27) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r27
            boolean r7 = r6 instanceof defpackage.oja
            if (r7 == 0) goto L_0x001f
            r7 = r6
            oja r7 = (defpackage.oja) r7
            int r8 = r7.t0
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r8 & r9
            if (r10 == 0) goto L_0x001f
            int r8 = r8 - r9
            r7.t0 = r8
            goto L_0x0024
        L_0x001f:
            oja r7 = new oja
            r7.<init>(r0, r6)
        L_0x0024:
            java.lang.Object r6 = r7.Z
            tx3 r8 = defpackage.tx3.a
            int r9 = r7.t0
            r10 = 3
            r11 = 4
            r12 = 2
            r13 = 1
            if (r9 == 0) goto L_0x007e
            if (r9 == r13) goto L_0x0079
            if (r9 == r12) goto L_0x006c
            if (r9 == r10) goto L_0x0059
            if (r9 != r11) goto L_0x0051
            java.util.Iterator r1 = r7.Y
            java.lang.Object r0 = r7.X
            r2 = r0
            java.io.File r2 = (java.io.File) r2
            sja r3 = r7.o
            defpackage.od2.a0(r6)     // Catch:{ all -> 0x0047 }
            r4 = r11
            goto L_0x024d
        L_0x0047:
            r0 = move-exception
            r4 = r11
            r17 = r2
            r2 = r1
            r1 = r3
            r3 = r17
            goto L_0x0258
        L_0x0051:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0059:
            java.util.Iterator r1 = r7.Y
            java.lang.Object r0 = r7.X
            r2 = r0
            java.io.File r2 = (java.io.File) r2
            sja r3 = r7.o
            defpackage.od2.a0(r6)     // Catch:{ all -> 0x0068 }
            r4 = r10
            goto L_0x01cd
        L_0x0068:
            r0 = move-exception
            r4 = r10
            goto L_0x01f6
        L_0x006c:
            java.lang.Object r0 = r7.X
            kja r0 = (defpackage.kja) r0
            sja r1 = r7.o
            defpackage.od2.a0(r6)
            r5 = r0
            r0 = r1
            goto L_0x01c3
        L_0x0079:
            defpackage.od2.a0(r6)
            goto L_0x0123
        L_0x007e:
            defpackage.od2.a0(r6)
            boolean r6 = r23.m()
            r6 = r6 ^ r13
            if (r6 != 0) goto L_0x0093
            if (r19 == 0) goto L_0x0093
            r14 = 0
            int r9 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0093
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x0093:
            java.lang.String r9 = r0.c
            ir6 r14 = defpackage.hm9.m
            if (r14 != 0) goto L_0x009a
            goto L_0x00d1
        L_0x009a:
            boolean r16 = r14.c()
            if (r16 == 0) goto L_0x00d1
            us7 r11 = defpackage.us7.s0
            long r12 = r22.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r15 = "File download. responseFailed="
            r10.<init>(r15)
            r10.append(r6)
            java.lang.String r15 = "\n                |response.body().contentLength()="
            r10.append(r15)
            r10.append(r1)
            java.lang.String r1 = "\n                |tempOutputFile.length()="
            r10.append(r1)
            r10.append(r12)
            java.lang.String r1 = "\n                |"
            r10.append(r1)
            java.lang.String r1 = r10.toString()
            java.lang.String r1 = defpackage.x9e.c0(r1)
            r2 = 0
            r14.d(r11, r9, r1, r2)
        L_0x00d1:
            if (r6 == 0) goto L_0x0126
            int r1 = r4.o
            w0f r2 = r0.a
            je7 r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            ad r2 = (defpackage.ad) r2
            js7 r6 = r2.a()
            boolean r6 = r6.c()
            if (r6 == 0) goto L_0x00ea
            goto L_0x00f3
        L_0x00ea:
            java.lang.String r6 = "HTTP_ERROR"
            java.lang.String r9 = java.lang.String.valueOf(r1)
            r2.g(r6, r9)
        L_0x00f3:
            r2 = 403(0x193, float:5.65E-43)
            if (r1 == r2) goto L_0x00fb
            r2 = 400(0x190, float:5.6E-43)
            if (r1 != r2) goto L_0x0126
        L_0x00fb:
            java.lang.String r2 = r0.c
            ir6 r4 = defpackage.hm9.m
            if (r4 != 0) goto L_0x0102
            goto L_0x0114
        L_0x0102:
            boolean r6 = r4.c()
            if (r6 == 0) goto L_0x0114
            us7 r6 = defpackage.us7.s0
            java.lang.String r9 = "File download. Url expired try to get new one. Code = "
            java.lang.String r1 = defpackage.zr6.h(r1, r9)
            r9 = 0
            r4.d(r6, r2, r1, r9)
        L_0x0114:
            b8c r1 = r5.a
            r1.d()
            r1 = 1
            r7.t0 = r1
            java.lang.Object r0 = r0.k(r5, r3, r7)
            if (r0 != r8) goto L_0x0123
            return r8
        L_0x0123:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0126:
            w0f r1 = r0.a
            java.lang.String r2 = "Exception in FileDownloader onResponse"
            r1.d(r2)
            long r1 = r22.length()
            int r6 = r4.o
            r9 = 416(0x1a0, float:5.83E-43)
            if (r6 != r9) goto L_0x0203
            cj6 r6 = r4.Y
            java.lang.String r9 = "Content-Range"
            java.lang.String r6 = r6.a(r9)
            if (r6 == 0) goto L_0x0142
            goto L_0x0143
        L_0x0142:
            r6 = 0
        L_0x0143:
            java.lang.String r9 = r0.c
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto L_0x014a
            goto L_0x0161
        L_0x014a:
            boolean r11 = r10.c()
            if (r11 == 0) goto L_0x0161
            us7 r11 = defpackage.us7.X
            if (r6 == 0) goto L_0x0156
            r12 = 1
            goto L_0x0157
        L_0x0156:
            r12 = 0
        L_0x0157:
            java.lang.String r13 = "File download. Try compare range with localLength, range exist:"
            java.lang.String r12 = defpackage.ey8.j(r13, r12)
            r13 = 0
            r10.d(r11, r9, r12, r13)
        L_0x0161:
            if (r6 == 0) goto L_0x0203
            java.util.regex.Pattern r9 = e
            java.util.regex.Matcher r6 = r9.matcher(r6)
            boolean r9 = r6.find()
            if (r9 == 0) goto L_0x0203
            r9 = 1
            java.lang.String r6 = r6.group(r9)
            if (r6 == 0) goto L_0x017f
            long r9 = java.lang.Long.parseLong(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            goto L_0x0180
        L_0x017f:
            r6 = 0
        L_0x0180:
            java.lang.String r9 = r0.c
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto L_0x0187
            goto L_0x01a1
        L_0x0187:
            boolean r11 = r10.c()
            if (r11 == 0) goto L_0x01a1
            us7 r11 = defpackage.us7.X
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "File download. Compare current range:"
            r12.<init>(r13)
            r12.append(r6)
            java.lang.String r12 = r12.toString()
            r13 = 0
            r10.d(r11, r9, r12, r13)
        L_0x01a1:
            if (r6 == 0) goto L_0x0203
            long r9 = r6.longValue()
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0203
            if (r26 == 0) goto L_0x01b2
            java.lang.String r15 = e(r23)
            goto L_0x01b3
        L_0x01b2:
            r15 = 0
        L_0x01b3:
            r7.o = r0
            r7.X = r5
            r1 = 2
            r7.t0 = r1
            r1 = r25
            java.lang.Object r6 = r0.d(r3, r1, r15, r7)
            if (r6 != r8) goto L_0x01c3
            return r8
        L_0x01c3:
            java.io.File r6 = (java.io.File) r6
            java.util.concurrent.CopyOnWriteArrayList r1 = r5.b
            java.util.Iterator r1 = r1.iterator()
            r3 = r0
            r2 = r6
        L_0x01cd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0200
            java.lang.Object r0 = r1.next()
            cfe r0 = (defpackage.cfe) r0
            java.lang.String r4 = r3.c
            java.lang.String r5 = "File download. File already fully downloaded"
            defpackage.hm9.m(r4, r5, new java.lang.Object[0])
            if (r0 == 0) goto L_0x01fe
            r7.o = r3     // Catch:{ all -> 0x01f4 }
            r7.X = r2     // Catch:{ all -> 0x01f4 }
            r7.Y = r1     // Catch:{ all -> 0x01f4 }
            r4 = 3
            r7.t0 = r4     // Catch:{ all -> 0x01f2 }
            java.lang.Object r0 = r0.f(r2, r7)     // Catch:{ all -> 0x01f2 }
            if (r0 != r8) goto L_0x01cd
            return r8
        L_0x01f2:
            r0 = move-exception
            goto L_0x01f6
        L_0x01f4:
            r0 = move-exception
            r4 = 3
        L_0x01f6:
            java.lang.String r5 = r3.c
            java.lang.String r6 = "File download. onResponse: failed to notify listener on download completed"
            defpackage.hm9.p(r5, r6, r0)
            goto L_0x01cd
        L_0x01fe:
            r4 = 3
            goto L_0x01cd
        L_0x0200:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0203:
            java.lang.String r1 = r0.c
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x020a
            goto L_0x0220
        L_0x020a:
            boolean r6 = r2.c()
            if (r6 == 0) goto L_0x0220
            us7 r6 = defpackage.us7.s0
            int r4 = r4.o
            java.lang.String r9 = "File download. Server response code = "
            java.lang.String r10 = ", download failed"
            java.lang.String r4 = defpackage.wg0.g(r4, r9, r10)
            r9 = 0
            r2.d(r6, r1, r4, r9)
        L_0x0220:
            java.util.concurrent.CopyOnWriteArrayList r1 = r5.b
            java.util.Iterator r1 = r1.iterator()
            r2 = r1
            r1 = r0
        L_0x0228:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0262
            java.lang.Object r0 = r2.next()
            cfe r0 = (defpackage.cfe) r0
            if (r0 == 0) goto L_0x0260
            r7.o = r1     // Catch:{ all -> 0x0256 }
            r7.X = r3     // Catch:{ all -> 0x0256 }
            r7.Y = r2     // Catch:{ all -> 0x0256 }
            r4 = 4
            r7.t0 = r4     // Catch:{ all -> 0x0254 }
            r0.a()     // Catch:{ all -> 0x0254 }
            e5f r0 = defpackage.e5f.a     // Catch:{ all -> 0x0254 }
            if (r0 != r8) goto L_0x0247
            return r8
        L_0x0247:
            r17 = r3
            r3 = r1
            r1 = r2
            r2 = r17
        L_0x024d:
            r17 = r2
            r2 = r1
            r1 = r3
            r3 = r17
            goto L_0x0228
        L_0x0254:
            r0 = move-exception
            goto L_0x0258
        L_0x0256:
            r0 = move-exception
            r4 = 4
        L_0x0258:
            java.lang.String r5 = r1.c
            java.lang.String r6 = "File download. onResponse: failed to notify listener on download failed"
            defpackage.hm9.p(r5, r6, r0)
            goto L_0x0228
        L_0x0260:
            r4 = 4
            goto L_0x0228
        L_0x0262:
            r3.delete()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sja.g(i8c, long, java.io.File, yic, kja, java.io.File, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r9.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        if ((r10 instanceof java.net.SocketException) != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a0, code lost:
        if ((r10.getCause() instanceof java.net.SocketException) != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        if ((r10 instanceof java.net.UnknownHostException) != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a8, code lost:
        if ((r10 instanceof java.net.SocketTimeoutException) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ad, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ae, code lost:
        r0.o = r9;
        r0.X = r10;
        r0.Y = r11;
        r0.Z = r12;
        r0.s0 = r8;
        r0.v0 = 1;
        r13.e(r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bd, code lost:
        if (r3 != r1) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bf, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c0, code lost:
        r6 = r12;
        r12 = r9;
        r9 = r6;
        r7 = r11;
        r11 = r10;
        r10 = r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d8 A[EDGE_INSN: B:62:0x00d8->B:53:0x00d8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.io.IOException r9, defpackage.mhc r10, defpackage.kja r11, java.io.File r12, kotlin.coroutines.Continuation r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.pja
            if (r0 == 0) goto L_0x0013
            r0 = r13
            pja r0 = (defpackage.pja) r0
            int r1 = r0.v0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v0 = r1
            goto L_0x0018
        L_0x0013:
            pja r0 = new pja
            r0.<init>(r8, r13)
        L_0x0018:
            java.lang.Object r13 = r0.t0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.v0
            e5f r3 = defpackage.e5f.a
            r4 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 != r4) goto L_0x003d
            java.util.Iterator r8 = r0.s0
            java.io.File r9 = r0.Z
            kja r10 = r0.Y
            java.io.IOException r11 = r0.X
            sja r12 = r0.o
            defpackage.od2.a0(r13)     // Catch:{ all -> 0x0034 }
            goto L_0x00c6
        L_0x0034:
            r13 = move-exception
            r6 = r12
            r12 = r9
            r9 = r6
            r7 = r11
            r11 = r10
            r10 = r7
            goto L_0x00ce
        L_0x003d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0045:
            defpackage.od2.a0(r13)
            java.lang.String r13 = r8.c     // Catch:{ all -> 0x00e4 }
            java.lang.String r2 = "File download. Exception while download request: %s"
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch:{ all -> 0x00e4 }
            defpackage.hm9.r(r13, r9, r2, r10)     // Catch:{ all -> 0x00e4 }
            w0f r10 = r8.a     // Catch:{ all -> 0x00e4 }
            je7 r10 = r10.a     // Catch:{ all -> 0x00e4 }
            java.lang.Object r10 = r10.getValue()     // Catch:{ all -> 0x00e4 }
            ad r10 = (defpackage.ad) r10     // Catch:{ all -> 0x00e4 }
            js7 r13 = r10.a()     // Catch:{ all -> 0x00e4 }
            boolean r13 = r13.c()     // Catch:{ all -> 0x00e4 }
            if (r13 == 0) goto L_0x0068
            goto L_0x007a
        L_0x0068:
            if (r9 != 0) goto L_0x006d
            java.lang.String r13 = "0"
            goto L_0x0075
        L_0x006d:
            java.lang.Class r13 = r9.getClass()     // Catch:{ all -> 0x00e4 }
            java.lang.String r13 = r13.getSimpleName()     // Catch:{ all -> 0x00e4 }
        L_0x0075:
            java.lang.String r2 = "HTTP_ERROR"
            r10.g(r2, r13)     // Catch:{ all -> 0x00e4 }
        L_0x007a:
            java.util.concurrent.CopyOnWriteArrayList r10 = r11.b     // Catch:{ all -> 0x00e4 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x00e4 }
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L_0x0084:
            boolean r13 = r8.hasNext()     // Catch:{ all -> 0x00d6 }
            if (r13 == 0) goto L_0x00d8
            java.lang.Object r13 = r8.next()     // Catch:{ all -> 0x00d6 }
            cfe r13 = (defpackage.cfe) r13     // Catch:{ all -> 0x00d6 }
            if (r13 == 0) goto L_0x0084
            r9.getClass()     // Catch:{ all -> 0x00cd }
            boolean r2 = r10 instanceof java.net.SocketException     // Catch:{ all -> 0x00cd }
            r5 = 0
            if (r2 != 0) goto L_0x00ad
            java.lang.Throwable r2 = r10.getCause()     // Catch:{ all -> 0x00cd }
            boolean r2 = r2 instanceof java.net.SocketException     // Catch:{ all -> 0x00cd }
            if (r2 != 0) goto L_0x00ad
            boolean r2 = r10 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x00cd }
            if (r2 != 0) goto L_0x00ad
            boolean r2 = r10 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x00cd }
            if (r2 == 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r2 = r5
            goto L_0x00ae
        L_0x00ad:
            r2 = r4
        L_0x00ae:
            r0.o = r9     // Catch:{ all -> 0x00cd }
            r0.X = r10     // Catch:{ all -> 0x00cd }
            r0.Y = r11     // Catch:{ all -> 0x00cd }
            r0.Z = r12     // Catch:{ all -> 0x00cd }
            r0.s0 = r8     // Catch:{ all -> 0x00cd }
            r0.v0 = r4     // Catch:{ all -> 0x00cd }
            r13.e(r2, r5)     // Catch:{ all -> 0x00cd }
            if (r3 != r1) goto L_0x00c0
            return r1
        L_0x00c0:
            r6 = r12
            r12 = r9
            r9 = r6
            r7 = r11
            r11 = r10
            r10 = r7
        L_0x00c6:
            r6 = r12
            r12 = r9
            r9 = r6
            r7 = r11
            r11 = r10
            r10 = r7
            goto L_0x0084
        L_0x00cd:
            r13 = move-exception
        L_0x00ce:
            java.lang.String r2 = r9.c     // Catch:{ all -> 0x00d6 }
            java.lang.String r5 = "File download. Failed to notify listener on exception"
            defpackage.hm9.p(r2, r5, r13)     // Catch:{ all -> 0x00d6 }
            goto L_0x0084
        L_0x00d6:
            r8 = move-exception
            goto L_0x00e6
        L_0x00d8:
            java.lang.String r8 = r12.getAbsolutePath()
            r9.j(r11, r8)
            goto L_0x00ee
        L_0x00e0:
            r6 = r9
            r9 = r8
            r8 = r6
            goto L_0x00e6
        L_0x00e4:
            r9 = move-exception
            goto L_0x00e0
        L_0x00e6:
            java.lang.String r10 = r9.c     // Catch:{ all -> 0x00ef }
            java.lang.String r13 = "File download. Failed to process on failure"
            defpackage.hm9.p(r10, r13, r8)     // Catch:{ all -> 0x00ef }
            goto L_0x00d8
        L_0x00ee:
            return r3
        L_0x00ef:
            r8 = move-exception
            java.lang.String r10 = r12.getAbsolutePath()
            r9.j(r11, r10)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sja.h(java.io.IOException, mhc, kja, java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.system.ErrnoException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.system.ErrnoException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.system.ErrnoException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v10, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v11, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v12, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v13, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v14, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v15, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v16, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v17, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: lec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v20, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v18, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v19, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v27, resolved type: lec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: lec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v21, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v22, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v26, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v22, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v36, resolved type: lec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v23, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v24, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v25, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v26, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v27, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v28, resolved type: lec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v29, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: lec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v30, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: lec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v31, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v32, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v33, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v34, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v35, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v36, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v37, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v38, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v39, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v64, resolved type: e5f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v65, resolved type: e5f} */
    /* JADX WARNING: type inference failed for: r0v97, types: [java.lang.Object, lec] */
    /* JADX WARNING: type inference failed for: r9v37, types: [java.lang.Object, lec] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0601 A[Catch:{ Exception -> 0x0639, all -> 0x0635 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x063e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    public final java.lang.Object i(defpackage.yic r34, defpackage.kja r35, java.io.File r36, java.io.File r37, boolean r38, kotlin.coroutines.Continuation r39) {
        /*
            r33 = this;
            r11 = r33
            r12 = r34
            r0 = r39
            java.lang.String r13 = "File download. Response content length: "
            boolean r1 = r0 instanceof defpackage.qja
            if (r1 == 0) goto L_0x001c
            r1 = r0
            qja r1 = (defpackage.qja) r1
            int r2 = r1.I0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001c
            int r2 = r2 - r3
            r1.I0 = r2
        L_0x001a:
            r14 = r1
            goto L_0x0022
        L_0x001c:
            qja r1 = new qja
            r1.<init>(r11, r0)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r0 = r14.G0
            tx3 r15 = defpackage.tx3.a
            int r1 = r14.I0
            e5f r10 = defpackage.e5f.a
            r16 = 0
            switch(r1) {
                case 0: goto L_0x01b3;
                case 1: goto L_0x0190;
                case 2: goto L_0x010c;
                case 3: goto L_0x00b0;
                case 4: goto L_0x008d;
                case 5: goto L_0x0063;
                case 6: goto L_0x0037;
                default: goto L_0x002f;
            }
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0037:
            java.lang.Object r1 = r14.t0
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.io.Serializable r2 = r14.s0
            java.lang.Exception r2 = (java.lang.Exception) r2
            java.io.File r3 = r14.Z
            kja r4 = r14.Y
            yic r5 = r14.X
            sja r6 = r14.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x0056 }
            r12 = r5
            r8 = r6
            r7 = r10
            r10 = 0
            r5 = r3
            r6 = r4
            r4 = 0
            r3 = r2
            r2 = r1
            r1 = r15
            goto L_0x0748
        L_0x0056:
            r0 = move-exception
            r12 = r5
            r8 = r6
            r7 = r10
            r10 = 0
            r5 = r3
            r6 = r4
            r4 = 0
            r3 = r2
            r2 = r1
            r1 = r15
            goto L_0x0741
        L_0x0063:
            java.lang.Object r1 = r14.t0
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.io.Serializable r2 = r14.s0
            java.io.File r2 = (java.io.File) r2
            java.io.File r3 = r14.Z
            kja r4 = r14.Y
            yic r5 = r14.X
            sja r6 = r14.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x007e }
            r12 = r5
            r18 = r10
            r5 = r3
            r3 = r1
            r1 = r15
            goto L_0x0625
        L_0x007e:
            r0 = move-exception
            r12 = r5
            r18 = r10
            r5 = r3
            r3 = r1
            r1 = r15
            r30 = r6
            r6 = r2
            r2 = r4
            r4 = r30
            goto L_0x062d
        L_0x008d:
            java.io.File r1 = r14.Z
            kja r2 = r14.Y
            yic r3 = r14.X
            sja r4 = r14.o
            defpackage.od2.a0(r0)     // Catch:{ Exception -> 0x00a6, all -> 0x009f }
            r5 = r1
            r12 = r3
            r18 = r10
            r1 = r15
            goto L_0x05eb
        L_0x009f:
            r0 = move-exception
            r5 = r1
            r6 = r2
            r12 = r3
        L_0x00a3:
            r8 = r4
            goto L_0x075d
        L_0x00a6:
            r0 = move-exception
            r5 = r1
            r6 = r2
            r12 = r3
            r8 = r4
        L_0x00ab:
            r18 = r10
        L_0x00ad:
            r1 = r15
            goto L_0x06b3
        L_0x00b0:
            long r1 = r14.E0
            boolean r3 = r14.D0
            byte[] r4 = r14.B0
            java.io.OutputStream r11 = r14.A0
            java.io.Closeable r12 = r14.z0
            java.io.InputStream r13 = r14.y0
            java.io.Closeable r5 = r14.x0
            java.io.File r6 = r14.w0
            lec r7 = r14.v0
            lec r8 = r14.u0
            java.lang.Object r9 = r14.t0
            lec r9 = (defpackage.lec) r9
            r16 = r1
            java.io.Serializable r1 = r14.s0
            java.io.File r1 = (java.io.File) r1
            java.io.File r2 = r14.Z
            r33 = r1
            kja r1 = r14.Y
            r34 = r1
            yic r1 = r14.X
            r35 = r1
            sja r1 = r14.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x00fa }
            r21 = r3
            r0 = r8
            r18 = r10
            r3 = r12
            r22 = r14
            r19 = r16
            r10 = r33
            r12 = r35
            r8 = r1
            r14 = r7
            r16 = r11
            r1 = r15
            r11 = r5
            r5 = r2
            r2 = r13
            r13 = r6
            r6 = r34
            goto L_0x052a
        L_0x00fa:
            r0 = move-exception
            r6 = r34
            r3 = r0
            r18 = r10
            r10 = r12
            r12 = r35
            r30 = r2
            r2 = r1
            r1 = r15
            r15 = r5
            r5 = r30
            goto L_0x0672
        L_0x010c:
            int r1 = r14.F0
            long r2 = r14.E0
            boolean r4 = r14.D0
            java.util.Iterator r5 = r14.C0
            byte[] r6 = r14.B0
            java.io.OutputStream r7 = r14.A0
            java.io.Closeable r8 = r14.z0
            java.io.InputStream r9 = r14.y0
            java.io.Closeable r11 = r14.x0
            java.io.File r12 = r14.w0
            lec r13 = r14.v0
            r16 = r1
            lec r1 = r14.u0
            r17 = r1
            java.lang.Object r1 = r14.t0
            lec r1 = (defpackage.lec) r1
            r33 = r1
            java.io.Serializable r1 = r14.s0
            java.io.File r1 = (java.io.File) r1
            r34 = r1
            java.io.File r1 = r14.Z
            r35 = r1
            kja r1 = r14.Y
            r36 = r1
            yic r1 = r14.X
            r37 = r1
            sja r1 = r14.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x0167 }
            r0 = r33
            r18 = r10
            r20 = r11
            r19 = r12
            r21 = r13
            r22 = r14
            r11 = r16
            r16 = r17
            r10 = r34
            r12 = r37
            r13 = r2
            r2 = r5
            r17 = r9
            r3 = r15
            r15 = 2
            r5 = r35
            r9 = r7
            r7 = r6
            r6 = r36
            goto L_0x03ac
        L_0x0167:
            r0 = move-exception
            r22 = r2
            r21 = r4
            r20 = r6
            r4 = r8
            r18 = r10
            r8 = r14
            r3 = r15
            r10 = r34
            r6 = r36
            r15 = r0
            r2 = r1
            r14 = r13
            r1 = r33
            r33 = r5
            r13 = r12
            r5 = r35
            r12 = r37
            r30 = r9
            r9 = r7
            r7 = r30
            r31 = r17
            r17 = r16
            r16 = r31
            goto L_0x044f
        L_0x0190:
            boolean r1 = r14.D0
            lec r2 = r14.u0
            java.lang.Object r3 = r14.t0
            i8c r3 = (defpackage.i8c) r3
            java.io.Serializable r4 = r14.s0
            java.io.File r4 = (java.io.File) r4
            java.io.File r5 = r14.Z
            kja r6 = r14.Y
            yic r7 = r14.X
            sja r8 = r14.o
            defpackage.od2.a0(r0)     // Catch:{ Exception -> 0x01af, all -> 0x01ab }
            r12 = r7
            r11 = r10
            goto L_0x0220
        L_0x01ab:
            r0 = move-exception
            r12 = r7
            goto L_0x075d
        L_0x01af:
            r0 = move-exception
            r12 = r7
            goto L_0x00ab
        L_0x01b3:
            defpackage.od2.a0(r0)
            i8c r0 = r12.Z     // Catch:{ Exception -> 0x06af, all -> 0x0697 }
            lec r9 = new lec     // Catch:{ Exception -> 0x06ab, all -> 0x0697 }
            r9.<init>()     // Catch:{ Exception -> 0x06af, all -> 0x0697 }
            if (r0 == 0) goto L_0x01d7
            long r1 = r0.n()     // Catch:{ Exception -> 0x01cd, all -> 0x01c5 }
            r3 = r1
            goto L_0x01d9
        L_0x01c5:
            r0 = move-exception
            r6 = r35
            r5 = r36
            r8 = r11
            goto L_0x075d
        L_0x01cd:
            r0 = move-exception
            r6 = r35
            r5 = r36
            r18 = r10
            r8 = r11
            goto L_0x00ad
        L_0x01d7:
            r3 = r16
        L_0x01d9:
            r9.a = r3     // Catch:{ Exception -> 0x06ab, all -> 0x0697 }
            r14.o = r11     // Catch:{ Exception -> 0x06af, all -> 0x0697 }
            r14.X = r12     // Catch:{ Exception -> 0x06af, all -> 0x0697 }
            r8 = r35
            r14.Y = r8     // Catch:{ Exception -> 0x06af, all -> 0x0697 }
            r7 = r36
            r14.Z = r7     // Catch:{ Exception -> 0x06af, all -> 0x0697 }
            r6 = r37
            r14.s0 = r6     // Catch:{ Exception -> 0x06af, all -> 0x0697 }
            r14.t0 = r0     // Catch:{ Exception -> 0x06ab, all -> 0x0697 }
            r14.u0 = r9     // Catch:{ Exception -> 0x06af, all -> 0x0697 }
            r5 = r38
            r14.D0 = r5     // Catch:{ Exception -> 0x06ab, all -> 0x0697 }
            r2 = 1
            r14.I0 = r2     // Catch:{ Exception -> 0x06ab, all -> 0x0697 }
            r1 = r33
            r20 = r2
            r2 = r0
            r11 = 2
            r5 = r36
            r6 = r34
            r11 = 0
            r7 = r35
            r8 = r37
            r18 = r9
            r9 = r38
            r11 = r10
            r10 = r14
            java.lang.Object r1 = r1.g(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x06a0, all -> 0x0697 }
            if (r1 != r15) goto L_0x0212
            return r15
        L_0x0212:
            r8 = r33
            r6 = r35
            r5 = r36
            r4 = r37
            r3 = r0
            r0 = r1
            r2 = r18
            r1 = r38
        L_0x0220:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0263 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0263 }
            if (r0 == 0) goto L_0x0233
            java.lang.String r0 = r5.getAbsolutePath()
            r8.j(r6, r0)
            defpackage.naf.c(r12)
            return r11
        L_0x0233:
            java.lang.String r0 = r8.c     // Catch:{ Exception -> 0x0263 }
            ir6 r7 = defpackage.hm9.m     // Catch:{ Exception -> 0x0263 }
            if (r7 != 0) goto L_0x023e
        L_0x0239:
            r33 = r1
            r18 = r11
            goto L_0x0268
        L_0x023e:
            boolean r9 = r7.c()     // Catch:{ Exception -> 0x0263 }
            if (r9 == 0) goto L_0x0239
            us7 r9 = defpackage.us7.X     // Catch:{ Exception -> 0x0263 }
            r18 = r11
            long r10 = r2.a     // Catch:{ Exception -> 0x0260 }
            r33 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0260 }
            r1.<init>(r13)     // Catch:{ Exception -> 0x0260 }
            r1.append(r10)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0260 }
            r10 = 0
            r7.d(r9, r0, r1, r10)     // Catch:{ Exception -> 0x0260 }
            goto L_0x0268
        L_0x025d:
            r0 = move-exception
            goto L_0x075d
        L_0x0260:
            r0 = move-exception
            goto L_0x00ad
        L_0x0263:
            r0 = move-exception
            r18 = r11
            goto L_0x00ad
        L_0x0268:
            lec r0 = new lec     // Catch:{ Exception -> 0x0260 }
            r0.<init>()     // Catch:{ Exception -> 0x0260 }
            long r9 = r5.length()     // Catch:{ Exception -> 0x0260 }
            r0.a = r9     // Catch:{ Exception -> 0x0260 }
            r34 = r0
            long r0 = r2.a     // Catch:{ Exception -> 0x0260 }
            long r0 = r0 + r9
            r2.a = r0     // Catch:{ Exception -> 0x0260 }
            if (r3 == 0) goto L_0x068a
            java.io.InputStream r1 = r3.m()     // Catch:{ Exception -> 0x0260 }
            w0f r0 = r8.a     // Catch:{ Exception -> 0x0260 }
            zh3 r0 = r0.c()     // Catch:{ Exception -> 0x0260 }
            int[] r3 = defpackage.bh3.$EnumSwitchMapping$0     // Catch:{ Exception -> 0x0260 }
            int r0 = r0.ordinal()     // Catch:{ Exception -> 0x0260 }
            r0 = r3[r0]     // Catch:{ Exception -> 0x0260 }
            r3 = 1
            if (r0 == r3) goto L_0x029d
            r7 = 2
            if (r0 == r7) goto L_0x029d
            r7 = 3
            if (r0 == r7) goto L_0x029a
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x02a1
        L_0x029a:
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x02a1
        L_0x029d:
            r7 = 3
            r0 = 32768(0x8000, float:4.5918E-41)
        L_0x02a1:
            java.lang.String r9 = r8.c     // Catch:{ Exception -> 0x0260 }
            java.lang.String r10 = "File download. Start read from buffer"
            defpackage.hm9.m(r9, r10, new java.lang.Object[0])     // Catch:{ Exception -> 0x0260 }
            lec r9 = new lec     // Catch:{ Exception -> 0x0260 }
            r9.<init>()     // Catch:{ Exception -> 0x0260 }
            java.io.File r10 = r5.getParentFile()     // Catch:{ Exception -> 0x0260 }
            if (r10 == 0) goto L_0x02b6
            r10.mkdirs()     // Catch:{ Exception -> 0x0260 }
        L_0x02b6:
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0260 }
            r10.<init>(r5, r3)     // Catch:{ Exception -> 0x0260 }
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x066c }
            long r19 = java.lang.System.nanoTime()     // Catch:{ all -> 0x066c }
            int r11 = r1.read(r0)     // Catch:{ all -> 0x066c }
            r13 = r5
            r21 = r10
            r3 = r11
            r22 = r14
            r23 = r19
            r11 = r1
            r14 = r9
            r19 = r16
            r9 = r2
            r10 = r4
            r16 = r21
            r4 = r33
            r2 = r11
            r1 = r0
            r0 = r34
        L_0x02db:
            if (r3 < 0) goto L_0x0578
            long r25 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0574 }
            r17 = r8
            long r7 = r25 - r23
            r33 = r1
            r34 = r2
            long r1 = r14.a     // Catch:{ all -> 0x0571 }
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x02fe
            r14.a = r7     // Catch:{ all -> 0x02f2 }
            goto L_0x02fe
        L_0x02f2:
            r0 = move-exception
            r3 = r0
            r1 = r15
            r2 = r17
            r10 = r21
            r14 = r22
            r15 = r11
            goto L_0x0672
        L_0x02fe:
            long r1 = r0.a     // Catch:{ all -> 0x0571 }
            long r7 = (long) r3     // Catch:{ all -> 0x0571 }
            long r1 = r1 + r7
            r0.a = r1     // Catch:{ all -> 0x0571 }
            java.util.concurrent.CopyOnWriteArrayList r1 = r6.b     // Catch:{ all -> 0x0565 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0565 }
            r7 = r34
            r2 = r17
            r8 = r22
            r17 = r4
            r4 = r21
            r21 = r19
            r20 = r33
            r19 = r15
            r15 = r0
            r30 = r9
            r9 = r1
            r1 = r30
            r31 = r16
            r16 = r3
            r3 = r31
        L_0x0326:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0560 }
            if (r0 == 0) goto L_0x04b4
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x04a6 }
            r23 = r0
            cfe r23 = (defpackage.cfe) r23     // Catch:{ all -> 0x04a6 }
            if (r23 == 0) goto L_0x0471
            r33 = r3
            r34 = r4
            long r3 = r15.a     // Catch:{ all -> 0x0443 }
            float r0 = (float) r3     // Catch:{ all -> 0x0443 }
            r25 = r3
            long r3 = r1.a     // Catch:{ all -> 0x0443 }
            r35 = r9
            float r9 = (float) r3
            float r0 = r0 / r9
            r9 = 100
            float r9 = (float) r9
            float r24 = r0 * r9
            r8.o = r2     // Catch:{ all -> 0x0424 }
            r8.X = r12     // Catch:{ all -> 0x0424 }
            r8.Y = r6     // Catch:{ all -> 0x0424 }
            r8.Z = r5     // Catch:{ all -> 0x0424 }
            r8.s0 = r10     // Catch:{ all -> 0x0424 }
            r8.t0 = r1     // Catch:{ all -> 0x0428 }
            r8.u0 = r15     // Catch:{ all -> 0x0424 }
            r8.v0 = r14     // Catch:{ all -> 0x0424 }
            r8.w0 = r13     // Catch:{ all -> 0x0424 }
            r8.x0 = r11     // Catch:{ all -> 0x0424 }
            r8.y0 = r7     // Catch:{ all -> 0x0424 }
            r9 = r34
            r8.z0 = r9     // Catch:{ all -> 0x0418 }
            r34 = r9
            r9 = r33
            r8.A0 = r9     // Catch:{ all -> 0x0410 }
            r33 = r7
            r7 = r20
            r8.B0 = r7     // Catch:{ all -> 0x040c }
            r20 = r11
            r11 = r35
            r8.C0 = r11     // Catch:{ all -> 0x0402 }
            r35 = r11
            r11 = r17
            r8.D0 = r11     // Catch:{ all -> 0x03f4 }
            r17 = r13
            r36 = r14
            r13 = r21
            r8.E0 = r13     // Catch:{ all -> 0x03ea }
            r21 = r11
            r11 = r16
            r8.F0 = r11     // Catch:{ all -> 0x03e3 }
            r16 = r15
            r15 = 2
            r8.I0 = r15     // Catch:{ all -> 0x03cb }
            r27 = r3
            r29 = r8
            java.lang.Object r0 = r23.c(r24, r25, r27, r29)     // Catch:{ all -> 0x03cb }
            r3 = r19
            if (r0 != r3) goto L_0x039c
            return r3
        L_0x039c:
            r0 = r1
            r1 = r2
            r22 = r8
            r19 = r17
            r4 = r21
            r17 = r33
            r8 = r34
            r2 = r35
            r21 = r36
        L_0x03ac:
            r15 = r16
            r16 = r11
            r11 = r20
            r20 = r7
            r7 = r17
            r17 = r4
            r4 = r8
            r8 = r22
            r30 = r1
            r1 = r0
            r0 = r2
            r2 = r30
            r31 = r13
            r13 = r19
            r14 = r21
            r21 = r31
            goto L_0x04a0
        L_0x03cb:
            r0 = move-exception
            r3 = r19
        L_0x03ce:
            r4 = r34
            r15 = r0
            r22 = r13
            r13 = r17
            r14 = r36
            r17 = r11
            r11 = r20
            r20 = r7
            r7 = r33
            r33 = r35
            goto L_0x044f
        L_0x03e3:
            r0 = move-exception
            r16 = r15
            r3 = r19
        L_0x03e8:
            r15 = 2
            goto L_0x03ce
        L_0x03ea:
            r0 = move-exception
            r21 = r11
            r11 = r16
            r3 = r19
        L_0x03f1:
            r16 = r15
            goto L_0x03e8
        L_0x03f4:
            r0 = move-exception
            r17 = r13
            r36 = r14
            r3 = r19
            r13 = r21
            r21 = r11
            r11 = r16
            goto L_0x03f1
        L_0x0402:
            r0 = move-exception
            r35 = r11
        L_0x0405:
            r36 = r14
            r11 = r16
            r3 = r19
            goto L_0x0437
        L_0x040c:
            r0 = move-exception
            r20 = r11
            goto L_0x0405
        L_0x0410:
            r0 = move-exception
        L_0x0411:
            r33 = r7
            r36 = r14
            r3 = r19
            goto L_0x0431
        L_0x0418:
            r0 = move-exception
            r34 = r9
            r36 = r14
            r3 = r19
            r9 = r33
            r33 = r7
            goto L_0x0431
        L_0x0424:
            r0 = move-exception
            r9 = r33
            goto L_0x0411
        L_0x0428:
            r0 = move-exception
            r9 = r33
            r33 = r7
            r36 = r14
            r3 = r19
        L_0x0431:
            r7 = r20
            r20 = r11
            r11 = r16
        L_0x0437:
            r16 = r15
            r15 = 2
            r30 = r17
            r17 = r13
            r13 = r21
            r21 = r30
            goto L_0x03ce
        L_0x0443:
            r0 = move-exception
            r35 = r9
            r36 = r14
            r3 = r19
            r9 = r33
            r33 = r7
            goto L_0x0431
        L_0x044f:
            java.lang.String r0 = r2.c     // Catch:{ all -> 0x0469 }
            r34 = r1
            java.lang.String r1 = "File download. onResponse: failed to notify listener on download progress"
            defpackage.hm9.p(r0, r1, r15)     // Catch:{ all -> 0x0469 }
            r1 = r34
            r19 = r3
            r3 = r9
            r15 = r16
            r16 = r17
            r17 = r21
            r21 = r22
            r9 = r33
            goto L_0x0326
        L_0x0469:
            r0 = move-exception
            r1 = r3
            r10 = r4
            r14 = r8
        L_0x046d:
            r15 = r11
        L_0x046e:
            r3 = r0
            goto L_0x0672
        L_0x0471:
            r34 = r4
            r33 = r7
            r35 = r9
            r36 = r14
            r7 = r20
            r9 = r3
            r20 = r11
            r11 = r16
            r3 = r19
            r16 = r15
            r30 = r17
            r17 = r13
            r13 = r21
            r21 = r30
            r0 = r35
            r16 = r11
            r11 = r20
            r20 = r7
            r7 = r33
            r30 = r13
            r14 = r36
            r13 = r17
            r17 = r21
            r21 = r30
        L_0x04a0:
            r19 = r3
            r3 = r9
            r9 = r0
            goto L_0x0326
        L_0x04a6:
            r0 = move-exception
            r34 = r4
            r20 = r11
            r3 = r19
            r10 = r34
            r1 = r3
            r14 = r8
            r15 = r20
            goto L_0x046e
        L_0x04b4:
            r9 = r3
            r34 = r4
            r33 = r7
            r36 = r14
            r3 = r19
            r7 = r20
            r20 = r11
            r11 = r16
            r16 = r15
            r15 = 0
            r30 = r17
            r17 = r13
            r13 = r21
            r21 = r30
            r9.write(r7, r15, r11)     // Catch:{ all -> 0x055d }
            long r3 = (long) r11
            long r3 = r3 + r13
            r8.o = r2     // Catch:{ all -> 0x0553 }
            r8.X = r12     // Catch:{ all -> 0x0553 }
            r8.Y = r6     // Catch:{ all -> 0x0553 }
            r8.Z = r5     // Catch:{ all -> 0x0553 }
            r8.s0 = r10     // Catch:{ all -> 0x0553 }
            r8.t0 = r1     // Catch:{ all -> 0x0557 }
            r11 = r16
            r8.u0 = r11     // Catch:{ all -> 0x0553 }
            r14 = r36
            r8.v0 = r14     // Catch:{ all -> 0x0553 }
            r13 = r17
            r8.w0 = r13     // Catch:{ all -> 0x0553 }
            r15 = r20
            r8.x0 = r15     // Catch:{ all -> 0x054d }
            r16 = r1
            r1 = r33
            r8.y0 = r1     // Catch:{ all -> 0x054d }
            r33 = r1
            r1 = r34
            r8.z0 = r1     // Catch:{ all -> 0x054f }
            r8.A0 = r9     // Catch:{ all -> 0x054f }
            r8.B0 = r7     // Catch:{ all -> 0x054f }
            r34 = r1
            r1 = 0
            r8.C0 = r1     // Catch:{ all -> 0x054d }
            r1 = r21
            r8.D0 = r1     // Catch:{ all -> 0x0544 }
            r8.E0 = r3     // Catch:{ all -> 0x0544 }
            r21 = r1
            r1 = 3
            r8.I0 = r1     // Catch:{ all -> 0x0544 }
            java.lang.Object r0 = defpackage.i24.L(r8)     // Catch:{ all -> 0x0544 }
            r1 = r19
            if (r0 != r1) goto L_0x0518
            return r1
        L_0x0518:
            r19 = r3
            r4 = r7
            r22 = r8
            r0 = r11
            r11 = r15
            r3 = r34
            r8 = r2
            r2 = r33
            r30 = r16
            r16 = r9
            r9 = r30
        L_0x052a:
            long r23 = java.lang.System.nanoTime()     // Catch:{ all -> 0x053c }
            int r7 = r2.read(r4)     // Catch:{ all -> 0x053c }
            r15 = r1
            r1 = r4
            r4 = r21
            r21 = r3
            r3 = r7
            r7 = 3
            goto L_0x02db
        L_0x053c:
            r0 = move-exception
            r10 = r3
            r2 = r8
            r15 = r11
            r14 = r22
            goto L_0x046e
        L_0x0544:
            r0 = move-exception
        L_0x0545:
            r1 = r19
        L_0x0547:
            r10 = r34
            r3 = r0
            r14 = r8
            goto L_0x0672
        L_0x054d:
            r0 = move-exception
            goto L_0x0545
        L_0x054f:
            r0 = move-exception
            r34 = r1
            goto L_0x0545
        L_0x0553:
            r0 = move-exception
            r1 = r19
            goto L_0x055a
        L_0x0557:
            r0 = move-exception
            r1 = r19
        L_0x055a:
            r15 = r20
            goto L_0x0547
        L_0x055d:
            r0 = move-exception
            r1 = r3
            goto L_0x055a
        L_0x0560:
            r0 = move-exception
            r34 = r4
            r15 = r11
            goto L_0x0545
        L_0x0565:
            r0 = move-exception
            goto L_0x0572
        L_0x0567:
            r3 = r0
            r15 = r11
            r2 = r17
            r10 = r21
            r14 = r22
            goto L_0x0672
        L_0x0571:
            r0 = move-exception
        L_0x0572:
            r1 = r15
            goto L_0x0567
        L_0x0574:
            r0 = move-exception
            r17 = r8
            goto L_0x0572
        L_0x0578:
            r17 = r8
            r1 = r15
            r16.flush()     // Catch:{ all -> 0x0661 }
            r3 = r21
            r2 = 0
            defpackage.v3c.i(r3, r2)     // Catch:{ all -> 0x0659 }
            defpackage.v3c.i(r11, r2)     // Catch:{ Exception -> 0x0654, all -> 0x064f }
            r8 = r17
            java.lang.String r0 = r8.c     // Catch:{ Exception -> 0x05b4 }
            ir6 r2 = defpackage.hm9.m     // Catch:{ Exception -> 0x05b4 }
            if (r2 != 0) goto L_0x0590
            goto L_0x05b6
        L_0x0590:
            boolean r3 = r2.c()     // Catch:{ Exception -> 0x05b4 }
            if (r3 == 0) goto L_0x05b6
            us7 r3 = defpackage.us7.X     // Catch:{ Exception -> 0x05b4 }
            long r13 = r14.a     // Catch:{ Exception -> 0x05b4 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05b4 }
            r7.<init>()     // Catch:{ Exception -> 0x05b4 }
            java.lang.String r9 = "File download. Finish read from buffer. Longest chunk time: "
            r7.append(r9)     // Catch:{ Exception -> 0x05b4 }
            r7.append(r13)     // Catch:{ Exception -> 0x05b4 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x05b4 }
            r9 = 0
            r2.d(r3, r0, r7, r9)     // Catch:{ Exception -> 0x05b4 }
            goto L_0x05b6
        L_0x05b0:
            r14 = r22
            goto L_0x06b3
        L_0x05b4:
            r0 = move-exception
            goto L_0x05b0
        L_0x05b6:
            if (r4 == 0) goto L_0x05bf
            java.lang.String r7 = e(r12)     // Catch:{ Exception -> 0x05b4 }
            r14 = r22
            goto L_0x05c2
        L_0x05bf:
            r14 = r22
            r7 = 0
        L_0x05c2:
            r14.o = r8     // Catch:{ Exception -> 0x064c }
            r14.X = r12     // Catch:{ Exception -> 0x064c }
            r14.Y = r6     // Catch:{ Exception -> 0x064c }
            r14.Z = r5     // Catch:{ Exception -> 0x064c }
            r2 = 0
            r14.s0 = r2     // Catch:{ Exception -> 0x064c }
            r14.t0 = r2     // Catch:{ Exception -> 0x064c }
            r14.u0 = r2     // Catch:{ Exception -> 0x064c }
            r14.v0 = r2     // Catch:{ Exception -> 0x064c }
            r14.w0 = r2     // Catch:{ Exception -> 0x064c }
            r14.x0 = r2     // Catch:{ Exception -> 0x064c }
            r14.y0 = r2     // Catch:{ Exception -> 0x064c }
            r14.z0 = r2     // Catch:{ Exception -> 0x064c }
            r14.A0 = r2     // Catch:{ Exception -> 0x064c }
            r14.B0 = r2     // Catch:{ Exception -> 0x064c }
            r0 = 4
            r14.I0 = r0     // Catch:{ Exception -> 0x064c }
            java.lang.Object r0 = r8.d(r5, r10, r7, r14)     // Catch:{ Exception -> 0x064c }
            if (r0 != r1) goto L_0x05e9
            return r1
        L_0x05e9:
            r2 = r6
            r4 = r8
        L_0x05eb:
            java.io.File r0 = (java.io.File) r0     // Catch:{ Exception -> 0x0639, all -> 0x0635 }
            java.lang.String r3 = r4.c     // Catch:{ Exception -> 0x0639, all -> 0x0635 }
            java.lang.String r6 = "File download. Completed"
            defpackage.hm9.m(r3, r6, new java.lang.Object[0])     // Catch:{ Exception -> 0x0639, all -> 0x0635 }
            java.util.concurrent.CopyOnWriteArrayList r3 = r2.b     // Catch:{ Exception -> 0x0639, all -> 0x0635 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0639, all -> 0x0635 }
            r6 = r0
        L_0x05fb:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x0639, all -> 0x0635 }
            if (r0 == 0) goto L_0x063e
            java.lang.Object r0 = r3.next()     // Catch:{ Exception -> 0x0639, all -> 0x0635 }
            cfe r0 = (defpackage.cfe) r0     // Catch:{ Exception -> 0x0639, all -> 0x0635 }
            if (r0 == 0) goto L_0x05fb
            r14.o = r4     // Catch:{ all -> 0x062c }
            r14.X = r12     // Catch:{ all -> 0x062c }
            r14.Y = r2     // Catch:{ all -> 0x062c }
            r14.Z = r5     // Catch:{ all -> 0x062c }
            r14.s0 = r6     // Catch:{ all -> 0x062c }
            r14.t0 = r3     // Catch:{ all -> 0x062c }
            r7 = 5
            r14.I0 = r7     // Catch:{ all -> 0x062c }
            java.lang.Object r0 = r0.f(r6, r14)     // Catch:{ all -> 0x062c }
            if (r0 != r1) goto L_0x061f
            return r1
        L_0x061f:
            r30 = r4
            r4 = r2
            r2 = r6
            r6 = r30
        L_0x0625:
            r30 = r6
            r6 = r2
            r2 = r4
            r4 = r30
            goto L_0x05fb
        L_0x062c:
            r0 = move-exception
        L_0x062d:
            java.lang.String r7 = r4.c     // Catch:{ Exception -> 0x0639, all -> 0x0635 }
            java.lang.String r8 = "File download. onResponse: failed to notify listener on download fully completed"
            defpackage.hm9.p(r7, r8, r0)     // Catch:{ Exception -> 0x0639, all -> 0x0635 }
            goto L_0x05fb
        L_0x0635:
            r0 = move-exception
            r6 = r2
            goto L_0x00a3
        L_0x0639:
            r0 = move-exception
            r6 = r2
            r8 = r4
            goto L_0x06b3
        L_0x063e:
            java.lang.String r0 = r5.getAbsolutePath()
            r4.j(r2, r0)
            defpackage.naf.c(r12)
            r7 = r18
            goto L_0x075c
        L_0x064c:
            r0 = move-exception
            goto L_0x06b3
        L_0x064f:
            r0 = move-exception
            r8 = r17
            goto L_0x075d
        L_0x0654:
            r0 = move-exception
            r8 = r17
            goto L_0x05b0
        L_0x0659:
            r0 = move-exception
            r8 = r17
            r14 = r22
            r3 = r0
            r2 = r8
            goto L_0x067c
        L_0x0661:
            r0 = move-exception
            r8 = r17
            r3 = r21
            r14 = r22
            r10 = r3
            r2 = r8
            goto L_0x046d
        L_0x066c:
            r0 = move-exception
            r2 = r1
            r1 = r15
            r3 = r0
            r15 = r2
            r2 = r8
        L_0x0672:
            throw r3     // Catch:{ all -> 0x0673 }
        L_0x0673:
            r0 = move-exception
            r4 = r0
            defpackage.v3c.i(r10, r3)     // Catch:{ all -> 0x0679 }
            throw r4     // Catch:{ all -> 0x0679 }
        L_0x0679:
            r0 = move-exception
            r3 = r0
            r11 = r15
        L_0x067c:
            throw r3     // Catch:{ all -> 0x067d }
        L_0x067d:
            r0 = move-exception
            r4 = r0
            defpackage.v3c.i(r11, r3)     // Catch:{ Exception -> 0x0687, all -> 0x0683 }
            throw r4     // Catch:{ Exception -> 0x0687, all -> 0x0683 }
        L_0x0683:
            r0 = move-exception
            r8 = r2
            goto L_0x075d
        L_0x0687:
            r0 = move-exception
            r8 = r2
            goto L_0x06b3
        L_0x068a:
            r1 = r15
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x064c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x064c }
            r2.<init>(r0)     // Catch:{ Exception -> 0x064c }
            throw r2     // Catch:{ Exception -> 0x064c }
        L_0x0697:
            r0 = move-exception
            r8 = r33
            r6 = r35
            r5 = r36
            goto L_0x075d
        L_0x06a0:
            r0 = move-exception
            r18 = r11
        L_0x06a3:
            r1 = r15
            r8 = r33
            r6 = r35
            r5 = r36
            goto L_0x06b3
        L_0x06ab:
            r0 = move-exception
            r18 = r10
            goto L_0x06a3
        L_0x06af:
            r0 = move-exception
            r18 = r10
            goto L_0x06a3
        L_0x06b3:
            java.lang.String r2 = r8.c     // Catch:{ all -> 0x025d }
            java.lang.String r3 = "File download. Exception while downloading file"
            r4 = 0
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x025d }
            defpackage.hm9.r(r2, r0, r3, r7)     // Catch:{ all -> 0x025d }
            java.util.concurrent.CopyOnWriteArrayList r2 = r6.b     // Catch:{ all -> 0x025d }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x025d }
            r3 = r0
        L_0x06c4:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x025d }
            if (r0 == 0) goto L_0x0750
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x025d }
            cfe r0 = (defpackage.cfe) r0     // Catch:{ all -> 0x025d }
            if (r0 == 0) goto L_0x074c
            r8.getClass()     // Catch:{ all -> 0x073d }
            boolean r7 = r3 instanceof java.net.SocketException     // Catch:{ all -> 0x073d }
            if (r7 != 0) goto L_0x06ec
            java.lang.Throwable r7 = r3.getCause()     // Catch:{ all -> 0x073d }
            boolean r7 = r7 instanceof java.net.SocketException     // Catch:{ all -> 0x073d }
            if (r7 != 0) goto L_0x06ec
            boolean r7 = r3 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x073d }
            if (r7 != 0) goto L_0x06ec
            boolean r7 = r3 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x073d }
            if (r7 == 0) goto L_0x06ea
            goto L_0x06ec
        L_0x06ea:
            r9 = r4
            goto L_0x06ed
        L_0x06ec:
            r9 = 1
        L_0x06ed:
            java.lang.Throwable r7 = r3.getCause()     // Catch:{ all -> 0x073d }
            boolean r10 = r7 instanceof android.system.ErrnoException     // Catch:{ all -> 0x073d }
            if (r10 == 0) goto L_0x06f8
            android.system.ErrnoException r7 = (android.system.ErrnoException) r7     // Catch:{ all -> 0x073d }
            goto L_0x06f9
        L_0x06f8:
            r7 = 0
        L_0x06f9:
            if (r7 != 0) goto L_0x0708
            boolean r7 = r3 instanceof android.system.ErrnoException     // Catch:{ all -> 0x073d }
            if (r7 == 0) goto L_0x0703
            r7 = r3
            android.system.ErrnoException r7 = (android.system.ErrnoException) r7     // Catch:{ all -> 0x073d }
            goto L_0x0704
        L_0x0703:
            r7 = 0
        L_0x0704:
            if (r7 != 0) goto L_0x0708
        L_0x0706:
            r7 = r4
            goto L_0x070f
        L_0x0708:
            int r7 = r7.errno     // Catch:{ all -> 0x073d }
            int r10 = android.system.OsConstants.ENOSPC     // Catch:{ all -> 0x073d }
            if (r7 != r10) goto L_0x0706
            r7 = 1
        L_0x070f:
            r14.o = r8     // Catch:{ all -> 0x073d }
            r14.X = r12     // Catch:{ all -> 0x073d }
            r14.Y = r6     // Catch:{ all -> 0x073d }
            r14.Z = r5     // Catch:{ all -> 0x073d }
            r14.s0 = r3     // Catch:{ all -> 0x073d }
            r14.t0 = r2     // Catch:{ all -> 0x073d }
            r10 = 0
            r14.u0 = r10     // Catch:{ all -> 0x0739 }
            r14.v0 = r10     // Catch:{ all -> 0x0739 }
            r14.w0 = r10     // Catch:{ all -> 0x0739 }
            r14.x0 = r10     // Catch:{ all -> 0x0739 }
            r14.y0 = r10     // Catch:{ all -> 0x0739 }
            r14.z0 = r10     // Catch:{ all -> 0x0739 }
            r14.A0 = r10     // Catch:{ all -> 0x0739 }
            r14.B0 = r10     // Catch:{ all -> 0x0739 }
            r14.C0 = r10     // Catch:{ all -> 0x0739 }
            r11 = 6
            r14.I0 = r11     // Catch:{ all -> 0x0739 }
            r0.e(r9, r7)     // Catch:{ all -> 0x0739 }
            r7 = r18
            if (r7 != r1) goto L_0x0748
            return r1
        L_0x0739:
            r0 = move-exception
            r7 = r18
            goto L_0x0741
        L_0x073d:
            r0 = move-exception
            r7 = r18
            r10 = 0
        L_0x0741:
            java.lang.String r9 = r8.c     // Catch:{ all -> 0x025d }
            java.lang.String r11 = "File download. onResponse: failed to notify listener on download interrupted"
            defpackage.hm9.p(r9, r11, r0)     // Catch:{ all -> 0x025d }
        L_0x0748:
            r18 = r7
            goto L_0x06c4
        L_0x074c:
            r7 = r18
            r10 = 0
            goto L_0x0748
        L_0x0750:
            r7 = r18
            java.lang.String r0 = r5.getAbsolutePath()
            r8.j(r6, r0)
            defpackage.naf.c(r12)
        L_0x075c:
            return r7
        L_0x075d:
            java.lang.String r1 = r5.getAbsolutePath()
            r8.j(r6, r1)
            defpackage.naf.c(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sja.i(yic, kja, java.io.File, java.io.File, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void j(kja kja, String str) {
        kja.b.clear();
        this.d.remove(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(defpackage.kja r6, java.io.File r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.rja
            if (r0 == 0) goto L_0x0013
            r0 = r8
            rja r0 = (defpackage.rja) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            rja r0 = new rja
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.util.Iterator r5 = r0.X
            sja r6 = r0.o
            defpackage.od2.a0(r8)     // Catch:{ all -> 0x002b }
            goto L_0x0044
        L_0x002b:
            r7 = move-exception
            goto L_0x005f
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            defpackage.od2.a0(r8)
            r7.delete()
            java.util.concurrent.CopyOnWriteArrayList r6 = r6.b
            java.util.Iterator r6 = r6.iterator()
            r4 = r6
            r6 = r5
            r5 = r4
        L_0x0044:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0067
            java.lang.Object r7 = r5.next()
            cfe r7 = (defpackage.cfe) r7
            if (r7 == 0) goto L_0x0044
            r0.o = r6     // Catch:{ all -> 0x002b }
            r0.X = r5     // Catch:{ all -> 0x002b }
            r0.s0 = r3     // Catch:{ all -> 0x002b }
            e5f r7 = r7.b()     // Catch:{ all -> 0x002b }
            if (r7 != r1) goto L_0x0044
            return r1
        L_0x005f:
            java.lang.String r8 = r6.c
            java.lang.String r2 = "File download. Failed to notify listener on url expired"
            defpackage.hm9.p(r8, r2, r7)
            goto L_0x0044
        L_0x0067:
            e5f r5 = defpackage.e5f.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sja.k(kja, java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
