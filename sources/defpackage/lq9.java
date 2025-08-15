package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: lq9  reason: default package */
public final class lq9 implements b66, cc3, iud, vaf, za7, py7, df9 {
    public static final lq9 X = new Object();
    public static final lq9 Y = new Object();
    public static lq9 a;
    public static final lq9 b = new Object();
    public static final lq9 c = new Object();
    public static final lq9 o = new Object();

    public /* synthetic */ lq9(Object obj) {
    }

    public Map a(Map map) {
        return map == null ? new LinkedHashMap() : map;
    }

    public Object apply(Object obj) {
        return new t28(new uh((ed1) obj, 4, xlc.a(0, "SELECT * FROM call_links")));
    }

    public void b(cy7 cy7) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Event bus " + cy7 + " accessed from non-main thread " + Looper.myLooper());
        }
    }

    public int c(Context context, String str) {
        return lu4.a(context, str);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x005c=Splitter:B:31:0x005c, B:47:0x008d=Splitter:B:47:0x008d, B:18:0x003f=Splitter:B:18:0x003f} */
    public int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            r10 = this;
            java.lang.Class<lu4> r10 = defpackage.lu4.class
            monitor-enter(r10)     // Catch:{ all -> 0x00bc }
            java.lang.Boolean r0 = defpackage.lu4.c     // Catch:{ all -> 0x004c }
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x00af
            android.content.Context r0 = r11.getApplicationContext()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.Class r0 = r0.loadClass(r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.Class r4 = r0.getDeclaringClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.Object r5 = r0.get(r3)     // Catch:{ all -> 0x0037 }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x0037 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0037 }
            if (r5 != r6) goto L_0x003a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0037 }
            goto L_0x00a3
        L_0x0037:
            r0 = move-exception
            goto L_0x00a5
        L_0x003a:
            if (r5 == 0) goto L_0x0042
            defpackage.lu4.d(r5)     // Catch:{ DynamiteModule$LoadingException -> 0x003f }
        L_0x003f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0037 }
            goto L_0x00a3
        L_0x0042:
            boolean r5 = defpackage.lu4.e(r11)     // Catch:{ all -> 0x0037 }
            if (r5 != 0) goto L_0x004f
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            monitor-exit(r10)     // Catch:{ all -> 0x004c }
            goto L_0x0196
        L_0x004c:
            r12 = move-exception
            goto L_0x019d
        L_0x004f:
            boolean r5 = defpackage.lu4.e     // Catch:{ all -> 0x0037 }
            if (r5 != 0) goto L_0x009a
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0037 }
            boolean r6 = r5.equals(r3)     // Catch:{ all -> 0x0037 }
            if (r6 == 0) goto L_0x005c
            goto L_0x009a
        L_0x005c:
            int r6 = defpackage.lu4.c(r11, r12, r13, r1)     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            java.lang.String r7 = defpackage.lu4.d     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            if (r7 == 0) goto L_0x008d
            boolean r7 = r7.isEmpty()     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            if (r7 == 0) goto L_0x006b
            goto L_0x008d
        L_0x006b:
            java.lang.ClassLoader r7 = defpackage.xfg.F()     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            if (r7 == 0) goto L_0x0072
            goto L_0x0080
        L_0x0072:
            dalvik.system.DelegateLastClassLoader r7 = new dalvik.system.DelegateLastClassLoader     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            java.lang.String r8 = defpackage.lu4.d     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            defpackage.fp3.n(r8)     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            r7.<init>(r8, r9)     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
        L_0x0080:
            defpackage.lu4.d(r7)     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            r0.set(r3, r7)     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            defpackage.lu4.c = r5     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            monitor-exit(r10)     // Catch:{ all -> 0x004c }
        L_0x008a:
            r2 = r6
            goto L_0x0196
        L_0x008d:
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            monitor-exit(r10)     // Catch:{ all -> 0x004c }
            goto L_0x008a
        L_0x0090:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0037 }
            r0.set(r3, r5)     // Catch:{ all -> 0x0037 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0037 }
            goto L_0x00a3
        L_0x009a:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0037 }
            r0.set(r3, r5)     // Catch:{ all -> 0x0037 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0037 }
        L_0x00a3:
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            goto L_0x00ad
        L_0x00a5:
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            r0.toString()     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004c }
        L_0x00ad:
            defpackage.lu4.c = r0     // Catch:{ all -> 0x004c }
        L_0x00af:
            monitor-exit(r10)     // Catch:{ all -> 0x004c }
            boolean r10 = r0.booleanValue()     // Catch:{ all -> 0x00bc }
            if (r10 == 0) goto L_0x00c5
            int r2 = defpackage.lu4.c(r11, r12, r13, r2)     // Catch:{ DynamiteModule$LoadingException -> 0x00bf }
            goto L_0x0196
        L_0x00bc:
            r10 = move-exception
            goto L_0x019f
        L_0x00bf:
            r10 = move-exception
            r10.getMessage()     // Catch:{ all -> 0x00bc }
            goto L_0x0196
        L_0x00c5:
            wjg r4 = defpackage.lu4.f(r11)     // Catch:{ all -> 0x00bc }
            if (r4 != 0) goto L_0x00cd
            goto L_0x0196
        L_0x00cd:
            android.os.Parcel r10 = r4.G0()     // Catch:{ RemoteException -> 0x014b }
            r0 = 6
            android.os.Parcel r10 = r4.k(r10, r0)     // Catch:{ RemoteException -> 0x014b }
            int r0 = r10.readInt()     // Catch:{ RemoteException -> 0x014b }
            r10.recycle()     // Catch:{ RemoteException -> 0x014b }
            r10 = 3
            if (r0 < r10) goto L_0x014d
            java.lang.ThreadLocal r10 = defpackage.lu4.h     // Catch:{ RemoteException -> 0x014b }
            java.lang.Object r0 = r10.get()     // Catch:{ RemoteException -> 0x014b }
            njg r0 = (defpackage.njg) r0     // Catch:{ RemoteException -> 0x014b }
            if (r0 == 0) goto L_0x00f4
            android.database.Cursor r0 = r0.a     // Catch:{ RemoteException -> 0x014b }
            if (r0 == 0) goto L_0x00f4
            int r2 = r0.getInt(r2)     // Catch:{ RemoteException -> 0x014b }
            goto L_0x0196
        L_0x00f4:
            oy9 r5 = new oy9     // Catch:{ RemoteException -> 0x014b }
            r5.<init>(r11)     // Catch:{ RemoteException -> 0x014b }
            yu0 r0 = defpackage.lu4.i     // Catch:{ RemoteException -> 0x014b }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x014b }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x014b }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x014b }
            r6 = r12
            r7 = r13
            xr6 r12 = r4.L0(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x014b }
            java.lang.Object r12 = defpackage.oy9.L0(r12)     // Catch:{ RemoteException -> 0x014b }
            android.database.Cursor r12 = (android.database.Cursor) r12     // Catch:{ RemoteException -> 0x014b }
            if (r12 == 0) goto L_0x0143
            boolean r13 = r12.moveToFirst()     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            if (r13 != 0) goto L_0x011a
            goto L_0x0143
        L_0x011a:
            int r13 = r12.getInt(r2)     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            if (r13 <= 0) goto L_0x0133
            java.lang.Object r10 = r10.get()     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            njg r10 = (defpackage.njg) r10     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            if (r10 == 0) goto L_0x012f
            android.database.Cursor r0 = r10.a     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            if (r0 != 0) goto L_0x012f
            r10.a = r12     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            goto L_0x0130
        L_0x012f:
            r1 = r2
        L_0x0130:
            if (r1 == 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r3 = r12
        L_0x0134:
            if (r3 == 0) goto L_0x0139
            r3.close()     // Catch:{ all -> 0x00bc }
        L_0x0139:
            r2 = r13
            goto L_0x0196
        L_0x013b:
            r10 = move-exception
            goto L_0x013f
        L_0x013d:
            r10 = move-exception
            goto L_0x0141
        L_0x013f:
            r3 = r12
            goto L_0x0197
        L_0x0141:
            r3 = r12
            goto L_0x018e
        L_0x0143:
            if (r12 == 0) goto L_0x0196
            r12.close()     // Catch:{ all -> 0x00bc }
            goto L_0x0196
        L_0x0149:
            r10 = move-exception
            goto L_0x0197
        L_0x014b:
            r10 = move-exception
            goto L_0x018e
        L_0x014d:
            r1 = 2
            if (r0 != r1) goto L_0x0170
            oy9 r10 = new oy9     // Catch:{ RemoteException -> 0x014b }
            r10.<init>(r11)     // Catch:{ RemoteException -> 0x014b }
            android.os.Parcel r0 = r4.G0()     // Catch:{ RemoteException -> 0x014b }
            defpackage.kgg.c(r0, r10)     // Catch:{ RemoteException -> 0x014b }
            r0.writeString(r12)     // Catch:{ RemoteException -> 0x014b }
            r0.writeInt(r13)     // Catch:{ RemoteException -> 0x014b }
            r10 = 5
            android.os.Parcel r10 = r4.k(r0, r10)     // Catch:{ RemoteException -> 0x014b }
            int r12 = r10.readInt()     // Catch:{ RemoteException -> 0x014b }
            r10.recycle()     // Catch:{ RemoteException -> 0x014b }
        L_0x016e:
            r2 = r12
            goto L_0x0196
        L_0x0170:
            oy9 r0 = new oy9     // Catch:{ RemoteException -> 0x014b }
            r0.<init>(r11)     // Catch:{ RemoteException -> 0x014b }
            android.os.Parcel r1 = r4.G0()     // Catch:{ RemoteException -> 0x014b }
            defpackage.kgg.c(r1, r0)     // Catch:{ RemoteException -> 0x014b }
            r1.writeString(r12)     // Catch:{ RemoteException -> 0x014b }
            r1.writeInt(r13)     // Catch:{ RemoteException -> 0x014b }
            android.os.Parcel r10 = r4.k(r1, r10)     // Catch:{ RemoteException -> 0x014b }
            int r12 = r10.readInt()     // Catch:{ RemoteException -> 0x014b }
            r10.recycle()     // Catch:{ RemoteException -> 0x014b }
            goto L_0x016e
        L_0x018e:
            r10.getMessage()     // Catch:{ all -> 0x0149 }
            if (r3 == 0) goto L_0x0196
            r3.close()     // Catch:{ all -> 0x00bc }
        L_0x0196:
            return r2
        L_0x0197:
            if (r3 == 0) goto L_0x019c
            r3.close()     // Catch:{ all -> 0x00bc }
        L_0x019c:
            throw r10     // Catch:{ all -> 0x00bc }
        L_0x019d:
            monitor-exit(r10)     // Catch:{ all -> 0x004c }
            throw r12     // Catch:{ all -> 0x00bc }
        L_0x019f:
            defpackage.fp3.n(r11)     // Catch:{ Exception -> 0x01a2 }
        L_0x01a2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq9.d(android.content.Context, java.lang.String, boolean):int");
    }

    public Object f(bg4 bg4) {
        return nd7.s((Executor) bg4.f(new lqb(kh7.class, Executor.class)));
    }

    public int j(Object obj) {
        return ((qq8) obj).U();
    }

    public Object parse(db7 db7) {
        return mqd.w(db7);
    }

    public Object r(gy8 gy8) {
        int N = lz7.N(gy8);
        fs8 fs8 = null;
        if (N == 0) {
            return null;
        }
        long j = 0;
        for (int i = 0; i < N; i++) {
            String z0 = gy8.z0();
            z0.getClass();
            if (z0.equals(ApiProtocol.PARAM_CHAT_ID)) {
                j = gy8.w0();
            } else if (!z0.equals("message")) {
                gy8.z();
            } else {
                fs8 = tpa.z(gy8);
            }
        }
        return new r71(j, fs8);
    }

    public lq9() {
        new LinkedHashSet(20);
    }
}
