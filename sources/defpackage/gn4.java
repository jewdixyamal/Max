package defpackage;

/* renamed from: gn4  reason: default package */
public final class gn4 {
    public static final /* synthetic */ bc7[] h;
    public static final String i;
    public final rm4 a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;
    public final rm4 e;
    public final rm4 f;
    public final rm4 g;

    static {
        Class<gn4> cls = gn4.class;
        hob hob = new hob(cls, "chatController", "getChatController()Lru/ok/tamtam/chats/ChatController;", 0);
        oec oec = nec.a;
        h = new bc7[]{hob, zr6.e(oec, cls, "contactController", "getContactController()Lru/ok/tamtam/contacts/ContactController;", 0), zr6.f(cls, "draftSerializer", "getDraftSerializer()Lru/ok/tamtam/draft/DraftSerializer;", 0, oec), zr6.f(cls, "messageController", "getMessageController()Lru/ok/tamtam/messages/MessageController;", 0, oec), zr6.f(cls, "api", "getApi()Lru/ok/tamtam/api/Api;", 0, oec), zr6.f(cls, "tamTamObservables", "getTamTamObservables()Lru/ok/tamtam/rx/TamTamObservables;", 0, oec), zr6.f(cls, "ioNetworkScheduler", "getIoNetworkScheduler()Lio/reactivex/rxjava3/core/Scheduler;", 0, oec)};
        i = cls.getName();
    }

