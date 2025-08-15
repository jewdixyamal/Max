package defpackage;

import java.util.concurrent.Callable;

/* renamed from: l5  reason: default package */
public final /* synthetic */ class l5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: java.io.FileOutputStream} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v6, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r13v5, types: [x8f, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r1v73, types: [u6f, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0294, code lost:
        r3 = (java.lang.ref.WeakReference) r1.next();
        r6 = (defpackage.nm9) r3.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02a0, code lost:
        if (r6 != null) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02a2, code lost:
        r6.onFailed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02a5, code lost:
        r3.clear();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x0282 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x027f A[SYNTHETIC, Splitter:B:141:0x027f] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0294 A[Catch:{ all -> 0x02aa, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0303  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r19 = this;
            r0 = r19
            r1 = 3
            r2 = 2
            r3 = 6
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            int r9 = r0.a
            switch(r9) {
                case 0: goto L_0x0615;
                case 1: goto L_0x0603;
                case 2: goto L_0x040c;
                case 3: goto L_0x0396;
                case 4: goto L_0x038b;
                case 5: goto L_0x0375;
                case 6: goto L_0x033c;
                case 7: goto L_0x0333;
                case 8: goto L_0x031d;
                case 9: goto L_0x02ba;
                case 10: goto L_0x013a;
                case 11: goto L_0x012d;
                case 12: goto L_0x0120;
                case 13: goto L_0x0117;
                case 14: goto L_0x00db;
                case 15: goto L_0x005f;
                case 16: goto L_0x0056;
                default: goto L_0x000f;
            }
        L_0x000f:
            u6f r1 = new u6f
            r1.<init>()
            q8f r2 = defpackage.q8f.UNKNOWN
            r1.g = r2
            java.lang.Object r0 = r0.b
            d7f r0 = (defpackage.d7f) r0
            r1.a = r0
            q8f r2 = defpackage.q8f.UPLOADING
            r1.g = r2
            java.lang.String r0 = r0.a
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0032 }
            r2.<init>(r0)     // Catch:{ all -> 0x0032 }
            long r2 = r2.length()     // Catch:{ all -> 0x0032 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0032 }
            goto L_0x0039
        L_0x0032:
            r0 = move-exception
            njc r2 = new njc
            r2.<init>(r0)
            r0 = r2
        L_0x0039:
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            boolean r3 = r0 instanceof defpackage.njc
            if (r3 == 0) goto L_0x0042
            r0 = r2
        L_0x0042:
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            r1.f = r2
            long r2 = java.lang.System.currentTimeMillis()
            r1.i = r2
            v6f r0 = new v6f
            r0.<init>(r1)
            return r0
        L_0x0056:
            java.lang.Object r0 = r0.b
            org.webrtc.TextureBufferImpl r0 = (org.webrtc.TextureBufferImpl) r0
            org.webrtc.VideoFrame$I420Buffer r0 = r0.lambda$toI420$1()
            return r0
        L_0x005f:
            java.lang.Object r0 = r0.b
            oke r0 = (defpackage.oke) r0
            je7 r1 = r0.o
            java.lang.Object r1 = r1.getValue()
            zi5 r1 = (defpackage.zi5) r1
            kk5 r1 = (defpackage.kk5) r1
            r1.getClass()
            android.content.Context r1 = r1.c
            java.io.File r2 = r1.getExternalFilesDir(r7)
            if (r2 != 0) goto L_0x007c
            java.io.File r2 = r1.getExternalCacheDir()
        L_0x007c:
            if (r2 != 0) goto L_0x0082
            java.io.File r2 = r1.getFilesDir()
        L_0x0082:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r2.getAbsolutePath()
            r1.<init>(r2)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x0094
            r1.mkdirs()
        L_0x0094:
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r2 = "font"
            java.io.File r1 = defpackage.kk5.g(r1, r2)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "TamNotoColorEmojiCompat.ttf"
            r2.<init>(r1, r3)
            boolean r1 = defpackage.pag.k(r2)
            if (r1 == 0) goto L_0x00d5
            je7 r0 = r0.c
            java.lang.Object r1 = r0.getValue()
            m7b r1 = (defpackage.m7b) r1
            p7b r1 = (defpackage.p7b) r1
            jp r1 = r1.c
            ne7 r1 = r1.g
            java.lang.String r3 = "app.extra.downloaded.emoji.font.url"
            java.lang.String r4 = ""
            java.lang.String r1 = r1.getString(r3, r4)
            java.lang.Object r0 = r0.getValue()
            m7b r0 = (defpackage.m7b) r0
            p7b r0 = (defpackage.p7b) r0
            z7d r0 = r0.b
            r0.getClass()
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L_0x00d5
            r6 = r8
        L_0x00d5:
            nke r0 = new nke
            r0.<init>(r2, r6)
            return r0
        L_0x00db:
            java.lang.Object r0 = r0.b
            a8g r0 = (defpackage.a8g) r0
            r0.getClass()
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.lang.Object r0 = r0.a
            java.io.File r0 = (java.io.File) r0
            r1.<init>(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromFile(r0)     // Catch:{ all -> 0x010b }
            java.lang.String r2 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r2)     // Catch:{ all -> 0x0104 }
            t99 r2 = new t99     // Catch:{ all -> 0x0104 }
            m99 r3 = defpackage.oag.z(r1)     // Catch:{ all -> 0x0104 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0104 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x010b }
            r1.close()
            return r2
        L_0x0104:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x010b }
            throw r0     // Catch:{ all -> 0x010b }
        L_0x0109:
            r2 = r0
            goto L_0x010d
        L_0x010b:
            r0 = move-exception
            goto L_0x0109
        L_0x010d:
            r1.close()     // Catch:{ all -> 0x0111 }
            goto L_0x0116
        L_0x0111:
            r0 = move-exception
            r1 = r0
            r2.addSuppressed(r1)
        L_0x0116:
            throw r2
        L_0x0117:
            java.lang.Object r0 = r0.b
            jlc r0 = (defpackage.jlc) r0
            ilc r0 = r0.m()
            return r0
        L_0x0120:
            java.lang.Object r0 = r0.b
            pkg r0 = (defpackage.pkg) r0
            java.lang.Object r0 = r0.a
            android.net.Uri r0 = (android.net.Uri) r0
            android.graphics.Bitmap r0 = defpackage.c37.o(r0)
            return r0
        L_0x012d:
            java.lang.Object r0 = r0.b
            qld r0 = (defpackage.qld) r0
            org.webrtc.EglBase r0 = r0.h
            if (r0 == 0) goto L_0x0139
            org.webrtc.EglBase$Context r7 = r0.getEglBaseContext()
        L_0x0139:
            return r7
        L_0x013a:
            java.lang.Object r0 = r0.b
            r1 = r0
            mm9 r1 = (defpackage.mm9) r1
            sc4 r0 = r1.b     // Catch:{ all -> 0x0165 }
            java.lang.String r2 = r1.d     // Catch:{ all -> 0x0165 }
            qm9 r0 = r0.b(r2)     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x016c
            java.io.File r2 = r0.b     // Catch:{ all -> 0x0165 }
            boolean r2 = r2.exists()     // Catch:{ all -> 0x0165 }
            if (r2 == 0) goto L_0x016c
            java.io.File r2 = r0.b     // Catch:{ all -> 0x0165 }
            boolean r2 = r2.canRead()     // Catch:{ all -> 0x0165 }
            if (r2 == 0) goto L_0x016c
            java.io.File r2 = r0.b     // Catch:{ all -> 0x0165 }
            java.lang.String r3 = r0.a     // Catch:{ all -> 0x0165 }
            r1.c(r2, r3)     // Catch:{ all -> 0x0165 }
            java.lang.String r1 = defpackage.pm9.a
            r7 = r0
            goto L_0x0259
        L_0x0165:
            r0 = move-exception
            r2 = r7
            r4 = r2
            r5 = r4
        L_0x0169:
            r9 = r5
            goto L_0x027b
        L_0x016c:
            boolean r0 = r1.e     // Catch:{ all -> 0x0165 }
            if (r0 != 0) goto L_0x0174
            java.lang.String r0 = defpackage.pm9.a
            goto L_0x0259
        L_0x0174:
            sc4 r0 = r1.b     // Catch:{ all -> 0x0165 }
            java.lang.String r2 = r1.d     // Catch:{ all -> 0x0165 }
            r0.getClass()     // Catch:{ all -> 0x0165 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0165 }
            gaa r5 = r0.a     // Catch:{ all -> 0x0165 }
            java.io.File r5 = r5.u()     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r0.a(r2)     // Catch:{ all -> 0x0165 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0165 }
            r2.<init>()     // Catch:{ all -> 0x0165 }
            r2.append(r0)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = ".temp"
            r2.append(r0)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0165 }
            r4.<init>(r5, r0)     // Catch:{ all -> 0x0165 }
            java.io.File r0 = r4.getParentFile()     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x01a4
            r0.mkdirs()     // Catch:{ all -> 0x0165 }
        L_0x01a4:
            boolean r0 = r4.exists()     // Catch:{ all -> 0x0165 }
            if (r0 != 0) goto L_0x01ad
            r4.createNewFile()     // Catch:{ all -> 0x0165 }
        L_0x01ad:
            aea r0 = r1.a     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = r1.d     // Catch:{ all -> 0x0279 }
            r0.getClass()     // Catch:{ all -> 0x0279 }
            l84 r5 = new l84     // Catch:{ all -> 0x0279 }
            r5.<init>()     // Catch:{ all -> 0x0279 }
            r5.S(r2)     // Catch:{ all -> 0x0279 }
            mhc r2 = r5.r()     // Catch:{ all -> 0x0279 }
            je7 r0 = r0.a     // Catch:{ all -> 0x0279 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0279 }
            u2a r0 = (defpackage.u2a) r0     // Catch:{ all -> 0x0279 }
            b8c r0 = r0.b(r2)     // Catch:{ all -> 0x0279 }
            yic r0 = r0.f()     // Catch:{ all -> 0x0279 }
            v2a r2 = new v2a     // Catch:{ all -> 0x0279 }
            r2.<init>(r0)     // Catch:{ all -> 0x0279 }
            boolean r5 = r0.m()     // Catch:{ all -> 0x0273 }
            if (r5 == 0) goto L_0x026b
            i8c r0 = r0.Z     // Catch:{ all -> 0x0273 }
            if (r0 == 0) goto L_0x0260
            java.io.InputStream r5 = r0.m()     // Catch:{ all -> 0x0273 }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x025d }
            r9.<init>(r4, r6)     // Catch:{ all -> 0x025d }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x01f7 }
        L_0x01ec:
            int r10 = r5.read(r0)     // Catch:{ all -> 0x01f7 }
            r11 = -1
            if (r10 == r11) goto L_0x01fa
            r9.write(r0, r6, r10)     // Catch:{ all -> 0x01f7 }
            goto L_0x01ec
        L_0x01f7:
            r0 = move-exception
            goto L_0x027b
        L_0x01fa:
            r9.flush()     // Catch:{ all -> 0x01f7 }
            yic r0 = r2.a     // Catch:{ all -> 0x01f7 }
            java.lang.String r10 = "Content-Disposition"
            java.lang.String r0 = defpackage.yic.a(r0, r10)     // Catch:{ all -> 0x01f7 }
            if (r0 == 0) goto L_0x0230
            int r10 = r0.length()     // Catch:{ all -> 0x01f7 }
            if (r10 != 0) goto L_0x020e
            goto L_0x0230
        L_0x020e:
            java.util.regex.Pattern r10 = defpackage.v2a.b     // Catch:{ IllegalStateException -> 0x021f }
            java.util.regex.Matcher r0 = r10.matcher(r0)     // Catch:{ IllegalStateException -> 0x021f }
            boolean r10 = r0.find()     // Catch:{ IllegalStateException -> 0x021f }
            if (r10 == 0) goto L_0x021f
            java.lang.String r0 = r0.group(r8)     // Catch:{ IllegalStateException -> 0x021f }
            goto L_0x0220
        L_0x021f:
            r0 = r7
        L_0x0220:
            if (r0 == 0) goto L_0x0231
            r10 = 47
            int r3 = defpackage.w9e.E0(r0, r10, r6, r3)     // Catch:{ all -> 0x01f7 }
            int r3 = r3 + r8
            if (r3 <= 0) goto L_0x0231
            java.lang.String r0 = r0.substring(r3)     // Catch:{ all -> 0x01f7 }
            goto L_0x0231
        L_0x0230:
            r0 = r7
        L_0x0231:
            sc4 r3 = r1.b     // Catch:{ all -> 0x01f7 }
            java.lang.String r6 = r1.d     // Catch:{ all -> 0x01f7 }
            java.io.File r3 = r3.c(r6, r0)     // Catch:{ all -> 0x01f7 }
            java.io.File r6 = r3.getParentFile()     // Catch:{ all -> 0x01f7 }
            if (r6 == 0) goto L_0x0242
            r6.mkdirs()     // Catch:{ all -> 0x01f7 }
        L_0x0242:
            defpackage.pm9.b(r4, r3)     // Catch:{ all -> 0x025a }
            r1.c(r3, r0)     // Catch:{ all -> 0x025a }
            qm9 r7 = new qm9     // Catch:{ all -> 0x025a }
            r7.<init>(r3, r0)     // Catch:{ all -> 0x025a }
            defpackage.pm9.a(r2)
            defpackage.pm9.a(r5)
            defpackage.pm9.a(r9)
            r4.delete()     // Catch:{ all -> 0x0259 }
        L_0x0259:
            return r7
        L_0x025a:
            r0 = move-exception
            r7 = r3
            goto L_0x027b
        L_0x025d:
            r0 = move-exception
            r9 = r7
            goto L_0x027b
        L_0x0260:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0273 }
            java.lang.String r3 = "failed to get response body"
            r0.<init>(r3)     // Catch:{ all -> 0x0273 }
            throw r0     // Catch:{ all -> 0x0273 }
        L_0x0268:
            r5 = r7
            goto L_0x0169
        L_0x026b:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0273 }
            java.lang.String r3 = r1.d     // Catch:{ all -> 0x0273 }
            r0.<init>(r3)     // Catch:{ all -> 0x0273 }
            throw r0     // Catch:{ all -> 0x0273 }
        L_0x0273:
            r0 = move-exception
            goto L_0x0268
        L_0x0275:
            r2 = r7
            r5 = r2
            goto L_0x0169
        L_0x0279:
            r0 = move-exception
            goto L_0x0275
        L_0x027b:
            java.lang.String r3 = defpackage.pm9.a     // Catch:{ all -> 0x02aa }
            if (r7 == 0) goto L_0x0282
            r7.delete()     // Catch:{ all -> 0x0282 }
        L_0x0282:
            java.util.concurrent.atomic.AtomicReference r1 = r1.f     // Catch:{ all -> 0x02aa }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x02aa }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x02aa }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x02aa }
        L_0x028e:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x02aa }
            if (r3 == 0) goto L_0x02a9
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x02aa }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x02aa }
            java.lang.Object r6 = r3.get()     // Catch:{ all -> 0x02aa }
            nm9 r6 = (defpackage.nm9) r6     // Catch:{ all -> 0x02aa }
            if (r6 == 0) goto L_0x02a5
            r6.onFailed(r0)     // Catch:{ all -> 0x02aa }
        L_0x02a5:
            r3.clear()     // Catch:{ all -> 0x02aa }
            goto L_0x028e
        L_0x02a9:
            throw r0     // Catch:{ all -> 0x02aa }
        L_0x02aa:
            r0 = move-exception
            defpackage.pm9.a(r2)
            defpackage.pm9.a(r5)
            defpackage.pm9.a(r9)
            if (r4 == 0) goto L_0x02b9
            r4.delete()     // Catch:{ all -> 0x02b9 }
        L_0x02b9:
            throw r0
        L_0x02ba:
            java.lang.String r1 = "Can't get video params for path "
            java.lang.Object r0 = r0.b
            r2 = r0
            uq7 r2 = (defpackage.uq7) r2
            java.lang.String r3 = r2.a
            android.media.MediaMetadataRetriever r8 = new android.media.MediaMetadataRetriever     // Catch:{ all -> 0x02e3 }
            r8.<init>()     // Catch:{ all -> 0x02e3 }
            android.content.Context r0 = r2.b     // Catch:{ all -> 0x02e0 }
            android.net.Uri r9 = android.net.Uri.parse(r3)     // Catch:{ all -> 0x02e0 }
            r8.setDataSource(r0, r9)     // Catch:{ all -> 0x02e0 }
            android.graphics.Point r9 = defpackage.s36.v(r8)     // Catch:{ all -> 0x02e0 }
            int r0 = defpackage.s36.r(r8)     // Catch:{ all -> 0x02de }
            long r4 = (long) r0
        L_0x02da:
            defpackage.s36.z(r8)
            goto L_0x02f8
        L_0x02de:
            r0 = move-exception
            goto L_0x02e6
        L_0x02e0:
            r0 = move-exception
            r9 = r7
            goto L_0x02e6
        L_0x02e3:
            r0 = move-exception
            r8 = r7
            r9 = r8
        L_0x02e6:
            java.lang.String r10 = "uq7"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0318 }
            r11.<init>(r1)     // Catch:{ all -> 0x0318 }
            r11.append(r3)     // Catch:{ all -> 0x0318 }
            java.lang.String r1 = r11.toString()     // Catch:{ all -> 0x0318 }
            defpackage.hm9.p(r10, r1, r0)     // Catch:{ all -> 0x0318 }
            goto L_0x02da
        L_0x02f8:
            df5 r0 = new df5
            if (r9 == 0) goto L_0x0300
            int r1 = r9.x
            r12 = r1
            goto L_0x0301
        L_0x0300:
            r12 = r6
        L_0x0301:
            if (r9 == 0) goto L_0x0305
            int r6 = r9.y
        L_0x0305:
            r13 = r6
            int r14 = (int) r4
            java.lang.String r15 = r2.a
            r11 = 3
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            ff5 r1 = new ff5
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.<init>(r7, r0)
            return r1
        L_0x0318:
            r0 = move-exception
            defpackage.s36.z(r8)
            throw r0
        L_0x031d:
            java.lang.Object r0 = r0.b
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x032e
            boolean r0 = defpackage.pag.l(r0)
            if (r0 == 0) goto L_0x032e
            r6 = r8
        L_0x032e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L_0x0333:
            java.lang.Object r0 = r0.b
            ru.ok.android.externcalls.sdk.id.InternalIdsResolver r0 = (ru.ok.android.externcalls.sdk.id.InternalIdsResolver) r0
            java.util.Set r0 = r0.lambda$resolveIdsAndGetFailed$0()
            return r0
        L_0x033c:
            java.lang.Object r0 = r0.b
            re6 r0 = (defpackage.re6) r0
            java.lang.Object r0 = r0.b
            androidx.work.impl.WorkDatabase r0 = (androidx.work.impl.WorkDatabase) r0
            h7b r1 = r0.u()
            java.lang.String r2 = "next_alarm_manager_id"
            java.lang.Long r1 = r1.j(r2)
            if (r1 == 0) goto L_0x0356
            long r3 = r1.longValue()
            int r1 = (int) r3
            goto L_0x0357
        L_0x0356:
            r1 = r6
        L_0x0357:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r3) goto L_0x035d
            goto L_0x035f
        L_0x035d:
            int r6 = r1 + 1
        L_0x035f:
            h7b r0 = r0.u()
            g7b r3 = new g7b
            long r4 = (long) r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.<init>(r2, r4)
            r0.p(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x0375:
            java.lang.Object r0 = r0.b
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            java.lang.Object r7 = r0.call()     // Catch:{ InterruptedException -> 0x0388, IllegalStateException -> 0x037e }
            goto L_0x0387
        L_0x037e:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = "Fresco"
            java.lang.String r2 = "failed to execute fresco task"
            defpackage.hm9.l0(r0, r2, r1)
        L_0x0387:
            return r7
        L_0x0388:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x038b:
            java.lang.Object r0 = r0.b
            je7 r0 = (defpackage.je7) r0
            java.lang.Object r0 = r0.getValue()
            wc5 r0 = (defpackage.wc5) r0
            return r0
        L_0x0396:
            java.lang.String r1 = "OKRTCCall"
            java.lang.Object r0 = r0.b
            r2 = r0
            vq7 r2 = (defpackage.vq7) r2
            java.lang.Object r0 = r2.b
            r3 = r0
            a4c r3 = (defpackage.a4c) r3
            int r4 = android.media.MediaCodecList.getCodecCount()
            r5 = r6
        L_0x03a7:
            if (r5 >= r4) goto L_0x0409
            android.media.MediaCodecInfo r0 = android.media.MediaCodecList.getCodecInfoAt(r5)     // Catch:{ Exception -> 0x03fe }
            java.lang.String r9 = r0.getName()     // Catch:{ Exception -> 0x03fe }
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x03fe }
            java.lang.String r9 = r9.toLowerCase(r10)     // Catch:{ Exception -> 0x03fe }
            java.lang.String[] r10 = r0.getSupportedTypes()     // Catch:{ Exception -> 0x03fe }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x03fe }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03fe }
            r11.<init>()     // Catch:{ Exception -> 0x03fe }
            java.lang.String r12 = "codec="
            r11.append(r12)     // Catch:{ Exception -> 0x03fe }
            r11.append(r0)     // Catch:{ Exception -> 0x03fe }
            java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x03fe }
            r3.log(r1, r0)     // Catch:{ Exception -> 0x03fe }
            int r0 = r10.length     // Catch:{ Exception -> 0x03fe }
            r11 = r6
        L_0x03d7:
            if (r11 >= r0) goto L_0x0407
            r12 = r10[r11]     // Catch:{ Exception -> 0x03fe }
            java.lang.String r13 = "avc"
            boolean r12 = defpackage.w9e.p0(r12, r13, r6)     // Catch:{ Exception -> 0x03fe }
            if (r12 == 0) goto L_0x0400
            java.lang.Object r12 = r2.c     // Catch:{ Exception -> 0x03fe }
            d4c r12 = (defpackage.d4c) r12     // Catch:{ Exception -> 0x03fe }
            e0e r13 = defpackage.e0e.app_event     // Catch:{ Exception -> 0x03fe }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03fe }
            r14.<init>()     // Catch:{ Exception -> 0x03fe }
            java.lang.String r15 = "rtc.enc.hw."
            r14.append(r15)     // Catch:{ Exception -> 0x03fe }
            r14.append(r9)     // Catch:{ Exception -> 0x03fe }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x03fe }
            r12.log((defpackage.e0e) r13, (java.lang.String) r14, (java.lang.String) r7)     // Catch:{ Exception -> 0x03fe }
            goto L_0x0400
        L_0x03fe:
            r0 = move-exception
            goto L_0x0402
        L_0x0400:
            int r11 = r11 + r8
            goto L_0x03d7
        L_0x0402:
            java.lang.String r9 = "codec.log"
            r3.reportException(r1, r9, r0)
        L_0x0407:
            int r5 = r5 + r8
            goto L_0x03a7
        L_0x0409:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x040c:
            java.lang.Object r0 = r0.b
            r9 = r0
            cx0 r9 = (defpackage.cx0) r9
            r9.getClass()
            java.util.ArrayList r10 = new java.util.ArrayList
            java.util.LinkedHashSet r11 = defpackage.cx0.l
            int r0 = r11.size()
            r10.<init>(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.i
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x042a
            r0 = r7
            goto L_0x055a
        L_0x042a:
            ng5 r12 = r9.a
            r12.getClass()
            x8f r13 = new x8f
            y8f r0 = r12.e
            py8 r14 = r12.f
            java.lang.String r15 = "x8f"
            r13.<init>()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r13.a = r6
            q8f r16 = defpackage.q8f.UNKNOWN     // Catch:{ all -> 0x0452 }
            f28 r0 = r0.f()     // Catch:{ all -> 0x0452 }
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0452 }
            java.lang.Object r0 = r0.c(r4)     // Catch:{ all -> 0x0452 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0452 }
            goto L_0x045c
        L_0x0452:
            r0 = move-exception
            java.lang.String r4 = "getUploadsFromRepository: failed"
            defpackage.hm9.p(r15, r4, r0)
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x045c:
            java.util.Iterator r0 = r0.iterator()
        L_0x0460:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0479
            java.lang.Object r4 = r0.next()
            v6f r4 = (defpackage.v6f) r4
            d7f r5 = r4.a
            java.lang.String r5 = r5.a
            defpackage.x8f.a(r6, r5)
            java.lang.String r4 = r4.b
            defpackage.x8f.a(r6, r4)
            goto L_0x0460
        L_0x0479:
            java.util.HashSet r4 = r13.a
            o28 r0 = r14.a()     // Catch:{ all -> 0x048a }
            java.util.List r5 = java.util.Collections.emptyList()     // Catch:{ all -> 0x048a }
            java.lang.Object r0 = r0.c(r5)     // Catch:{ all -> 0x048a }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x048a }
            goto L_0x0494
        L_0x048a:
            r0 = move-exception
            java.lang.String r5 = "getMessageUploads: failed"
            defpackage.hm9.p(r15, r5, r0)
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0494:
            java.util.Iterator r0 = r0.iterator()
        L_0x0498:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x04aa
            java.lang.Object r5 = r0.next()
            iy8 r5 = (defpackage.iy8) r5
            java.lang.String r5 = r5.b
            defpackage.x8f.a(r4, r5)
            goto L_0x0498
        L_0x04aa:
            java.util.HashSet r0 = r13.a
            v00 r4 = defpackage.p82.I
            p82 r5 = r12.c
            java.util.List r4 = r5.E(r4)
            hb3 r4 = defpackage.qy9.j(r4)
            n2f r5 = new n2f
            r6 = 9
            r5.<init>(r6)
            ty9 r6 = new ty9
            r6.<init>(r4, r5, r8)
            n2f r4 = new n2f
            r5 = 10
            r4.<init>(r5)
            e0a r5 = new e0a
            r5.<init>(r6, r4, r2)
            n2f r4 = new n2f
            r6 = 11
            r4.<init>(r6)
            e0a r6 = new e0a
            r6.<init>(r5, r4, r1)
            vy9 r4 = r6.v()
            java.lang.Object r4 = r4.e()
            java.util.List r4 = (java.util.List) r4
            r0.addAll(r4)
            java.util.HashSet r0 = r13.a
            oz7 r4 = defpackage.iu8.b
            au8 r4 = r12.d
            java.util.ArrayList r4 = r4.s()
            java.util.Iterator r4 = r4.iterator()
        L_0x04f7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0528
            java.lang.Object r5 = r4.next()
            cu8 r5 = (defpackage.cu8) r5
            boolean r6 = r5.n()
            if (r6 != 0) goto L_0x050a
            goto L_0x04f7
        L_0x050a:
            r6 = 0
        L_0x050b:
            int r14 = r5.b()
            if (r6 >= r14) goto L_0x04f7
            k8g r14 = r5.z0
            if (r14 == 0) goto L_0x051a
            java.lang.Object r14 = r14.a
            java.util.List r14 = (java.util.List) r14
            goto L_0x051b
        L_0x051a:
            r14 = r7
        L_0x051b:
            java.lang.Object r14 = r14.get(r6)
            l20 r14 = (defpackage.l20) r14
            java.lang.String r14 = r14.s
            defpackage.x8f.a(r0, r14)
            int r6 = r6 + r8
            goto L_0x050b
        L_0x0528:
            java.util.HashSet r0 = r13.a
            wef r4 = r12.g
            java.util.HashMap r4 = r4.i
            java.util.Set r4 = r4.keySet()
            java.util.Set r4 = java.util.Collections.unmodifiableSet(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x053a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x054c
            java.lang.Object r5 = r4.next()
            lef r5 = (defpackage.lef) r5
            java.lang.String r5 = r5.a
            defpackage.x8f.a(r0, r5)
            goto L_0x053a
        L_0x054c:
            va8 r0 = new va8
            mg5 r4 = r12.j
            r4.getClass()
            r0.<init>((defpackage.x8f) r13)
            nw4 r0 = r12.a(r0)
        L_0x055a:
            java.util.Iterator r4 = r11.iterator()
            r5 = 0
        L_0x0560:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x05ee
            java.lang.Object r11 = r4.next()
            gx0 r11 = (defpackage.gx0) r11
            gx0 r12 = defpackage.gx0.Y
            if (r11 != r12) goto L_0x0571
            goto L_0x0560
        L_0x0571:
            if (r0 != 0) goto L_0x0576
            r13 = 0
            goto L_0x057a
        L_0x0576:
            long r13 = r0.l(r11)
        L_0x057a:
            gx0 r15 = defpackage.gx0.t0
            if (r11 != r15) goto L_0x0589
            if (r0 != 0) goto L_0x0583
            r17 = 0
            goto L_0x0587
        L_0x0583:
            long r17 = r0.l(r12)
        L_0x0587:
            long r13 = r17 + r13
        L_0x0589:
            java.lang.String r12 = defpackage.are.w(r13, r8, r7)
            iw0 r15 = new iw0
            int r7 = r11.ordinal()
            s23 r3 = r9.d
            if (r7 == r8) goto L_0x05da
            if (r7 == r2) goto L_0x05d1
            if (r7 == r1) goto L_0x05c8
            r1 = 4
            if (r7 == r1) goto L_0x05bf
            r1 = 6
            if (r7 == r1) goto L_0x05b6
            r1 = 7
            if (r7 == r1) goto L_0x05ad
            android.content.Context r1 = r3.a
            int r3 = defpackage.jpc.M0
            java.lang.String r1 = r1.getString(r3)
            goto L_0x05e2
        L_0x05ad:
            android.content.Context r1 = r3.a
            int r3 = defpackage.jpc.O0
            java.lang.String r1 = r1.getString(r3)
            goto L_0x05e2
        L_0x05b6:
            android.content.Context r1 = r3.a
            int r3 = defpackage.jpc.L0
            java.lang.String r1 = r1.getString(r3)
            goto L_0x05e2
        L_0x05bf:
            android.content.Context r1 = r3.a
            int r3 = defpackage.jpc.N0
            java.lang.String r1 = r1.getString(r3)
            goto L_0x05e2
        L_0x05c8:
            android.content.Context r1 = r3.a
            int r3 = defpackage.jpc.J0
            java.lang.String r1 = r1.getString(r3)
            goto L_0x05e2
        L_0x05d1:
            android.content.Context r1 = r3.a
            int r3 = defpackage.jpc.I0
            java.lang.String r1 = r1.getString(r3)
            goto L_0x05e2
        L_0x05da:
            android.content.Context r1 = r3.a
            int r3 = defpackage.jpc.K0
            java.lang.String r1 = r1.getString(r3)
        L_0x05e2:
            r15.<init>(r1, r11, r12, r8)
            r10.add(r15)
            long r5 = r5 + r13
            r1 = 3
            r3 = 6
            r7 = 0
            goto L_0x0560
        L_0x05ee:
            ax0 r1 = new ax0
            r2 = 0
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x05fd
            r2 = 0
            r3 = 0
            java.lang.String r2 = defpackage.are.w(r5, r3, r2)
            goto L_0x05ff
        L_0x05fd:
            java.lang.String r2 = "0 KB"
        L_0x05ff:
            r1.<init>(r0, r2, r10)
            return r1
        L_0x0603:
            java.lang.Object r0 = r0.b
            du0 r0 = (defpackage.du0) r0
            rxd r1 = r0.g
            r1.U()
            lg5 r0 = r0.a
            el4 r0 = (defpackage.el4) r0
            r0.a()
            r1 = 0
            return r1
        L_0x0615:
            int r1 = ru.ok.messages.views.ActAvatarCrop.d1
            java.lang.Object r0 = r0.b
            ru.ok.messages.views.ActAvatarCrop r0 = (ru.ok.messages.views.ActAvatarCrop) r0
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r2 = "ru.ok.tamtam.extra.URI"
            android.os.Parcelable r1 = r1.getParcelableExtra(r2)
            android.net.Uri r1 = (android.net.Uri) r1
            android.graphics.Bitmap r1 = defpackage.c37.o(r1)
            boolean r2 = r0.c1
            if (r2 == 0) goto L_0x0634
            int r2 = r1.getHeight()
            goto L_0x0638
        L_0x0634:
            int r2 = r1.getWidth()
        L_0x0638:
            boolean r3 = r0.c1
            if (r3 == 0) goto L_0x0641
            int r3 = r1.getWidth()
            goto L_0x0645
        L_0x0641:
            int r3 = r1.getHeight()
        L_0x0645:
            android.graphics.Bitmap$Config r4 = r1.getConfig()
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r2, r3, r4)
            boolean r5 = r0.c1
            android.graphics.Matrix r6 = r0.b1
            if (r5 == 0) goto L_0x0668
            float r5 = (float) r2
            int r7 = r1.getWidth()
            float r7 = (float) r7
            float r5 = r5 - r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r7
            float r3 = (float) r3
            int r9 = r1.getHeight()
            float r9 = (float) r9
            float r3 = r3 - r9
            float r3 = r3 / r7
            r6.postTranslate(r5, r3)
        L_0x0668:
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r4)
            r5 = 0
            r3.drawBitmap(r1, r6, r5)
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r6 = "ru.ok.tamtam.extra.FILE_PATH"
            java.lang.String r3 = r3.getStringExtra(r6)
            y7g r6 = r0.K0
            java.lang.Object r6 = r6.b
            ed3 r6 = (defpackage.ed3) r6
            y8a r6 = (defpackage.y8a) r6
            p7b r6 = r6.n()
            z7d r6 = r6.b
            defpackage.j47.i0(r3, r4, r6)
            r1.recycle()
            r4.recycle()
            ru.ok.messages.views.widgets.AvatarCropView r1 = r0.U0
            jag r1 = r1.getZoomableController()
            oz3 r1 = (defpackage.oz3) r1
            android.graphics.Rect r1 = r1.c(r2)
            android.graphics.Point r2 = r0.a1
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r1.toString()
            int r4 = r1.width()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r6 = r1.height()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r6}
            java.lang.String r3 = "ru.ok.messages.views.ActAvatarCrop"
            java.lang.String r4 = "image crop finished, image size: %s, cropped bounds: %s, cropped width: %d, cropped height: %d"
            defpackage.hm9.m(r3, r4, r2)
            y7g r2 = r0.K0
            java.lang.Object r2 = r2.b
            ed3 r2 = (defpackage.ed3) r2
            y8a r2 = (defpackage.y8a) r2
            p7b r2 = r2.n()
            z7d r2 = r2.b
            r2.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r3 = ru.ok.tamtam.android.prefs.PmsKey.f84minimagesidesize
            r4 = 64
            long r6 = (long) r4
            long r2 = r2.q(r3, r6)
            int r2 = (int) r2
            int r3 = r1.width()
            if (r3 < r2) goto L_0x06ed
            int r3 = r1.height()
            if (r3 >= r2) goto L_0x06eb
            goto L_0x06ed
        L_0x06eb:
            r7 = r1
            goto L_0x06f7
        L_0x06ed:
            int r1 = defpackage.jpc.E1
            java.lang.String r1 = r0.getString(r1)
            defpackage.a14.N(r8, r0, r1)
            r7 = r5
        L_0x06f7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l5.call():java.lang.Object");
    }
}
