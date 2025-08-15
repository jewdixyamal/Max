package defpackage;

/* renamed from: r4g  reason: default package */
public final class r4g extends fqd {
    public final yaf x0 = new yaf(3, false);
    public final c4g y0 = new c4g();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v6, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r10v3, types: [e4g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v45 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0101, code lost:
        if (")".equals(defpackage.c4g.b(r8, r11)) == false) goto L_0x009b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.abe a(int r20, byte[] r21, boolean r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = 2
            r2 = 0
            r3 = -1
            r4 = 1
            yaf r5 = r0.x0
            r6 = r20
            r7 = r21
            r5.F(r6, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            defpackage.u4g.d(r5)     // Catch:{ ParserException -> 0x03e4 }
        L_0x0017:
            java.lang.String r7 = r5.i()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x0022
            goto L_0x0017
        L_0x0022:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0027:
            r9 = r2
            r8 = r3
        L_0x0029:
            if (r8 != r3) goto L_0x004b
            int r9 = r5.b
            java.lang.String r8 = r5.i()
            if (r8 != 0) goto L_0x0035
            r8 = r2
            goto L_0x0029
        L_0x0035:
            java.lang.String r11 = "STYLE"
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L_0x003f
            r8 = r1
            goto L_0x0029
        L_0x003f:
            java.lang.String r11 = "NOTE"
            boolean r8 = r8.startsWith(r11)
            if (r8 == 0) goto L_0x0049
            r8 = r4
            goto L_0x0029
        L_0x0049:
            r8 = 3
            goto L_0x0029
        L_0x004b:
            r5.H(r9)
            if (r8 == 0) goto L_0x03de
            if (r8 != r4) goto L_0x005d
        L_0x0052:
            java.lang.String r8 = r5.i()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0027
            goto L_0x0052
        L_0x005d:
            r9 = 0
            if (r8 != r1) goto L_0x039c
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0394
            r5.i()
            c4g r8 = r0.y0
            java.lang.StringBuilder r11 = r8.b
            r11.setLength(r2)
            int r12 = r5.b
        L_0x0072:
            java.lang.String r13 = r5.i()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x0390
            byte[] r13 = r5.a
            int r14 = r5.b
            yaf r8 = r8.a
            r8.F(r14, r13)
            r8.H(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x008d:
            defpackage.c4g.c(r8)
            int r13 = r8.c()
            java.lang.String r14 = "{"
            java.lang.String r15 = ""
            r10 = 5
            if (r13 >= r10) goto L_0x009e
        L_0x009b:
            r1 = r9
            goto L_0x0104
        L_0x009e:
            java.nio.charset.Charset r13 = defpackage.b52.c
            java.lang.String r10 = r8.t(r10, r13)
            java.lang.String r13 = "::cue"
            boolean r10 = r13.equals(r10)
            if (r10 != 0) goto L_0x00ad
            goto L_0x009b
        L_0x00ad:
            int r10 = r8.b
            java.lang.String r13 = defpackage.c4g.b(r8, r11)
            if (r13 != 0) goto L_0x00b6
            goto L_0x009b
        L_0x00b6:
            boolean r16 = r14.equals(r13)
            if (r16 == 0) goto L_0x00c1
            r8.H(r10)
            r1 = r15
            goto L_0x0104
        L_0x00c1:
            java.lang.String r10 = "("
            boolean r10 = r10.equals(r13)
            if (r10 == 0) goto L_0x00f6
            int r10 = r8.b
            int r13 = r8.c
            r16 = r2
        L_0x00cf:
            if (r10 >= r13) goto L_0x00e7
            if (r16 != 0) goto L_0x00e7
            byte[] r1 = r8.a
            int r16 = r10 + 1
            byte r1 = r1[r10]
            char r1 = (char) r1
            r10 = 41
            if (r1 != r10) goto L_0x00e0
            r1 = r4
            goto L_0x00e1
        L_0x00e0:
            r1 = r2
        L_0x00e1:
            r10 = r16
            r16 = r1
            r1 = 2
            goto L_0x00cf
        L_0x00e7:
            int r10 = r10 + r3
            int r1 = r8.b
            int r10 = r10 - r1
            java.nio.charset.Charset r1 = defpackage.b52.c
            java.lang.String r1 = r8.t(r10, r1)
            java.lang.String r1 = r1.trim()
            goto L_0x00f7
        L_0x00f6:
            r1 = r9
        L_0x00f7:
            java.lang.String r10 = defpackage.c4g.b(r8, r11)
            java.lang.String r13 = ")"
            boolean r10 = r13.equals(r10)
            if (r10 != 0) goto L_0x0104
            goto L_0x009b
        L_0x0104:
            if (r1 == 0) goto L_0x0110
            java.lang.String r10 = defpackage.c4g.b(r8, r11)
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x0114
        L_0x0110:
            r0 = r4
            r2 = 2
            goto L_0x0385
        L_0x0114:
            e4g r10 = new e4g
            r10.<init>()
            r10.a = r15
            r10.b = r15
            java.util.Set r13 = java.util.Collections.emptySet()
            r10.c = r13
            r10.d = r15
            r10.e = r9
            r10.g = r2
            r10.i = r2
            r10.j = r3
            r10.k = r3
            r10.l = r3
            r10.m = r3
            r10.n = r3
            r10.p = r3
            r10.q = r2
            boolean r13 = r15.equals(r1)
            if (r13 == 0) goto L_0x0140
            goto L_0x01a5
        L_0x0140:
            r13 = 91
            int r13 = r1.indexOf(r13)
            if (r13 == r3) goto L_0x0165
            java.util.regex.Pattern r14 = defpackage.c4g.c
            java.lang.String r9 = r1.substring(r13)
            java.util.regex.Matcher r9 = r14.matcher(r9)
            boolean r14 = r9.matches()
            if (r14 == 0) goto L_0x0161
            java.lang.String r9 = r9.group(r4)
            r9.getClass()
            r10.d = r9
        L_0x0161:
            java.lang.String r1 = r1.substring(r2, r13)
        L_0x0165:
            int r9 = defpackage.maf.a
            java.lang.String r9 = "\\."
            java.lang.String[] r1 = r1.split(r9, r3)
            r9 = r1[r2]
            r13 = 35
            int r13 = r9.indexOf(r13)
            if (r13 == r3) goto L_0x0185
            java.lang.String r14 = r9.substring(r2, r13)
            r10.b = r14
            int r13 = r13 + r4
            java.lang.String r9 = r9.substring(r13)
            r10.a = r9
            goto L_0x0187
        L_0x0185:
            r10.b = r9
        L_0x0187:
            int r9 = r1.length
            if (r9 <= r4) goto L_0x01a5
            int r9 = r1.length
            int r13 = r1.length
            if (r9 > r13) goto L_0x0190
            r13 = r4
            goto L_0x0191
        L_0x0190:
            r13 = r2
        L_0x0191:
            defpackage.np8.d(r13)
            java.lang.Object[] r1 = java.util.Arrays.copyOfRange(r1, r4, r9)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.HashSet r9 = new java.util.HashSet
            java.util.List r1 = java.util.Arrays.asList(r1)
            r9.<init>(r1)
            r10.c = r9
        L_0x01a5:
            r1 = r2
            r9 = 0
        L_0x01a7:
            java.lang.String r13 = "}"
            if (r1 != 0) goto L_0x0371
            int r1 = r8.b
            java.lang.String r9 = defpackage.c4g.b(r8, r11)
            if (r9 == 0) goto L_0x01bc
            boolean r14 = r13.equals(r9)
            if (r14 == 0) goto L_0x01ba
            goto L_0x01bc
        L_0x01ba:
            r14 = r2
            goto L_0x01bd
        L_0x01bc:
            r14 = r4
        L_0x01bd:
            if (r14 != 0) goto L_0x0367
            r8.H(r1)
            defpackage.c4g.c(r8)
            java.lang.String r1 = defpackage.c4g.a(r8, r11)
            boolean r16 = r15.equals(r1)
            if (r16 == 0) goto L_0x01d1
            goto L_0x0367
        L_0x01d1:
            java.lang.String r2 = ":"
            java.lang.String r3 = defpackage.c4g.b(r8, r11)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x01df
            goto L_0x0367
        L_0x01df:
            defpackage.c4g.c(r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
        L_0x01e8:
            java.lang.String r4 = ";"
            if (r3 != 0) goto L_0x0214
            int r0 = r8.b
            r17 = r3
            java.lang.String r3 = defpackage.c4g.b(r8, r11)
            if (r3 != 0) goto L_0x01f8
            r0 = 0
            goto L_0x0218
        L_0x01f8:
            boolean r18 = r13.equals(r3)
            if (r18 != 0) goto L_0x020d
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0205
            goto L_0x020d
        L_0x0205:
            r2.append(r3)
            r0 = r19
            r3 = r17
            goto L_0x01e8
        L_0x020d:
            r8.H(r0)
            r3 = 1
            r0 = r19
            goto L_0x01e8
        L_0x0214:
            java.lang.String r0 = r2.toString()
        L_0x0218:
            if (r0 == 0) goto L_0x030e
            boolean r2 = r15.equals(r0)
            if (r2 == 0) goto L_0x0222
            goto L_0x030e
        L_0x0222:
            int r2 = r8.b
            java.lang.String r3 = defpackage.c4g.b(r8, r11)
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x022f
            goto L_0x0238
        L_0x022f:
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x030e
            r8.H(r2)
        L_0x0238:
            java.lang.String r2 = "color"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x024c
            r2 = 1
            int r0 = defpackage.j63.a(r0, r2)
            r10.f = r0
            r10.g = r2
        L_0x0249:
            r0 = r2
            goto L_0x0368
        L_0x024c:
            r2 = 1
            java.lang.String r3 = "background-color"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x025e
            int r0 = defpackage.j63.a(r0, r2)
            r10.h = r0
            r10.i = r2
            goto L_0x0249
        L_0x025e:
            java.lang.String r3 = "ruby-position"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x027f
            java.lang.String r1 = "over"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0272
            r10.p = r2
            goto L_0x030e
        L_0x0272:
            java.lang.String r1 = "under"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x030e
            r0 = 2
            r10.p = r0
            goto L_0x030e
        L_0x027f:
            java.lang.String r2 = "text-combine-upright"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x029f
            java.lang.String r1 = "all"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x029a
            java.lang.String r1 = "digits"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0298
            goto L_0x029a
        L_0x0298:
            r0 = 0
            goto L_0x029b
        L_0x029a:
            r0 = 1
        L_0x029b:
            r10.q = r0
            goto L_0x030e
        L_0x029f:
            java.lang.String r2 = "text-decoration"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x02b3
            java.lang.String r1 = "underline"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x030e
            r0 = 1
            r10.k = r0
            goto L_0x030e
        L_0x02b3:
            java.lang.String r2 = "font-family"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x02c2
            java.lang.String r0 = defpackage.lz7.T(r0)
            r10.e = r0
            goto L_0x030e
        L_0x02c2:
            java.lang.String r2 = "font-weight"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x02d7
            java.lang.String r1 = "bold"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x030e
            r2 = 1
            r10.l = r2
            goto L_0x0249
        L_0x02d7:
            r2 = 1
            java.lang.String r3 = "font-style"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x02eb
            java.lang.String r1 = "italic"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0249
            r10.m = r2
            goto L_0x030e
        L_0x02eb:
            java.lang.String r2 = "font-size"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x030e
            java.lang.String r1 = defpackage.lz7.T(r0)
            java.util.regex.Pattern r2 = defpackage.c4g.d
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L_0x0310
            int r0 = r0.length()
            int r0 = r0 + 22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
        L_0x030e:
            r0 = 1
            goto L_0x0368
        L_0x0310:
            r0 = 2
            java.lang.String r2 = r1.group(r0)
            r2.getClass()
            int r0 = r2.hashCode()
            switch(r0) {
                case 37: goto L_0x0337;
                case 3240: goto L_0x032c;
                case 3592: goto L_0x0321;
                default: goto L_0x031f;
            }
        L_0x031f:
            r2 = -1
            goto L_0x0341
        L_0x0321:
            java.lang.String r0 = "px"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x032a
            goto L_0x031f
        L_0x032a:
            r2 = 2
            goto L_0x0341
        L_0x032c:
            java.lang.String r0 = "em"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0335
            goto L_0x031f
        L_0x0335:
            r2 = 1
            goto L_0x0341
        L_0x0337:
            java.lang.String r0 = "%"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0340
            goto L_0x031f
        L_0x0340:
            r2 = 0
        L_0x0341:
            switch(r2) {
                case 0: goto L_0x0354;
                case 1: goto L_0x034f;
                case 2: goto L_0x034a;
                default: goto L_0x0344;
            }
        L_0x0344:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x034a:
            r0 = 1
            r10.n = r0
            r2 = 2
            goto L_0x0359
        L_0x034f:
            r0 = 1
            r2 = 2
            r10.n = r2
            goto L_0x0359
        L_0x0354:
            r0 = 1
            r2 = 2
            r3 = 3
            r10.n = r3
        L_0x0359:
            java.lang.String r1 = r1.group(r0)
            r1.getClass()
            float r1 = java.lang.Float.parseFloat(r1)
            r10.o = r1
            goto L_0x0369
        L_0x0367:
            r0 = r4
        L_0x0368:
            r2 = 2
        L_0x0369:
            r4 = r0
            r1 = r14
            r2 = 0
            r3 = -1
            r0 = r19
            goto L_0x01a7
        L_0x0371:
            r0 = r4
            r2 = 2
            boolean r1 = r13.equals(r9)
            if (r1 == 0) goto L_0x037c
            r12.add(r10)
        L_0x037c:
            r4 = r0
            r1 = r2
            r2 = 0
            r3 = -1
            r9 = 0
            r0 = r19
            goto L_0x008d
        L_0x0385:
            r6.addAll(r12)
        L_0x0388:
            r4 = r0
            r1 = r2
            r2 = 0
            r3 = -1
            r0 = r19
            goto L_0x0027
        L_0x0390:
            r0 = r19
            goto L_0x0072
        L_0x0394:
            com.google.android.exoplayer2.text.SubtitleDecoderException r0 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r1 = "A style block was found after the first cue."
            r0.<init>(r1)
            throw r0
        L_0x039c:
            r2 = r1
            r0 = r4
            r1 = 3
            if (r8 != r1) goto L_0x0388
            java.util.regex.Pattern r1 = defpackage.p4g.a
            java.lang.String r1 = r5.i()
            if (r1 != 0) goto L_0x03ab
            r9 = 0
            goto L_0x03d8
        L_0x03ab:
            java.util.regex.Pattern r3 = defpackage.p4g.a
            java.util.regex.Matcher r4 = r3.matcher(r1)
            boolean r8 = r4.matches()
            if (r8 == 0) goto L_0x03bd
            r8 = 0
            g4g r9 = defpackage.p4g.d(r8, r4, r5, r6)
            goto L_0x03d8
        L_0x03bd:
            r8 = 0
            java.lang.String r4 = r5.i()
            if (r4 != 0) goto L_0x03c6
        L_0x03c4:
            r9 = r8
            goto L_0x03d8
        L_0x03c6:
            java.util.regex.Matcher r3 = r3.matcher(r4)
            boolean r4 = r3.matches()
            if (r4 == 0) goto L_0x03c4
            java.lang.String r1 = r1.trim()
            g4g r9 = defpackage.p4g.d(r1, r3, r5, r6)
        L_0x03d8:
            if (r9 == 0) goto L_0x0388
            r7.add(r9)
            goto L_0x0388
        L_0x03de:
            nw4 r0 = new nw4
            r0.<init>((java.util.ArrayList) r7)
            return r0
        L_0x03e4:
            r0 = move-exception
            r1 = r0
            com.google.android.exoplayer2.text.SubtitleDecoderException r0 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r4g.a(int, byte[], boolean):abe");
    }
}
