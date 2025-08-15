package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.tamtam.api.SessionSendLimitException;

/* renamed from: v9d  reason: default package */
public final class v9d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9d b;

    public /* synthetic */ v9d(x9d x9d, int i) {
        this.a = i;
        this.b = x9d;
    }

    public boolean a(bpa bpa) {
        x9d x9d = this.b;
        if (x9d.c.get() != 2 && !x9d.b(x9d, bpa, jt7.class)) {
            return false;
        }
        bpa.b.c.g(new pke("session.state", "session is in logged in state or login already in progress", (String) null));
        return true;
    }

    public void b() {
        boolean z;
        long j;
        boolean z2;
        apa apa;
        long currentTimeMillis = System.currentTimeMillis();
        ai3 a2 = this.b.n.a();
        zh3 b2 = ((gh3) ((je7) a2.b).getValue()).b();
        Class<ai3> cls = ai3.class;
        int i = 1;
        if (((zh3) ((AtomicReference) a2.o).getAndSet(b2)) != b2) {
            String name = cls.getName();
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, name, "reset timeoutIndex", (Throwable) null);
            }
            ((AtomicInteger) a2.c).set(0);
            z = true;
        } else {
            z = false;
        }
        long[] jArr = (long[]) ((Map) ((khe) a2.Y).getValue()).getOrDefault(b2, c37.c);
        int i2 = ((AtomicInteger) a2.c).get();
        if (i2 >= 0 && i2 < jArr.length) {
            j = jArr[i2];
        } else if (i2 >= jArr.length) {
            if (jArr.length != 0) {
                j = jArr[jArr.length - 1];
            } else {
                throw new NoSuchElementException("Array is empty.");
            }
        } else if (jArr.length != 0) {
            j = jArr[0];
        } else {
            throw new NoSuchElementException("Array is empty.");
        }
        if (z) {
            String name2 = cls.getName();
            ir6 ir62 = hm9.m;
            if (ir62 != null && ir62.c()) {
                ir62.d(us7.X, name2, "connType=" + b2 + ", timeout = " + j, (Throwable) null);
            }
        }
        x9d x9d = this.b;
        int size = x9d.w.size();
        boolean z3 = x9d.B > 0 && x9d.k();
        if (z3 && !x9d.C && x9d.B < size) {
            hm9.k0(x9d.a, (Exception) null, "amount of send_tasks=%d has exceeded the specified limit=%d", Arrays.copyOf(new Object[]{Integer.valueOf(size), Integer.valueOf(x9d.B)}, 2));
            x9d.o(new SessionSendLimitException(x9d.B, size));
            x9d.C = true;
        }
        if (z3) {
            hm9.m(this.b.a, "!==! invalidate start time for cmds, tasks=%d, limit=%d", Integer.valueOf(this.b.w.size()), Integer.valueOf(this.b.B));
        }
        synchronized (this.b.x) {
            try {
                if (this.b.w.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (bpa bpa : this.b.w) {
                        if (!(bpa == null || bpa.a != i || (apa = bpa.b) == null)) {
                            if (z3) {
                                int i3 = dc7.a;
                                int i4 = ft4.o;
                                apa.d = z7.S(System.currentTimeMillis(), kt4.MILLISECONDS);
                            } else {
                                long e = currentTimeMillis - ft4.e(apa.d);
                                if (e > j) {
                                    this.b.m(ds7.EXCEPTION, bpa.b.c.i(), 0, bpa.b.a.N(), true, "send timeout: diff=" + e + " requestTimeout=" + j);
                                    bpa.b.c.g(new gke());
                                    this.b.n.f();
                                    arrayList.add(bpa);
                                }
                            }
                        }
                        i = 1;
                    }
                    this.b.w.removeAll(arrayList);
                }
            } finally {
                while (true) {
                }
            }
        }
        if (this.b.v.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = this.b.v.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ft4.e(((zoa) entry.getValue()).c) > j && currentTimeMillis - this.b.d.get() > j) {
                    this.b.m(ds7.EXCEPTION, ((zoa) entry.getValue()).a.i(), ((Short) entry.getKey()).shortValue(), ((zoa) entry.getValue()).b.b.a.N(), false, "read timeout");
                    this.b.n.f();
                    arrayList2.add((Short) entry.getKey());
                    z2 = true;
                    break;
                }
            }
            gke gke = new gke();
            if (z2) {
                hm9.k0(this.b.a, (Exception) null, "session timeout", Arrays.copyOf(new Object[0], 0));
                for (zoa zoa : this.b.v.values()) {
                    zoa.a.g(gke);
                }
                this.b.v.clear();
                this.b.p(0);
                this.b.g.set(false);
                return;
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Short sh = (Short) it2.next();
                zoa zoa2 = (zoa) this.b.v.get(sh);
                if (zoa2 != null) {
                    zoa2.a.g(gke);
                    this.b.v.remove(sh);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [yoa, java.lang.String, java.lang.Exception] */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010a, code lost:
        if (a(r5) != false) goto L_0x010c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c() {
        /*
            r26 = this;
            r1 = r26
            x9d r2 = r1.b
            boolean r0 = r2.l()
            if (r0 == 0) goto L_0x0270
            java.util.List r0 = r2.w
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0014
            goto L_0x0270
        L_0x0014:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r0 = r2.w
            java.util.Iterator r4 = r0.iterator()
        L_0x001f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0268
            java.lang.Object r0 = r4.next()
            r5 = r0
            bpa r5 = (defpackage.bpa) r5
            boolean r0 = r2.l()
            r6 = 0
            java.lang.String r8 = r2.a
            if (r0 == 0) goto L_0x003b
            boolean r0 = r2.k()
            if (r0 == 0) goto L_0x003e
        L_0x003b:
            r1 = 0
            goto L_0x025d
        L_0x003e:
            int r0 = r5.a
            r9 = 1
            r10 = 2
            java.util.concurrent.atomic.AtomicBoolean r11 = r2.g
            if (r0 != r9) goto L_0x020c
            apa r9 = r5.b
            if (r9 == 0) goto L_0x020c
            dle r12 = r9.a
            boolean r0 = r12 instanceof defpackage.jt7
            boolean r13 = r12 instanceof defpackage.lu7
            boolean r14 = r12 instanceof defpackage.mad
            java.util.concurrent.ConcurrentHashMap r15 = r2.v
            if (r0 != 0) goto L_0x00a3
            if (r13 != 0) goto L_0x00a3
            java.util.List r13 = r2.w
            java.util.Iterator r13 = r13.iterator()
        L_0x005e:
            boolean r16 = r13.hasNext()
            if (r16 == 0) goto L_0x0079
            java.lang.Object r16 = r13.next()
            r7 = r16
            bpa r7 = (defpackage.bpa) r7
            apa r7 = r7.b
            if (r7 == 0) goto L_0x005e
            dle r7 = r7.a
            if (r7 == 0) goto L_0x005e
            boolean r7 = r7 instanceof defpackage.lu7
            if (r7 == 0) goto L_0x005e
            goto L_0x001f
        L_0x0079:
            java.util.Set r7 = r15.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0081:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x00a3
            java.lang.Object r13 = r7.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r13 = r13.getValue()
            zoa r13 = (defpackage.zoa) r13
            bpa r13 = r13.b
            apa r13 = r13.b
            if (r13 == 0) goto L_0x0081
            dle r13 = r13.a
            if (r13 == 0) goto L_0x0081
            boolean r13 = r13 instanceof defpackage.lu7
            if (r13 == 0) goto L_0x0081
            goto L_0x001f
        L_0x00a3:
            boolean r7 = r12.V()
            if (r7 == 0) goto L_0x00b1
            java.util.concurrent.atomic.AtomicInteger r7 = r2.c
            int r7 = r7.get()
            if (r7 != r10) goto L_0x001f
        L_0x00b1:
            boolean r7 = r11.get()
            if (r7 != 0) goto L_0x00bb
            if (r14 != 0) goto L_0x00bb
            goto L_0x001f
        L_0x00bb:
            dke r7 = r9.c
            if (r14 == 0) goto L_0x00e9
            boolean r13 = r11.get()
            java.lang.String r14 = "session.state"
            if (r13 == 0) goto L_0x00d2
            pke r0 = new pke
            java.lang.String r8 = "SESSION_INIT already initialized"
            r0.<init>(r14, r8, r6)
            r7.g(r0)
            goto L_0x00e4
        L_0x00d2:
            java.lang.Class<mad> r13 = defpackage.mad.class
            boolean r13 = defpackage.x9d.b(r2, r5, r13)
            if (r13 == 0) goto L_0x00e9
            pke r0 = new pke
            java.lang.String r8 = "SESSION_INIT already requested"
            r0.<init>(r14, r8, r6)
            r7.g(r0)
        L_0x00e4:
            r3.add(r5)
            goto L_0x001f
        L_0x00e9:
            long r13 = java.lang.System.currentTimeMillis()
            r17 = r11
            long r10 = r5.c
            long r10 = defpackage.ft4.e(r10)
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x00fb
            goto L_0x001f
        L_0x00fb:
            java.util.concurrent.atomic.AtomicInteger r10 = r2.b
            r10.incrementAndGet()
            short r10 = r10.shortValue()
            if (r0 == 0) goto L_0x0119
            boolean r0 = r1.a(r5)     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            if (r0 == 0) goto L_0x0119
        L_0x010c:
            r3.add(r5)
            goto L_0x001f
        L_0x0111:
            r0 = move-exception
            goto L_0x0208
        L_0x0114:
            r0 = move-exception
            goto L_0x0168
        L_0x0116:
            r0 = move-exception
            goto L_0x01cd
        L_0x0119:
            zoa r0 = new zoa     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            r0.<init>(r7, r5)     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            java.lang.Short r11 = java.lang.Short.valueOf(r10)     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            r15.put(r11, r0)     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            boolean r0 = r9.b     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            if (r0 == 0) goto L_0x012c
            r0 = 2
        L_0x012a:
            r9 = 0
            goto L_0x012e
        L_0x012c:
            r0 = 0
            goto L_0x012a
        L_0x012e:
            yoa r6 = defpackage.yoa.a(r12, r0, r9)     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            x9d r0 = r1.b     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            ds7 r19 = defpackage.ds7.SEND     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            long r20 = r7.i()     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            short r23 = r12.N()     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            java.lang.Object r9 = r12.b     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            java.util.HashMap r9 = (java.util.HashMap) r9     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            java.lang.String r25 = defpackage.s5c.T(r9)     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            r24 = 1
            r18 = r0
            r22 = r10
            r18.m(r19, r20, r22, r23, r24, r25)     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            k33 r0 = r2.n     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            boolean r0 = r0.e()     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            if (r0 == 0) goto L_0x015c
            byte[] r0 = r6.c(r10)     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            goto L_0x0160
        L_0x015c:
            byte[] r0 = r6.b(r10)     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
        L_0x0160:
            java.io.DataOutputStream r9 = r2.r     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            int r11 = r0.length     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            r13 = 0
            r9.write(r0, r13, r11)     // Catch:{ IOException -> 0x0116, Exception -> 0x0114 }
            goto L_0x010c
        L_0x0168:
            x9d r9 = r1.b     // Catch:{ all -> 0x0111 }
            ds7 r19 = defpackage.ds7.EXCEPTION     // Catch:{ all -> 0x0111 }
            long r20 = r7.i()     // Catch:{ all -> 0x0111 }
            short r23 = r12.N()     // Catch:{ all -> 0x0111 }
            java.lang.String r25 = r0.getMessage()     // Catch:{ all -> 0x0111 }
            r24 = 1
            r18 = r9
            r22 = r10
            r18.m(r19, r20, r22, r23, r24, r25)     // Catch:{ all -> 0x0111 }
            boolean r9 = r0 instanceof java.lang.ArrayIndexOutOfBoundsException     // Catch:{ all -> 0x0111 }
            if (r9 != 0) goto L_0x0189
            boolean r9 = r0 instanceof net.jpountz.lz4.LZ4Exception     // Catch:{ all -> 0x0111 }
            if (r9 == 0) goto L_0x01b9
        L_0x0189:
            if (r6 == 0) goto L_0x01b9
            byte[] r6 = r6.b(r10)     // Catch:{ all -> 0x0111 }
            java.lang.String r9 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x01b2 }
            byte[] r6 = defpackage.kq0.k(r6)     // Catch:{ UnsupportedEncodingException -> 0x01b2 }
            java.lang.String r11 = "US-ASCII"
            r9.<init>(r6, r11)     // Catch:{ UnsupportedEncodingException -> 0x01b2 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0111 }
            r6.<init>()     // Catch:{ all -> 0x0111 }
            java.lang.String r11 = "exception in LZ4, packet = "
            r6.append(r11)     // Catch:{ all -> 0x0111 }
            r6.append(r9)     // Catch:{ all -> 0x0111 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0111 }
            r9 = 0
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0111 }
            defpackage.hm9.r(r8, r0, r6, r9)     // Catch:{ all -> 0x0111 }
            goto L_0x01b9
        L_0x01b2:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0111 }
            r1.<init>(r0)     // Catch:{ all -> 0x0111 }
            throw r1     // Catch:{ all -> 0x0111 }
        L_0x01b9:
            gke r6 = new gke     // Catch:{ all -> 0x0111 }
            r6.<init>()     // Catch:{ all -> 0x0111 }
            r7.g(r6)     // Catch:{ all -> 0x0111 }
            java.lang.Short r6 = java.lang.Short.valueOf(r10)     // Catch:{ all -> 0x0111 }
            r15.remove(r6)     // Catch:{ all -> 0x0111 }
            r2.o(r0)     // Catch:{ all -> 0x0111 }
            goto L_0x010c
        L_0x01cd:
            x9d r1 = r1.b     // Catch:{ all -> 0x0111 }
            ds7 r19 = defpackage.ds7.EXCEPTION     // Catch:{ all -> 0x0111 }
            long r20 = r7.i()     // Catch:{ all -> 0x0111 }
            short r23 = r12.N()     // Catch:{ all -> 0x0111 }
            java.lang.String r25 = r0.getMessage()     // Catch:{ all -> 0x0111 }
            r24 = 1
            r18 = r1
            r22 = r10
            r18.m(r19, r20, r22, r23, r24, r25)     // Catch:{ all -> 0x0111 }
            gke r1 = new gke     // Catch:{ all -> 0x0111 }
            r1.<init>()     // Catch:{ all -> 0x0111 }
            r7.g(r1)     // Catch:{ all -> 0x0111 }
            java.lang.Short r1 = java.lang.Short.valueOf(r10)     // Catch:{ all -> 0x0111 }
            r15.remove(r1)     // Catch:{ all -> 0x0111 }
            r1 = 0
            r2.p(r1)     // Catch:{ all -> 0x0111 }
            r6 = r17
            r6.set(r1)     // Catch:{ all -> 0x0111 }
            r2.n()     // Catch:{ all -> 0x0111 }
            r2.o(r0)     // Catch:{ all -> 0x0111 }
            r3.add(r5)
            goto L_0x0268
        L_0x0208:
            r3.add(r5)
            throw r0
        L_0x020c:
            r6 = r11
            r7 = r10
            if (r0 != r7) goto L_0x001f
            yoa r7 = r5.d
            if (r7 == 0) goto L_0x001f
            x9d r8 = r1.b     // Catch:{ IOException -> 0x0238 }
            ds7 r9 = defpackage.ds7.SEND_ACK     // Catch:{ IOException -> 0x0238 }
            short r12 = r7.c     // Catch:{ IOException -> 0x0238 }
            short r13 = r7.d     // Catch:{ IOException -> 0x0238 }
            java.lang.String r15 = ""
            r10 = 0
            r14 = 1
            r8.m(r9, r10, r12, r13, r14, r15)     // Catch:{ IOException -> 0x0238 }
            short r0 = r7.c     // Catch:{ IOException -> 0x0238 }
            byte[] r0 = r7.b(r0)     // Catch:{ IOException -> 0x0238 }
            java.io.DataOutputStream r8 = r2.r     // Catch:{ IOException -> 0x0238 }
            int r9 = r0.length     // Catch:{ IOException -> 0x0238 }
            r10 = 0
            r8.write(r0, r10, r9)     // Catch:{ IOException -> 0x0238 }
        L_0x0231:
            r3.add(r5)
            goto L_0x001f
        L_0x0236:
            r0 = move-exception
            goto L_0x0259
        L_0x0238:
            r0 = move-exception
            x9d r8 = r1.b     // Catch:{ all -> 0x0236 }
            ds7 r9 = defpackage.ds7.EXCEPTION     // Catch:{ all -> 0x0236 }
            short r12 = r7.c     // Catch:{ all -> 0x0236 }
            short r13 = r7.d     // Catch:{ all -> 0x0236 }
            java.lang.String r15 = r0.getMessage()     // Catch:{ all -> 0x0236 }
            r10 = 0
            r14 = 1
            r8.m(r9, r10, r12, r13, r14, r15)     // Catch:{ all -> 0x0236 }
            r7 = 0
            r2.p(r7)     // Catch:{ all -> 0x0236 }
            r6.set(r7)     // Catch:{ all -> 0x0236 }
            r2.n()     // Catch:{ all -> 0x0236 }
            r2.o(r0)     // Catch:{ all -> 0x0236 }
            goto L_0x0231
        L_0x0259:
            r3.add(r5)
            throw r0
        L_0x025d:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "packet_sender, detect INACTIVE session or has NO connection"
            defpackage.hm9.k0(r8, r6, r1, r0)
        L_0x0268:
            java.util.List r0 = r2.w
            r0.removeAll(r3)
            r3.clear()
        L_0x0270:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9d.c():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: qke} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: pke} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: qke} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v22, resolved type: qke} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(defpackage.yoa r27, byte[] r28) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            r3 = 1
            x9d r4 = r1.b
            java.util.concurrent.ConcurrentHashMap r0 = r4.v
            short r5 = r2.c
            java.lang.Short r6 = java.lang.Short.valueOf(r5)
            java.lang.Object r0 = r0.get(r6)
            r6 = r0
            zoa r6 = (defpackage.zoa) r6
            java.lang.String r0 = r4.a
            r8 = 0
            if (r6 == 0) goto L_0x029f
            dke r9 = r6.a
            byte r10 = r2.b
            if (r10 == r3) goto L_0x0290
            r11 = 3
            if (r10 == r11) goto L_0x0036
            java.lang.String r1 = "illegal state in handleResponse, cmd: "
            java.lang.String r1 = defpackage.zr6.h(r10, r1)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            defpackage.hm9.p(r0, r1, r2)
            r4.o(r2)
            return
        L_0x0036:
            fle r0 = defpackage.gle.b
            gy8 r10 = defpackage.vw8.a(r28)
            java.lang.String r11 = "payloadCatching catch error"
            java.lang.String r12 = "ServerPayload/PayloadCatching"
            boolean r0 = r10.m()
            if (r0 == 0) goto L_0x0240
            int r0 = defpackage.lz7.N(r10)     // Catch:{ all -> 0x004c }
            r13 = r0
            goto L_0x007c
        L_0x004c:
            r0 = move-exception
            r13 = r0
            defpackage.hm9.l0(r12, r11, r13)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0057:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x006a
            java.lang.Object r14 = r0.next()
            r4a r14 = (defpackage.r4a) r14
            r14.getClass()
            defpackage.r4a.a(r13)
            goto L_0x0057
        L_0x006a:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x007b
            if (r0 == r3) goto L_0x007a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x007a:
            throw r13
        L_0x007b:
            r13 = r8
        L_0x007c:
            r14 = r8
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x0086:
            if (r14 >= r13) goto L_0x0237
            java.lang.String r0 = defpackage.lz7.P(r10)     // Catch:{ all -> 0x008d }
            goto L_0x00bd
        L_0x008d:
            r0 = move-exception
            r7 = r0
            defpackage.hm9.l0(r12, r11, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0098:
            boolean r20 = r0.hasNext()
            if (r20 == 0) goto L_0x00ab
            java.lang.Object r20 = r0.next()
            r4a r20 = (defpackage.r4a) r20
            r20.getClass()
            defpackage.r4a.a(r7)
            goto L_0x0098
        L_0x00ab:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x00bc
            if (r0 == r3) goto L_0x00bb
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00bb:
            throw r7
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            if (r0 != 0) goto L_0x00c1
            goto L_0x0234
        L_0x00c1:
            int r7 = r0.hashCode()
            switch(r7) {
                case -1724546052: goto L_0x01c5;
                case 96784904: goto L_0x0187;
                case 110371416: goto L_0x0148;
                case 954925063: goto L_0x0109;
                case 1122960396: goto L_0x00ca;
                default: goto L_0x00c8;
            }
        L_0x00c8:
            goto L_0x01cd
        L_0x00ca:
            java.lang.String r7 = "localizedMessage"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x00d4
            goto L_0x01cd
        L_0x00d4:
            java.lang.String r19 = defpackage.lz7.P(r10)     // Catch:{ all -> 0x00da }
            goto L_0x0234
        L_0x00da:
            r0 = move-exception
            r7 = r0
            defpackage.hm9.l0(r12, r11, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00e5:
            boolean r20 = r0.hasNext()
            if (r20 == 0) goto L_0x00f8
            java.lang.Object r20 = r0.next()
            r4a r20 = (defpackage.r4a) r20
            r20.getClass()
            defpackage.r4a.a(r7)
            goto L_0x00e5
        L_0x00f8:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0234
            if (r0 == r3) goto L_0x0108
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0108:
            throw r7
        L_0x0109:
            java.lang.String r7 = "message"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0113
            goto L_0x01cd
        L_0x0113:
            java.lang.String r16 = defpackage.lz7.P(r10)     // Catch:{ all -> 0x0119 }
            goto L_0x0234
        L_0x0119:
            r0 = move-exception
            r7 = r0
            defpackage.hm9.l0(r12, r11, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0124:
            boolean r20 = r0.hasNext()
            if (r20 == 0) goto L_0x0137
            java.lang.Object r20 = r0.next()
            r4a r20 = (defpackage.r4a) r20
            r20.getClass()
            defpackage.r4a.a(r7)
            goto L_0x0124
        L_0x0137:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0234
            if (r0 == r3) goto L_0x0147
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0147:
            throw r7
        L_0x0148:
            java.lang.String r7 = "title"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0152
            goto L_0x01cd
        L_0x0152:
            java.lang.String r18 = defpackage.lz7.P(r10)     // Catch:{ all -> 0x0158 }
            goto L_0x0234
        L_0x0158:
            r0 = move-exception
            r7 = r0
            defpackage.hm9.l0(r12, r11, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0163:
            boolean r20 = r0.hasNext()
            if (r20 == 0) goto L_0x0176
            java.lang.Object r20 = r0.next()
            r4a r20 = (defpackage.r4a) r20
            r20.getClass()
            defpackage.r4a.a(r7)
            goto L_0x0163
        L_0x0176:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0234
            if (r0 == r3) goto L_0x0186
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0186:
            throw r7
        L_0x0187:
            java.lang.String r7 = "error"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0190
            goto L_0x01cd
        L_0x0190:
            java.lang.String r15 = defpackage.lz7.P(r10)     // Catch:{ all -> 0x0196 }
            goto L_0x0234
        L_0x0196:
            r0 = move-exception
            r7 = r0
            defpackage.hm9.l0(r12, r11, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01a1:
            boolean r20 = r0.hasNext()
            if (r20 == 0) goto L_0x01b4
            java.lang.Object r20 = r0.next()
            r4a r20 = (defpackage.r4a) r20
            r20.getClass()
            defpackage.r4a.a(r7)
            goto L_0x01a1
        L_0x01b4:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0234
            if (r0 == r3) goto L_0x01c4
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01c4:
            throw r7
        L_0x01c5:
            java.lang.String r7 = "description"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0200
        L_0x01cd:
            r10.z()     // Catch:{ all -> 0x01d1 }
            goto L_0x0234
        L_0x01d1:
            r0 = move-exception
            r7 = r0
            defpackage.hm9.l0(r12, r11, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01dc:
            boolean r20 = r0.hasNext()
            if (r20 == 0) goto L_0x01ef
            java.lang.Object r20 = r0.next()
            r4a r20 = (defpackage.r4a) r20
            r20.getClass()
            defpackage.r4a.a(r7)
            goto L_0x01dc
        L_0x01ef:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0234
            if (r0 == r3) goto L_0x01ff
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01ff:
            throw r7
        L_0x0200:
            java.lang.String r17 = defpackage.lz7.P(r10)     // Catch:{ all -> 0x0205 }
            goto L_0x0234
        L_0x0205:
            r0 = move-exception
            r7 = r0
            defpackage.hm9.l0(r12, r11, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0210:
            boolean r20 = r0.hasNext()
            if (r20 == 0) goto L_0x0223
            java.lang.Object r20 = r0.next()
            r4a r20 = (defpackage.r4a) r20
            r20.getClass()
            defpackage.r4a.a(r7)
            goto L_0x0210
        L_0x0223:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0234
            if (r0 == r3) goto L_0x0233
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0233:
            throw r7
        L_0x0234:
            int r14 = r14 + r3
            goto L_0x0086
        L_0x0237:
            r0 = r16
            r25 = r17
            r24 = r18
            r7 = r19
            goto L_0x0247
        L_0x0240:
            r0 = 0
            r7 = 0
            r15 = 0
            r24 = 0
            r25 = 0
        L_0x0247:
            if (r25 == 0) goto L_0x0257
            qke r10 = new qke
            r20 = r10
            r21 = r15
            r22 = r0
            r23 = r7
            r20.<init>(r21, r22, r23, r24, r25)
            goto L_0x025c
        L_0x0257:
            pke r10 = new pke
            r10.<init>(r15, r0, r7)
        L_0x025c:
            ds7 r12 = defpackage.ds7.ERROR
            long r13 = r9.i()
            bpa r0 = r6.b
            apa r0 = r0.b
            dle r0 = r0.a
            short r16 = r0.N()
            java.lang.String r18 = r10.toString()
            r17 = 0
            short r15 = r2.c
            x9d r11 = r1.b
            r11.m(r12, r13, r15, r16, r17, r18)
            java.lang.String r0 = "proto.state"
            java.lang.String r1 = r10.b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x028c
            boolean r0 = r4.g()
            if (r0 == 0) goto L_0x028c
            r4.h(r3, r8)
        L_0x028c:
            r9.g(r10)
            goto L_0x0295
        L_0x0290:
            r0 = r28
            r1.e(r0, r2, r9)
        L_0x0295:
            java.util.concurrent.ConcurrentHashMap r0 = r4.v
            java.lang.Short r1 = java.lang.Short.valueOf(r5)
            r0.remove(r1)
            goto L_0x02ab
        L_0x029f:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r8)
            java.lang.String r2 = "illegal state in handleResponse, reader task is null"
            r3 = 0
            defpackage.hm9.k0(r0, r3, r2, r1)
        L_0x02ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9d.d(yoa, byte[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v435, resolved type: mp3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v436, resolved type: mp3} */
    /* JADX WARNING: type inference failed for: r16v1, types: [gle] */
    /* JADX WARNING: type inference failed for: r16v2, types: [gle] */
    /* JADX WARNING: type inference failed for: r16v3, types: [gle] */
    /* JADX WARNING: type inference failed for: r16v4, types: [gle] */
    /* JADX WARNING: type inference failed for: r16v5, types: [gle] */
    /* JADX WARNING: type inference failed for: r16v6, types: [gle] */
    /* JADX WARNING: type inference failed for: r16v7, types: [uq2] */
    /* JADX WARNING: type inference failed for: r16v8, types: [fn1] */
    /* JADX WARNING: type inference failed for: r16v9, types: [gle] */
    /* JADX WARNING: type inference failed for: r16v10, types: [us9] */
    /* JADX WARNING: type inference failed for: r16v11, types: [gle] */
    /* JADX WARNING: type inference failed for: r16v12, types: [te9] */
    /* JADX WARNING: type inference failed for: r16v13, types: [gle] */
    /* JADX WARNING: type inference failed for: r16v14, types: [gle] */
    /* JADX WARNING: type inference failed for: r16v15, types: [gle] */
    /* JADX WARNING: type inference failed for: r16v16, types: [gle] */
    /* JADX WARNING: type inference failed for: r16v17, types: [gf9] */
    /* JADX WARNING: type inference failed for: r16v18, types: [we9] */
    /* JADX WARNING: type inference failed for: r16v19, types: [mf9] */
    /* JADX WARNING: type inference failed for: r16v20, types: [qe9] */
    /* JADX WARNING: type inference failed for: r16v21, types: [gle] */
    /* JADX WARNING: type inference failed for: r0v125, types: [gle, up3] */
    /* JADX WARNING: type inference failed for: r0v127, types: [gle, iq3] */
    /* JADX WARNING: type inference failed for: r0v128, types: [gle, hn3] */
    /* JADX WARNING: type inference failed for: r0v129, types: [gle, xp3] */
    /* JADX WARNING: type inference failed for: r16v22, types: [gle] */
    /* JADX WARNING: type inference failed for: r16v23, types: [gle] */
    /* JADX WARNING: type inference failed for: r16v24, types: [gle] */
    /* JADX WARNING: type inference failed for: r0v134, types: [gle, lc2] */
    /* JADX WARNING: type inference failed for: r0v136, types: [dc2] */
    /* JADX WARNING: type inference failed for: r0v225, types: [z70] */
    /* JADX WARNING: type inference failed for: r0v275 */
    /* JADX WARNING: type inference failed for: r0v277, types: [y70] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0664, code lost:
        r9.z();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:864:0x0e43  */
    /* JADX WARNING: Removed duplicated region for block: B:868:0x0e55  */
    /* JADX WARNING: Removed duplicated region for block: B:876:0x0e6e  */
    /* JADX WARNING: Removed duplicated region for block: B:880:0x0e87  */
    /* JADX WARNING: Removed duplicated region for block: B:882:0x0ec0  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(byte[] r34, defpackage.yoa r35, defpackage.dke r36) {
        /*
            r33 = this;
            r1 = r33
            r2 = r35
            r3 = r36
            r6 = 1
            byte r0 = r2.b
            if (r0 != r6) goto L_0x0011
            ds7 r0 = defpackage.ds7.RECEIVE
        L_0x000d:
            r8 = r0
            r0 = r34
            goto L_0x0014
        L_0x0011:
            ds7 r0 = defpackage.ds7.NOTIF
            goto L_0x000d
        L_0x0014:
            int r7 = r0.length
            if (r7 <= 0) goto L_0x0ef8
            short r7 = r2.d
            fle r9 = defpackage.gle.b
            gy8 r9 = defpackage.vw8.a(r34)
            yb9 r0 = defpackage.sla.c
            nz4 r10 = defpackage.nz4.a
            r0 = 18
            java.lang.String r13 = "token"
            java.lang.String r14 = "ServerPayload/PayloadCatching"
            java.lang.String r15 = "payloadCatching catch error"
            r16 = 0
            if (r7 != r0) goto L_0x02d5
            boolean r0 = r9.m()
            if (r0 != 0) goto L_0x0039
        L_0x0035:
            r23 = r8
            goto L_0x02d1
        L_0x0039:
            int r0 = defpackage.lz7.N(r9)     // Catch:{ all -> 0x003f }
            r7 = r0
            goto L_0x006f
        L_0x003f:
            r0 = move-exception
            r7 = r0
            defpackage.hm9.l0(r14, r15, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x004a:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L_0x005d
            java.lang.Object r17 = r0.next()
            r4a r17 = (defpackage.r4a) r17
            r17.getClass()
            defpackage.r4a.a(r7)
            goto L_0x004a
        L_0x005d:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x006e
            if (r0 == r6) goto L_0x006d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x006d:
            throw r7
        L_0x006e:
            r7 = 0
        L_0x006f:
            if (r7 != 0) goto L_0x0072
            goto L_0x0035
        L_0x0072:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r11 = 0
        L_0x007d:
            if (r11 >= r7) goto L_0x02c8
            java.lang.String r0 = defpackage.lz7.P(r9)     // Catch:{ all -> 0x0084 }
            goto L_0x00b5
        L_0x0084:
            r0 = move-exception
            r12 = r0
            defpackage.hm9.l0(r14, r15, r12)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x008f:
            boolean r18 = r0.hasNext()
            if (r18 == 0) goto L_0x00a2
            java.lang.Object r18 = r0.next()
            r4a r18 = (defpackage.r4a) r18
            r18.getClass()
            defpackage.r4a.a(r12)
            goto L_0x008f
        L_0x00a2:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x00b3
            if (r0 == r6) goto L_0x00b2
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00b2:
            throw r12
        L_0x00b3:
            r0 = r16
        L_0x00b5:
            if (r0 != 0) goto L_0x00c0
            r2 = r6
            r34 = r7
            r23 = r8
            r19 = r10
            goto L_0x02ba
        L_0x00c0:
            java.lang.String r12 = "tokenAttrs"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x0271
            int r0 = defpackage.lz7.N(r9)     // Catch:{ all -> 0x00d1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d1 }
            goto L_0x0101
        L_0x00d1:
            r0 = move-exception
            defpackage.hm9.l0(r14, r15, r0)
            java.util.concurrent.CopyOnWriteArraySet r12 = defpackage.u7d.a
            java.util.Iterator r12 = r12.iterator()
        L_0x00db:
            boolean r18 = r12.hasNext()
            if (r18 == 0) goto L_0x00ee
            java.lang.Object r18 = r12.next()
            r4a r18 = (defpackage.r4a) r18
            r18.getClass()
            defpackage.r4a.a(r0)
            goto L_0x00db
        L_0x00ee:
            int r12 = defpackage.k7d.a
            int r12 = defpackage.au1.s(r12)
            if (r12 == 0) goto L_0x00ff
            if (r12 == r6) goto L_0x00fe
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00fe:
            throw r0
        L_0x00ff:
            r0 = r16
        L_0x0101:
            if (r0 == 0) goto L_0x0269
            int r12 = r0.intValue()
            r6 = 0
        L_0x0108:
            if (r6 >= r12) goto L_0x0262
            java.lang.String r0 = defpackage.lz7.P(r9)     // Catch:{ all -> 0x0114 }
            r34 = r7
            r19 = r10
            r7 = r0
            goto L_0x014a
        L_0x0114:
            r0 = move-exception
            r34 = r7
            r7 = r0
            defpackage.hm9.l0(r14, r15, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0121:
            boolean r19 = r0.hasNext()
            if (r19 == 0) goto L_0x0134
            java.lang.Object r19 = r0.next()
            r4a r19 = (defpackage.r4a) r19
            r19.getClass()
            defpackage.r4a.a(r7)
            goto L_0x0121
        L_0x0134:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0146
            r10 = 1
            if (r0 == r10) goto L_0x0145
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0145:
            throw r7
        L_0x0146:
            r19 = r10
            r7 = r16
        L_0x014a:
            if (r7 != 0) goto L_0x0153
            r23 = r8
            r20 = r12
            r2 = 1
            goto L_0x0253
        L_0x0153:
            int r10 = r9.x0()
            r20 = r12
            r21 = r16
            r12 = 0
        L_0x015c:
            if (r12 >= r10) goto L_0x0247
            java.lang.String r0 = defpackage.lz7.P(r9)     // Catch:{ all -> 0x0167 }
            r23 = r8
            r22 = r10
            goto L_0x019d
        L_0x0167:
            r0 = move-exception
            r22 = r10
            r10 = r0
            defpackage.hm9.l0(r14, r15, r10)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0174:
            boolean r23 = r0.hasNext()
            if (r23 == 0) goto L_0x0187
            java.lang.Object r23 = r0.next()
            r4a r23 = (defpackage.r4a) r23
            r23.getClass()
            defpackage.r4a.a(r10)
            goto L_0x0174
        L_0x0187:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0199
            r8 = 1
            if (r0 == r8) goto L_0x0198
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0198:
            throw r10
        L_0x0199:
            r23 = r8
            r0 = r16
        L_0x019d:
            boolean r8 = defpackage.tpa.f(r0, r13)
            if (r8 == 0) goto L_0x01de
            java.lang.String r0 = defpackage.lz7.P(r9)     // Catch:{ all -> 0x01aa }
            r21 = r0
            goto L_0x01dc
        L_0x01aa:
            r0 = move-exception
            r8 = r0
            defpackage.hm9.l0(r14, r15, r8)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01b5:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x01c8
            java.lang.Object r10 = r0.next()
            r4a r10 = (defpackage.r4a) r10
            r10.getClass()
            defpackage.r4a.a(r8)
            goto L_0x01b5
        L_0x01c8:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x01da
            r10 = 1
            if (r0 == r10) goto L_0x01d9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01d9:
            throw r8
        L_0x01da:
            r21 = r16
        L_0x01dc:
            r2 = 1
            goto L_0x023c
        L_0x01de:
            java.lang.String r8 = "tokenTtl"
            boolean r0 = defpackage.tpa.f(r0, r8)
            if (r0 == 0) goto L_0x0238
            boolean r0 = r9.m()
            if (r0 == 0) goto L_0x0232
            org.msgpack.core.buffer.MessageBuffer r0 = r9.s0
            int r8 = r9.t0
            byte r0 = r0.getByte(r8)
            r8 = -64
            if (r0 != r8) goto L_0x01fc
            r9.readByte()
            goto L_0x01dc
        L_0x01fc:
            r2 = 0
            defpackage.lz7.M(r9, r2)     // Catch:{ all -> 0x0202 }
            goto L_0x01dc
        L_0x0202:
            r0 = move-exception
            r2 = r0
            defpackage.hm9.l0(r14, r15, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x020d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0220
            java.lang.Object r3 = r0.next()
            r4a r3 = (defpackage.r4a) r3
            r3.getClass()
            defpackage.r4a.a(r2)
            goto L_0x020d
        L_0x0220:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x01dc
            r3 = 1
            if (r0 == r3) goto L_0x0231
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0231:
            throw r2
        L_0x0232:
            org.msgpack.core.MessageInsufficientBufferException r0 = new org.msgpack.core.MessageInsufficientBufferException
            r0.<init>()
            throw r0
        L_0x0238:
            r9.z()
            goto L_0x01dc
        L_0x023c:
            int r12 = r12 + r2
            r2 = r35
            r3 = r36
            r10 = r22
            r8 = r23
            goto L_0x015c
        L_0x0247:
            r23 = r8
            r2 = 1
            if (r21 != 0) goto L_0x024e
            java.lang.String r21 = ""
        L_0x024e:
            r0 = r21
            r4.put(r7, r0)
        L_0x0253:
            int r6 = r6 + r2
            r7 = r34
            r2 = r35
            r3 = r36
            r10 = r19
            r12 = r20
            r8 = r23
            goto L_0x0108
        L_0x0262:
            r34 = r7
            r23 = r8
            r19 = r10
            goto L_0x02b9
        L_0x0269:
            r34 = r7
            r23 = r8
            r19 = r10
            r2 = r6
            goto L_0x02ba
        L_0x0271:
            r34 = r7
            r23 = r8
            r19 = r10
            java.lang.String r2 = "presetAvatars"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x02b6
            av8 r0 = r9.n()
            int r0 = r0.a()
            r2 = 7
            if (r0 != r2) goto L_0x02a0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r9.s0()
            r3 = 0
        L_0x0294:
            if (r3 >= r2) goto L_0x02a5
            xo9 r6 = defpackage.z04.S(r9)
            r0.add(r6)
            r6 = 1
            int r3 = r3 + r6
            goto L_0x0294
        L_0x02a0:
            r9.z()
            r0 = r16
        L_0x02a5:
            if (r0 == 0) goto L_0x02ac
            java.util.List r0 = defpackage.x53.e0(r0)
            goto L_0x02ae
        L_0x02ac:
            r0 = r16
        L_0x02ae:
            if (r0 != 0) goto L_0x02b2
            r0 = r19
        L_0x02b2:
            r5.addAll(r0)
            goto L_0x02b9
        L_0x02b6:
            r9.z()
        L_0x02b9:
            r2 = 1
        L_0x02ba:
            int r11 = r11 + r2
            r7 = r34
            r3 = r36
            r6 = r2
            r10 = r19
            r8 = r23
            r2 = r35
            goto L_0x007d
        L_0x02c8:
            r23 = r8
            y70 r0 = new y70
            r0.<init>(r4, r5)
        L_0x02cf:
            r16 = r0
        L_0x02d1:
            r0 = r16
            goto L_0x0e3f
        L_0x02d5:
            r23 = r8
            r19 = r10
            r0 = 23
            if (r7 != r0) goto L_0x04ab
            boolean r0 = r9.m()
            if (r0 != 0) goto L_0x02e4
            goto L_0x02d1
        L_0x02e4:
            int r0 = defpackage.lz7.N(r9)     // Catch:{ all -> 0x02ea }
            r2 = r0
            goto L_0x031b
        L_0x02ea:
            r0 = move-exception
            r2 = r0
            defpackage.hm9.l0(r14, r15, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x02f5:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0308
            java.lang.Object r3 = r0.next()
            r4a r3 = (defpackage.r4a) r3
            r3.getClass()
            defpackage.r4a.a(r2)
            goto L_0x02f5
        L_0x0308:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x031a
            r3 = 1
            if (r0 == r3) goto L_0x0319
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0319:
            throw r2
        L_0x031a:
            r2 = 0
        L_0x031b:
            if (r2 != 0) goto L_0x031e
            goto L_0x02d1
        L_0x031e:
            fu7 r3 = defpackage.fu7.LOGIN
            r7 = r3
            r5 = r16
            r6 = r5
            r8 = r6
            r4 = 0
        L_0x0326:
            if (r4 >= r2) goto L_0x049e
            java.lang.String r0 = defpackage.lz7.P(r9)     // Catch:{ all -> 0x032d }
            goto L_0x035f
        L_0x032d:
            r0 = move-exception
            r10 = r0
            defpackage.hm9.l0(r14, r15, r10)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0338:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x034b
            java.lang.Object r11 = r0.next()
            r4a r11 = (defpackage.r4a) r11
            r11.getClass()
            defpackage.r4a.a(r10)
            goto L_0x0338
        L_0x034b:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x035d
            r11 = 1
            if (r0 == r11) goto L_0x035c
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x035c:
            throw r10
        L_0x035d:
            r0 = r16
        L_0x035f:
            if (r0 != 0) goto L_0x0364
        L_0x0361:
            r10 = 1
            goto L_0x049b
        L_0x0364:
            int r10 = r0.hashCode()
            switch(r10) {
                case -309425751: goto L_0x0488;
                case 110541305: goto L_0x0447;
                case 141498579: goto L_0x03b0;
                case 329221358: goto L_0x036d;
                default: goto L_0x036b;
            }
        L_0x036b:
            goto L_0x0490
        L_0x036d:
            java.lang.String r10 = "userToken"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0377
            goto L_0x0490
        L_0x0377:
            java.lang.String r0 = defpackage.lz7.P(r9)     // Catch:{ all -> 0x037d }
            r8 = r0
            goto L_0x0361
        L_0x037d:
            r0 = move-exception
            r8 = r0
            defpackage.hm9.l0(r14, r15, r8)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0388:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x039b
            java.lang.Object r10 = r0.next()
            r4a r10 = (defpackage.r4a) r10
            r10.getClass()
            defpackage.r4a.a(r8)
            goto L_0x0388
        L_0x039b:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x03ad
            r10 = 1
            if (r0 == r10) goto L_0x03ac
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03ac:
            throw r8
        L_0x03ad:
            r8 = r16
            goto L_0x0361
        L_0x03b0:
            java.lang.String r10 = "tokenType"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x03ba
            goto L_0x0490
        L_0x03ba:
            java.lang.String r0 = defpackage.lz7.P(r9)     // Catch:{ all -> 0x03bf }
            goto L_0x03f1
        L_0x03bf:
            r0 = move-exception
            r7 = r0
            defpackage.hm9.l0(r14, r15, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x03ca:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x03dd
            java.lang.Object r10 = r0.next()
            r4a r10 = (defpackage.r4a) r10
            r10.getClass()
            defpackage.r4a.a(r7)
            goto L_0x03ca
        L_0x03dd:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x03ef
            r10 = 1
            if (r0 == r10) goto L_0x03ee
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03ee:
            throw r7
        L_0x03ef:
            r0 = r16
        L_0x03f1:
            r0.getClass()
            r7 = -1
            int r10 = r0.hashCode()
            switch(r10) {
                case -1154090892: goto L_0x041e;
                case -94752593: goto L_0x0413;
                case -16486507: goto L_0x0408;
                case 72611657: goto L_0x03fd;
                default: goto L_0x03fc;
            }
        L_0x03fc:
            goto L_0x0428
        L_0x03fd:
            java.lang.String r10 = "LOGIN"
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L_0x0406
            goto L_0x0428
        L_0x0406:
            r7 = 3
            goto L_0x0428
        L_0x0408:
            java.lang.String r10 = "RECOVERY"
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L_0x0411
            goto L_0x0428
        L_0x0411:
            r7 = 2
            goto L_0x0428
        L_0x0413:
            java.lang.String r10 = "PHONE_CONFIRM"
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L_0x041c
            goto L_0x0428
        L_0x041c:
            r7 = 1
            goto L_0x0428
        L_0x041e:
            java.lang.String r10 = "PHONE_BINDING"
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L_0x0427
            goto L_0x0428
        L_0x0427:
            r7 = 0
        L_0x0428:
            switch(r7) {
                case 0: goto L_0x0444;
                case 1: goto L_0x0441;
                case 2: goto L_0x043c;
                case 3: goto L_0x0439;
                default: goto L_0x042b;
            }
        L_0x042b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "No such value "
            java.lang.String r3 = " for LoginTokenType"
            java.lang.String r0 = defpackage.zr6.i(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x0439:
            r7 = r3
            goto L_0x0361
        L_0x043c:
            fu7 r0 = defpackage.fu7.RECOVERY
        L_0x043e:
            r7 = r0
            goto L_0x0361
        L_0x0441:
            fu7 r0 = defpackage.fu7.PHONE_CONFIRM
            goto L_0x043e
        L_0x0444:
            fu7 r0 = defpackage.fu7.PHONE_BINDING
            goto L_0x043e
        L_0x0447:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0490
            java.lang.String r0 = defpackage.lz7.P(r9)     // Catch:{ all -> 0x0454 }
            r6 = r0
            goto L_0x0361
        L_0x0454:
            r0 = move-exception
            r6 = r0
            defpackage.hm9.l0(r14, r15, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x045f:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x0472
            java.lang.Object r10 = r0.next()
            r4a r10 = (defpackage.r4a) r10
            r10.getClass()
            defpackage.r4a.a(r6)
            goto L_0x045f
        L_0x0472:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0484
            r10 = 1
            if (r0 == r10) goto L_0x0483
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0483:
            throw r6
        L_0x0484:
            r6 = r16
            goto L_0x0361
        L_0x0488:
            java.lang.String r10 = "profile"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0495
        L_0x0490:
            r9.z()
            goto L_0x0361
        L_0x0495:
            nab r5 = defpackage.nd7.C(r9)
            goto L_0x0361
        L_0x049b:
            int r4 = r4 + r10
            goto L_0x0326
        L_0x049e:
            if (r6 == 0) goto L_0x02d1
            z70 r0 = new z70
            if (r5 != 0) goto L_0x04a6
            goto L_0x02d1
        L_0x04a6:
            r0.<init>(r6, r7, r8, r5)
            goto L_0x02cf
        L_0x04ab:
            r0 = 17
            if (r7 != r0) goto L_0x06b0
            boolean r0 = r9.m()
            if (r0 != 0) goto L_0x04b7
            goto L_0x02d1
        L_0x04b7:
            int r0 = defpackage.lz7.N(r9)     // Catch:{ all -> 0x04bd }
            r2 = r0
            goto L_0x04ee
        L_0x04bd:
            r0 = move-exception
            r2 = r0
            defpackage.hm9.l0(r14, r15, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x04c8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x04db
            java.lang.Object r3 = r0.next()
            r4a r3 = (defpackage.r4a) r3
            r3.getClass()
            defpackage.r4a.a(r2)
            goto L_0x04c8
        L_0x04db:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x04ed
            r3 = 1
            if (r0 == r3) goto L_0x04ec
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04ec:
            throw r2
        L_0x04ed:
            r2 = 0
        L_0x04ee:
            if (r2 != 0) goto L_0x04f2
            goto L_0x02d1
        L_0x04f2:
            r25 = r16
            r3 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r31 = 0
        L_0x04fd:
            if (r3 >= r2) goto L_0x06a5
            java.lang.String r0 = defpackage.lz7.P(r9)     // Catch:{ all -> 0x0504 }
            goto L_0x0536
        L_0x0504:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r14, r15, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x050f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0522
            java.lang.Object r5 = r0.next()
            r4a r5 = (defpackage.r4a) r5
            r5.getClass()
            defpackage.r4a.a(r4)
            goto L_0x050f
        L_0x0522:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0534
            r5 = 1
            if (r0 == r5) goto L_0x0533
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0533:
            throw r4
        L_0x0534:
            r0 = r16
        L_0x0536:
            if (r0 != 0) goto L_0x053a
            goto L_0x05c9
        L_0x053a:
            int r4 = r0.hashCode()
            switch(r4) {
                case -1135546573: goto L_0x065a;
                case -1007074317: goto L_0x0614;
                case 6808551: goto L_0x05d1;
                case 110541305: goto L_0x058a;
                case 575768841: goto L_0x0545;
                default: goto L_0x0541;
            }
        L_0x0541:
            r4 = 0
            goto L_0x0664
        L_0x0545:
            java.lang.String r4 = "requestMaxDuration"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x054e
            goto L_0x0541
        L_0x054e:
            r4 = 0
            long r6 = defpackage.lz7.M(r9, r4)     // Catch:{ all -> 0x0555 }
            goto L_0x0587
        L_0x0555:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r14, r15, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0560:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0573
            java.lang.Object r5 = r0.next()
            r4a r5 = (defpackage.r4a) r5
            r5.getClass()
            defpackage.r4a.a(r4)
            goto L_0x0560
        L_0x0573:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0585
            r5 = 1
            if (r0 == r5) goto L_0x0584
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0584:
            throw r4
        L_0x0585:
            r6 = 0
        L_0x0587:
            r29 = r6
            goto L_0x05c9
        L_0x058a:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0541
            java.lang.String r0 = defpackage.lz7.P(r9)     // Catch:{ all -> 0x0595 }
            goto L_0x05c7
        L_0x0595:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r14, r15, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x05a0:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x05b3
            java.lang.Object r5 = r0.next()
            r4a r5 = (defpackage.r4a) r5
            r5.getClass()
            defpackage.r4a.a(r4)
            goto L_0x05a0
        L_0x05b3:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x05c5
            r5 = 1
            if (r0 == r5) goto L_0x05c4
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x05c4:
            throw r4
        L_0x05c5:
            r0 = r16
        L_0x05c7:
            if (r0 != 0) goto L_0x05ce
        L_0x05c9:
            r4 = 0
        L_0x05cb:
            r7 = 1
            goto L_0x06a2
        L_0x05ce:
            r25 = r0
            goto L_0x05c9
        L_0x05d1:
            java.lang.String r4 = "requestCountLeft"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x05db
            goto L_0x0541
        L_0x05db:
            int r0 = defpackage.lz7.L(r9)     // Catch:{ all -> 0x05e0 }
            goto L_0x0611
        L_0x05e0:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r14, r15, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x05eb:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x05fe
            java.lang.Object r5 = r0.next()
            r4a r5 = (defpackage.r4a) r5
            r5.getClass()
            defpackage.r4a.a(r4)
            goto L_0x05eb
        L_0x05fe:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0610
            r5 = 1
            if (r0 == r5) goto L_0x060f
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x060f:
            throw r4
        L_0x0610:
            r0 = 0
        L_0x0611:
            r31 = r0
            goto L_0x05c9
        L_0x0614:
            java.lang.String r4 = "altActionDuration"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x061e
            goto L_0x0541
        L_0x061e:
            r4 = 0
            long r6 = defpackage.lz7.M(r9, r4)     // Catch:{ all -> 0x0625 }
            goto L_0x0656
        L_0x0625:
            r0 = move-exception
            r6 = r0
            defpackage.hm9.l0(r14, r15, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0630:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0643
            java.lang.Object r7 = r0.next()
            r4a r7 = (defpackage.r4a) r7
            r7.getClass()
            defpackage.r4a.a(r6)
            goto L_0x0630
        L_0x0643:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0655
            r7 = 1
            if (r0 == r7) goto L_0x0654
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0654:
            throw r6
        L_0x0655:
            r6 = r4
        L_0x0656:
            r27 = r6
            goto L_0x05cb
        L_0x065a:
            r4 = 0
            java.lang.String r6 = "codeLength"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0669
        L_0x0664:
            r9.z()
            goto L_0x05cb
        L_0x0669:
            int r0 = defpackage.lz7.L(r9)     // Catch:{ all -> 0x066f }
            r7 = 1
            goto L_0x06a0
        L_0x066f:
            r0 = move-exception
            r6 = r0
            defpackage.hm9.l0(r14, r15, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x067a:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x068d
            java.lang.Object r7 = r0.next()
            r4a r7 = (defpackage.r4a) r7
            r7.getClass()
            defpackage.r4a.a(r6)
            goto L_0x067a
        L_0x068d:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            r7 = 1
            if (r0 == 0) goto L_0x069f
            if (r0 == r7) goto L_0x069e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x069e:
            throw r6
        L_0x069f:
            r0 = 0
        L_0x06a0:
            r26 = r0
        L_0x06a2:
            int r3 = r3 + r7
            goto L_0x04fd
        L_0x06a5:
            if (r25 == 0) goto L_0x02d1
            h80 r16 = new h80
            r24 = r16
            r24.<init>(r25, r26, r27, r29, r31)
            goto L_0x02d1
        L_0x06b0:
            r0 = 49
            if (r7 != r0) goto L_0x07c9
            boolean r0 = r9.m()
            if (r0 != 0) goto L_0x06bc
            goto L_0x02d1
        L_0x06bc:
            int r0 = defpackage.lz7.N(r9)     // Catch:{ all -> 0x06c2 }
            r2 = r0
            goto L_0x06f3
        L_0x06c2:
            r0 = move-exception
            r2 = r0
            defpackage.hm9.l0(r14, r15, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x06cd:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x06e0
            java.lang.Object r3 = r0.next()
            r4a r3 = (defpackage.r4a) r3
            r3.getClass()
            defpackage.r4a.a(r2)
            goto L_0x06cd
        L_0x06e0:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x06f2
            r3 = 1
            if (r0 == r3) goto L_0x06f1
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x06f1:
            throw r2
        L_0x06f2:
            r2 = 0
        L_0x06f3:
            if (r2 != 0) goto L_0x06f7
            goto L_0x02d1
        L_0x06f7:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            r5 = r16
            r10 = r19
            r4 = 0
        L_0x0701:
            if (r4 >= r2) goto L_0x07c2
            java.lang.String r0 = defpackage.lz7.P(r9)     // Catch:{ all -> 0x0708 }
            goto L_0x073a
        L_0x0708:
            r0 = move-exception
            r6 = r0
            defpackage.hm9.l0(r14, r15, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0713:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0726
            java.lang.Object r7 = r0.next()
            r4a r7 = (defpackage.r4a) r7
            r7.getClass()
            defpackage.r4a.a(r6)
            goto L_0x0713
        L_0x0726:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0738
            r7 = 1
            if (r0 == r7) goto L_0x0737
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0737:
            throw r6
        L_0x0738:
            r0 = r16
        L_0x073a:
            if (r0 != 0) goto L_0x073f
        L_0x073c:
            r7 = 1
            goto L_0x07bf
        L_0x073f:
            int r6 = r0.hashCode()
            r7 = -1690743503(0xffffffff9b394d31, float:-1.5327783E-22)
            if (r6 == r7) goto L_0x076e
            r7 = -462094004(0xffffffffe475014c, float:-1.8078183E22)
            if (r6 == r7) goto L_0x0761
            r7 = 3052376(0x2e9358, float:4.27729E-39)
            if (r6 == r7) goto L_0x0753
            goto L_0x0776
        L_0x0753:
            java.lang.String r6 = "chat"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x075c
            goto L_0x0776
        L_0x075c:
            f52 r5 = defpackage.f52.a(r9)
            goto L_0x073c
        L_0x0761:
            java.lang.String r6 = "messages"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0776
            wz r10 = defpackage.wz.e(r9)
            goto L_0x073c
        L_0x076e:
            java.lang.String r6 = "messageIds"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x07aa
        L_0x0776:
            r9.z()     // Catch:{ all -> 0x077a }
            goto L_0x073c
        L_0x077a:
            r0 = move-exception
            r6 = r0
            defpackage.hm9.l0(r14, r15, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0785:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0798
            java.lang.Object r7 = r0.next()
            r4a r7 = (defpackage.r4a) r7
            r7.getClass()
            defpackage.r4a.a(r6)
            goto L_0x0785
        L_0x0798:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x073c
            r7 = 1
            if (r0 == r7) goto L_0x07a9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x07a9:
            throw r6
        L_0x07aa:
            int r0 = defpackage.lz7.G(r9)
            r6 = 0
        L_0x07af:
            if (r6 >= r0) goto L_0x073c
            long r7 = r9.w0()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r3.add(r7)
            r7 = 1
            int r6 = r6 + r7
            goto L_0x07af
        L_0x07bf:
            int r4 = r4 + r7
            goto L_0x0701
        L_0x07c2:
            dc2 r0 = new dc2
            r0.<init>(r10, r5, r3)
            goto L_0x02cf
        L_0x07c9:
            r0 = 48
            if (r7 != r0) goto L_0x07de
            lc2 r0 = new lc2
            r0.<init>(r9)
            java.util.List r2 = r0.c
            if (r2 != 0) goto L_0x0e3f
            java.util.List r2 = java.util.Collections.emptyList()
            r0.c = r2
            goto L_0x0e3f
        L_0x07de:
            r0 = 50
            if (r7 != r0) goto L_0x07ea
            oq9 r0 = defpackage.oq9.c
            gle r16 = r0.w(r9)
            goto L_0x02d1
        L_0x07ea:
            r0 = 34
            if (r7 != r0) goto L_0x07f5
            tq3 r0 = new tq3
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x07f5:
            r0 = 32
            if (r7 != r0) goto L_0x0801
            o84 r0 = defpackage.o84.o
            gle r16 = r0.w(r9)
            goto L_0x02d1
        L_0x0801:
            r0 = 46
            if (r7 != r0) goto L_0x080d
            sp3 r0 = defpackage.sp3.b
            gle r16 = r0.w(r9)
            goto L_0x02d1
        L_0x080d:
            r0 = 35
            if (r7 != r0) goto L_0x0822
            xp3 r0 = new xp3
            r0.<init>(r9)
            java.util.Map r2 = r0.c
            if (r2 != 0) goto L_0x0e3f
            java.util.Map r2 = java.util.Collections.emptyMap()
            r0.c = r2
            goto L_0x0e3f
        L_0x0822:
            r0 = 36
            if (r7 != r0) goto L_0x0837
            hn3 r0 = new hn3
            r0.<init>(r9)
            java.util.List r2 = r0.c
            if (r2 != 0) goto L_0x0e3f
            java.util.List r2 = java.util.Collections.emptyList()
            r0.c = r2
            goto L_0x0e3f
        L_0x0837:
            r0 = 37
            if (r7 != r0) goto L_0x084c
            iq3 r0 = new iq3
            r0.<init>(r9)
            java.util.List r2 = r0.c
            if (r2 != 0) goto L_0x0e3f
            java.util.List r2 = java.util.Collections.emptyList()
            r0.c = r2
            goto L_0x0e3f
        L_0x084c:
            r0 = 38
            if (r7 != r0) goto L_0x0864
            mp3 r0 = new mp3
            r2 = 0
            r0.<init>(r9, r2)
            java.lang.Object r2 = r0.o
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0e3f
            java.util.List r2 = java.util.Collections.emptyList()
            r0.o = r2
            goto L_0x0e3f
        L_0x0864:
            r0 = 39
            if (r7 != r0) goto L_0x0883
            up3 r0 = new up3
            r0.<init>(r9)
            java.util.List r2 = r0.c
            if (r2 != 0) goto L_0x0877
            java.util.List r2 = java.util.Collections.emptyList()
            r0.c = r2
        L_0x0877:
            java.util.List r2 = r0.o
            if (r2 != 0) goto L_0x0e3f
            java.util.List r2 = java.util.Collections.emptyList()
            r0.o = r2
            goto L_0x0e3f
        L_0x0883:
            r0 = 19
            if (r7 != r0) goto L_0x088f
            o84 r0 = defpackage.o84.Y
            gle r16 = r0.w(r9)
            goto L_0x02d1
        L_0x088f:
            fle r0 = defpackage.gle.b
            r2 = 20
            if (r7 != r2) goto L_0x0897
            goto L_0x0e3f
        L_0x0897:
            r2 = 66
            if (r7 != r2) goto L_0x08a1
            qe9 r16 = defpackage.qe9.c(r9)
            goto L_0x02d1
        L_0x08a1:
            r2 = 64
            if (r7 != r2) goto L_0x08ab
            mf9 r16 = defpackage.mf9.c(r9)
            goto L_0x02d1
        L_0x08ab:
            r2 = 65
            if (r7 != r2) goto L_0x08b1
            goto L_0x0e3f
        L_0x08b1:
            r2 = 67
            if (r7 != r2) goto L_0x08bb
            we9 r16 = defpackage.we9.c(r9)
            goto L_0x02d1
        L_0x08bb:
            r2 = 178(0xb2, float:2.5E-43)
            if (r7 != r2) goto L_0x08c5
            gf9 r16 = defpackage.gf9.c(r9)
            goto L_0x02d1
        L_0x08c5:
            r2 = 179(0xb3, float:2.51E-43)
            if (r7 != r2) goto L_0x08d0
            ne9 r0 = new ne9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x08d0:
            r2 = 180(0xb4, float:2.52E-43)
            if (r7 != r2) goto L_0x08dc
            kj6 r0 = defpackage.kj6.X
            gle r16 = r0.w(r9)
            goto L_0x02d1
        L_0x08dc:
            r2 = 181(0xb5, float:2.54E-43)
            if (r7 != r2) goto L_0x08e7
            ye9 r0 = new ye9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x08e7:
            r2 = 52
            if (r7 != r2) goto L_0x08ed
            goto L_0x0e3f
        L_0x08ed:
            r2 = 54
            if (r7 != r2) goto L_0x08f3
            goto L_0x0e3f
        L_0x08f3:
            sla r2 = defpackage.sla.NOTIF_CONTACT
            short r2 = r2.a
            if (r7 != r2) goto L_0x0900
            vr9 r0 = new vr9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0900:
            sla r2 = defpackage.sla.NOTIF_MARK
            short r3 = r2.a
            if (r7 != r3) goto L_0x090e
            s43 r0 = r2.b
            gle r16 = r0.w(r9)
            goto L_0x02d1
        L_0x090e:
            sla r2 = defpackage.sla.NOTIF_MESSAGE
            short r3 = r2.a
            if (r7 != r3) goto L_0x091c
            s43 r0 = r2.b
            gle r16 = r0.w(r9)
            goto L_0x02d1
        L_0x091c:
            sla r2 = defpackage.sla.NOTIF_PRESENCE
            short r2 = r2.a
            if (r7 != r2) goto L_0x0929
            xs9 r0 = new xs9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0929:
            sla r2 = defpackage.sla.NOTIF_CONFIG
            short r2 = r2.a
            if (r7 != r2) goto L_0x0936
            tr9 r0 = new tr9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0936:
            sla r2 = defpackage.sla.NOTIF_TYPING
            short r2 = r2.a
            if (r7 != r2) goto L_0x0943
            at9 r0 = new at9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0943:
            sla r2 = defpackage.sla.NOTIF_CHAT
            short r2 = r2.a
            if (r7 != r2) goto L_0x0950
            rr9 r0 = new rr9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0950:
            sla r2 = defpackage.sla.NOTIF_ATTACH
            short r2 = r2.a
            if (r7 != r2) goto L_0x095d
            nr9 r0 = new nr9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x095d:
            r2 = 80
            if (r7 != r2) goto L_0x0968
            gwa r0 = new gwa
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0968:
            r2 = 1
            if (r7 != r2) goto L_0x096d
            goto L_0x0e3f
        L_0x096d:
            r2 = 16
            if (r7 != r2) goto L_0x0978
            wcb r0 = new wcb
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0978:
            r2 = 21
            if (r7 != r2) goto L_0x0983
            ahe r0 = new ahe
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0983:
            sla r2 = defpackage.sla.CONFIG
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0992
            fe3 r0 = new fe3
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0992:
            sla r2 = defpackage.sla.CHAT_SEARCH
            short r2 = r2.c()
            if (r7 != r2) goto L_0x09a1
            sq2 r0 = new sq2
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x09a1:
            sla r2 = defpackage.sla.MSG_SEARCH
            short r2 = r2.c()
            if (r7 != r2) goto L_0x09b0
            if9 r0 = new if9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x09b0:
            sla r2 = defpackage.sla.SEARCH_FEEDBACK
            short r2 = r2.c()
            if (r7 != r2) goto L_0x09ba
            goto L_0x0e3f
        L_0x09ba:
            sla r2 = defpackage.sla.MSG_SHARE_PREVIEW
            short r2 = r2.c()
            if (r7 != r2) goto L_0x09c9
            qf9 r0 = new qf9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x09c9:
            sla r2 = defpackage.sla.VIDEO_PLAY
            short r2 = r2.c()
            if (r7 != r2) goto L_0x09d8
            zjf r0 = new zjf
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x09d8:
            sla r2 = defpackage.sla.CHAT_PIN_SET_VISIBILITY
            short r2 = r2.c()
            if (r7 != r2) goto L_0x09e7
            om2 r0 = new om2
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x09e7:
            sla r2 = defpackage.sla.VIDEO_UPLOAD
            short r2 = r2.c()
            if (r7 != r2) goto L_0x09f6
            plf r0 = new plf
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x09f6:
            sla r2 = defpackage.sla.CHAT_MEDIA
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0a05
            de2 r0 = new de2
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0a05:
            sla r2 = defpackage.sla.SESSIONS_INFO
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0a14
            ubd r0 = new ubd
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0a14:
            sla r2 = defpackage.sla.SESSIONS_CLOSE
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0a23
            sbd r0 = new sbd
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0a23:
            sla r2 = defpackage.sla.PHONE_BIND_REQUEST
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0a32
            sua r0 = new sua
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0a32:
            sla r2 = defpackage.sla.PHONE_BIND_CONFIRM
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0a41
            rua r0 = new rua
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0a41:
            sla r2 = defpackage.sla.PRESET_AVATARS
            short r3 = r2.c()
            if (r7 != r3) goto L_0x0a53
            s43 r0 = r2.a()
            gle r16 = r0.w(r9)
            goto L_0x02d1
        L_0x0a53:
            sla r2 = defpackage.sla.RECONNECT
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0a62
            z9c r0 = new z9c
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0a62:
            sla r2 = defpackage.sla.DEBUG
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0a71
            s44 r0 = new s44
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0a71:
            sla r2 = defpackage.sla.LOG
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0a7b
            goto L_0x0e3f
        L_0x0a7b:
            sla r2 = defpackage.sla.CHATS_LIST
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0a8a
            st2 r0 = new st2
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0a8a:
            sla r2 = defpackage.sla.ASSETS_GET
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0a99
            gu r0 = new gu
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0a99:
            sla r2 = defpackage.sla.ASSETS_UPDATE
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0aa8
            ru r0 = new ru
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0aa8:
            sla r2 = defpackage.sla.ASSETS_GET_BY_IDS
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0ab7
            eu r0 = new eu
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0ab7:
            sla r2 = defpackage.sla.MSG_GET
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0ac6
            xe9 r0 = new xe9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0ac6:
            sla r2 = defpackage.sla.MSG_GET_STAT
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0ad5
            mp3 r0 = new mp3
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0ad5:
            sla r2 = defpackage.sla.SESSION_INIT
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0ae4
            nad r0 = new nad
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0ae4:
            sla r2 = defpackage.sla.CHAT_CHECK_LINK
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0aee
            goto L_0x0e3f
        L_0x0aee:
            sla r2 = defpackage.sla.CHAT_UPDATE
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0afd
            ss2 r0 = new ss2
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0afd:
            sla r2 = defpackage.sla.CHAT_JOIN
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0b0c
            pc2 r0 = new pc2
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0b0c:
            sla r2 = defpackage.sla.CHAT_MEMBERS
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0b1b
            fk2 r0 = new fk2
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0b1b:
            sla r2 = defpackage.sla.PUBLIC_SEARCH
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0b2a
            upb r0 = new upb
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0b2a:
            sla r2 = defpackage.sla.CHAT_LEAVE
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0b34
            goto L_0x0e3f
        L_0x0b34:
            sla r2 = defpackage.sla.CHAT_CLOSE
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0b3e
            goto L_0x0e3f
        L_0x0b3e:
            sla r2 = defpackage.sla.CHAT_CREATE
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0b4d
            r82 r0 = new r82
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0b4d:
            sla r2 = defpackage.sla.CHAT_MEMBERS_UPDATE
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0b5c
            sk2 r0 = new sk2
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0b5c:
            sla r2 = defpackage.sla.CHAT_SUBSCRIBE
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0b66
            goto L_0x0e3f
        L_0x0b66:
            sla r2 = defpackage.sla.VIDEO_CHAT_START
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0b75
            pm1 r0 = new pm1
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0b75:
            sla r2 = defpackage.sla.NOTIF_CALL_START
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0b84
            or9 r0 = new or9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0b84:
            sla r2 = defpackage.sla.FILE_UPLOAD
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0b93
            mj5 r0 = new mj5
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0b93:
            sla r2 = defpackage.sla.FILE_DOWNLOAD
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0ba2
            yg5 r0 = new yg5
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0ba2:
            sla r2 = defpackage.sla.NOTIF_CONTACT_SORT
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0bb1
            wr9 r0 = new wr9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0bb1:
            sla r2 = defpackage.sla.LINK_INFO
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0bc0
            gi7 r0 = new gi7
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0bc0:
            sla r2 = defpackage.sla.CONTACT_VERIFY
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0bcf
            uq3 r0 = new uq3
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0bcf:
            sla r2 = defpackage.sla.REMOVE_CONTACT_PHOTO
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0bde
            cgc r0 = new cgc
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0bde:
            sla r2 = defpackage.sla.VIDEO_CHAT_HISTORY
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0bed
            udf r0 = new udf
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0bed:
            sla r2 = defpackage.sla.NOTIF_MSG_DELETE_RANGE
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0bfc
            ss9 r0 = new ss9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0bfc:
            sla r2 = defpackage.sla.MSG_DELETE_RANGE
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0c0a
            te9 r16 = defpackage.te9.c(r9)
            goto L_0x02d1
        L_0x0c0a:
            sla r2 = defpackage.sla.NOTIF_MSG_DELETE
            short r3 = r2.c()
            if (r7 != r3) goto L_0x0c1c
            s43 r0 = r2.a()
            gle r16 = r0.w(r9)
            goto L_0x02d1
        L_0x0c1c:
            sla r2 = defpackage.sla.NOTIF_MSG_REACTIONS_CHANGED
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0c2a
            us9 r16 = defpackage.us9.c(r9)
            goto L_0x02d1
        L_0x0c2a:
            sla r2 = defpackage.sla.NOTIF_MSG_YOU_REACTED
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0c39
            ws9 r0 = new ws9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0c39:
            sla r2 = defpackage.sla.CONFIRM_PRESENT
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0c43
            goto L_0x0e3f
        L_0x0c43:
            sla r2 = defpackage.sla.CHAT_COMPLAIN
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0c4d
            goto L_0x0e3f
        L_0x0c4d:
            sla r2 = defpackage.sla.MSG_SEND_CALLBACK
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0c5c
            lf9 r0 = new lf9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0c5c:
            sla r2 = defpackage.sla.NOTIF_CALLBACK_ANSWER
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0c6b
            pr9 r0 = new pr9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0c6b:
            sla r2 = defpackage.sla.CHAT_BOT_COMMANDS
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0c7a
            h62 r0 = new h62
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0c7a:
            sla r2 = defpackage.sla.BOT_INFO
            short r3 = r2.c()
            if (r7 != r3) goto L_0x0c8c
            s43 r0 = r2.a()
            gle r16 = r0.w(r9)
            goto L_0x02d1
        L_0x0c8c:
            sla r2 = defpackage.sla.LOCATION_SEND
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0c96
            goto L_0x0e3f
        L_0x0c96:
            sla r2 = defpackage.sla.LOCATION_STOP
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0ca5
            ur7 r0 = new ur7
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0ca5:
            sla r2 = defpackage.sla.LOCATION_REQUEST
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0cb5
            mp3 r0 = new mp3
            r2 = 2
            r0.<init>(r9, r2)
            goto L_0x0e3f
        L_0x0cb5:
            sla r2 = defpackage.sla.NOTIF_LOCATION_REQUEST
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0cbf
            goto L_0x0e3f
        L_0x0cbf:
            sla r2 = defpackage.sla.NOTIF_LOCATION
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0cce
            cs9 r0 = new cs9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0cce:
            sla r2 = defpackage.sla.GET_LAST_MENTIONS
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0cde
            mp3 r0 = new mp3
            r2 = 1
            r0.<init>(r9, r2)
            goto L_0x0e3f
        L_0x0cde:
            sla r2 = defpackage.sla.GET_INBOUND_CALLS
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0cee
            zb6 r0 = new zb6
            r2 = 0
            r0.<init>(r9, r2)
            goto L_0x0e3f
        L_0x0cee:
            sla r2 = defpackage.sla.CALLS_TOKEN
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0cfc
            fn1 r16 = defpackage.ote.O(r9)
            goto L_0x02d1
        L_0x0cfc:
            sla r2 = defpackage.sla.NOTIF_ASSETS_UPDATE
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0d0b
            mr9 r0 = new mr9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0d0b:
            sla r2 = defpackage.sla.ASSETS_LIST_MODIFY
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0d1a
            iu r0 = new iu
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0d1a:
            sla r2 = defpackage.sla.ASSETS_REMOVE
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0d29
            ou r0 = new ou
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0d29:
            sla r2 = defpackage.sla.ASSETS_MOVE
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0d38
            lu r0 = new lu
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0d38:
            sla r2 = defpackage.sla.ASSETS_ADD
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0d47
            bu r0 = new bu
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0d47:
            sla r2 = defpackage.sla.STICKER_CREATE
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0d56
            p2e r0 = new p2e
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0d56:
            sla r2 = defpackage.sla.STICKER_UPLOAD
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0d65
            i4e r0 = new i4e
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0d65:
            sla r2 = defpackage.sla.STICKER_SUGGEST
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0d74
            g4e r0 = new g4e
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0d74:
            sla r2 = defpackage.sla.NOTIF_DRAFT
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0d83
            yr9 r0 = new yr9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0d83:
            sla r2 = defpackage.sla.NOTIF_DRAFT_DISCARD
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0d92
            zr9 r0 = new zr9
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0d92:
            sla r2 = defpackage.sla.DRAFT_SAVE
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0da1
            ip4 r0 = new ip4
            r0.<init>(r9)
            goto L_0x0e3f
        L_0x0da1:
            sla r2 = defpackage.sla.DRAFT_DISCARD
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0dab
            goto L_0x0e3f
        L_0x0dab:
            sla r2 = defpackage.sla.CHAT_HIDE
            short r2 = r2.c()
            if (r7 != r2) goto L_0x0db5
            goto L_0x0e3f
        L_0x0db5:
            sla r0 = defpackage.sla.VIDEO_CHAT_MEMBERS
            short r0 = r0.c()
            if (r7 != r0) goto L_0x0dc5
            zb6 r0 = new zb6
            r2 = 1
            r0.<init>(r9, r2)
            goto L_0x0e3f
        L_0x0dc5:
            sla r0 = defpackage.sla.CHAT_SEARCH_COMMON_PARTICIPANTS
            short r0 = r0.c()
            if (r7 != r0) goto L_0x0dd3
            uq2 r16 = defpackage.uq2.c(r9)
            goto L_0x02d1
        L_0x0dd3:
            sla r0 = defpackage.sla.NOTIF_MSG_DELAYED
            short r2 = r0.c()
            if (r7 != r2) goto L_0x0de5
            s43 r0 = r0.a()
            gle r16 = r0.w(r9)
            goto L_0x02d1
        L_0x0de5:
            sla r0 = defpackage.sla.PROFILE_DELETE
            short r2 = r0.c()
            if (r7 != r2) goto L_0x0df7
            s43 r0 = r0.a()
            gle r16 = r0.w(r9)
            goto L_0x02d1
        L_0x0df7:
            sla r0 = defpackage.sla.PROFILE_DELETE_TIME
            short r2 = r0.c()
            if (r7 != r2) goto L_0x0e09
            s43 r0 = r0.a()
            gle r16 = r0.w(r9)
            goto L_0x02d1
        L_0x0e09:
            sla r0 = defpackage.sla.WEB_APP_INIT_DATA
            short r2 = r0.c()
            if (r7 != r2) goto L_0x0e1b
            s43 r0 = r0.a()
            gle r16 = r0.w(r9)
            goto L_0x02d1
        L_0x0e1b:
            sla r0 = defpackage.sla.EXTERNAL_CALLBACK
            short r2 = r0.c()
            if (r7 != r2) goto L_0x0e2d
            s43 r0 = r0.a()
            gle r16 = r0.w(r9)
            goto L_0x02d1
        L_0x0e2d:
            sla r0 = defpackage.sla.NOTIF_PROFILE
            short r2 = r0.c()
            if (r7 != r2) goto L_0x02d1
            s43 r0 = r0.a()
            gle r16 = r0.w(r9)
            goto L_0x02d1
        L_0x0e3f:
            boolean r2 = r0 instanceof defpackage.nad
            if (r2 == 0) goto L_0x0e55
            r3 = r0
            nad r3 = (defpackage.nad) r3
            int r3 = r3.X
            r4 = 1
            if (r3 == r4) goto L_0x0e56
            x9d r2 = r1.b
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.g
            r2.set(r4)
        L_0x0e52:
            r2 = r36
            goto L_0x0e6a
        L_0x0e55:
            r4 = 1
        L_0x0e56:
            if (r2 == 0) goto L_0x0e52
            r2 = r0
            nad r2 = (defpackage.nad) r2
            int r2 = r2.X
            if (r2 != r4) goto L_0x0e52
            r2 = r36
            r2.e(r0)
            x9d r0 = r1.b
            r0.f(r4)
            return
        L_0x0e6a:
            boolean r3 = r0 instanceof defpackage.kt7
            if (r3 == 0) goto L_0x0e85
            x9d r3 = r1.b
            r4 = 2
            r3.p(r4)
            x9d r3 = r1.b
            boolean r5 = r3.l()
            if (r5 == 0) goto L_0x0e85
            mh3 r3 = r3.t
            jbd r3 = (defpackage.jbd) r3
            r3.i = r4
            r3.b()
        L_0x0e85:
            if (r0 != 0) goto L_0x0ec0
            r3 = r35
            short r0 = r3.d
            yb9 r4 = defpackage.sla.c
            r4.getClass()
            java.lang.String r0 = defpackage.yb9.c(r0)
            java.lang.String r4 = "Unknown response type, define it in TamResponse.decode: "
            java.lang.String r0 = r4.concat(r0)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r0)
            x9d r7 = r1.b
            long r9 = r36.i()
            short r11 = r3.c
            short r12 = r3.d
            java.lang.String r14 = r4.toString()
            r13 = 0
            r8 = r23
            r7.m(r8, r9, r11, r12, r13, r14)
            x9d r2 = r1.b
            java.lang.String r2 = r2.a
            defpackage.hm9.p(r2, r0, r4)
            x9d r0 = r1.b
            r0.o(r4)
            return
        L_0x0ec0:
            r3 = r35
            boolean r4 = r0 instanceof defpackage.dt7
            if (r4 == 0) goto L_0x0edf
            r4 = r0
            dt7 r4 = (defpackage.dt7) r4
            x9d r5 = r1.b
            e6a r5 = r5.p
            boolean r5 = r5.a()
            x9d r6 = r1.b
            e6a r6 = r6.p
            boolean r6 = r6.b()
            java.lang.String r4 = r4.a(r5, r6)
        L_0x0edd:
            r14 = r4
            goto L_0x0ee4
        L_0x0edf:
            java.lang.String r4 = r0.toString()
            goto L_0x0edd
        L_0x0ee4:
            x9d r7 = r1.b
            long r9 = r36.i()
            short r11 = r3.c
            short r12 = r3.d
            r13 = 0
            r8 = r23
            r7.m(r8, r9, r11, r12, r13, r14)
            r2.e(r0)
            goto L_0x0f39
        L_0x0ef8:
            r23 = r8
            r32 = r3
            r3 = r2
            r2 = r32
            x9d r7 = r1.b
            long r9 = r36.i()
            short r11 = r3.c
            short r12 = r3.d
            r13 = 0
            java.lang.String r14 = "empty"
            r8 = r23
            r7.m(r8, r9, r11, r12, r13, r14)
            short r0 = r3.d
            sla r4 = defpackage.sla.LOGOUT
            short r4 = r4.c()
            if (r0 != r4) goto L_0x0f34
            x9d r0 = r1.b
            java.util.concurrent.ConcurrentHashMap r0 = r0.v
            short r3 = r3.c
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            r0.remove(r3)
            fle r0 = defpackage.gle.b
            r2.e(r0)
            x9d r0 = r1.b
            r1 = 0
            r0.h(r1, r1)
            goto L_0x0f39
        L_0x0f34:
            fle r0 = defpackage.gle.b
            r2.e(r0)
        L_0x0f39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9d.e(byte[], yoa, dke):void");
    }

    public yoa f() {
        byte[] bArr = new byte[10];
        this.b.s.readFully(bArr, 0, 10);
        return new yoa(bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        java.lang.Thread.currentThread().interrupt();
        r0 = false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0024 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.a
            switch(r0) {
                case 0: goto L_0x0099;
                case 1: goto L_0x0039;
                default: goto L_0x0005;
            }
        L_0x0005:
            x9d r0 = r12.b
        L_0x0007:
            boolean r1 = r0.l()     // Catch:{ all -> 0x0011 }
            if (r1 == 0) goto L_0x002b
            r12.b()     // Catch:{ Exception -> 0x0013 }
            goto L_0x001e
        L_0x0011:
            r12 = move-exception
            goto L_0x0032
        L_0x0013:
            r1 = move-exception
            java.lang.String r2 = r0.a     // Catch:{ all -> 0x0011 }
            java.lang.String r3 = "exception in timeout handler"
            defpackage.hm9.p(r2, r3, r1)     // Catch:{ all -> 0x0011 }
            r0.o(r1)     // Catch:{ all -> 0x0011 }
        L_0x001e:
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0024 }
            goto L_0x0007
        L_0x0024:
            java.lang.String r12 = r0.a     // Catch:{ all -> 0x0011 }
            java.lang.String r1 = "waiting in timeout_handler was interrupted, EXIT"
            defpackage.hm9.o(r12, r1)     // Catch:{ all -> 0x0011 }
        L_0x002b:
            defpackage.x9d.a(r0)
            defpackage.x9d.d(r0)
            return
        L_0x0032:
            defpackage.x9d.a(r0)
            defpackage.x9d.d(r0)
            throw r12
        L_0x0039:
            x9d r0 = r12.b     // Catch:{ all -> 0x0064 }
            boolean r0 = r0.l()     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x0083
            x9d r0 = r12.b     // Catch:{ all -> 0x0064 }
            aqb r0 = r0.z     // Catch:{ all -> 0x0064 }
            r0.getClass()     // Catch:{ all -> 0x0064 }
            r1 = -1
            r0.b(r1)     // Catch:{ InterruptedException -> 0x004f }
            r0 = 1
            goto L_0x0057
        L_0x004f:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0064 }
            r0.interrupt()     // Catch:{ all -> 0x0064 }
            r0 = 0
        L_0x0057:
            if (r0 != 0) goto L_0x0066
            x9d r0 = r12.b     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = r0.a     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "waiting in packet_sender was interrupted, EXIT"
            r2 = 0
            defpackage.hm9.p(r0, r1, r2)     // Catch:{ all -> 0x0064 }
            goto L_0x0083
        L_0x0064:
            r0 = move-exception
            goto L_0x008e
        L_0x0066:
            x9d r0 = r12.b     // Catch:{ Exception -> 0x0073 }
            java.lang.Object r0 = r0.x     // Catch:{ Exception -> 0x0073 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0073 }
            r12.c()     // Catch:{ all -> 0x0070 }
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            goto L_0x0039
        L_0x0070:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            throw r1     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            x9d r1 = r12.b     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = r1.a     // Catch:{ all -> 0x0064 }
            java.lang.String r2 = "exception in packet sender"
            defpackage.hm9.p(r1, r2, r0)     // Catch:{ all -> 0x0064 }
            x9d r1 = r12.b     // Catch:{ all -> 0x0064 }
            r1.o(r0)     // Catch:{ all -> 0x0064 }
            goto L_0x0039
        L_0x0083:
            x9d r0 = r12.b
            defpackage.x9d.a(r0)
            x9d r12 = r12.b
            defpackage.x9d.d(r12)
            return
        L_0x008e:
            x9d r1 = r12.b
            defpackage.x9d.a(r1)
            x9d r12 = r12.b
            defpackage.x9d.d(r12)
            throw r0
        L_0x0099:
            x9d r0 = r12.b
        L_0x009b:
            boolean r1 = r0.l()     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = r0.a
            if (r1 == 0) goto L_0x00bc
        L_0x00a3:
            r1 = 0
            boolean r3 = r0.k()     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            if (r3 == 0) goto L_0x00dc
            boolean r3 = r0.l()     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            r4 = 0
            if (r3 != 0) goto L_0x00d0
            java.lang.String r3 = "PacketReader: session is not active!"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            defpackage.hm9.k0(r2, r4, r3, r5)     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
        L_0x00bc:
            defpackage.x9d.a(r0)
            defpackage.x9d.d(r0)
            goto L_0x0171
        L_0x00c4:
            r12 = move-exception
            goto L_0x0172
        L_0x00c7:
            r1 = move-exception
            goto L_0x0142
        L_0x00ca:
            r3 = move-exception
            goto L_0x014c
        L_0x00cd:
            r3 = move-exception
            goto L_0x015b
        L_0x00d0:
            r5 = 100
            java.lang.Thread.sleep(r5)     // Catch:{ InterruptedException -> 0x00d6 }
            goto L_0x00a3
        L_0x00d6:
            java.lang.String r3 = "waiting in packet_reader was interrupted, EXIT"
            defpackage.hm9.p(r2, r3, r4)     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            goto L_0x00bc
        L_0x00dc:
            yoa r3 = r12.f()     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            int r7 = r3.g     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            byte[] r5 = new byte[r7]     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            r4 = r1
        L_0x00e5:
            int r6 = r3.g     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            if (r4 >= r6) goto L_0x010a
            java.io.DataInputStream r6 = r0.s     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            int r8 = r7 - r4
            r9 = 256(0x100, float:3.59E-43)
            int r8 = java.lang.Math.min(r9, r8)     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            int r6 = r6.read(r5, r4, r8)     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            if (r6 < 0) goto L_0x0104
            int r4 = r4 + r6
            java.util.concurrent.atomic.AtomicLong r6 = r0.d     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            r6.set(r8)     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            goto L_0x00e5
        L_0x0104:
            java.io.EOFException r3 = new java.io.EOFException     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            r3.<init>()     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            throw r3     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
        L_0x010a:
            byte r4 = r3.e     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            if (r4 == 0) goto L_0x012d
            int r10 = r6 * r4
            byte[] r11 = new byte[r10]     // Catch:{ all -> 0x0122 }
            net.jpountz.lz4.LZ4Factory r4 = defpackage.nd7.u()     // Catch:{ all -> 0x0122 }
            net.jpountz.lz4.LZ4SafeDecompressor r4 = r4.safeDecompressor()     // Catch:{ all -> 0x0122 }
            r9 = 0
            r6 = 0
            r8 = r11
            r4.decompress((byte[]) r5, (int) r6, (int) r7, (byte[]) r8, (int) r9, (int) r10)     // Catch:{ all -> 0x0122 }
            r5 = r11
            goto L_0x012d
        L_0x0122:
            r4 = move-exception
            java.lang.String r5 = "LZ4Utils.decompress failure! packet = %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            defpackage.hm9.r(r2, r4, r5, r3)     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            throw r4     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
        L_0x012d:
            byte r4 = r3.b     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            if (r4 != 0) goto L_0x013d
            bdb r4 = new bdb     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            r6 = 4
            r7 = 0
            r4.<init>(r12, r3, r7, r6)     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            r12.e(r5, r3, r4)     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            goto L_0x009b
        L_0x013d:
            r12.d(r3, r5)     // Catch:{ MalformedPacketException -> 0x00cd, IOException -> 0x00ca, Exception -> 0x00c7 }
            goto L_0x009b
        L_0x0142:
            java.lang.String r3 = "exception in packet reader"
            defpackage.hm9.p(r2, r3, r1)     // Catch:{ all -> 0x00c4 }
            r0.o(r1)     // Catch:{ all -> 0x00c4 }
            goto L_0x009b
        L_0x014c:
            java.lang.String r4 = "IOException in packet reader"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c4 }
            defpackage.hm9.k0(r2, r3, r4, r5)     // Catch:{ all -> 0x00c4 }
            r0.h(r1, r1)     // Catch:{ all -> 0x00c4 }
            r0.o(r3)     // Catch:{ all -> 0x00c4 }
            goto L_0x009b
        L_0x015b:
            java.lang.String r4 = "Malformed input packet detected"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c4 }
            defpackage.hm9.r(r2, r3, r4, r5)     // Catch:{ all -> 0x00c4 }
            r0.h(r1, r1)     // Catch:{ all -> 0x00c4 }
            ru.ok.tamtam.api.CorruptedInputDataException r1 = new ru.ok.tamtam.api.CorruptedInputDataException     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = "Corrupted input data"
            r1.<init>(r2)     // Catch:{ all -> 0x00c4 }
            r0.o(r1)     // Catch:{ all -> 0x00c4 }
            goto L_0x009b
        L_0x0171:
            return
        L_0x0172:
            defpackage.x9d.a(r0)
            defpackage.x9d.d(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9d.run():void");
    }
}
