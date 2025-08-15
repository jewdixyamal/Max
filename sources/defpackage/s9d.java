package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: s9d  reason: default package */
public final class s9d extends d8d {
    public final /* synthetic */ int b = 0;
    public final long c;
    public final Object o;

    public s9d(long j) {
        this.c = j;
        this.o = s9d.class.getName();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: nz4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r103 = this;
            r0 = r103
            r1 = 10
            r2 = 1
            r4 = 0
            long r6 = r0.c
            int r8 = r0.b
            switch(r8) {
                case 0: goto L_0x0054;
                default: goto L_0x000e;
            }
        L_0x000e:
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x001e
            p82 r1 = r103.b()
            e52 r1 = r1.C(r6)
            r0.y(r1)
            goto L_0x0053
        L_0x001e:
            long r4 = java.lang.System.currentTimeMillis()
            p82 r6 = r103.b()
            v00 r7 = defpackage.p82.I
            java.util.List r6 = r6.E(r7)
            java.util.Iterator r6 = r6.iterator()
            r3 = 0
        L_0x0031:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0053
            java.lang.Object r7 = r6.next()
            e52 r7 = (defpackage.e52) r7
            k92 r8 = r7.b
            long r8 = r8.k
            long r8 = r4 - r8
            r10 = 1209600000(0x48190800, double:5.97621805E-315)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x0031
            boolean r7 = r0.y(r7)
            if (r7 == 0) goto L_0x0051
            int r3 = r3 + r2
        L_0x0051:
            if (r3 < r1) goto L_0x0031
        L_0x0053:
            return
        L_0x0054:
            nz4 r8 = defpackage.nz4.a
            p82 r9 = r103.g()
            e52 r9 = r9.C(r6)
            java.lang.String r11 = " to update = "
            java.lang.String r12 = "messages for chat "
            java.lang.Object r13 = r0.o
            java.lang.String r13 = (java.lang.String) r13
            if (r9 == 0) goto L_0x0484
            k92 r8 = r9.b
            java.util.Map r14 = r8.e
            boolean r14 = r14.isEmpty()
            r14 = r14 ^ r2
            if (r14 == 0) goto L_0x00b4
            java.util.Map r8 = r8.e
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x007d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00bc
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r14 = r9.getKey()
            java.lang.Number r14 = (java.lang.Number) r14
            long r14 = r14.longValue()
            java.lang.Object r9 = r9.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            long r16 = r9.longValue()
            m7b r9 = r103.p()
            p7b r9 = (defpackage.p7b) r9
            t33 r9 = r9.a
            long r18 = r9.t()
            int r9 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r9 == 0) goto L_0x007d
            int r9 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x007d
            r4 = r16
            goto L_0x007d
        L_0x00b4:
            es8 r8 = r9.c
            if (r8 == 0) goto L_0x00bc
            cu8 r4 = r8.a
            long r4 = r4.o
        L_0x00bc:
            au8 r8 = r103.o()
            c34 r9 = r8.a
            k24 r9 = (defpackage.k24) r9
            vlc r9 = r9.c
            m7b r8 = r8.c
            p7b r8 = (defpackage.p7b) r8
            t33 r8 = r8.a
            long r14 = r8.t()
            t19 r8 = r9.d()
            oz7 r16 = defpackage.iu8.b
            r8.getClass()
            java.lang.String r3 = "SELECT * FROM messages WHERE chat_id = ? AND sender = ? AND time <= ? AND delivery_status = ? AND inserted_from_msg_link = 0 AND status <> ?"
            r10 = 5
            xlc r3 = defpackage.xlc.a(r10, r3)
            r3.j(r2, r6)
            r2 = 2
            r3.j(r2, r14)
            r2 = 3
            defpackage.ey8.m(r3, r2, r4, r8)
            r2 = 20
            long r4 = (long) r2
            r2 = 4
            defpackage.ey8.m(r3, r2, r4, r8)
            long r4 = (long) r1
            r3.j(r10, r4)
            ilc r2 = r8.a
            r2.b()
            r4 = 0
            android.database.Cursor r2 = r2.o(r3, r4)
            java.lang.String r5 = "id"
            int r5 = defpackage.tfg.n(r2, r5)     // Catch:{ all -> 0x047a }
            java.lang.String r10 = "server_id"
            int r10 = defpackage.tfg.n(r2, r10)     // Catch:{ all -> 0x047a }
            java.lang.String r14 = "time"
            int r14 = defpackage.tfg.n(r2, r14)     // Catch:{ all -> 0x047a }
            java.lang.String r15 = "update_time"
            int r15 = defpackage.tfg.n(r2, r15)     // Catch:{ all -> 0x047a }
            java.lang.String r4 = "sender"
            int r4 = defpackage.tfg.n(r2, r4)     // Catch:{ all -> 0x047a }
            java.lang.String r1 = "cid"
            int r1 = defpackage.tfg.n(r2, r1)     // Catch:{ all -> 0x047a }
            java.lang.String r0 = "text"
            int r0 = defpackage.tfg.n(r2, r0)     // Catch:{ all -> 0x047a }
            r20 = r13
            java.lang.String r13 = "delivery_status"
            int r13 = defpackage.tfg.n(r2, r13)     // Catch:{ all -> 0x047a }
            r21 = r11
            java.lang.String r11 = "status"
            int r11 = defpackage.tfg.n(r2, r11)     // Catch:{ all -> 0x047a }
            r22 = r6
            java.lang.String r6 = "time_local"
            int r6 = defpackage.tfg.n(r2, r6)     // Catch:{ all -> 0x047a }
            java.lang.String r7 = "error"
            int r7 = defpackage.tfg.n(r2, r7)     // Catch:{ all -> 0x047a }
            r24 = r12
            java.lang.String r12 = "localized_error"
            int r12 = defpackage.tfg.n(r2, r12)     // Catch:{ all -> 0x047a }
            r25 = r9
            java.lang.String r9 = "attaches"
            int r9 = defpackage.tfg.n(r2, r9)     // Catch:{ all -> 0x047a }
            r26 = r3
            java.lang.String r3 = "media_type"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r27 = r3
            java.lang.String r3 = "detect_share"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r28 = r3
            java.lang.String r3 = "msg_link_type"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r29 = r3
            java.lang.String r3 = "msg_link_id"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r30 = r3
            java.lang.String r3 = "inserted_from_msg_link"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r31 = r3
            java.lang.String r3 = "msg_link_chat_id"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r32 = r3
            java.lang.String r3 = "msg_link_chat_name"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r33 = r3
            java.lang.String r3 = "msg_link_chat_link"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r34 = r3
            java.lang.String r3 = "msg_link_out_chat_id"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r35 = r3
            java.lang.String r3 = "msg_link_out_msg_id"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r36 = r3
            java.lang.String r3 = "type"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r37 = r3
            java.lang.String r3 = "chat_id"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r38 = r3
            java.lang.String r3 = "ttl"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r39 = r3
            java.lang.String r3 = "channel_views"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r40 = r3
            java.lang.String r3 = "channel_forwards"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r41 = r3
            java.lang.String r3 = "view_time"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r42 = r3
            java.lang.String r3 = "zoom"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r43 = r3
            java.lang.String r3 = "options"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r44 = r3
            java.lang.String r3 = "live_until"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r45 = r3
            java.lang.String r3 = "elements"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r46 = r3
            java.lang.String r3 = "reactions"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r47 = r3
            java.lang.String r3 = "delayed_attrs_time_to_fire"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r48 = r3
            java.lang.String r3 = "delayed_attrs_notify_sender"
            int r3 = defpackage.tfg.n(r2, r3)     // Catch:{ all -> 0x041a }
            r49 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x041a }
            r50 = r9
            int r9 = r2.getCount()     // Catch:{ all -> 0x041a }
            r3.<init>(r9)     // Catch:{ all -> 0x041a }
        L_0x021d:
            boolean r9 = r2.moveToNext()     // Catch:{ all -> 0x041a }
            if (r9 == 0) goto L_0x041c
            long r52 = r2.getLong(r5)     // Catch:{ all -> 0x041a }
            long r54 = r2.getLong(r10)     // Catch:{ all -> 0x041a }
            long r56 = r2.getLong(r14)     // Catch:{ all -> 0x041a }
            long r58 = r2.getLong(r15)     // Catch:{ all -> 0x041a }
            long r60 = r2.getLong(r4)     // Catch:{ all -> 0x041a }
            long r62 = r2.getLong(r1)     // Catch:{ all -> 0x041a }
            boolean r9 = r2.isNull(r0)     // Catch:{ all -> 0x041a }
            if (r9 == 0) goto L_0x0244
            r64 = 0
            goto L_0x024a
        L_0x0244:
            java.lang.String r9 = r2.getString(r0)     // Catch:{ all -> 0x041a }
            r64 = r9
        L_0x024a:
            int r9 = r2.getInt(r13)     // Catch:{ all -> 0x041a }
            v89 r51 = r8.a()     // Catch:{ all -> 0x041a }
            r51.getClass()     // Catch:{ all -> 0x041a }
            oz7 r51 = defpackage.iu8.b     // Catch:{ all -> 0x041a }
            r51.getClass()     // Catch:{ all -> 0x041a }
            iu8 r65 = defpackage.oz7.n(r9)     // Catch:{ all -> 0x041a }
            int r9 = r2.getInt(r11)     // Catch:{ all -> 0x041a }
            v89 r51 = r8.a()     // Catch:{ all -> 0x041a }
            r51.getClass()     // Catch:{ all -> 0x041a }
            vx8 r66 = defpackage.v89.b(r9)     // Catch:{ all -> 0x041a }
            long r67 = r2.getLong(r6)     // Catch:{ all -> 0x041a }
            boolean r9 = r2.isNull(r7)     // Catch:{ all -> 0x041a }
            if (r9 == 0) goto L_0x027a
            r69 = 0
            goto L_0x0280
        L_0x027a:
            java.lang.String r9 = r2.getString(r7)     // Catch:{ all -> 0x041a }
            r69 = r9
        L_0x0280:
            boolean r9 = r2.isNull(r12)     // Catch:{ all -> 0x041a }
            if (r9 == 0) goto L_0x028b
            r9 = r50
            r70 = 0
            goto L_0x0293
        L_0x028b:
            java.lang.String r9 = r2.getString(r12)     // Catch:{ all -> 0x041a }
            r70 = r9
            r9 = r50
        L_0x0293:
            boolean r50 = r2.isNull(r9)     // Catch:{ all -> 0x041a }
            if (r50 == 0) goto L_0x029c
            r50 = 0
            goto L_0x02a0
        L_0x029c:
            byte[] r50 = r2.getBlob(r9)     // Catch:{ all -> 0x041a }
        L_0x02a0:
            v89 r51 = r8.a()     // Catch:{ all -> 0x041a }
            r51.getClass()     // Catch:{ all -> 0x041a }
            k8g r71 = defpackage.iz7.b(r50)     // Catch:{ all -> 0x041a }
            r50 = r0
            r0 = r27
            int r72 = r2.getInt(r0)     // Catch:{ all -> 0x041a }
            r27 = r0
            r0 = r28
            int r28 = r2.getInt(r0)     // Catch:{ all -> 0x041a }
            if (r28 == 0) goto L_0x02c4
            r28 = r0
            r0 = r29
            r73 = 1
            goto L_0x02ca
        L_0x02c4:
            r28 = r0
            r0 = r29
            r73 = 0
        L_0x02ca:
            int r74 = r2.getInt(r0)     // Catch:{ all -> 0x041a }
            r29 = r0
            r0 = r30
            long r75 = r2.getLong(r0)     // Catch:{ all -> 0x041a }
            r30 = r0
            r0 = r31
            int r31 = r2.getInt(r0)     // Catch:{ all -> 0x041a }
            if (r31 == 0) goto L_0x02e7
            r31 = r0
            r0 = r32
            r77 = 1
            goto L_0x02ed
        L_0x02e7:
            r31 = r0
            r0 = r32
            r77 = 0
        L_0x02ed:
            long r78 = r2.getLong(r0)     // Catch:{ all -> 0x041a }
            r32 = r0
            r0 = r33
            boolean r33 = r2.isNull(r0)     // Catch:{ all -> 0x041a }
            if (r33 == 0) goto L_0x0302
            r33 = r0
            r0 = r34
            r80 = 0
            goto L_0x030c
        L_0x0302:
            java.lang.String r33 = r2.getString(r0)     // Catch:{ all -> 0x041a }
            r80 = r33
            r33 = r0
            r0 = r34
        L_0x030c:
            boolean r34 = r2.isNull(r0)     // Catch:{ all -> 0x041a }
            if (r34 == 0) goto L_0x0319
            r34 = r0
            r0 = r35
            r81 = 0
            goto L_0x0323
        L_0x0319:
            java.lang.String r34 = r2.getString(r0)     // Catch:{ all -> 0x041a }
            r81 = r34
            r34 = r0
            r0 = r35
        L_0x0323:
            long r82 = r2.getLong(r0)     // Catch:{ all -> 0x041a }
            r35 = r0
            r0 = r36
            long r84 = r2.getLong(r0)     // Catch:{ all -> 0x041a }
            r36 = r0
            r0 = r37
            int r37 = r2.getInt(r0)     // Catch:{ all -> 0x041a }
            v89 r51 = r8.a()     // Catch:{ all -> 0x041a }
            r51.getClass()     // Catch:{ all -> 0x041a }
            int r86 = defpackage.ey8.a(r37)     // Catch:{ all -> 0x041a }
            r37 = r0
            r0 = r38
            long r87 = r2.getLong(r0)     // Catch:{ all -> 0x041a }
            r38 = r0
            r0 = r39
            int r89 = r2.getInt(r0)     // Catch:{ all -> 0x041a }
            r39 = r0
            r0 = r40
            int r90 = r2.getInt(r0)     // Catch:{ all -> 0x041a }
            r40 = r0
            r0 = r41
            int r91 = r2.getInt(r0)     // Catch:{ all -> 0x041a }
            r41 = r0
            r0 = r42
            long r92 = r2.getLong(r0)     // Catch:{ all -> 0x041a }
            r42 = r0
            r0 = r43
            int r94 = r2.getInt(r0)     // Catch:{ all -> 0x041a }
            r43 = r0
            r0 = r44
            int r95 = r2.getInt(r0)     // Catch:{ all -> 0x041a }
            r44 = r0
            r0 = r45
            long r96 = r2.getLong(r0)     // Catch:{ all -> 0x041a }
            r45 = r0
            r0 = r46
            boolean r46 = r2.isNull(r0)     // Catch:{ all -> 0x041a }
            if (r46 == 0) goto L_0x038f
            r46 = 0
            goto L_0x0393
        L_0x038f:
            byte[] r46 = r2.getBlob(r0)     // Catch:{ all -> 0x041a }
        L_0x0393:
            v89 r51 = r8.a()     // Catch:{ all -> 0x041a }
            r51.getClass()     // Catch:{ all -> 0x041a }
            java.util.List r98 = defpackage.v89.a(r46)     // Catch:{ all -> 0x041a }
            r46 = r0
            r0 = r47
            boolean r47 = r2.isNull(r0)     // Catch:{ all -> 0x041a }
            if (r47 == 0) goto L_0x03ae
            r102 = r0
            r47 = r1
            r0 = 0
            goto L_0x03b8
        L_0x03ae:
            byte[] r47 = r2.getBlob(r0)     // Catch:{ all -> 0x041a }
            r102 = r0
            r0 = r47
            r47 = r1
        L_0x03b8:
            v89 r1 = r8.a()     // Catch:{ all -> 0x041a }
            ix8 r99 = r1.c(r0)     // Catch:{ all -> 0x041a }
            r0 = r48
            boolean r1 = r2.isNull(r0)     // Catch:{ all -> 0x041a }
            if (r1 == 0) goto L_0x03cd
            r1 = r49
            r100 = 0
            goto L_0x03d9
        L_0x03cd:
            long r100 = r2.getLong(r0)     // Catch:{ all -> 0x041a }
            java.lang.Long r1 = java.lang.Long.valueOf(r100)     // Catch:{ all -> 0x041a }
            r100 = r1
            r1 = r49
        L_0x03d9:
            boolean r48 = r2.isNull(r1)     // Catch:{ all -> 0x041a }
            if (r48 == 0) goto L_0x03e2
            r48 = 0
            goto L_0x03ea
        L_0x03e2:
            int r48 = r2.getInt(r1)     // Catch:{ all -> 0x041a }
            java.lang.Integer r48 = java.lang.Integer.valueOf(r48)     // Catch:{ all -> 0x041a }
        L_0x03ea:
            if (r48 != 0) goto L_0x03f1
            r48 = r0
            r101 = 0
            goto L_0x0404
        L_0x03f1:
            int r48 = r48.intValue()     // Catch:{ all -> 0x041a }
            if (r48 == 0) goto L_0x03fa
            r48 = 1
            goto L_0x03fc
        L_0x03fa:
            r48 = 0
        L_0x03fc:
            java.lang.Boolean r48 = java.lang.Boolean.valueOf(r48)     // Catch:{ all -> 0x041a }
            r101 = r48
            r48 = r0
        L_0x0404:
            ru8 r0 = new ru8     // Catch:{ all -> 0x041a }
            r51 = r0
            r51.<init>(r52, r54, r56, r58, r60, r62, r64, r65, r66, r67, r69, r70, r71, r72, r73, r74, r75, r77, r78, r80, r81, r82, r84, r86, r87, r89, r90, r91, r92, r94, r95, r96, r98, r99, r100, r101)     // Catch:{ all -> 0x041a }
            r3.add(r0)     // Catch:{ all -> 0x041a }
            r49 = r1
            r1 = r47
            r0 = r50
            r47 = r102
            r50 = r9
            goto L_0x021d
        L_0x041a:
            r0 = move-exception
            goto L_0x047d
        L_0x041c:
            r2.close()
            r26.n()
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.z53.S(r3, r0)
            r8.<init>(r0)
            java.util.Iterator r0 = r3.iterator()
        L_0x0431:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0447
            java.lang.Object r1 = r0.next()
            ru8 r1 = (defpackage.ru8) r1
            r2 = r25
            cu8 r1 = r2.b(r1)
            r8.add(r1)
            goto L_0x0431
        L_0x0447:
            boolean r0 = r8.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0471
            int r0 = r8.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = r24
            r1.<init>(r3)
            r4 = r22
            r1.append(r4)
            r6 = r21
            r1.append(r6)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r13 = r20
            defpackage.hm9.m(r13, r0, new java.lang.Object[0])
            goto L_0x0487
        L_0x0471:
            r13 = r20
            r6 = r21
            r4 = r22
            r3 = r24
            goto L_0x0487
        L_0x047a:
            r0 = move-exception
            r26 = r3
        L_0x047d:
            r2.close()
            r26.n()
            throw r0
        L_0x0484:
            r4 = r6
            r6 = r11
            r3 = r12
        L_0x0487:
            int r0 = r8.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            r1.append(r6)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.hm9.m(r13, r0, new java.lang.Object[0])
            boolean r0 = r8.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0535
            au8 r0 = r103.o()
            oz7 r1 = defpackage.iu8.b
            c34 r0 = r0.a
            k24 r0 = (defpackage.k24) r0
            vlc r0 = r0.c
            jlc r1 = r0.a
            ilc r1 = r1.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r1 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r1
            v05 r2 = new v05
            r2.<init>((java.util.List) r8, (defpackage.vlc) r0)
            r1.q(r2)
            p82 r0 = r103.g()
            e52 r0 = r0.C(r4)
            java.util.Iterator r1 = r8.iterator()
        L_0x04d0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0520
            java.lang.Object r2 = r1.next()
            cu8 r2 = (defpackage.cu8) r2
            if (r0 == 0) goto L_0x04e1
            es8 r3 = r0.c
            goto L_0x04e2
        L_0x04e1:
            r3 = 0
        L_0x04e2:
            if (r3 == 0) goto L_0x04fb
            es8 r3 = r0.c
            cu8 r3 = r3.a
            long r6 = r3.b
            long r9 = r2.b
            int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x04fb
            p82 r3 = r103.g()
            r6 = 0
            r3.k0(r4, r2, r6)
        L_0x04f8:
            r3 = r103
            goto L_0x04fd
        L_0x04fb:
            r6 = 0
            goto L_0x04f8
        L_0x04fd:
            e8d r7 = r3.a
            if (r7 == 0) goto L_0x0502
            goto L_0x0503
        L_0x0502:
            r7 = 0
        L_0x0503:
            je7 r7 = r7.c
            java.lang.Object r7 = r7.getValue()
            av0 r7 = (defpackage.av0) r7
            l6f r9 = new l6f
            long r10 = r2.t0
            long r14 = r2.b
            r23 = 0
            r18 = r9
            r19 = r10
            r21 = r14
            r18.<init>(r19, r21, r23)
            r7.c(r9)
            goto L_0x04d0
        L_0x0520:
            int r0 = r8.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "records updated "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.hm9.m(r13, r0, new java.lang.Object[0])
        L_0x0535:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s9d.x():void");
    }

    public boolean y(e52 e52) {
        long j;
        Iterable<es8> iterable;
        e52 e522 = e52;
        Object obj = this.o;
        if (e522 == null) {
            return false;
        }
        k92 k92 = e522.b;
        mg4 mg4 = (mg4) obj;
        if (k92.n.c(mg4) == 0) {
            return false;
        }
        int ordinal = mg4.ordinal();
        if (ordinal == 0) {
            b().getClass();
            j = e52.n();
            es8 es8 = e522.c;
            if (es8 != null) {
                long j2 = es8.a.o;
                if (j > j2) {
                    j = j2;
                }
            }
        } else if (ordinal == 1) {
            j = System.currentTimeMillis();
        } else {
            throw new IllegalStateException("Unexpected value: " + mg4);
        }
        au8 n = n();
        ArrayList d = k92.n.d(mg4);
        n.getClass();
        hm9.m("au8", "loadInitialToReadMark " + nu0.G(Long.valueOf(j)) + "; chunks count = " + d.size(), new Object[0]);
        d92 d92 = (d92) hm9.u(j, d).b;
        mg4 mg42 = (mg4) obj;
        rm4 rm4 = n.g;
        if (d92 == null) {
            d92 v = hm9.v(j, d);
            if (v != null) {
                long j3 = e522.a;
                long j4 = v.a;
                long j5 = v.b;
                iterable = ((zu8) rm4.get()).b(n.n(j3, j4, j5, true, mg42));
            } else {
                iterable = null;
            }
        } else {
            rm4 rm42 = rm4;
            String str = "au8";
            ArrayList n2 = n.n(e522.a, d92.a, j, true, mg42);
            ArrayList n3 = n.n(e522.a, j, d92.b, false, mg42);
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            Iterator it = n2.iterator();
            while (it.hasNext()) {
                cu8 cu8 = (cu8) it.next();
                arrayList.add(cu8);
                hashSet.add(Long.valueOf(cu8.b));
            }
            Iterator it2 = n3.iterator();
            while (it2.hasNext()) {
                cu8 cu82 = (cu8) it2.next();
                if (!hashSet.contains(Long.valueOf(cu82.b))) {
                    arrayList.add(cu82);
                    hashSet.add(Long.valueOf(cu82.b));
                }
            }
            hm9.m(str, "result record count = " + hashSet.size(), new Object[0]);
            iterable = ((zu8) rm42.get()).b(arrayList);
        }
        if (iterable == null) {
            iterable = nz4.a;
        }
        for (es8 es82 : iterable) {
            e8d e8d = this.a;
            if (e8d == null) {
                e8d = null;
            }
            t6b t6b = (t6b) e8d.H.getValue();
            cu8 cu83 = es82.a;
            ((u6b) t6b.c.computeIfAbsent(Long.valueOf(cu83.b), new di(16, new lr1(t6b, cu83, e522, 10)))).h(e522);
            cu8 cu84 = es82.a;
            if (cu84.n()) {
                k8g k8g = cu84.z0;
                int i = k8g.i();
                for (int i2 = 0; i2 < i; i2++) {
                    e8d e8d2 = this.a;
                    if (e8d2 == null) {
                        e8d2 = null;
                    }
                    k8g.h(i2);
                    ((af8) e8d2.A.getValue()).getClass();
                }
            }
        }
        return true;
    }

    public s9d(long j, mg4 mg4) {
        this.c = j;
        this.o = mg4;
    }
}
