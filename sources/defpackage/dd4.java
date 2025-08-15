package defpackage;

/* renamed from: dd4  reason: default package */
public final /* synthetic */ class dd4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dd4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [jy7, m99] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1 = r6.d();
        r2 = r1.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r2 != 2) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r3 = r6.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0028, code lost:
        if (r2 != 0) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        android.os.Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
        r0 = r6.c;
        r2 = r6.a;
        r0.getClass();
        r0 = defpackage.a4f.a(r2, new defpackage.vx5[]{r1}, 0);
        r1 = defpackage.f8.p(r6.a, r1.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r1 == null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0049, code lost:
        if (r0 == null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        android.os.Trace.beginSection("EmojiCompat.MetadataRepo.create");
        r1 = r1.duplicate();
        r1.position((int) defpackage.oag.l(new defpackage.wd6(r1)).b);
        r3 = new defpackage.jy7();
        r1.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r5 = r1.position() + r1.getInt(r1.position());
        r3.o = r1;
        r3.a = r5;
        r5 = r5 - r1.getInt(r5);
        r3.b = r5;
        r3.c = ((java.nio.ByteBuffer) r3.o).getShort(r5);
        r2 = new defpackage.t99(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        android.os.Trace.endSection();
        r0 = r6.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r1 = r6.s0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        if (r1 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        r1.y(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r6.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ba, code lost:
        throw new java.lang.RuntimeException("Unable to open file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00bf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d6, code lost:
        throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r2 + ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d9, code lost:
        monitor-enter(r6.o);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r1 = r6.s0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00dc, code lost:
        if (r1 != null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00de, code lost:
        r1.v(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e2, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e5, code lost:
        r6.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00ea, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r6 = this;
            java.lang.Object r6 = r6.b
            lx5 r6 = (defpackage.lx5) r6
            java.lang.String r0 = "fetchFonts result is not OK. ("
            java.lang.Object r1 = r6.o
            monitor-enter(r1)
            tu0 r2 = r6.s0     // Catch:{ all -> 0x0010 }
            if (r2 != 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x0010 }
            goto L_0x00e8
        L_0x0010:
            r6 = move-exception
            goto L_0x00eb
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x0010 }
            vx5 r1 = r6.d()     // Catch:{ all -> 0x0025 }
            int r2 = r1.e     // Catch:{ all -> 0x0025 }
            r3 = 2
            if (r2 != r3) goto L_0x0028
            java.lang.Object r3 = r6.o     // Catch:{ all -> 0x0025 }
            monitor-enter(r3)     // Catch:{ all -> 0x0025 }
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            goto L_0x0028
        L_0x0022:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            goto L_0x00d7
        L_0x0028:
            if (r2 != 0) goto L_0x00c0
            java.lang.String r0 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x00bb }
            dp3 r0 = r6.c     // Catch:{ all -> 0x00bb }
            android.content.Context r2 = r6.a     // Catch:{ all -> 0x00bb }
            r0.getClass()     // Catch:{ all -> 0x00bb }
            vx5[] r0 = new defpackage.vx5[]{r1}     // Catch:{ all -> 0x00bb }
            r3 = 0
            android.graphics.Typeface r0 = defpackage.a4f.a(r2, r0, r3)     // Catch:{ all -> 0x00bb }
            android.content.Context r2 = r6.a     // Catch:{ all -> 0x00bb }
            android.net.Uri r1 = r1.a     // Catch:{ all -> 0x00bb }
            java.nio.MappedByteBuffer r1 = defpackage.f8.p(r2, r1)     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x00b3
            if (r0 == 0) goto L_0x00b3
            java.lang.String r2 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r2)     // Catch:{ all -> 0x00ae }
            t99 r2 = new t99     // Catch:{ all -> 0x00ae }
            java.nio.ByteBuffer r1 = r1.duplicate()     // Catch:{ all -> 0x00ae }
            wd6 r3 = new wd6     // Catch:{ all -> 0x00ae }
            r3.<init>((java.nio.ByteBuffer) r1)     // Catch:{ all -> 0x00ae }
            l7 r3 = defpackage.oag.l(r3)     // Catch:{ all -> 0x00ae }
            long r3 = r3.b     // Catch:{ all -> 0x00ae }
            int r3 = (int) r3     // Catch:{ all -> 0x00ae }
            r1.position(r3)     // Catch:{ all -> 0x00ae }
            m99 r3 = new m99     // Catch:{ all -> 0x00ae }
            r3.<init>()     // Catch:{ all -> 0x00ae }
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x00ae }
            r1.order(r4)     // Catch:{ all -> 0x00ae }
            int r4 = r1.position()     // Catch:{ all -> 0x00ae }
            int r4 = r1.getInt(r4)     // Catch:{ all -> 0x00ae }
            int r5 = r1.position()     // Catch:{ all -> 0x00ae }
            int r5 = r5 + r4
            r3.o = r1     // Catch:{ all -> 0x00ae }
            r3.a = r5     // Catch:{ all -> 0x00ae }
            int r1 = r1.getInt(r5)     // Catch:{ all -> 0x00ae }
            int r5 = r5 - r1
            r3.b = r5     // Catch:{ all -> 0x00ae }
            java.lang.Object r1 = r3.o     // Catch:{ all -> 0x00ae }
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch:{ all -> 0x00ae }
            short r1 = r1.getShort(r5)     // Catch:{ all -> 0x00ae }
            r3.c = r1     // Catch:{ all -> 0x00ae }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x00ae }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00bb }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = r6.o     // Catch:{ all -> 0x0025 }
            monitor-enter(r0)     // Catch:{ all -> 0x0025 }
            tu0 r1 = r6.s0     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x00a7
            r1.y(r2)     // Catch:{ all -> 0x00a5 }
            goto L_0x00a7
        L_0x00a5:
            r1 = move-exception
            goto L_0x00ac
        L_0x00a7:
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            r6.b()     // Catch:{ all -> 0x0025 }
            goto L_0x00e8
        L_0x00ac:
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x00ae:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00b3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = "Unable to open file."
            r0.<init>(r1)     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x0025 }
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x00c0:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0025 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0025 }
            r3.<init>(r0)     // Catch:{ all -> 0x0025 }
            r3.append(r2)     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = ")"
            r3.append(r0)     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0025 }
            r1.<init>(r0)     // Catch:{ all -> 0x0025 }
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x00d7:
            java.lang.Object r2 = r6.o
            monitor-enter(r2)
            tu0 r1 = r6.s0     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x00e4
            r1.v(r0)     // Catch:{ all -> 0x00e2 }
            goto L_0x00e4
        L_0x00e2:
            r6 = move-exception
            goto L_0x00e9
        L_0x00e4:
            monitor-exit(r2)     // Catch:{ all -> 0x00e2 }
            r6.b()
        L_0x00e8:
            return
        L_0x00e9:
            monitor-exit(r2)     // Catch:{ all -> 0x00e2 }
            throw r6
        L_0x00eb:
            monitor-exit(r1)     // Catch:{ all -> 0x0010 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd4.a():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: m55} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: m55} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: m55} */
    /* JADX WARNING: type inference failed for: r11v0, types: [r10, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:63|62|64|66|154|155|156|143|(0)(0)) */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x02d0 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01e5 A[Catch:{ InterruptedException -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02ea A[LOOP:0: B:39:0x0117->B:157:0x02ea, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0157 A[SYNTHETIC, Splitter:B:56:0x0157] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01c7 A[SYNTHETIC, Splitter:B:93:0x01c7] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01db A[Catch:{ InterruptedException -> 0x01cd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r30 = this;
            r0 = r30
            r3 = 2
            r4 = 0
            r5 = 1
            int r6 = r0.a
            switch(r6) {
                case 0: goto L_0x0446;
                case 1: goto L_0x043e;
                case 2: goto L_0x0433;
                case 3: goto L_0x042b;
                case 4: goto L_0x0422;
                case 5: goto L_0x03ab;
                case 6: goto L_0x03a3;
                case 7: goto L_0x0393;
                case 8: goto L_0x0388;
                case 9: goto L_0x0365;
                case 10: goto L_0x035d;
                case 11: goto L_0x0355;
                case 12: goto L_0x034d;
                case 13: goto L_0x0345;
                case 14: goto L_0x030d;
                case 15: goto L_0x0305;
                case 16: goto L_0x02fd;
                case 17: goto L_0x00dd;
                case 18: goto L_0x00d1;
                case 19: goto L_0x00bd;
                case 20: goto L_0x0096;
                case 21: goto L_0x008c;
                case 22: goto L_0x0079;
                case 23: goto L_0x0065;
                case 24: goto L_0x0049;
                case 25: goto L_0x0045;
                case 26: goto L_0x0035;
                case 27: goto L_0x001c;
                case 28: goto L_0x0012;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.Object r0 = r0.b
            em6 r0 = (defpackage.em6) r0
            r0.i()
            return
        L_0x0012:
            java.lang.Object r0 = r0.b
            ru.ok.messages.settings.FrgBaseSettings r0 = (ru.ok.messages.settings.FrgBaseSettings) r0
            eed r0 = r0.C1
            r0.m()
            return
        L_0x001c:
            java.lang.Object r0 = r0.b
            androidx.fragment.app.c r0 = (androidx.fragment.app.c) r0
            java.util.ArrayList r0 = r0.n
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x002d
            return
        L_0x002d:
            java.lang.Object r0 = r0.next()
            defpackage.au1.r(r0)
            throw r4
        L_0x0035:
            java.lang.Object r0 = r0.b
            androidx.fragment.app.a r0 = (androidx.fragment.app.a) r0
            x16 r1 = r0.e1
            android.os.Bundle r2 = r0.o
            td r1 = r1.Y
            r1.t(r2)
            r0.o = r4
            return
        L_0x0045:
            r30.a()
            return
        L_0x0049:
            bc7[] r1 = one.me.folders.pickerfolders.FoldersPickerScreen.s0
            java.lang.Object r0 = r0.b
            one.me.folders.pickerfolders.FoldersPickerScreen r0 = (one.me.folders.pickerfolders.FoldersPickerScreen) r0
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto L_0x0064
            bc7[] r1 = one.me.folders.pickerfolders.FoldersPickerScreen.s0
            r1 = r1[r5]
            q7c r2 = r0.X
            java.lang.Object r0 = r2.T0(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.Y()
        L_0x0064:
            return
        L_0x0065:
            int r1 = ru.ok.messages.video.widgets.FloatingVideoView.E0
            java.lang.Object r0 = r0.b
            ru.ok.messages.video.widgets.FloatingVideoView r0 = (ru.ok.messages.video.widgets.FloatingVideoView) r0
            android.os.IBinder r1 = r0.getWindowToken()
            if (r1 == 0) goto L_0x0078
            android.view.WindowManager$LayoutParams r1 = r0.B0
            android.view.WindowManager r2 = r0.u0
            r2.updateViewLayout(r0, r1)
        L_0x0078:
            return
        L_0x0079:
            java.lang.Object r0 = r0.b
            fn5 r0 = (defpackage.fn5) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.t0
            if (r1 == 0) goto L_0x0084
            r1.Y()
        L_0x0084:
            androidx.recyclerview.widget.RecyclerView r0 = r0.t0
            if (r0 == 0) goto L_0x008b
            r0.postInvalidate()
        L_0x008b:
            return
        L_0x008c:
            bc7[] r1 = one.me.inappreview.ui.FakeInAppReviewBottomSheet.H0
            java.lang.Object r0 = r0.b
            one.me.inappreview.ui.FakeInAppReviewBottomSheet r0 = (one.me.inappreview.ui.FakeInAppReviewBottomSheet) r0
            r0.s0(r5)
            return
        L_0x0096:
            java.lang.Object r0 = r0.b
            sa5 r0 = (defpackage.sa5) r0
            rod r1 = r0.f
            qod r0 = r0.e     // Catch:{ all -> 0x00b2 }
            r1.getClass()     // Catch:{ all -> 0x00b2 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x00b2 }
            r2.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = "error"
            java.lang.String r4 = "command-discarded"
            org.json.JSONObject r2 = r2.put((java.lang.String) r3, (java.lang.Object) r4)     // Catch:{ all -> 0x00b2 }
            r0.j(r2)     // Catch:{ all -> 0x00b2 }
            goto L_0x00bc
        L_0x00b2:
            r0 = move-exception
            a4c r1 = r1.b
            java.lang.String r2 = "OKSignaling"
            java.lang.String r3 = "Error discarding postponed command"
            r1.logException(r2, r3, r0)
        L_0x00bc:
            return
        L_0x00bd:
            java.lang.Object r0 = r0.b
            fa5 r0 = (defpackage.fa5) r0
            r0.getClass()
            ca5 r1 = new ca5
            r1.<init>(r0, r3)
            java.lang.Object r0 = r0.a
            nx0 r0 = (defpackage.nx0) r0
            r0.v(r1)
            return
        L_0x00d1:
            java.lang.Object r0 = r0.b
            r10 r0 = (defpackage.r10) r0
            java.lang.Object r0 = r0.c
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            r0.set(r5)
            return
        L_0x00dd:
            java.lang.Object r0 = r0.b
            r6 = r0
            m55 r6 = (defpackage.m55) r6
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r6.u0 = r0
            hba r0 = r6.b
            long r7 = r0.a()
            hba r0 = r6.b
            long r9 = r0.b()
            r10 r11 = new r10
            r11.<init>()
            r11.e = r6
            r11.a = r9
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r5)
            r11.c = r0
            dd4 r0 = new dd4
            r12 = 18
            r0.<init>(r12, r11)
            r11.d = r0
            long r12 = r6.g()
            long r12 = defpackage.m55.c(r12, r9)
            r11.b = r12
        L_0x0117:
            java.util.concurrent.ExecutorService r0 = r6.a
            boolean r0 = r0.isTerminated()
            if (r0 != 0) goto L_0x02fc
            boolean r0 = r6.X
            if (r0 != 0) goto L_0x02fc
            r11.b()
            int r0 = defpackage.ft4.c(r7, r9)
            if (r0 > 0) goto L_0x012e
            r12 = r7
            goto L_0x012f
        L_0x012e:
            r12 = r9
        L_0x012f:
            long r14 = r6.g()
            long r14 = defpackage.m55.c(r14, r7)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r6.s0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r16 = r0.readLock()
            r16.lock()
            qv7 r0 = r6.Z     // Catch:{ all -> 0x0168 }
            int r0 = r0.f     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x0149
            r17 = r5
            goto L_0x014b
        L_0x0149:
            r17 = 0
        L_0x014b:
            if (r17 == 0) goto L_0x02ea
            long r1 = r6.g()     // Catch:{ all -> 0x0168 }
            int r0 = defpackage.ft4.c(r1, r14)     // Catch:{ all -> 0x0168 }
            if (r0 >= 0) goto L_0x02ea
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r6.s0     // Catch:{ InterruptedException -> 0x016b }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()     // Catch:{ InterruptedException -> 0x016b }
            int r2 = r0.getWriteHoldCount()     // Catch:{ InterruptedException -> 0x016b }
            if (r2 != 0) goto L_0x0172
            int r2 = r0.getReadHoldCount()     // Catch:{ InterruptedException -> 0x016b }
            goto L_0x0173
        L_0x0168:
            r0 = move-exception
            goto L_0x02f8
        L_0x016b:
            r5 = r6
        L_0x016c:
            r19 = r9
        L_0x016e:
            r24 = r14
            goto L_0x02d0
        L_0x0172:
            r2 = 0
        L_0x0173:
            r4 = 0
        L_0x0174:
            if (r4 >= r2) goto L_0x017b
            r1.unlock()     // Catch:{ InterruptedException -> 0x016b }
            int r4 = r4 + r5
            goto L_0x0174
        L_0x017b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r0.writeLock()     // Catch:{ InterruptedException -> 0x016b }
            r4.lock()     // Catch:{ InterruptedException -> 0x016b }
            int r0 = defpackage.ft4.o     // Catch:{ all -> 0x02c0 }
            java.util.concurrent.locks.Condition r0 = r6.t0     // Catch:{ all -> 0x02c0 }
            long r19 = r12 >> r5
            int r3 = (int) r12
            r3 = r3 & r5
            if (r3 != 0) goto L_0x018e
            r3 = r5
            goto L_0x018f
        L_0x018e:
            r3 = 0
        L_0x018f:
            if (r3 == 0) goto L_0x0196
        L_0x0191:
            r30 = r6
        L_0x0193:
            r5 = r19
            goto L_0x01ba
        L_0x0196:
            r21 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r3 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r3 <= 0) goto L_0x01a5
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0191
        L_0x01a5:
            r21 = -9223372036854(0xfffff79c842fa50a, double:NaN)
            int r3 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r3 >= 0) goto L_0x01b1
            r19 = -9223372036854775808
            goto L_0x0191
        L_0x01b1:
            r3 = 1000000(0xf4240, float:1.401298E-39)
            r30 = r6
            long r5 = (long) r3
            long r19 = r19 * r5
            goto L_0x0193
        L_0x01ba:
            long r5 = r0.awaitNanos(r5)     // Catch:{ all -> 0x02b8 }
            kt4 r0 = defpackage.kt4.NANOSECONDS     // Catch:{ all -> 0x02b8 }
            long r5 = defpackage.z7.S(r5, r0)     // Catch:{ all -> 0x02b8 }
            r0 = 0
        L_0x01c5:
            if (r0 >= r2) goto L_0x01d0
            r1.lock()     // Catch:{ InterruptedException -> 0x01cd }
            r3 = 1
            int r0 = r0 + r3
            goto L_0x01c5
        L_0x01cd:
            r5 = r30
            goto L_0x016c
        L_0x01d0:
            r4.unlock()     // Catch:{ InterruptedException -> 0x01cd }
            r0 = 0
            int r2 = defpackage.ft4.c(r5, r0)     // Catch:{ InterruptedException -> 0x01cd }
            if (r2 <= 0) goto L_0x01e5
            r5 = r30
            r19 = r9
            r22 = r12
            r24 = r14
            goto L_0x02ac
        L_0x01e5:
            long r2 = r30.g()     // Catch:{ InterruptedException -> 0x01cd }
            long r4 = defpackage.ft4.g(r2, r14)     // Catch:{ InterruptedException -> 0x01cd }
            int r0 = defpackage.ft4.c(r4, r0)     // Catch:{ InterruptedException -> 0x01cd }
            if (r0 <= 0) goto L_0x02a6
            r5 = r30
            boolean r0 = r5.X     // Catch:{ InterruptedException -> 0x016c }
            if (r0 != 0) goto L_0x029f
            qv7 r0 = r5.Z     // Catch:{ InterruptedException -> 0x016c }
            long[] r1 = r0.c     // Catch:{ InterruptedException -> 0x016c }
            java.lang.Object[] r4 = r0.d     // Catch:{ InterruptedException -> 0x016c }
            long[] r0 = r0.b     // Catch:{ InterruptedException -> 0x016c }
            int r6 = r0.length     // Catch:{ InterruptedException -> 0x016c }
            r19 = 2
            int r6 = r6 + -2
            r19 = r9
            r22 = r12
            if (r6 < 0) goto L_0x028c
            r9 = 0
            r10 = 0
        L_0x020e:
            r12 = r0[r9]     // Catch:{ InterruptedException -> 0x016e }
            r24 = r14
            long r14 = ~r12
            r26 = 7
            long r14 = r14 << r26
            long r14 = r14 & r12
            r26 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r26
            int r14 = (r14 > r26 ? 1 : (r14 == r26 ? 0 : -1))
            if (r14 == 0) goto L_0x0281
            int r14 = r9 - r6
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r15 = 0
        L_0x022d:
            if (r15 >= r14) goto L_0x0278
            r26 = 255(0xff, double:1.26E-321)
            long r26 = r12 & r26
            r28 = 128(0x80, double:6.32E-322)
            int r26 = (r26 > r28 ? 1 : (r26 == r28 ? 0 : -1))
            if (r26 >= 0) goto L_0x0268
            r18 = 3
            int r26 = r9 << 3
            int r26 = r26 + r15
            r27 = r1[r26]     // Catch:{ InterruptedException -> 0x02d0 }
            r26 = r4[r26]     // Catch:{ InterruptedException -> 0x02d0 }
            r27 = r0
            r0 = r26
            urf r0 = (defpackage.urf) r0     // Catch:{ InterruptedException -> 0x02d0 }
            r26 = r14
            r28 = r15
            long r14 = r0.b(r2)     // Catch:{ InterruptedException -> 0x02d0 }
            int r14 = defpackage.ft4.c(r14, r7)     // Catch:{ InterruptedException -> 0x02d0 }
            if (r14 <= 0) goto L_0x0265
            if (r10 != 0) goto L_0x0262
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ InterruptedException -> 0x02d0 }
            qv7 r14 = r5.Z     // Catch:{ InterruptedException -> 0x02d0 }
            int r14 = r14.f     // Catch:{ InterruptedException -> 0x02d0 }
            r10.<init>(r14)     // Catch:{ InterruptedException -> 0x02d0 }
        L_0x0262:
            r10.add(r0)     // Catch:{ InterruptedException -> 0x02d0 }
        L_0x0265:
            r0 = 8
            goto L_0x026f
        L_0x0268:
            r27 = r0
            r26 = r14
            r28 = r15
            goto L_0x0265
        L_0x026f:
            long r12 = r12 >> r0
            r14 = 1
            int r15 = r28 + 1
            r14 = r26
            r0 = r27
            goto L_0x022d
        L_0x0278:
            r27 = r0
            r15 = r14
            r0 = 8
            r14 = 1
            if (r15 != r0) goto L_0x0290
            goto L_0x0284
        L_0x0281:
            r27 = r0
            r14 = 1
        L_0x0284:
            if (r9 == r6) goto L_0x0290
            int r9 = r9 + r14
            r14 = r24
            r0 = r27
            goto L_0x020e
        L_0x028c:
            r24 = r14
            r14 = 1
            r10 = 0
        L_0x0290:
            if (r10 == 0) goto L_0x02a9
            boolean r0 = r10.isEmpty()     // Catch:{ InterruptedException -> 0x02d0 }
            r0 = r0 ^ r14
            if (r0 == 0) goto L_0x02a9
            hba r0 = r5.b     // Catch:{ InterruptedException -> 0x02d0 }
            r0.c(r10)     // Catch:{ InterruptedException -> 0x02d0 }
            goto L_0x02a9
        L_0x029f:
            r19 = r9
            r22 = r12
            r24 = r14
            goto L_0x02a9
        L_0x02a6:
            r5 = r30
            goto L_0x029f
        L_0x02a9:
            r11.b()     // Catch:{ InterruptedException -> 0x02d0 }
        L_0x02ac:
            r6 = r5
            r9 = r19
            r12 = r22
            r14 = r24
        L_0x02b3:
            r3 = 2
            r4 = 0
            r5 = 1
            goto L_0x014b
        L_0x02b8:
            r0 = move-exception
            r5 = r30
        L_0x02bb:
            r19 = r9
            r24 = r14
            goto L_0x02c3
        L_0x02c0:
            r0 = move-exception
            r5 = r6
            goto L_0x02bb
        L_0x02c3:
            r3 = 0
        L_0x02c4:
            if (r3 >= r2) goto L_0x02cc
            r1.lock()     // Catch:{ InterruptedException -> 0x02d0 }
            r6 = 1
            int r3 = r3 + r6
            goto L_0x02c4
        L_0x02cc:
            r4.unlock()     // Catch:{ InterruptedException -> 0x02d0 }
            throw r0     // Catch:{ InterruptedException -> 0x02d0 }
        L_0x02d0:
            long r0 = r5.g()     // Catch:{ all -> 0x0168 }
            r2 = r24
            long r0 = defpackage.ft4.g(r2, r0)     // Catch:{ all -> 0x0168 }
            kt4 r4 = defpackage.kt4.NANOSECONDS     // Catch:{ all -> 0x0168 }
            r6 = 1
            long r9 = defpackage.z7.R(r6, r4)     // Catch:{ all -> 0x0168 }
            long r12 = defpackage.ft4.g(r0, r9)     // Catch:{ all -> 0x0168 }
            r14 = r2
            r6 = r5
            r9 = r19
            goto L_0x02b3
        L_0x02ea:
            r5 = r6
            r19 = r9
            r16.unlock()
            r6 = r5
            r9 = r19
            r3 = 2
            r4 = 0
            r5 = 1
            goto L_0x0117
        L_0x02f8:
            r16.unlock()
            throw r0
        L_0x02fc:
            return
        L_0x02fd:
            java.lang.Object r0 = r0.b
            z15 r0 = (defpackage.z15) r0
            defpackage.z15.setRefreshingNext$lambda$3(r0)
            return
        L_0x0305:
            java.lang.Object r0 = r0.b
            b15 r0 = (defpackage.b15) r0
            r0.a()
            return
        L_0x030d:
            java.lang.Object r0 = r0.b
            vx4 r0 = (defpackage.vx4) r0
            java.lang.String r1 = "vx4"
            je7 r2 = r0.a     // Catch:{ all -> 0x0321 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0321 }
            t6b r2 = (defpackage.t6b) r2     // Catch:{ all -> 0x0321 }
            if (r2 == 0) goto L_0x0323
            r2.d()     // Catch:{ all -> 0x0321 }
            goto L_0x0323
        L_0x0321:
            r0 = move-exception
            goto L_0x033f
        L_0x0323:
            je7 r2 = r0.b     // Catch:{ all -> 0x0321 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0321 }
            p82 r2 = (defpackage.p82) r2     // Catch:{ all -> 0x0321 }
            r2.O()     // Catch:{ all -> 0x0321 }
            je7 r0 = r0.c     // Catch:{ all -> 0x0321 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0321 }
            el3 r0 = (defpackage.el3) r0     // Catch:{ all -> 0x0321 }
            r0.l()     // Catch:{ all -> 0x0321 }
            java.lang.String r0 = "Success invalidate cache"
            defpackage.hm9.m(r1, r0, new java.lang.Object[0])     // Catch:{ all -> 0x0321 }
            goto L_0x0344
        L_0x033f:
            java.lang.String r2 = "Can't invalidate cache"
            defpackage.hm9.p(r1, r2, r0)
        L_0x0344:
            return
        L_0x0345:
            java.lang.Object r0 = r0.b
            org.webrtc.EglBase$EglConnection r0 = (org.webrtc.EglBase.EglConnection) r0
            r0.release()
            return
        L_0x034d:
            java.lang.Object r0 = r0.b
            org.webrtc.EglRenderer r0 = (org.webrtc.EglRenderer) r0
            r0.renderFrameOnRenderThread()
            return
        L_0x0355:
            java.lang.Object r0 = r0.b
            org.webrtc.EglBase14Impl$EglConnection r0 = (org.webrtc.EglBase14Impl.EglConnection) r0
            r0.lambda$new$0()
            return
        L_0x035d:
            java.lang.Object r0 = r0.b
            org.webrtc.EglBase10Impl$EglConnection r0 = (org.webrtc.EglBase10Impl.EglConnection) r0
            r0.lambda$new$0()
            return
        L_0x0365:
            java.lang.Object r0 = r0.b
            o23 r0 = (defpackage.o23) r0
            java.lang.Object r0 = r0.o
            xs4 r0 = (defpackage.xs4) r0
            if (r0 == 0) goto L_0x0387
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0377:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0387
            java.lang.Object r1 = r0.next()
            iee r1 = (defpackage.iee) r1
            r1.c()
            goto L_0x0377
        L_0x0387:
            return
        L_0x0388:
            java.lang.Object r0 = r0.b
            vs4 r0 = (defpackage.vs4) r0
            r1 = 1
            r0.Y = r1
            r0.d()
            return
        L_0x0393:
            java.lang.Object r0 = r0.b
            qs4 r0 = (defpackage.qs4) r0
            android.widget.AutoCompleteTextView r1 = r0.h
            boolean r1 = r1.isPopupShowing()
            r0.t(r1)
            r0.m = r1
            return
        L_0x03a3:
            java.lang.Object r0 = r0.b
            android.graphics.drawable.AnimationDrawable r0 = (android.graphics.drawable.AnimationDrawable) r0
            r0.start()
            return
        L_0x03ab:
            bc7[] r1 = defpackage.mp4.f
            r2 = 0
            r3 = r1[r2]
            java.lang.Object r0 = r0.b
            mp4 r0 = (defpackage.mp4) r0
            rm4 r2 = r0.b
            java.lang.Object r2 = r2.get()
            f5a r2 = (defpackage.f5a) r2
            boolean r2 = r2.d()
            java.lang.String r3 = defpackage.mp4.g
            if (r2 != 0) goto L_0x03cb
            java.lang.String r0 = "restoreUploads: not authorized"
            r1 = 0
            defpackage.hm9.p(r3, r0, r1)
            goto L_0x0421
        L_0x03cb:
            java.lang.String r2 = "restoreUploadsFromStorage: "
            defpackage.hm9.m(r3, r2, new java.lang.Object[0])
            r2 = 2
            r1 = r1[r2]
            rm4 r1 = r0.d
            java.lang.Object r1 = r1.get()
            up4 r1 = (defpackage.up4) r1
            uqd r1 = r1.a()
            huc r3 = defpackage.huc.Z
            o28 r4 = new o28
            r4.<init>(r1, r2, r3)
            crd r1 = defpackage.crd.Z
            q28 r2 = new q28
            r3 = 0
            r2.<init>(r4, r1, r3)
            b46 r1 = defpackage.b46.t0
            e0a r3 = new e0a
            r4 = 3
            r3.<init>(r2, r1, r4)
            vy9 r1 = r3.v()
            xxc r2 = defpackage.xxc.X
            o28 r3 = new o28
            r4 = 2
            r3.<init>(r1, r4, r2)
            boolean r1 = r3 instanceof defpackage.x66
            if (r1 == 0) goto L_0x040d
            x66 r3 = (defpackage.x66) r3
            qy9 r1 = r3.d()
            goto L_0x0413
        L_0x040d:
            hb3 r1 = new hb3
            r2 = 1
            r1.<init>(r2, r3)
        L_0x0413:
            qqd r2 = new qqd
            r3 = 11
            r2.<init>((int) r3, (java.lang.Object) r0)
            rq9 r0 = defpackage.rq9.s0
            r66 r3 = defpackage.ft.d
            defpackage.nd7.U(r1, r2, r0, r3)
        L_0x0421:
            return
        L_0x0422:
            java.lang.Object r0 = r0.b
            bm7 r0 = (defpackage.bm7) r0
            r1 = 1
            r0.cancel(r1)
            return
        L_0x042b:
            java.lang.Object r0 = r0.b
            agf r0 = (defpackage.agf) r0
            r0.O()
            return
        L_0x0433:
            r1 = r5
            java.lang.Object r0 = r0.b
            ce4 r0 = (defpackage.ce4) r0
            r0.u0 = r1
            r0.d()
            return
        L_0x043e:
            java.lang.Object r0 = r0.b
            kee r0 = (defpackage.kee) r0
            r0.close()
            return
        L_0x0446:
            java.lang.Object r0 = r0.b
            fd4 r0 = (defpackage.fd4) r0
            java.util.concurrent.ConcurrentHashMap r1 = r0.Y
            monitor-enter(r1)
            java.lang.Object r2 = r0.b     // Catch:{ all -> 0x04bd }
            a4c r2 = (defpackage.a4c) r2     // Catch:{ all -> 0x04bd }
            java.lang.String r3 = "DefaultRemoteVideoTracks"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x04bd }
            r4.<init>()     // Catch:{ all -> 0x04bd }
            r4.append(r0)     // Catch:{ all -> 0x04bd }
            java.lang.String r5 = ": remove remote video renderers"
            r4.append(r5)     // Catch:{ all -> 0x04bd }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x04bd }
            r2.log(r3, r4)     // Catch:{ all -> 0x04bd }
            java.util.concurrent.ConcurrentHashMap r2 = r0.Y     // Catch:{ all -> 0x04bd }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x04bd }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x04bd }
        L_0x0471:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x04bd }
            if (r3 == 0) goto L_0x04bf
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x04bd }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x04bd }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x04bd }
            fp1 r4 = (defpackage.fp1) r4     // Catch:{ all -> 0x04bd }
            olf r4 = r4.a     // Catch:{ all -> 0x04bd }
            olf r5 = defpackage.olf.a     // Catch:{ all -> 0x04bd }
            if (r4 == r5) goto L_0x048a
            goto L_0x0471
        L_0x048a:
            java.util.concurrent.ConcurrentHashMap r4 = r0.t0     // Catch:{ all -> 0x04bd }
            java.lang.Object r5 = r3.getKey()     // Catch:{ all -> 0x04bd }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x04bd }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x04bd }
            java.util.HashMap r5 = r0.Z     // Catch:{ all -> 0x04bd }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x04bd }
            org.webrtc.VideoTrack r4 = (org.webrtc.VideoTrack) r4     // Catch:{ all -> 0x04bd }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x04bd }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x04bd }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x04bd }
        L_0x04a8:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x04bd }
            if (r5 == 0) goto L_0x0471
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x04bd }
            blf r5 = (defpackage.blf) r5     // Catch:{ all -> 0x04bd }
            r6 = 0
            r5.a = r6     // Catch:{ all -> 0x04bd }
            if (r4 == 0) goto L_0x04a8
            r4.removeSink(r5)     // Catch:{ Exception -> 0x04a8 }
            goto L_0x04a8
        L_0x04bd:
            r0 = move-exception
            goto L_0x04cb
        L_0x04bf:
            java.util.concurrent.ConcurrentHashMap r2 = r0.Y     // Catch:{ all -> 0x04bd }
            r2.clear()     // Catch:{ all -> 0x04bd }
            java.util.HashMap r0 = r0.Z     // Catch:{ all -> 0x04bd }
            r0.clear()     // Catch:{ all -> 0x04bd }
            monitor-exit(r1)     // Catch:{ all -> 0x04bd }
            return
        L_0x04cb:
            monitor-exit(r1)     // Catch:{ all -> 0x04bd }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd4.run():void");
    }
}
