package defpackage;

/* renamed from: e5  reason: default package */
public final /* synthetic */ class e5 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 224 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r0 = r18
            r1 = 0
            r2 = 1
            r3 = 0
            int r4 = r0.a
            switch(r4) {
                case 0: goto L_0x0214;
                case 1: goto L_0x020a;
                case 2: goto L_0x01d9;
                case 3: goto L_0x01cb;
                case 4: goto L_0x019b;
                case 5: goto L_0x0193;
                case 6: goto L_0x018b;
                case 7: goto L_0x0181;
                case 8: goto L_0x0171;
                case 9: goto L_0x0163;
                case 10: goto L_0x015b;
                case 11: goto L_0x0108;
                case 12: goto L_0x00fe;
                case 13: goto L_0x00df;
                case 14: goto L_0x00d8;
                case 15: goto L_0x00c8;
                case 16: goto L_0x0080;
                case 17: goto L_0x0059;
                case 18: goto L_0x0051;
                case 19: goto L_0x0049;
                case 20: goto L_0x0039;
                case 21: goto L_0x0029;
                case 22: goto L_0x0019;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.Object r0 = r0.b
            ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview r0 = (ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview) r0
            sd7 r1 = r0.u0
            defpackage.cqc.b(r1)
            ru.ok.messages.video.widgets.VideoFramePreview r0 = r0.c
            r0.a(r3)
            return
        L_0x0019:
            java.lang.Object r0 = r0.b
            kef r0 = (defpackage.kef) r0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "wef"
            java.lang.String r2 = "putConversionInRepository: success, videoConversion = %s"
            defpackage.hm9.m(r1, r2, r0)
            return
        L_0x0029:
            java.lang.Object r0 = r0.b
            lef r0 = (defpackage.lef) r0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "wef"
            java.lang.String r2 = "removeFromRepository: success, conversionData = %s"
            defpackage.hm9.m(r1, r2, r0)
            return
        L_0x0039:
            java.lang.Object r0 = r0.b
            v6f r0 = (defpackage.v6f) r0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "c7f"
            java.lang.String r2 = "putUploadInRepository: finished for upload=%s"
            defpackage.hm9.m(r1, r2, r0)
            return
        L_0x0049:
            java.lang.Object r0 = r0.b
            ai3 r0 = (defpackage.ai3) r0
            r0.getClass()
            return
        L_0x0051:
            java.lang.Object r0 = r0.b
            tme r0 = (defpackage.tme) r0
            r0.b(r2)
            return
        L_0x0059:
            java.lang.Object r0 = r0.b
            wle r0 = (defpackage.wle) r0
            je7 r0 = r0.i
            java.lang.Object r0 = r0.getValue()
            s7d r0 = (defpackage.s7d) r0
            je7 r0 = r0.j
            java.lang.Object r0 = r0.getValue()
            ds9 r0 = (defpackage.ds9) r0
            r0.getClass()
            bc7[] r1 = defpackage.ds9.b
            r1 = r1[r3]
            rm4 r0 = r0.a
            java.lang.Object r0 = r0.get()
            cn7 r0 = (defpackage.cn7) r0
            r0.getClass()
            return
        L_0x0080:
            java.lang.Object r0 = r0.b
            ede r0 = (defpackage.ede) r0
            e52 r1 = r0.n
            long r1 = r1.a
            p82 r3 = r0.c
            e52 r1 = r3.C(r1)
            r0.n = r1
            if (r1 != 0) goto L_0x0093
            goto L_0x00c7
        L_0x0093:
            es8 r1 = r1.c
            if (r1 == 0) goto L_0x00c7
            cu8 r1 = r1.a
            boolean r2 = r1.x()
            if (r2 != 0) goto L_0x00a0
            goto L_0x00c7
        L_0x00a0:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r1.o
            long r2 = r2 - r4
            r4 = 60000(0xea60, double:2.9644E-319)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x00af
            goto L_0x00c7
        L_0x00af:
            q10 r1 = r1.f()
            if (r1 != 0) goto L_0x00b6
            goto L_0x00c7
        L_0x00b6:
            p10 r2 = defpackage.p10.c
            p10 r1 = r1.a
            if (r1 == r2) goto L_0x00c4
            p10 r2 = defpackage.p10.o
            if (r1 == r2) goto L_0x00c4
            p10 r2 = defpackage.p10.b
            if (r1 != r2) goto L_0x00c7
        L_0x00c4:
            r0.d()
        L_0x00c7:
            return
        L_0x00c8:
            java.lang.Object r0 = r0.b
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "a4e"
            java.lang.String r2 = "storeStickerSetsFromServer: success: %s"
            defpackage.hm9.m(r1, r2, r0)
            return
        L_0x00d8:
            java.lang.Object r0 = r0.b
            zj9 r0 = (defpackage.zj9) r0
            r0.C0 = r1
            return
        L_0x00df:
            java.lang.Object r0 = r0.b
            sj9 r0 = (defpackage.sj9) r0
            r0.getClass()
            java.lang.String r1 = "sj9"
            java.lang.String r2 = "Empty locations"
            defpackage.hm9.k(r1, r2)
            java.lang.Object r0 = r0.b
            kk9 r0 = (defpackage.kk9) r0
            xk9 r0 = (defpackage.xk9) r0
            r0.A(r3)
            java.util.List r1 = java.util.Collections.emptyList()
            r0.B(r1)
            return
        L_0x00fe:
            java.lang.Object r0 = r0.b
            jy8 r0 = (defpackage.jy8) r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.d
            r0.set(r3)
            return
        L_0x0108:
            java.lang.Object r1 = r0.b
            yx7 r1 = (defpackage.yx7) r1
            java.util.ArrayList r4 = r1.n
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x014f
            java.util.ArrayList r4 = r1.n
            java.lang.Object r4 = r4.get(r3)
            kzc r4 = (defpackage.kzc) r4
            int r5 = r4.a
            if (r5 != r2) goto L_0x014d
            e52 r5 = r4.o
            long r5 = r5.a
            p82 r7 = r1.a
            e52 r12 = r7.C(r5)
            if (r12 == 0) goto L_0x0148
            boolean r5 = r12.h0()
            if (r5 == 0) goto L_0x0148
            kzc r5 = new kzc
            r15 = 0
            r17 = 0
            r9 = 1
            r10 = 0
            java.util.List r11 = r4.c
            r13 = 0
            r14 = 0
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r17)
            java.util.ArrayList r1 = r1.n
            r1.set(r3, r5)
            goto L_0x014d
        L_0x0148:
            java.util.ArrayList r1 = r1.n
            r1.remove(r3)
        L_0x014d:
            int r3 = r3 + r2
            goto L_0x0108
        L_0x014f:
            px7 r0 = r1.i
            if (r0 == 0) goto L_0x015a
            java.util.ArrayList r2 = r1.n
            java.lang.String r1 = r1.r
            r0.c(r1, r2)
        L_0x015a:
            return
        L_0x015b:
            java.lang.Object r0 = r0.b
            jn7 r0 = (defpackage.jn7) r0
            r0.getClass()
            return
        L_0x0163:
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.mediabar.FrgLocalVideo r0 = (ru.ok.messages.media.mediabar.FrgLocalVideo) r0
            b56 r0 = r0.r1()
            if (r0 == 0) goto L_0x0170
            r0.e()
        L_0x0170:
            return
        L_0x0171:
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.attaches.fragments.FrgAttachUnknown r0 = (ru.ok.messages.media.attaches.fragments.FrgAttachUnknown) r0
            n46 r0 = r0.r1()
            if (r0 == 0) goto L_0x0180
            ru.ok.messages.media.attaches.ActAttachesView r0 = (ru.ok.messages.media.attaches.ActAttachesView) r0
            r0.e()
        L_0x0180:
            return
        L_0x0181:
            android.graphics.Typeface r2 = ru.ok.messages.media.attaches.FileAttachView.X0
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.attaches.FileAttachView r0 = (ru.ok.messages.media.attaches.FileAttachView) r0
            r0.getClass()
            throw r1
        L_0x018b:
            java.lang.Object r0 = r0.b
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x0193:
            java.lang.Object r0 = r0.b
            rr3 r0 = (defpackage.rr3) r0
            r0.b()
            return
        L_0x019b:
            java.lang.Object r0 = r0.b
            hp3 r0 = (defpackage.hp3) r0
            ip3 r1 = r0.J0
            gp3 r1 = r1.Z
            if (r1 == 0) goto L_0x01ca
            e08 r0 = r0.I0
            pk9 r1 = (defpackage.pk9) r1
            java.lang.Object r1 = r1.a
            java.util.Set r1 = (java.util.Set) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x01b1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01ca
            java.lang.Object r2 = r1.next()
            mj9 r2 = (defpackage.mj9) r2
            el9 r2 = r2.o
            if (r2 == 0) goto L_0x01b1
            gj0 r4 = new gj0
            r4.<init>(r0, r3)
            r2.n(r4)
            goto L_0x01b1
        L_0x01ca:
            return
        L_0x01cb:
            java.lang.Object r0 = r0.b
            r4 = r0
            cx0 r4 = (defpackage.cx0) r4
            monitor-enter(r4)
            r4.j = r1     // Catch:{ all -> 0x01d7 }
            monitor-exit(r4)
            return
        L_0x01d5:
            monitor-exit(r4)     // Catch:{ all -> 0x01d7 }
            throw r0
        L_0x01d7:
            r0 = move-exception
            goto L_0x01d5
        L_0x01d9:
            java.lang.Object r0 = r0.b
            dq0 r0 = (defpackage.dq0) r0
            zi5 r0 = r0.a
            kk5 r0 = (defpackage.kk5) r0
            r0.getClass()
            java.lang.String r0 = r0.b()
            java.lang.String r1 = "botCommands"
            java.io.File r0 = defpackage.kk5.g(r0, r1)
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L_0x0202
            int r1 = r0.length
            if (r1 != 0) goto L_0x01f8
            goto L_0x0202
        L_0x01f8:
            int r1 = r0.length
        L_0x01f9:
            if (r3 >= r1) goto L_0x0209
            r4 = r0[r3]
            r4.delete()
            int r3 = r3 + r2
            goto L_0x01f9
        L_0x0202:
            java.lang.String r0 = "dq0"
            java.lang.String r1 = "deleteBotCommands: directory is empty"
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
        L_0x0209:
            return
        L_0x020a:
            int r1 = ru.ok.messages.media.audio.AudioRecordView.O0
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.audio.AudioRecordView r0 = (ru.ok.messages.media.audio.AudioRecordView) r0
            r0.getClass()
            return
        L_0x0214:
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.attaches.ActAttachesView r0 = (ru.ok.messages.media.attaches.ActAttachesView) r0
            s20 r1 = r0.W0
            if (r1 == 0) goto L_0x0259
            androidx.viewpager.widget.ViewPager r2 = r0.f1
            int r2 = r2.getCurrentItem()
            mpa r1 = r1.l(r2)
            if (r1 != 0) goto L_0x0229
            goto L_0x0259
        L_0x0229:
            java.lang.Object r2 = r1.a
            l20 r2 = (defpackage.l20) r2
            boolean r3 = r2.f()
            if (r3 == 0) goto L_0x0238
            x10 r2 = r2.b
            long r2 = r2.s0
            goto L_0x0250
        L_0x0238:
            boolean r3 = r2.i()
            if (r3 == 0) goto L_0x0243
            k20 r2 = r2.d
            long r2 = r2.a
            goto L_0x0250
        L_0x0243:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x024e
            s10 r2 = r2.j
            long r2 = r2.a
            goto L_0x0250
        L_0x024e:
            r2 = 0
        L_0x0250:
            java.lang.Object r1 = r1.b
            es8 r1 = (defpackage.es8) r1
            sh0 r0 = r0.m1
            r0.s(r1, r2)
        L_0x0259:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e5.run():void");
    }
}
