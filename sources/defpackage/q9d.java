package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: q9d  reason: default package */
public final class q9d extends d8d implements hua {
    public static WeakReference Z = new WeakReference((Object) null);
    public final mg4 X;
    public final String Y;
    public final long b;
    public final long c;
    public int o;

    public q9d(long j, long j2, int i, mg4 mg4) {
        this.b = j;
        this.c = j2;
        this.o = i;
        this.X = mg4;
        String name = mg4.name();
        StringBuilder k = au1.k(j, "TaskSyncChatHistory(#", ",");
        ms2.j(j2, ",", name, k);
        k.append(")");
        this.Y = k.toString();
    }

    /* JADX INFO: finally extract failed */
    public final int c() {
        b46 b46;
        hm9.m(this.Y, "onPreExecute", new Object[0]);
        e8d e8d = this.a;
        if (e8d == null) {
            e8d = null;
        }
        if (!((ch3) e8d.E.getValue()).e()) {
            return 2;
        }
        eoe r = r();
        iua iua = iua.TYPE_SYNC_CHAT_HISTORY;
        goe goe = goe.PROCESSING;
        hoe b2 = ((k24) ((c34) r.a.get())).f.b();
        List singletonList = Collections.singletonList(iua);
        List<goe> singletonList2 = Collections.singletonList(goe);
        b2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id FROM tasks WHERE type in (");
        int size = singletonList.size();
        a14.c(sb, size);
        sb.append(") AND status in (");
        int size2 = singletonList2.size();
        a14.c(sb, size2);
        sb.append(")");
        xlc a = xlc.a(size2 + size, sb.toString());
        Iterator it = singletonList.iterator();
        int i = 1;
        while (true) {
            boolean hasNext = it.hasNext();
            b46 = b2.c;
            if (!hasNext) {
                break;
            }
            b46.getClass();
            a.j(i, (long) ((iua) it.next()).a);
            i++;
        }
        int i2 = size + 1;
        for (goe goe2 : singletonList2) {
            b46.getClass();
            a.j(i2, (long) goe2.a);
            i2++;
        }
        ilc ilc = b2.a;
        ilc.b();
        Cursor o2 = ilc.o(a, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o2.getCount());
            while (o2.moveToNext()) {
                arrayList.add(o2.isNull(0) ? null : Long.valueOf(o2.getLong(0)));
            }
            o2.close();
            a.n();
            return arrayList.isEmpty() ^ true ? 2 : 1;
        } catch (Throwable th) {
            o2.close();
            a.n();
            throw th;
        }
    }

    public final void d() {
        hm9.m(this.Y, "removeTask", new Object[0]);
        r().d(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (q9d.class.equals(obj.getClass())) {
                q9d q9d = (q9d) obj;
                return this.c == q9d.c && this.X == q9d.X;
            }
        }
        return false;
    }

    public final byte[] f() {
        Tasks.SyncChatHistory syncChatHistory = new Tasks.SyncChatHistory();
        syncChatHistory.taskId = this.b;
        syncChatHistory.chatId = this.c;
        syncChatHistory.count = this.o;
        syncChatHistory.itemTypeId = this.X.a;
        hm9.m(this.Y, "toByteArray", new Object[0]);
        return qw8.toByteArray(syncChatHistory);
    }

    public final long getId() {
        return this.b;
    }

    public final iua getType() {
        return iua.TYPE_SYNC_CHAT_HISTORY;
    }

