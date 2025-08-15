package defpackage;

import android.os.Looper;

/* renamed from: rw4  reason: default package */
public final class rw4 {
    public final Object a;
    public volatile Object b;
    public volatile Object c;

    public /* synthetic */ rw4(Object obj) {
        this.a = obj;
    }

    public void a() {
        String str;
        e24 e24;
        kj kjVar = (kj) this.a;
        a4c a4c = (a4c) kjVar.a.b;
        Integer num = kjVar.c;
        Integer num2 = (Integer) this.b;
        if (num2 != null) {
            nd7.e(16);
            String l = Long.toString(((long) num2.intValue()) & 4294967295L, 16);
            int i = 6;
            if (l.length() > 6) {
                i = 8;
            }
            str = w9e.H0(l, i, '0');
        } else {
            str = null;
        }
        e24 e242 = ((kj) this.a).d;
        Boolean valueOf = e242 != null ? Boolean.valueOf(e242.b()) : null;
        a4c.log("AniSend", kjVar + ": isReady: v=" + num + " bgColor=" + str + "} connected=" + valueOf + " senderThread=" + ((kj) this.a).e);
        Integer num3 = ((kj) this.a).c;
        if (num3 != null) {
            if (num3.intValue() == 1 || (((Integer) this.b) != null && ((kj) this.a).e != null && (e24 = ((kj) this.a).d) != null && e24.b())) {
                ((kj) this.a).g = null;
                Integer num4 = (Integer) this.b;
                if (num4 != null) {
                    ((kj) this.a).c(num4.intValue());
                }
                if (((Double[]) this.c) != null) {
                    kj kjVar2 = (kj) this.a;
                    rw4 rw4 = kjVar2.g;
                    Integer num5 = kjVar2.c;
                    if (rw4 != null) {
                        rw4.c = null;
                    } else if (num5 == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("AnimojiSender has neither version nor startup data");
                        a4c a4c2 = (a4c) kjVar2.a.b;
                        String message = illegalStateException.getMessage();
                        if (message == null) {
                            message = "animoji error";
                        }
                        a4c2.reportException("AniSend", message, illegalStateException);
                        rw4 rw42 = new rw4(kjVar2);
                        rw42.c = null;
                        kjVar2.g = rw42;
                    } else {
                        throw null;
                    }
                }
            }
        }
    }

