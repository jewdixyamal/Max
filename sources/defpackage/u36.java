package defpackage;

/* renamed from: u36  reason: default package */
public final class u36 extends brd {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u36(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [e46, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v4, types: [java.lang.Object, ty2] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0129 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.v4 r14) {
        /*
            r13 = this;
            r0 = 6
            r1 = 17
            int r2 = r13.b
            switch(r2) {
                case 0: goto L_0x003e;
                case 1: goto L_0x0028;
                default: goto L_0x0008;
            }
        L_0x0008:
            t33 r0 = new t33
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Object r1 = r14.c(r1)
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r13 = r13.c
            je7 r13 = (defpackage.je7) r13
            java.lang.Object r13 = r13.getValue()
            cj4 r13 = (defpackage.cj4) r13
            java.lang.Class<mi5> r2 = defpackage.mi5.class
            java.lang.Object r14 = r14.c(r2)
            mi5 r14 = (defpackage.mi5) r14
            r0.<init>(r1, r13, r14)
            return r0
        L_0x0028:
            io0 r0 = new io0
            java.lang.Class<iv6> r1 = defpackage.iv6.class
            khe r1 = r14.d(r1)
            java.lang.Class<lv6> r2 = defpackage.lv6.class
            khe r14 = r14.d(r2)
            java.lang.Object r13 = r13.c
            y8 r13 = (defpackage.y8) r13
            r0.<init>(r13, r1, r14)
            return r0
        L_0x003e:
            java.lang.Object r2 = r13.c
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            java.lang.Class<m7b> r3 = defpackage.m7b.class
            java.lang.Object r3 = r14.c(r3)
            m7b r3 = (defpackage.m7b) r3
            p7b r3 = (defpackage.p7b) r3
            t33 r3 = r3.a
            java.lang.String r4 = "app.debug.fresco"
            ne7 r3 = r3.g
            r5 = 0
            boolean r3 = r3.getBoolean(r4, r5)
            r2.set(r3)
            b46 r2 = defpackage.b46.a
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Object r4 = r14.c(r3)
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Class<kv6> r6 = defpackage.kv6.class
            java.lang.Object r6 = r14.c(r6)
            kv6 r6 = (defpackage.kv6) r6
            java.lang.Class<iba> r7 = defpackage.iba.class
            java.lang.Object r14 = r14.c(r7)
            iba r14 = (defpackage.iba) r14
            java.lang.Object r13 = r13.c
            java.util.concurrent.atomic.AtomicBoolean r13 = (java.util.concurrent.atomic.AtomicBoolean) r13
            bp7 r7 = new bp7
            r7.<init>()
            java.util.List r7 = java.util.Collections.singletonList(r7)
            y36 r8 = new y36
            r8.<init>()
            defpackage.ta5.a = r8
            boolean r8 = r13.get()
            if (r8 == 0) goto L_0x0090
            r8 = 2
            goto L_0x0091
        L_0x0090:
            r8 = r0
        L_0x0091:
            ft7 r9 = defpackage.ta5.a
            r9.j(r8)
            ob6 r8 = new ob6
            r8.<init>()
            defpackage.f46.a = r8
            ty2 r8 = new ty2
            r8.<init>()
            nw4 r9 = new nw4
            r9.<init>((int) r0)
            z36 r0 = new z36
            r0.<init>(r13)
            r9.c = r0
            r9.o = r8
            java.util.Iterator r0 = r7.iterator()
        L_0x00b4:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x00d5
            java.lang.Object r7 = r0.next()
            cq4 r7 = (defpackage.cq4) r7
            java.lang.Object r10 = r9.b
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x00cd
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r9.b = r10
        L_0x00cd:
            java.lang.Object r10 = r9.b
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r10.add(r7)
            goto L_0x00b4
        L_0x00d5:
            vq7 r0 = new vq7
            r0.<init>((defpackage.nw4) r9)
            defpackage.f46.I()
            boolean r7 = defpackage.s36.b
            r9 = 5
            r10 = 1
            if (r7 == 0) goto L_0x00f9
            java.lang.Class<s36> r7 = defpackage.s36.class
            java.lang.String r11 = "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!"
            ft7 r12 = defpackage.ta5.a
            boolean r12 = r12.i(r9)
            if (r12 == 0) goto L_0x00fb
            ft7 r12 = defpackage.ta5.a
            java.lang.String r7 = r7.getSimpleName()
            r12.w(r7, r11)
            goto L_0x00fb
        L_0x00f9:
            defpackage.s36.b = r10
        L_0x00fb:
            defpackage.nu0.D0 = r10
            java.lang.Class<hm9> r7 = defpackage.hm9.class
            monitor-enter(r7)
            im9 r11 = defpackage.hm9.a     // Catch:{ all -> 0x01cc }
            if (r11 == 0) goto L_0x0105
            r5 = r10
        L_0x0105:
            monitor-exit(r7)     // Catch:{ all -> 0x01cc }
            r7 = 0
            if (r5 != 0) goto L_0x0151
            defpackage.f46.I()
            java.lang.String r5 = "com.facebook.imagepipeline.nativecode.NativeCodeInitializer"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0144, IllegalAccessException -> 0x013b, InvocationTargetException -> 0x0132, NoSuchMethodException -> 0x0129 }
            java.lang.String r10 = "init"
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch:{ ClassNotFoundException -> 0x0144, IllegalAccessException -> 0x013b, InvocationTargetException -> 0x0132, NoSuchMethodException -> 0x0129 }
            java.lang.reflect.Method r3 = r5.getMethod(r10, r3)     // Catch:{ ClassNotFoundException -> 0x0144, IllegalAccessException -> 0x013b, InvocationTargetException -> 0x0132, NoSuchMethodException -> 0x0129 }
            java.lang.Object[] r5 = new java.lang.Object[]{r4}     // Catch:{ ClassNotFoundException -> 0x0144, IllegalAccessException -> 0x013b, InvocationTargetException -> 0x0132, NoSuchMethodException -> 0x0129 }
            r3.invoke(r7, r5)     // Catch:{ ClassNotFoundException -> 0x0144, IllegalAccessException -> 0x013b, InvocationTargetException -> 0x0132, NoSuchMethodException -> 0x0129 }
        L_0x0123:
            defpackage.f46.I()
            goto L_0x0151
        L_0x0127:
            r13 = move-exception
            goto L_0x014d
        L_0x0129:
            oq9 r3 = new oq9     // Catch:{ all -> 0x0127 }
            r3.<init>((int) r1)     // Catch:{ all -> 0x0127 }
            defpackage.hm9.I(r3)     // Catch:{ all -> 0x0127 }
            goto L_0x0123
        L_0x0132:
            oq9 r3 = new oq9     // Catch:{ all -> 0x0127 }
            r3.<init>((int) r1)     // Catch:{ all -> 0x0127 }
            defpackage.hm9.I(r3)     // Catch:{ all -> 0x0127 }
            goto L_0x0123
        L_0x013b:
            oq9 r3 = new oq9     // Catch:{ all -> 0x0127 }
            r3.<init>((int) r1)     // Catch:{ all -> 0x0127 }
            defpackage.hm9.I(r3)     // Catch:{ all -> 0x0127 }
            goto L_0x0123
        L_0x0144:
            oq9 r3 = new oq9     // Catch:{ all -> 0x0127 }
            r3.<init>((int) r1)     // Catch:{ all -> 0x0127 }
            defpackage.hm9.I(r3)     // Catch:{ all -> 0x0127 }
            goto L_0x0123
        L_0x014d:
            defpackage.f46.I()
            throw r13
        L_0x0151:
            android.content.Context r1 = r4.getApplicationContext()
            java.lang.Class<lv6> r3 = defpackage.lv6.class
            monitor-enter(r3)
            lv6 r5 = defpackage.lv6.p     // Catch:{ all -> 0x0172 }
            if (r5 == 0) goto L_0x0174
            java.lang.Class<lv6> r5 = defpackage.lv6.class
            java.lang.String r7 = "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior."
            ft7 r10 = defpackage.ta5.a     // Catch:{ all -> 0x0172 }
            boolean r9 = r10.i(r9)     // Catch:{ all -> 0x0172 }
            if (r9 == 0) goto L_0x0174
            ft7 r9 = defpackage.ta5.a     // Catch:{ all -> 0x0172 }
            java.lang.String r5 = r5.getSimpleName()     // Catch:{ all -> 0x0172 }
            r9.w(r5, r7)     // Catch:{ all -> 0x0172 }
            goto L_0x0174
        L_0x0172:
            r13 = move-exception
            goto L_0x01ca
        L_0x0174:
            lv6 r5 = new lv6     // Catch:{ all -> 0x0172 }
            r5.<init>(r6)     // Catch:{ all -> 0x0172 }
            defpackage.lv6.p = r5     // Catch:{ all -> 0x0172 }
            monitor-exit(r3)
            defpackage.f46.I()
            f2b r3 = new f2b
            r3.<init>(r1, r0)
            defpackage.s36.a = r3
            com.facebook.drawee.view.SimpleDraweeView.w0 = r3
            defpackage.f46.I()
            defpackage.f46.I()
            lv6 r1 = defpackage.lv6.g()
            android.content.res.Resources r3 = r4.getResources()
            bg4 r4 = defpackage.bg4.h()
            j84 r5 = r1.a()
            kv6 r6 = r1.b
            ho9 r6 = r6.v
            r6.getClass()
            a46 r6 = new a46
            java.util.concurrent.ExecutorService r14 = r14.a()
            r6.<init>(r14)
            y7g r14 = r1.d()
            java.lang.Object r0 = r0.b
            wz r0 = (defpackage.wz) r0
            z36 r1 = new z36
            r1.<init>(r13)
            r8.a = r3
            r8.b = r4
            r8.c = r5
            r8.o = r6
            r8.X = r14
            r8.Y = r0
            r8.Z = r1
            return r2
        L_0x01ca:
            monitor-exit(r3)     // Catch:{ all -> 0x0172 }
            throw r13
        L_0x01cc:
            r13 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01cc }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u36.b(v4):java.lang.Object");
    }
}
