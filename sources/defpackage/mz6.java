package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: mz6  reason: default package */
public final class mz6 {
    public final rm4 a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;
    public final rm4 e;
    public final rm4 f;
    public final rm4 g;
    public final rm4 h;
    public final rm4 i;
    public final rm4 j;
    public final ConcurrentHashMap k = new ConcurrentHashMap();

    public mz6(rm4 rm4, rm4 rm42, rm4 rm43, rm4 rm44, rm4 rm45, rm4 rm46, rm4 rm47, rm4 rm48, rm4 rm49, rm4 rm410) {
        this.a = rm4;
        this.b = rm42;
        this.c = rm43;
        this.d = rm44;
        this.e = rm45;
        this.f = rm46;
        this.g = rm47;
        this.h = rm48;
        this.i = rm49;
        this.j = rm410;
    }

    public final Map a(long j2) {
        return (Map) this.k.get(Long.valueOf(j2));
    }

    public final void b(long j2) {
        hm9.k("mz6", "postEvent: chat.id =  " + j2);
        ((av0) this.c.get()).c(new f4f(j2, d(j2)));
    }

    public final synchronized void c(long j2, long j3) {
        try {
            hm9.m("mz6", "removeTyping: chatId = " + j2 + ", sender = " + j3, new Object[0]);
            Map a2 = a(j2);
            if (a2 != null) {
                a2.remove(Long.valueOf(j3));
                if (a2.isEmpty()) {
                    hm9.m("mz6", "removeTyping: remove chat notifs, chatId = " + j2, new Object[0]);
                    this.k.remove(Long.valueOf(j2));
                }
                b(j2);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String d(long r11) {
        /*
            r10 = this;
            r0 = 0
            java.util.Map r1 = r10.a(r11)
            java.lang.String r2 = "mz6"
            r3 = 0
            r4 = 1
            java.lang.String r5 = "getNotifList: there is no notifs for chat, chatId = "
            if (r1 == 0) goto L_0x004c
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x0014
            goto L_0x004c
        L_0x0014:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ NoSuchElementException -> 0x001e }
            java.util.Set r1 = r1.entrySet()     // Catch:{ NoSuchElementException -> 0x001e }
            r6.<init>(r1)     // Catch:{ NoSuchElementException -> 0x001e }
            goto L_0x0022
        L_0x001e:
            java.util.List r6 = java.util.Collections.emptyList()
        L_0x0022:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x0039
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            defpackage.hm9.k(r2, r1)
        L_0x0037:
            r6 = r3
            goto L_0x005c
        L_0x0039:
            int r1 = r6.size()
            if (r1 <= r4) goto L_0x005c
            lz6 r1 = new lz6
            r1.<init>(r0)
            java.util.Comparator r1 = java.util.Comparator.comparingLong(r1)
            r6.sort(r1)
            goto L_0x005c
        L_0x004c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            defpackage.hm9.k(r2, r1)
            goto L_0x0037
        L_0x005c:
            if (r6 != 0) goto L_0x0070
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "typingText: there is no notifs for chat, chatId = "
            r10.<init>(r0)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            defpackage.hm9.k(r2, r10)
            return r3
        L_0x0070:
            rm4 r1 = r10.h
            java.lang.Object r1 = r1.get()
            p82 r1 = (defpackage.p82) r1
            e52 r11 = r1.C(r11)
            if (r11 != 0) goto L_0x0095
            rm4 r10 = r10.d
            java.lang.Object r10 = r10.get()
            o45 r10 = (defpackage.o45) r10
            ru.ok.tamtam.util.HandledException r11 = new ru.ok.tamtam.util.HandledException
            java.lang.String r12 = "chat is null"
            r11.<init>(r12)
            cba r10 = (defpackage.cba) r10
            r10.c(r11, r4)
            java.lang.String r10 = ""
            return r10
        L_0x0095:
            boolean r11 = r11.M()
            java.lang.Object r12 = r6.get(r0)
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r12 = r12.getValue()
            kr9 r12 = (defpackage.kr9) r12
            java.lang.Object r1 = r6.get(r0)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r5 = 2
            if (r11 == 0) goto L_0x0120
            rm4 r10 = r10.e
            java.lang.Object r10 = r10.get()
            ida r10 = (defpackage.ida) r10
            r10.getClass()
            b10 r11 = r12.b
            android.content.Context r10 = r10.a
            if (r11 == 0) goto L_0x0118
            int r11 = r11.ordinal()
            if (r11 == r5) goto L_0x0110
            r12 = 3
            if (r11 == r12) goto L_0x0108
            r12 = 4
            if (r11 == r12) goto L_0x0100
            r12 = 5
            if (r11 == r12) goto L_0x00f8
            r12 = 9
            if (r11 == r12) goto L_0x00f0
            r12 = 15
            if (r11 == r12) goto L_0x00e8
            int r11 = defpackage.c2c.tt_typing
            java.lang.String r10 = r10.getString(r11)
            goto L_0x01f4
        L_0x00e8:
            int r11 = defpackage.c2c.tt_typing_video_message
            java.lang.String r10 = r10.getString(r11)
            goto L_0x01f4
        L_0x00f0:
            int r11 = defpackage.c2c.tt_typing_file
            java.lang.String r10 = r10.getString(r11)
            goto L_0x01f4
        L_0x00f8:
            int r11 = defpackage.c2c.tt_typing_sticker
            java.lang.String r10 = r10.getString(r11)
            goto L_0x01f4
        L_0x0100:
            int r11 = defpackage.c2c.tt_typing_audio
            java.lang.String r10 = r10.getString(r11)
            goto L_0x01f4
        L_0x0108:
            int r11 = defpackage.c2c.tt_typing_video
            java.lang.String r10 = r10.getString(r11)
            goto L_0x01f4
        L_0x0110:
            int r11 = defpackage.c2c.tt_typing_photo
            java.lang.String r10 = r10.getString(r11)
            goto L_0x01f4
        L_0x0118:
            int r11 = defpackage.c2c.tt_typing
            java.lang.String r10 = r10.getString(r11)
            goto L_0x01f4
        L_0x0120:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r12 = r6.size()
            java.lang.String r7 = "MISSED_CONTACT_IN_TYPING"
            rm4 r8 = r10.j
            rm4 r9 = r10.i
            if (r12 != r4) goto L_0x0157
            java.lang.Object r10 = r9.get()
            el3 r10 = (defpackage.el3) r10
            uj3 r10 = r10.i(r1, r0)
            if (r10 == 0) goto L_0x014d
            boolean r12 = r10.w()
            if (r12 == 0) goto L_0x0144
            goto L_0x014d
        L_0x0144:
            java.lang.String r10 = r10.d()
            r11.append(r10)
            goto L_0x01f0
        L_0x014d:
            java.lang.Object r10 = r8.get()
            ad r10 = (defpackage.ad) r10
            r10.f(r7)
            return r3
        L_0x0157:
            int r12 = r6.size()
            if (r12 != r5) goto L_0x01a7
            java.util.Iterator r10 = r6.iterator()
        L_0x0161:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x01f0
            java.lang.Object r12 = r10.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r1 = r9.get()
            el3 r1 = (defpackage.el3) r1
            java.lang.Object r12 = r12.getKey()
            java.lang.Long r12 = (java.lang.Long) r12
            long r2 = r12.longValue()
            uj3 r12 = r1.i(r2, r0)
            if (r12 == 0) goto L_0x019d
            boolean r1 = r12.w()
            if (r1 == 0) goto L_0x018a
            goto L_0x019d
        L_0x018a:
            int r1 = r11.length()
            if (r1 == 0) goto L_0x0195
            java.lang.String r1 = ", "
            r11.append(r1)
        L_0x0195:
            java.lang.String r12 = r12.d()
            r11.append(r12)
            goto L_0x0161
        L_0x019d:
            java.lang.Object r12 = r8.get()
            ad r12 = (defpackage.ad) r12
            r12.f(r7)
            goto L_0x0161
        L_0x01a7:
            java.util.Iterator r12 = r6.iterator()
        L_0x01ab:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01db
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r9.get()
            el3 r1 = (defpackage.el3) r1
            java.lang.Object r0 = r0.getKey()
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            uj3 r0 = r1.i(r2, r4)
            boolean r0 = r0.w()
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r0 = r8.get()
            ad r0 = (defpackage.ad) r0
            r0.f(r7)
            goto L_0x01ab
        L_0x01db:
            rm4 r10 = r10.a
            java.lang.Object r10 = r10.get()
            android.content.Context r10 = (android.content.Context) r10
            int r12 = defpackage.fzb.tt_chat_subtitle_count
            int r0 = r6.size()
            java.lang.String r10 = defpackage.are.s(r12, r0, r10)
            r11.append(r10)
        L_0x01f0:
            java.lang.String r10 = r11.toString()
        L_0x01f4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mz6.d(long):java.lang.String");
    }
}