    public gn4(rm4 rm4, rm4 rm42, rm4 rm43, rm4 rm44, rm4 rm45, rm4 rm46, rm4 rm47) {
        this.a = rm4;
        this.b = rm42;
        this.c = rm43;
        this.d = rm44;
        this.e = rm45;
        this.f = rm46;
        this.g = rm47;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e0, code lost:
        if (((defpackage.au8) r4.get()).e(r6, r8.longValue()) == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (((defpackage.au8) r4.get()).e(r6, r8.longValue()) == false) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Long r13, java.lang.Long r14, defpackage.n7d r15) {
        /*
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "execute: chatId="
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r1 = ", contactId="
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = ", serverDraft="
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = i
            defpackage.hm9.m(r1, r0, new java.lang.Object[0])
            r0 = 0
            r2 = 1
            bc7[] r3 = h
            r4 = 0
            if (r13 == 0) goto L_0x0040
            long r6 = r13.longValue()
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0040
            p82 r14 = r12.b()
            long r6 = r13.longValue()
            e52 r13 = r14.z(r6)
            goto L_0x0093
        L_0x0040:
            if (r14 == 0) goto L_0x0092
            long r6 = r14.longValue()
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x0092
            r13 = r3[r2]
            rm4 r13 = r12.b
            java.lang.Object r13 = r13.get()
            el3 r13 = (defpackage.el3) r13
            long r6 = r14.longValue()
            r8 = 0
            uj3 r13 = r13.i(r6, r8)
            if (r13 == 0) goto L_0x006a
            boolean r13 = r13.s()
            if (r13 == 0) goto L_0x006a
            java.lang.String r13 = "contact is blocked"
            defpackage.hm9.m(r1, r13, new java.lang.Object[0])
        L_0x006a:
            p82 r13 = r12.b()
            long r6 = r14.longValue()
            e52 r13 = r13.F(r6)
            if (r13 == 0) goto L_0x007e
            boolean r6 = r13.C()
            if (r6 != 0) goto L_0x0093
        L_0x007e:
            java.lang.String r13 = "No dialog on device. Create it"
            defpackage.hm9.m(r1, r13, new java.lang.Object[0])
            p82 r13 = r12.b()
            java.util.List r14 = java.util.Collections.singletonList(r14)
            j92 r6 = defpackage.j92.a
            e52 r13 = r13.b(r6, r14, r0, r0)
            goto L_0x0093
        L_0x0092:
            r13 = r0
        L_0x0093:
            if (r13 != 0) goto L_0x009b
            java.lang.String r12 = "Chat is null. Ignore"
            defpackage.hm9.m0(r1, r12, new java.lang.Object[0])
            return
        L_0x009b:
            k92 r14 = r13.b
            uaa r6 = r14.f0
            if (r6 == 0) goto L_0x00ab
            java.lang.Long r6 = r6.b()
            if (r6 == 0) goto L_0x00ab
            long r4 = r6.longValue()
        L_0x00ab:
            long r6 = r15.g
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b7
            java.lang.String r12 = "We already have this draft. Ignore"
            defpackage.hm9.m0(r1, r12, new java.lang.Object[0])
            return
        L_0x00b7:
            long r4 = r14.g0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x00c7
            uaa r4 = r14.f0
            if (r4 != 0) goto L_0x00c7
            java.lang.String r12 = "draft was discarded, ignore it!"
            defpackage.hm9.m0(r1, r12, new java.lang.Object[0])
            return
        L_0x00c7:
            rm4 r4 = r12.d
            r5 = 3
            long r6 = r13.a
            java.lang.Long r8 = r15.f
            if (r8 == 0) goto L_0x00e4
            r9 = r3[r5]
            java.lang.Object r9 = r4.get()
            au8 r9 = (defpackage.au8) r9
            long r10 = r8.longValue()
            boolean r9 = r9.e(r6, r10)
            if (r9 != 0) goto L_0x00e4
        L_0x00e2:
            r0 = r8
            goto L_0x00fb
        L_0x00e4:
            java.lang.Long r8 = r15.e
            if (r8 == 0) goto L_0x00fb
            r5 = r3[r5]
            java.lang.Object r4 = r4.get()
            au8 r4 = (defpackage.au8) r4
            long r9 = r8.longValue()
            boolean r4 = r4.e(r6, r9)
            if (r4 != 0) goto L_0x00fb
            goto L_0x00e2
        L_0x00fb:
            if (r0 != 0) goto L_0x0101
            r12.c(r13, r15)
            return
        L_0x0101:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Don't have message "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r5 = ". Request it"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            defpackage.hm9.m0(r1, r4, new java.lang.Object[0])
            r1 = 4
            r1 = r3[r1]
            rm4 r1 = r12.e
            java.lang.Object r1 = r1.get()
            pk r1 = (defpackage.pk) r1
            tq2 r4 = new tq2
            java.util.List r0 = java.util.Collections.singletonList(r0)
            long r5 = r14.a
            r4.<init>((long) r5, (java.util.List) r0)
            r14 = 6
            r14 = r3[r14]
            rm4 r14 = r12.g
            java.lang.Object r14 = r14.get()
            ztc r14 = (defpackage.ztc) r14
            k4a r1 = (defpackage.k4a) r1
            drd r14 = r1.K(r4, r14)
            gd1 r0 = new gd1
            java.lang.Class<gu> r1 = defpackage.gu.class
            r4 = 12
            r0.<init>(r4, r1)
            uqd r14 = r14.h(r0)
            r0 = 5
            r0 = r3[r0]
            rm4 r0 = r12.f
            java.lang.Object r0 = r0.get()
            fme r0 = (defpackage.fme) r0
            r0.getClass()
            dme r1 = new dme
            r3 = 0
            r1.<init>(r0, r2, r3)
            ds5 r14 = r14.j(r1)
            cjg r0 = new cjg
            r0.<init>(r12, r13, r15)
            jo7 r1 = new jo7
            r1.<init>((java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r15)
            iq1 r12 = new iq1
            r13 = 2
            r12.<init>(r0, r13, r1)
            r14.k(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn4.a(java.lang.Long, java.lang.Long, n7d):void");
    }

    public final p82 b() {
        bc7 bc7 = h[0];
        return (p82) this.a.get();
    }

    public final void c(e52 e52, n7d n7d) {
        hm9.m(i, "Save server draft", new Object[0]);
        bc7 bc7 = h[2];
        b().k(e52.a, n7d.g, ((jp4) this.c.get()).b(e52.a, n7d));
    }
}