    public final int hashCode() {
        long j = this.c;
        return this.X.hashCode() + (((q9d.class.getName().hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final ExecutorService k(iba iba, vi4 vi4) {
        ExecutorService executorService;
        int i;
        ExecutorService executorService2 = (ExecutorService) Z.get();
        if (executorService2 != null) {
            return executorService2;
        }
        synchronized (q9d.class) {
            try {
                executorService = (ExecutorService) Z.get();
                if (executorService == null) {
                    int availableProcessors = Runtime.getRuntime().availableProcessors();
                    int ordinal = vi4.ordinal();
                    if (ordinal == 0) {
                        i = Math.max(4, availableProcessors - 1);
                    } else if (ordinal == 1) {
                        i = Math.max(8, availableProcessors);
                    } else if (ordinal == 2) {
                        i = Math.max(12, availableProcessors);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    bc7[] bc7Arr = iba.p;
                    executorService = iba.f(0, "sync-chat-history", i, 5);
                    Z = new WeakReference(executorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public final String toString() {
        return this.Y;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r22 = this;
            r0 = r22
            java.lang.String r1 = r0.Y
            java.lang.String r2 = "process start"
            defpackage.hm9.m(r1, r2, new java.lang.Object[0])
            p82 r1 = r22.b()
            long r2 = r0.c
            e52 r1 = r1.C(r2)
            r2 = 0
            r3 = 3
            if (r1 == 0) goto L_0x004c
            boolean r4 = r1.C()
            if (r4 != 0) goto L_0x0023
            boolean r4 = r1.R()
            if (r4 == 0) goto L_0x0029
        L_0x0023:
            boolean r4 = r1.e0()
            if (r4 != 0) goto L_0x004c
        L_0x0029:
            java.lang.String r4 = r0.Y
            k92 r5 = r1.b
            i92 r5 = r5.c
            boolean r6 = r1.e0()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r5, r6}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.lang.String r3 = "Chat %s have status %s or self participant=%b finish this task"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            defpackage.hm9.p(r4, r1, r2)
            r22.y()
            return
        L_0x004c:
            int r4 = r0.o
            r5 = 1
            int r4 = r4 + r5
            r0.o = r4
            r6 = 10
            if (r4 <= r6) goto L_0x0095
            java.lang.String r3 = r0.Y
            ru.ok.tamtam.exception.TaskSyncChatHistoryMaxIterationsException r4 = new ru.ok.tamtam.exception.TaskSyncChatHistoryMaxIterationsException
            if (r1 == 0) goto L_0x0066
            k92 r5 = r1.b
            if (r5 == 0) goto L_0x0066
            long r5 = r5.a
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
        L_0x0066:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "chat = "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            java.lang.String r2 = "MAX_ITERATION_COUNT reached"
            defpackage.hm9.p(r3, r2, r4)
            if (r1 == 0) goto L_0x0091
            java.lang.String r2 = r0.Y
            k92 r1 = r1.b
            long r3 = r1.a
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = "process: chatServerId = %d"
            defpackage.hm9.m(r2, r3, r1)
        L_0x0091:
            r22.y()
            return
        L_0x0095:
            eoe r1 = r22.r()
            crd r4 = defpackage.goe.b
            rm4 r1 = r1.a
            java.lang.Object r1 = r1.get()
            c34 r1 = (defpackage.c34) r1
            k24 r1 = (defpackage.k24) r1
            jmc r1 = r1.f
            hoe r1 = r1.b()
            long r7 = r0.b
            byte[] r4 = r22.f()
            ilc r9 = r1.a
            r9.b()
            zkc r10 = r1.e
            q36 r11 = r10.f()
            r11.k(r5, r4)
            b46 r1 = r1.c
            r1.getClass()
            long r12 = (long) r6
            r1 = 2
            r11.j(r1, r12)
            r11.j(r3, r7)
            r9.c()     // Catch:{ all -> 0x0417 }
            r11.n()     // Catch:{ all -> 0x0412 }
            r9.r()     // Catch:{ all -> 0x0412 }
            r9.l()     // Catch:{ all -> 0x0417 }
            r10.t(r11)
            java.lang.String r1 = r0.Y
            java.lang.String r3 = "syncMessages"
            defpackage.hm9.m(r1, r3, new java.lang.Object[0])
            p82 r1 = r22.b()
            long r3 = r0.c
            e52 r1 = r1.C(r3)
            r3 = 0
            if (r1 == 0) goto L_0x01df
            k92 r4 = r1.b
            long r6 = r4.a
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0103
            p82 r4 = r22.b()
            boolean r4 = r4.P(r1)
            if (r4 == 0) goto L_0x01df
        L_0x0103:
            boolean r4 = r1.e0()
            if (r4 != 0) goto L_0x010b
            goto L_0x01df
        L_0x010b:
            boolean r4 = r1.G()
            if (r4 == 0) goto L_0x0132
            java.lang.String r2 = r0.Y
            java.lang.String r3 = "current chat is blocked, try to get history from last event time (probably, it's equals to last message time"
            defpackage.hm9.m(r2, r3, new java.lang.Object[0])
            hc2 r6 = r22.e()
            long r7 = r1.a
            k92 r1 = r1.b
            long r9 = r1.a
            long r11 = r1.k
            long r1 = r0.b
            mg4 r3 = r0.X
            r13 = 0
            r15 = r1
            r17 = r3
            defpackage.hc2.b(r6, r7, r9, r11, r13, r15, r17)
            goto L_0x03e2
        L_0x0132:
            es8 r4 = r1.c
            if (r4 == 0) goto L_0x0182
            cu8 r4 = r4.a
            long r6 = r4.t0
            long r8 = r0.c
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0182
            one.me.sdk.tasks.WrongLastMessageInChatException r4 = new one.me.sdk.tasks.WrongLastMessageInChatException
            r4.<init>()
            java.lang.String r6 = r0.Y
            ir6 r7 = defpackage.hm9.m
            if (r7 != 0) goto L_0x014c
            goto L_0x017b
        L_0x014c:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x017b
            us7 r8 = defpackage.us7.Z
            k92 r9 = r1.b
            long r9 = r9.a
            es8 r11 = r1.c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "CRITICAL SITUATION: chat.lastMessage.data.chatId != chatId serverId = "
            r12.<init>(r13)
            r12.append(r9)
            java.lang.String r9 = " chat = "
            r12.append(r9)
            r12.append(r1)
            java.lang.String r9 = " lastMessage = "
            r12.append(r9)
            r12.append(r11)
            java.lang.String r9 = r12.toString()
            r7.d(r8, r6, r9, r2)
        L_0x017b:
            o45 r2 = r22.j()
            ((defpackage.cba) r2).c(r4, false)
        L_0x0182:
            mg4 r2 = r0.X
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x01f8
            if (r2 != r5) goto L_0x01e2
            hc2 r2 = r22.e()
            long r7 = r1.a
            k92 r1 = r1.b
            long r9 = r1.a
            long r13 = r0.b
            r2.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "firstPageDelayed: chatId = "
            r1.<init>(r4)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = r2.c
            defpackage.hm9.m(r4, r1, new java.lang.Object[0])
            je7 r1 = r2.a
            java.lang.Object r1 = r1.getValue()
            rhc r1 = (defpackage.rhc) r1
            hyc r1 = (defpackage.hyc) r1
            long r5 = r1.o()
            long r11 = java.lang.System.currentTimeMillis()
            r15 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 + r15
            mg4 r20 = defpackage.mg4.DELAYED
            cc2 r1 = new cc2
            r4 = r1
            r17 = 0
            r18 = 0
            r15 = 0
            r16 = 40
            r21 = 3488(0xda0, float:4.888E-42)
            r4.<init>(r5, r7, r9, r11, r13, r15, r16, r17, r18, r20, r21)
            je7 r2 = r2.b
            java.lang.Object r2 = r2.getValue()
            ome r2 = (defpackage.ome) r2
            defpackage.ome.b(r2, r1)
        L_0x01df:
            r5 = r3
            goto L_0x03e2
        L_0x01e2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            mg4 r0 = r0.X
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected value: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x01f8:
            long r6 = r1.n()
            es8 r2 = r1.c
            if (r2 == 0) goto L_0x0209
            cu8 r2 = r2.a
            long r8 = r2.o
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0209
            r6 = r8
        L_0x0209:
            mg4 r2 = r0.X
            k92 r4 = r1.b
            e92 r4 = r4.n
            java.util.ArrayList r2 = r4.d(r2)
            kpa r2 = defpackage.hm9.u(r6, r2)
            java.lang.Object r2 = r2.b
            d92 r2 = (defpackage.d92) r2
            java.lang.String r4 = r0.Y
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            java.lang.String r8 = defpackage.nu0.G(r8)
            java.lang.String r9 = defpackage.hm9.W(r2)
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r9}
            java.lang.String r9 = "syncMessages: readMark = %s, chunk = %s"
            defpackage.hm9.m(r4, r9, r8)
            if (r2 != 0) goto L_0x0259
            mg4 r2 = r0.X
            long r17 = r1.i(r6, r2)
            java.lang.String r2 = r0.Y
            java.lang.String r3 = "checkReadmarkChunk: chunk is null, request from readmark back and forth"
            defpackage.hm9.m(r2, r3, new java.lang.Object[0])
            hc2 r10 = r22.e()
            k92 r2 = r1.b
            long r13 = r2.a
            long r11 = r1.a
            long r1 = r0.b
            mg4 r3 = r0.X
            r15 = r6
            r19 = r1
            r21 = r3
            defpackage.hc2.b(r10, r11, r13, r15, r17, r19, r21)
            goto L_0x03e2
        L_0x0259:
            mg4 r4 = defpackage.mg4.REGULAR
            long r19 = r1.i(r6, r4)
            au8 r10 = r22.n()
            long r13 = r2.a
            r17 = 1
            long r11 = r1.a
            r15 = r6
            r18 = r4
            java.util.ArrayList r4 = r10.n(r11, r13, r15, r17, r18)
            boolean r8 = r4.isEmpty()
            r9 = 40
            if (r8 != 0) goto L_0x02f8
            int r8 = r4.size()
            if (r8 < r9) goto L_0x0280
            goto L_0x02f8
        L_0x0280:
            java.util.Iterator r8 = r4.iterator()
        L_0x0284:
            boolean r10 = r8.hasNext()
            java.lang.String r11 = r0.Y
            k92 r12 = r1.b
            if (r10 == 0) goto L_0x02a5
            java.lang.Object r10 = r8.next()
            cu8 r10 = (defpackage.cu8) r10
            long r13 = r10.b
            long r9 = r12.x
            int r9 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x02a2
            java.lang.String r4 = "checkBackwardSync: first chat message exists in backward history, stop syncing"
            defpackage.hm9.m(r11, r4, new java.lang.Object[0])
            goto L_0x02f8
        L_0x02a2:
            r9 = 40
            goto L_0x0284
        L_0x02a5:
            java.lang.Object r2 = r4.get(r3)
            cu8 r2 = (defpackage.cu8) r2
            long r6 = r2.o
            int r3 = r4.size()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.String r14 = defpackage.nu0.G(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r19)
            java.lang.String r15 = defpackage.nu0.G(r3)
            long r3 = r12.x
            java.lang.Long r16 = java.lang.Long.valueOf(r3)
            e92 r3 = r12.n
            mg4 r4 = defpackage.mg4.REGULAR
            java.util.ArrayList r3 = r3.d(r4)
            java.lang.String r18 = defpackage.hm9.X(r3)
            r17 = r2
            java.lang.Object[] r2 = new java.lang.Object[]{r13, r14, r15, r16, r17, r18}
            java.lang.String r3 = "checkBackwardSync: before.size = %d, from = %s, backward = %s, chat.data.firstMessageId = %d, firstInHistory = %s, chunks = %s"
            defpackage.hm9.m(r11, r3, r2)
            hc2 r8 = r22.e()
            long r11 = r12.a
            long r9 = r1.a
            long r1 = r0.b
            r13 = r6
            r15 = r19
            r17 = r1
            r19 = r4
            defpackage.hc2.c(r8, r9, r11, r13, r15, r17, r19)
            goto L_0x03e2
        L_0x02f8:
            es8 r4 = r1.c
            if (r4 == 0) goto L_0x0306
            cu8 r4 = r4.a
            long r8 = r4.o
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0306
            goto L_0x0377
        L_0x0306:
            au8 r10 = r22.n()
            long r8 = r2.b
            mg4 r4 = defpackage.mg4.REGULAR
            long r11 = r1.a
            r17 = 0
            r13 = r6
            r15 = r8
            r18 = r4
            java.util.ArrayList r6 = r10.n(r11, r13, r15, r17, r18)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x0377
            int r7 = r6.size()
            r8 = 40
            if (r7 >= r8) goto L_0x0377
            es8 r7 = r1.c
            if (r7 != 0) goto L_0x032d
            goto L_0x0377
        L_0x032d:
            cu8 r8 = r7.a
            long r8 = r8.o
            boolean r2 = defpackage.hm9.K(r8, r2)
            if (r2 != 0) goto L_0x0377
            int r2 = r6.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            k92 r3 = r1.b
            e92 r8 = r3.n
            java.util.ArrayList r8 = r8.d(r4)
            java.lang.String r8 = defpackage.hm9.X(r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r8, r7}
            java.lang.String r7 = r0.Y
            java.lang.String r8 = "checkForwardSync: after.size = %d, chunks = %s, lastMessage = %s"
            defpackage.hm9.m(r7, r8, r2)
            int r2 = r6.size()
            int r2 = r2 - r5
            java.lang.Object r2 = r6.get(r2)
            cu8 r2 = (defpackage.cu8) r2
            long r6 = r2.o
            hc2 r11 = r22.e()
            long r14 = r3.a
            long r12 = r1.a
            long r1 = r0.b
            r16 = r6
            r18 = r1
            r20 = r4
            defpackage.hc2.a(r11, r12, r14, r16, r18, r20)
            goto L_0x03e2
        L_0x0377:
            k92 r2 = r1.b
            e92 r2 = r2.n
            mg4 r4 = defpackage.mg4.REGULAR
            java.util.ArrayList r2 = r2.d(r4)
            es8 r4 = r1.c
            if (r4 == 0) goto L_0x01df
            k92 r6 = r1.b
            int r7 = r6.m
            r8 = 40
            if (r7 >= r8) goto L_0x038f
            goto L_0x01df
        L_0x038f:
            cu8 r4 = r4.a
            long r7 = r4.o
            mg4 r4 = r0.X
            long r16 = r1.i(r7, r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x039d:
            boolean r4 = r2.hasNext()
            es8 r7 = r1.c
            if (r4 == 0) goto L_0x03be
            java.lang.Object r4 = r2.next()
            d92 r4 = (defpackage.d92) r4
            cu8 r7 = r7.a
            long r7 = r7.o
            boolean r7 = defpackage.hm9.K(r7, r4)
            if (r7 == 0) goto L_0x039d
            long r7 = r4.a
            long r9 = r4.b
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x01df
            goto L_0x039d
        L_0x03be:
            int r2 = r6.m
            java.lang.String r3 = "checkBackwardLastMessageSync: newMessages = "
            java.lang.String r2 = defpackage.zr6.h(r2, r3)
            java.lang.String r3 = r0.Y
            defpackage.hm9.m(r3, r2, new java.lang.Object[0])
            hc2 r9 = r22.e()
            long r12 = r6.a
            cu8 r2 = r7.a
            long r14 = r2.o
            long r10 = r1.a
            long r1 = r0.b
            mg4 r3 = r0.X
            r18 = r1
            r20 = r3
            defpackage.hc2.c(r9, r10, r12, r14, r16, r18, r20)
        L_0x03e2:
            java.lang.String r1 = r0.Y
            long r2 = r0.b
            long r6 = r0.c
            int r4 = r0.o
            java.lang.String r8 = "process, taskId = "
            java.lang.String r9 = ", chatId = "
            java.lang.StringBuilder r2 = defpackage.au1.k(r2, r8, r9)
            r2.append(r6)
            java.lang.String r3 = ", needSyncMessage = "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = " count: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            defpackage.hm9.m(r1, r2, new java.lang.Object[0])
            if (r5 != 0) goto L_0x0411
            r22.y()
        L_0x0411:
            return
        L_0x0412:
            r0 = move-exception
            r9.l()     // Catch:{ all -> 0x0417 }
            throw r0     // Catch:{ all -> 0x0417 }
        L_0x0417:
            r0 = move-exception
            r10.t(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q9d.x():void");
    }

    public final void y() {
        String str = this.Y;
        hm9.m(str, "finishTask", new Object[0]);
        hm9.m(str, "removeTask", new Object[0]);
        r().d(this.b);
        r9d.y(u());
    }
}
