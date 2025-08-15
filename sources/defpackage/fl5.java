package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Base64;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fl5  reason: default package */
public final class fl5 {
    public static final Object j = new Object();
    public static final us k = new qpd(0);
    public final Context a;
    public final String b;
    public final ol5 c;
    public final fc3 d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final le7 g;
    public final gpb h;
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r12v2, types: [fc3, java.lang.Object, zb3] */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:51|52|105) */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r3.remove();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x01ce */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fl5(android.content.Context r11, java.lang.String r12, defpackage.ol5 r13) {
        /*
            r10 = this;
            r0 = 1
            r10.<init>()
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r1.<init>(r2)
            r10.e = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>()
            r10.f = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r10.i = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r10.a = r11
            defpackage.fp3.j(r12)
            r10.b = r12
            r10.c = r13
            sb0 r12 = com.google.firebase.provider.FirebaseInitProvider.a
            java.lang.String r1 = "Firebase"
            android.os.Trace.beginSection(r1)
            java.lang.String r1 = "ComponentDiscovery"
            android.os.Trace.beginSection(r1)
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r1 = com.google.firebase.components.ComponentDiscoveryService.class
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            android.content.pm.PackageManager r5 = r11.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r5 != 0) goto L_0x0043
            goto L_0x0056
        L_0x0043:
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0056 }
            r6.<init>(r11, r1)     // Catch:{ NameNotFoundException -> 0x0056 }
            r7 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r5 = r5.getServiceInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r5 != 0) goto L_0x0054
            java.util.Objects.toString(r1)     // Catch:{ NameNotFoundException -> 0x0056 }
            goto L_0x0056
        L_0x0054:
            android.os.Bundle r4 = r5.metaData     // Catch:{ NameNotFoundException -> 0x0056 }
        L_0x0056:
            if (r4 != 0) goto L_0x005d
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x0094
        L_0x005d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Set r5 = r4.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x006a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0094
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r4.get(r6)
            java.lang.String r8 = "com.google.firebase.components.ComponentRegistrar"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x006a
            java.lang.String r7 = "com.google.firebase.components:"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x006a
            r7 = 31
            java.lang.String r6 = r6.substring(r7)
            r1.add(r6)
            goto L_0x006a
        L_0x0094:
            java.util.Iterator r1 = r1.iterator()
        L_0x0098:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00ad
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            bc3 r5 = new bc3
            r5.<init>(r2, r4)
            r3.add(r5)
            goto L_0x0098
        L_0x00ad:
            android.os.Trace.endSection()
            java.lang.String r1 = "Runtime"
            android.os.Trace.beginSection(r1)
            s4f r1 = defpackage.s4f.a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.addAll(r3)
            com.google.firebase.FirebaseCommonRegistrar r3 = new com.google.firebase.FirebaseCommonRegistrar
            r3.<init>()
            bc3 r5 = new bc3
            r5.<init>(r0, r3)
            r1.add(r5)
            com.google.firebase.concurrent.ExecutorsRegistrar r3 = new com.google.firebase.concurrent.ExecutorsRegistrar
            r3.<init>()
            bc3 r5 = new bc3
            r5.<init>(r0, r3)
            r1.add(r5)
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Class[] r5 = new java.lang.Class[r2]
            nb3 r3 = defpackage.nb3.b(r11, r3, r5)
            r4.add(r3)
            java.lang.Class<fl5> r3 = defpackage.fl5.class
            java.lang.Class[] r5 = new java.lang.Class[r2]
            nb3 r3 = defpackage.nb3.b(r10, r3, r5)
            r4.add(r3)
            java.lang.Class<ol5> r3 = defpackage.ol5.class
            java.lang.Class[] r5 = new java.lang.Class[r2]
            nb3 r13 = defpackage.nb3.b(r13, r3, r5)
            r4.add(r13)
            huc r13 = new huc
            r13.<init>()
            boolean r3 = defpackage.daf.a(r11)
            if (r3 == 0) goto L_0x011d
            java.util.concurrent.atomic.AtomicBoolean r3 = com.google.firebase.provider.FirebaseInitProvider.b
            boolean r3 = r3.get()
            if (r3 == 0) goto L_0x011d
            java.lang.Class<sb0> r3 = defpackage.sb0.class
            java.lang.Class[] r5 = new java.lang.Class[r2]
            nb3 r12 = defpackage.nb3.b(r12, r3, r5)
            r4.add(r12)
        L_0x011d:
            fc3 r12 = new fc3
            s4f r3 = defpackage.s4f.a
            r12.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r12.a = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r12.b = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r12.c = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r12.o = r3
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r12.Y = r3
            r35 r3 = new r35
            r3.<init>()
            r12.X = r3
            r12.Z = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.Class<r35> r5 = defpackage.r35.class
            java.lang.Class<wae> r6 = defpackage.wae.class
            java.lang.Class<zpb> r7 = defpackage.zpb.class
            java.lang.Class[] r6 = new java.lang.Class[]{r6, r7}
            nb3 r3 = defpackage.nb3.b(r3, r5, r6)
            r13.add(r3)
            java.lang.Class<fc3> r3 = defpackage.fc3.class
            java.lang.Class[] r5 = new java.lang.Class[r2]
            nb3 r3 = defpackage.nb3.b(r12, r3, r5)
            r13.add(r3)
            java.util.Iterator r3 = r4.iterator()
        L_0x0175:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0187
            java.lang.Object r4 = r3.next()
            nb3 r4 = (defpackage.nb3) r4
            if (r4 == 0) goto L_0x0175
            r13.add(r4)
            goto L_0x0175
        L_0x0187:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0190:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x019e
            java.lang.Object r4 = r1.next()
            r3.add(r4)
            goto L_0x0190
        L_0x019e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            monitor-enter(r12)
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x01cb }
        L_0x01a8:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x01cb }
            if (r4 == 0) goto L_0x01d2
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x01cb }
            gpb r4 = (defpackage.gpb) r4     // Catch:{ all -> 0x01cb }
            java.lang.Object r4 = r4.get()     // Catch:{ InvalidRegistrarException -> 0x01ce }
            com.google.firebase.components.ComponentRegistrar r4 = (com.google.firebase.components.ComponentRegistrar) r4     // Catch:{ InvalidRegistrarException -> 0x01ce }
            if (r4 == 0) goto L_0x01a8
            java.lang.Object r5 = r12.Z     // Catch:{ InvalidRegistrarException -> 0x01ce }
            huc r5 = (defpackage.huc) r5     // Catch:{ InvalidRegistrarException -> 0x01ce }
            java.util.List r4 = r5.r(r4)     // Catch:{ InvalidRegistrarException -> 0x01ce }
            r13.addAll(r4)     // Catch:{ InvalidRegistrarException -> 0x01ce }
            r3.remove()     // Catch:{ InvalidRegistrarException -> 0x01ce }
            goto L_0x01a8
        L_0x01cb:
            r10 = move-exception
            goto L_0x02d3
        L_0x01ce:
            r3.remove()     // Catch:{ all -> 0x01cb }
            goto L_0x01a8
        L_0x01d2:
            java.util.Iterator r3 = r13.iterator()     // Catch:{ all -> 0x01cb }
        L_0x01d6:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x01cb }
            if (r4 == 0) goto L_0x0219
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x01cb }
            nb3 r4 = (defpackage.nb3) r4     // Catch:{ all -> 0x01cb }
            java.util.Set r4 = r4.b     // Catch:{ all -> 0x01cb }
            java.lang.Object[] r4 = r4.toArray()     // Catch:{ all -> 0x01cb }
            int r5 = r4.length     // Catch:{ all -> 0x01cb }
            r6 = r2
        L_0x01ea:
            if (r6 >= r5) goto L_0x01d6
            r7 = r4[r6]     // Catch:{ all -> 0x01cb }
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x01cb }
            java.lang.String r9 = "kotlinx.coroutines.CoroutineDispatcher"
            boolean r8 = r8.contains(r9)     // Catch:{ all -> 0x01cb }
            if (r8 == 0) goto L_0x0217
            java.lang.Object r8 = r12.o     // Catch:{ all -> 0x01cb }
            java.util.HashSet r8 = (java.util.HashSet) r8     // Catch:{ all -> 0x01cb }
            java.lang.String r9 = r7.toString()     // Catch:{ all -> 0x01cb }
            boolean r8 = r8.contains(r9)     // Catch:{ all -> 0x01cb }
            if (r8 == 0) goto L_0x020c
            r3.remove()     // Catch:{ all -> 0x01cb }
            goto L_0x01d6
        L_0x020c:
            java.lang.Object r8 = r12.o     // Catch:{ all -> 0x01cb }
            java.util.HashSet r8 = (java.util.HashSet) r8     // Catch:{ all -> 0x01cb }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x01cb }
            r8.add(r7)     // Catch:{ all -> 0x01cb }
        L_0x0217:
            int r6 = r6 + r0
            goto L_0x01ea
        L_0x0219:
            java.lang.Object r0 = r12.a     // Catch:{ all -> 0x01cb }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x01cb }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01cb }
            if (r0 == 0) goto L_0x0227
            defpackage.xfg.h(r13)     // Catch:{ all -> 0x01cb }
            goto L_0x023a
        L_0x0227:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01cb }
            java.lang.Object r3 = r12.a     // Catch:{ all -> 0x01cb }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x01cb }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x01cb }
            r0.<init>(r3)     // Catch:{ all -> 0x01cb }
            r0.addAll(r13)     // Catch:{ all -> 0x01cb }
            defpackage.xfg.h(r0)     // Catch:{ all -> 0x01cb }
        L_0x023a:
            java.util.Iterator r0 = r13.iterator()     // Catch:{ all -> 0x01cb }
        L_0x023e:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x01cb }
            if (r3 == 0) goto L_0x025c
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x01cb }
            nb3 r3 = (defpackage.nb3) r3     // Catch:{ all -> 0x01cb }
            le7 r4 = new le7     // Catch:{ all -> 0x01cb }
            ec3 r5 = new ec3     // Catch:{ all -> 0x01cb }
            r5.<init>(r12, r2, r3)     // Catch:{ all -> 0x01cb }
            r4.<init>(r5)     // Catch:{ all -> 0x01cb }
            java.lang.Object r5 = r12.a     // Catch:{ all -> 0x01cb }
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x01cb }
            r5.put(r3, r4)     // Catch:{ all -> 0x01cb }
            goto L_0x023e
        L_0x025c:
            java.util.ArrayList r13 = r12.q(r13)     // Catch:{ all -> 0x01cb }
            r1.addAll(r13)     // Catch:{ all -> 0x01cb }
            java.util.ArrayList r13 = r12.r()     // Catch:{ all -> 0x01cb }
            r1.addAll(r13)     // Catch:{ all -> 0x01cb }
            r12.p()     // Catch:{ all -> 0x01cb }
            monitor-exit(r12)     // Catch:{ all -> 0x01cb }
            java.util.Iterator r13 = r1.iterator()
        L_0x0272:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0282
            java.lang.Object r0 = r13.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L_0x0272
        L_0x0282:
            java.lang.Object r13 = r12.Y
            java.util.concurrent.atomic.AtomicReference r13 = (java.util.concurrent.atomic.AtomicReference) r13
            java.lang.Object r13 = r13.get()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            if (r13 == 0) goto L_0x0299
            java.lang.Object r0 = r12.a
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r13 = r13.booleanValue()
            r12.i(r0, r13)
        L_0x0299:
            r10.d = r12
            android.os.Trace.endSection()
            le7 r13 = new le7
            ec3 r0 = new ec3
            r1 = 2
            r0.<init>(r10, r1, r11)
            r13.<init>(r0)
            r10.g = r13
            java.lang.Class<bb4> r11 = defpackage.bb4.class
            gpb r11 = r12.c(r11)
            r10.h = r11
            cl5 r11 = new cl5
            r11.<init>(r10)
            r10.a()
            java.util.concurrent.atomic.AtomicBoolean r12 = r10.e
            boolean r12 = r12.get()
            if (r12 == 0) goto L_0x02ca
            se0 r12 = defpackage.se0.X
            java.util.concurrent.atomic.AtomicBoolean r12 = r12.a
            r12.get()
        L_0x02ca:
            java.util.concurrent.CopyOnWriteArrayList r10 = r10.i
            r10.add(r11)
            android.os.Trace.endSection()
            return
        L_0x02d3:
            monitor-exit(r12)     // Catch:{ all -> 0x01cb }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl5.<init>(android.content.Context, java.lang.String, ol5):void");
    }

    public static fl5 b() {
        fl5 fl5;
        synchronized (j) {
            try {
                fl5 = (fl5) k.get("[DEFAULT]");
                if (fl5 == null) {
                    StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                    if (f46.e == null) {
                        f46.e = Application.getProcessName();
                    }
                    sb.append(f46.e);
                    sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    throw new IllegalStateException(sb.toString());
                }
                ((bb4) fl5.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return fl5;
    }

    public static fl5 e(Context context) {
        synchronized (j) {
            try {
                if (k.containsKey("[DEFAULT]")) {
                    fl5 b2 = b();
                    return b2;
                }
                ol5 a2 = ol5.a(context);
                if (a2 == null) {
                    return null;
                }
                fl5 f2 = f(context, a2);
                return f2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static fl5 f(Context context, ol5 ol5) {
        fl5 fl5;
        AtomicReference atomicReference = dl5.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = dl5.a;
            if (atomicReference2.get() == null) {
                Object obj = new Object();
                while (true) {
                    if (!atomicReference2.compareAndSet((Object) null, obj)) {
                        if (atomicReference2.get() != null) {
                            break;
                        }
                    } else {
                        se0.a(application);
                        se0 se0 = se0.X;
                        se0.getClass();
                        synchronized (se0) {
                            se0.c.add(obj);
                        }
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            us usVar = k;
            fp3.p("FirebaseApp name " + "[DEFAULT]" + " already exists!", !usVar.containsKey("[DEFAULT]"));
            fp3.o(context, "Application context cannot be null.");
            fl5 = new fl5(context, "[DEFAULT]", ol5);
            usVar.put("[DEFAULT]", fl5);
        }
        fl5.d();
        return fl5;
    }

    public final void a() {
        fp3.p("FirebaseApp was deleted", !this.f.get());
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        String str = null;
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str);
        return sb.toString();
    }

    public final void d() {
        HashMap hashMap;
        if (!daf.a(this.a)) {
            a();
            Context context = this.a;
            AtomicReference atomicReference = el5.b;
            if (atomicReference.get() == null) {
                el5 el5 = new el5(context);
                while (!atomicReference.compareAndSet((Object) null, el5)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(el5, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        a();
        fc3 fc3 = this.d;
        a();
        boolean equals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = (AtomicReference) fc3.Y;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (!atomicReference2.compareAndSet((Object) null, valueOf)) {
                if (atomicReference2.get() != null) {
                    break;
                }
            } else {
                synchronized (fc3) {
                    hashMap = new HashMap((HashMap) fc3.a);
                }
                fc3.i(hashMap, equals);
                break;
            }
        }
        ((bb4) this.h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fl5)) {
            return false;
        }
        fl5 fl5 = (fl5) obj;
        fl5.a();
        return this.b.equals(fl5.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        qz7 qz7 = new qz7((Object) this);
        qz7.h(this.b, "name");
        qz7.h(this.c, "options");
        return qz7.toString();
    }
}
