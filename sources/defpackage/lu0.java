package defpackage;

/* renamed from: lu0  reason: default package */
public final class lu0 {
    public final je7 a;

    public lu0(je7 je7) {
        this.a = je7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x00f6 A[EDGE_INSN: B:101:0x00f6->B:59:0x00f6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0118 A[EDGE_INSN: B:103:0x0118->B:68:0x0118 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x013f A[EDGE_INSN: B:106:0x013f->B:80:0x013f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.util.Set r6, java.lang.Long r7, java.lang.CharSequence r8, java.util.Set r9, kotlin.coroutines.Continuation r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof defpackage.ku0
            if (r0 == 0) goto L_0x0013
            r0 = r10
            ku0 r0 = (defpackage.ku0) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            ku0 r0 = new ku0
            r0.<init>(r5, r10)
        L_0x0018:
            java.lang.Object r10 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.util.Set r9 = r0.Y
            java.lang.CharSequence r5 = r0.X
            r8 = r5
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.Long r7 = r0.o
            defpackage.od2.a0(r10)
            goto L_0x0060
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            defpackage.od2.a0(r10)
            if (r6 == 0) goto L_0x016e
            boolean r10 = r6.isEmpty()
            if (r10 == 0) goto L_0x0046
            goto L_0x016e
        L_0x0046:
            je7 r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            r79 r5 = (defpackage.r79) r5
            r0.o = r7
            r10 = r8
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r0.X = r10
            r0.Y = r9
            r0.t0 = r4
            java.lang.Object r10 = r5.b(r6, r0)
            if (r10 != r1) goto L_0x0060
            return r1
        L_0x0060:
            java.util.List r10 = (java.util.List) r10
            int r5 = r10.size()
            if (r8 == 0) goto L_0x0070
            int r6 = r8.length()
            if (r6 <= 0) goto L_0x0070
            int r5 = r5 + 1
        L_0x0070:
            int r6 = r9.size()
            int r6 = r6 * r5
            boolean r5 = r10.isEmpty()
            r8 = 0
            if (r5 == 0) goto L_0x007e
            r0 = r8
            goto L_0x009e
        L_0x007e:
            java.util.Iterator r5 = r10.iterator()
            r0 = r8
        L_0x0083:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x009e
            java.lang.Object r1 = r5.next()
            cu8 r1 = (defpackage.cu8) r1
            boolean r1 = r1.D()
            if (r1 == 0) goto L_0x0083
            int r0 = r0 + 1
            if (r0 < 0) goto L_0x009a
            goto L_0x0083
        L_0x009a:
            defpackage.y53.Q()
            throw r3
        L_0x009e:
            int r5 = r9.size()
            int r5 = r5 * r0
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x00aa
            goto L_0x00c9
        L_0x00aa:
            java.util.Iterator r0 = r10.iterator()
        L_0x00ae:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c9
            java.lang.Object r1 = r0.next()
            cu8 r1 = (defpackage.cu8) r1
            boolean r1 = r1.u()
            if (r1 == 0) goto L_0x00ae
            int r8 = r8 + 1
            if (r8 < 0) goto L_0x00c5
            goto L_0x00ae
        L_0x00c5:
            defpackage.y53.Q()
            throw r3
        L_0x00c9:
            int r9 = r9.size()
            int r9 = r9 * r8
            if (r7 == 0) goto L_0x00f6
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x00d7
            goto L_0x00f6
        L_0x00d7:
            java.util.Iterator r8 = r10.iterator()
        L_0x00db:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r0 = r8.next()
            cu8 r0 = (defpackage.cu8) r0
            boolean r1 = r0.A()
            if (r1 != 0) goto L_0x00f3
            boolean r0 = r0.E()
            if (r0 == 0) goto L_0x00db
        L_0x00f3:
            wuc r7 = defpackage.wuc.CHAT_ATTACHMENTS_MEDIA
            goto L_0x0141
        L_0x00f6:
            if (r7 == 0) goto L_0x0118
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x00ff
            goto L_0x0118
        L_0x00ff:
            java.util.Iterator r8 = r10.iterator()
        L_0x0103:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0118
            java.lang.Object r0 = r8.next()
            cu8 r0 = (defpackage.cu8) r0
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x0103
            wuc r7 = defpackage.wuc.CHAT_ATTACHMENTS_FILES
            goto L_0x0141
        L_0x0118:
            if (r7 == 0) goto L_0x013f
            boolean r7 = r10.isEmpty()
            if (r7 == 0) goto L_0x0121
            goto L_0x013f
        L_0x0121:
            java.util.Iterator r7 = r10.iterator()
        L_0x0125:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x013f
            java.lang.Object r8 = r7.next()
            cu8 r8 = (defpackage.cu8) r8
            cu8 r10 = r8.C0
            if (r10 == 0) goto L_0x0125
            r10 = 2
            int r8 = r8.A0
            if (r8 == r10) goto L_0x013c
            if (r8 != r4) goto L_0x0125
        L_0x013c:
            wuc r7 = defpackage.wuc.CHAT_ATTACHMENTS_LINKS
            goto L_0x0141
        L_0x013f:
            wuc r7 = defpackage.wuc.CHAT
        L_0x0141:
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            wx6 r10 = new wx6
            ux6 r0 = defpackage.ux6.SEND_5_MESSAGES
            r10.<init>(r0, r6)
            r8.add(r10)
            if (r5 <= 0) goto L_0x015c
            wx6 r6 = new wx6
            ux6 r10 = defpackage.ux6.SEND_3_STICKERS
            r6.<init>(r10, r5)
            r8.add(r6)
        L_0x015c:
            if (r9 <= 0) goto L_0x0168
            wx6 r5 = new wx6
            ux6 r6 = defpackage.ux6.SEND_AUDIO_MESSAGE
            r5.<init>(r6, r9)
            r8.add(r5)
        L_0x0168:
            zy5 r5 = new zy5
            r5.<init>(r8, r7)
            return r5
        L_0x016e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu0.a(java.util.Set, java.lang.Long, java.lang.CharSequence, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