    public void b(im7 im7) {
        ((ck6) this.a).execute(new u8g(this, im7, false, 1));
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [q5f, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c A[Catch:{ all -> 0x003c }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c A[Catch:{ all -> 0x003c }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence c(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            r10 = this;
            java.lang.Object r10 = r10.b
            r0 = r10
            te r0 = (defpackage.te) r0
            r0.getClass()
            boolean r10 = r11 instanceof defpackage.fvd
            if (r10 == 0) goto L_0x0012
            r1 = r11
            fvd r1 = (defpackage.fvd) r1
            r1.a()
        L_0x0012:
            r1 = 0
            java.lang.Class<c4f> r2 = defpackage.c4f.class
            if (r10 != 0) goto L_0x0041
            boolean r3 = r11 instanceof android.text.Spannable     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x001c
            goto L_0x0041
        L_0x001c:
            boolean r3 = r11 instanceof android.text.Spanned     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x003f
            r3 = r11
            android.text.Spanned r3 = (android.text.Spanned) r3     // Catch:{ all -> 0x003c }
            int r4 = r12 + -1
            int r5 = r13 + 1
            int r3 = r3.nextSpanTransition(r4, r5, r2)     // Catch:{ all -> 0x003c }
            if (r3 > r13) goto L_0x003f
            q5f r3 = new q5f     // Catch:{ all -> 0x003c }
            r3.<init>()     // Catch:{ all -> 0x003c }
            r3.a = r1     // Catch:{ all -> 0x003c }
            android.text.SpannableString r4 = new android.text.SpannableString     // Catch:{ all -> 0x003c }
            r4.<init>(r11)     // Catch:{ all -> 0x003c }
            r3.b = r4     // Catch:{ all -> 0x003c }
            goto L_0x0049
        L_0x003c:
            r12 = move-exception
            goto L_0x00ca
        L_0x003f:
            r3 = 0
            goto L_0x0049
        L_0x0041:
            q5f r3 = new q5f     // Catch:{ all -> 0x003c }
            r4 = r11
            android.text.Spannable r4 = (android.text.Spannable) r4     // Catch:{ all -> 0x003c }
            r3.<init>(r4)     // Catch:{ all -> 0x003c }
        L_0x0049:
            if (r3 == 0) goto L_0x007a
            android.text.Spannable r4 = r3.b     // Catch:{ all -> 0x003c }
            java.lang.Object[] r4 = r4.getSpans(r12, r13, r2)     // Catch:{ all -> 0x003c }
            c4f[] r4 = (defpackage.c4f[]) r4     // Catch:{ all -> 0x003c }
            if (r4 == 0) goto L_0x007a
            int r5 = r4.length     // Catch:{ all -> 0x003c }
            if (r5 <= 0) goto L_0x007a
            int r5 = r4.length     // Catch:{ all -> 0x003c }
            r6 = r1
        L_0x005a:
            if (r6 >= r5) goto L_0x007a
            r7 = r4[r6]     // Catch:{ all -> 0x003c }
            android.text.Spannable r8 = r3.b     // Catch:{ all -> 0x003c }
            int r8 = r8.getSpanStart(r7)     // Catch:{ all -> 0x003c }
            android.text.Spannable r9 = r3.b     // Catch:{ all -> 0x003c }
            int r9 = r9.getSpanEnd(r7)     // Catch:{ all -> 0x003c }
            if (r8 == r13) goto L_0x006f
            r3.removeSpan(r7)     // Catch:{ all -> 0x003c }
        L_0x006f:
            int r12 = java.lang.Math.min(r8, r12)     // Catch:{ all -> 0x003c }
            int r13 = java.lang.Math.max(r9, r13)     // Catch:{ all -> 0x003c }
            int r6 = r6 + 1
            goto L_0x005a
        L_0x007a:
            if (r12 == r13) goto L_0x00c6
            int r4 = r11.length()     // Catch:{ all -> 0x003c }
            if (r12 < r4) goto L_0x0083
            goto L_0x00c6
        L_0x0083:
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r4) goto L_0x009a
            if (r3 == 0) goto L_0x009a
            android.text.Spannable r4 = r3.b     // Catch:{ all -> 0x003c }
            int r4 = r4.length()     // Catch:{ all -> 0x003c }
            android.text.Spannable r5 = r3.b     // Catch:{ all -> 0x003c }
            java.lang.Object[] r1 = r5.getSpans(r1, r4, r2)     // Catch:{ all -> 0x003c }
            c4f[] r1 = (defpackage.c4f[]) r1     // Catch:{ all -> 0x003c }
            int r1 = r1.length     // Catch:{ all -> 0x003c }
            int r14 = r14 - r1
        L_0x009a:
            r4 = r14
            va8 r6 = new va8     // Catch:{ all -> 0x003c }
            java.lang.Object r14 = r0.b     // Catch:{ all -> 0x003c }
            kj6 r14 = (defpackage.kj6) r14     // Catch:{ all -> 0x003c }
            r1 = 16
            r6.<init>((java.lang.Object) r3, (int) r1, (java.lang.Object) r14)     // Catch:{ all -> 0x003c }
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r15
            java.lang.Object r12 = r0.c(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x003c }
            q5f r12 = (defpackage.q5f) r12     // Catch:{ all -> 0x003c }
            if (r12 == 0) goto L_0x00bd
            android.text.Spannable r12 = r12.b     // Catch:{ all -> 0x003c }
            if (r10 == 0) goto L_0x00bb
            fvd r11 = (defpackage.fvd) r11
            r11.b()
        L_0x00bb:
            r11 = r12
            goto L_0x00c9
        L_0x00bd:
            if (r10 == 0) goto L_0x00c9
        L_0x00bf:
            r10 = r11
            fvd r10 = (defpackage.fvd) r10
            r10.b()
            goto L_0x00c9
        L_0x00c6:
            if (r10 == 0) goto L_0x00c9
            goto L_0x00bf
        L_0x00c9:
            return r11
        L_0x00ca:
            if (r10 == 0) goto L_0x00d1
            fvd r11 = (defpackage.fvd) r11
            r11.b()
        L_0x00d1:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw4.c(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    public rw4(Looper looper, le6 le6, String str) {
        this.a = new ck6(looper);
        this.b = le6;
        fp3.j(str);
        this.c = new hm7(le6, str);
    }
}
