package defpackage;

import android.os.Handler;
import android.util.SparseArray;
import java.util.concurrent.Executor;

/* renamed from: ay1  reason: default package */
public final class ay1 {
    public static final Object l = new Object();
    public static final SparseArray m = new SparseArray();
    public final va8 a = new va8(10, (byte) 0);
    public final Object b = new Object();
    public final by1 c;
    public final Executor d;
    public final Handler e;
    public yg2 f;
    public y7g g;
    public ev1 h;
    public final akc i;
    public final oq1 j;
    public int k;

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ay1(android.content.Context r8) {
        /*
            r7 = this;
            r7.<init>()
            va8 r0 = new va8
            r1 = 10
            r2 = 0
            r0.<init>((int) r1, (byte) r2)
            r7.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r7.b = r0
            r0 = 1
            r7.k = r0
            android.content.Context r1 = defpackage.lz7.n(r8)
        L_0x001b:
            boolean r2 = r1 instanceof android.content.ContextWrapper
            r3 = 0
            if (r2 == 0) goto L_0x002e
            boolean r2 = r1 instanceof android.app.Application
            if (r2 == 0) goto L_0x0027
            android.app.Application r1 = (android.app.Application) r1
            goto L_0x002e
        L_0x0027:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L_0x001b
        L_0x002e:
            r1 = 640(0x280, float:8.97E-43)
            android.content.Context r2 = defpackage.lz7.n(r8)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0051 }
            android.content.pm.PackageManager r4 = r2.getPackageManager()     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0051 }
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0051 }
            java.lang.Class<androidx.camera.core.impl.MetadataHolderService> r6 = androidx.camera.core.impl.MetadataHolderService.class
            r5.<init>(r2, r6)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0051 }
            android.content.pm.ServiceInfo r2 = r4.getServiceInfo(r5, r1)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0051 }
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0051 }
            if (r2 == 0) goto L_0x004e
            java.lang.String r4 = "androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER"
            java.lang.String r2 = r2.getString(r4)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0051 }
            goto L_0x004f
        L_0x004e:
            r2 = r3
        L_0x004f:
            if (r2 != 0) goto L_0x0053
        L_0x0051:
            r2 = r3
            goto L_0x0061
        L_0x0053:
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0051 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0051 }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0051 }
            androidx.camera.camera2.Camera2Config$DefaultProvider r2 = (androidx.camera.camera2.Camera2Config$DefaultProvider) r2     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0051 }
        L_0x0061:
            if (r2 == 0) goto L_0x01b8
            by1 r2 = r2.getCameraXConfig()
            r7.c = r2
            aa0 r4 = defpackage.by1.v0
            wma r2 = r2.a
            r2.getClass()
            java.lang.Object r2 = r2.h(r4)     // Catch:{ IllegalArgumentException -> 0x0075 }
            goto L_0x0076
        L_0x0075:
            r2 = r3
        L_0x0076:
            wrb r2 = (defpackage.wrb) r2
            if (r2 == 0) goto L_0x007e
            r2.toString()
            goto L_0x009b
        L_0x007e:
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0091 }
            java.lang.Class<zrb> r5 = defpackage.zrb.class
            r4.<init>(r8, r5)     // Catch:{ NameNotFoundException -> 0x0091 }
            android.content.pm.ServiceInfo r1 = r2.getServiceInfo(r4, r1)     // Catch:{ NameNotFoundException -> 0x0091 }
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0091 }
            if (r1 != 0) goto L_0x0093
        L_0x0091:
            r2 = r3
            goto L_0x0098
        L_0x0093:
            wrb r1 = defpackage.asb.a(r8, r1)     // Catch:{ NameNotFoundException -> 0x0091 }
            r2 = r1
        L_0x0098:
            java.util.Objects.toString(r2)
        L_0x009b:
            if (r2 != 0) goto L_0x00a2
            wrb r2 = defpackage.yrb.b
            java.util.Objects.toString(r2)
        L_0x00a2:
            yrb r1 = defpackage.yrb.c
            cd6 r1 = r1.a
            r1.v(r2)
            by1 r1 = r7.c
            aa0 r2 = defpackage.by1.X
            wma r1 = r1.a
            r1.getClass()
            java.lang.Object r1 = r1.h(r2)     // Catch:{ IllegalArgumentException -> 0x00b7 }
            goto L_0x00b8
        L_0x00b7:
            r1 = r3
        L_0x00b8:
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            by1 r2 = r7.c
            aa0 r4 = defpackage.by1.Y
            wma r2 = r2.a
            r2.getClass()
            java.lang.Object r2 = r2.h(r4)     // Catch:{ IllegalArgumentException -> 0x00c8 }
            goto L_0x00c9
        L_0x00c8:
            r2 = r3
        L_0x00c9:
            android.os.Handler r2 = (android.os.Handler) r2
            if (r1 != 0) goto L_0x00d2
            rw1 r1 = new rw1
            r1.<init>()
        L_0x00d2:
            r7.d = r1
            if (r2 != 0) goto L_0x00ed
            android.os.HandlerThread r1 = new android.os.HandlerThread
            java.lang.String r2 = "CameraX-scheduler"
            r4 = 10
            r1.<init>(r2, r4)
            r1.start()
            android.os.Looper r1 = r1.getLooper()
            android.os.Handler r1 = android.os.Handler.createAsync(r1)
            r7.e = r1
            goto L_0x00ef
        L_0x00ed:
            r7.e = r2
        L_0x00ef:
            by1 r1 = r7.c
            aa0 r2 = defpackage.by1.Z
            java.lang.Object r1 = r1.f(r2, r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r2 = l
            monitor-enter(r2)
            if (r1 != 0) goto L_0x0103
            monitor-exit(r2)     // Catch:{ all -> 0x0100 }
            goto L_0x0165
        L_0x0100:
            r7 = move-exception
            goto L_0x01b6
        L_0x0103:
            int r3 = r1.intValue()     // Catch:{ all -> 0x0100 }
            java.lang.String r4 = "minLogLevel"
            r5 = 6
            r6 = 3
            defpackage.c54.l(r3, r4, r6, r5)     // Catch:{ all -> 0x0100 }
            android.util.SparseArray r3 = m     // Catch:{ all -> 0x0100 }
            int r4 = r1.intValue()     // Catch:{ all -> 0x0100 }
            java.lang.Object r4 = r3.get(r4)     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x012a
            int r4 = r1.intValue()     // Catch:{ all -> 0x0100 }
            java.lang.Object r4 = r3.get(r4)     // Catch:{ all -> 0x0100 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0100 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0100 }
            int r4 = r4 + r0
            goto L_0x012b
        L_0x012a:
            r4 = r0
        L_0x012b:
            int r1 = r1.intValue()     // Catch:{ all -> 0x0100 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0100 }
            r3.put(r1, r4)     // Catch:{ all -> 0x0100 }
            int r1 = r3.size()     // Catch:{ all -> 0x0100 }
            if (r1 != 0) goto L_0x013f
            defpackage.mqd.e = r6     // Catch:{ all -> 0x0100 }
            goto L_0x0164
        L_0x013f:
            java.lang.Object r1 = r3.get(r6)     // Catch:{ all -> 0x0100 }
            if (r1 == 0) goto L_0x0148
            defpackage.mqd.e = r6     // Catch:{ all -> 0x0100 }
            goto L_0x0164
        L_0x0148:
            r1 = 4
            java.lang.Object r4 = r3.get(r1)     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x0152
            defpackage.mqd.e = r1     // Catch:{ all -> 0x0100 }
            goto L_0x0164
        L_0x0152:
            r1 = 5
            java.lang.Object r4 = r3.get(r1)     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x015c
            defpackage.mqd.e = r1     // Catch:{ all -> 0x0100 }
            goto L_0x0164
        L_0x015c:
            java.lang.Object r1 = r3.get(r5)     // Catch:{ all -> 0x0100 }
            if (r1 == 0) goto L_0x0164
            defpackage.mqd.e = r5     // Catch:{ all -> 0x0100 }
        L_0x0164:
            monitor-exit(r2)     // Catch:{ all -> 0x0100 }
        L_0x0165:
            by1 r1 = r7.c
            r1.getClass()
            aa0 r2 = defpackage.by1.u0
            ox1 r3 = defpackage.akc.a
            wma r1 = r1.a
            r1.getClass()
            java.lang.Object r3 = r1.h(r2)     // Catch:{ IllegalArgumentException -> 0x0177 }
        L_0x0177:
            akc r3 = (defpackage.akc) r3
            java.util.Objects.requireNonNull(r3)
            long r1 = r3.a()
            boolean r4 = r3 instanceof defpackage.ox1
            if (r4 == 0) goto L_0x018b
            ox1 r3 = (defpackage.ox1) r3
            akc r1 = r3.c(r1)
            goto L_0x0191
        L_0x018b:
            rue r4 = new rue
            r4.<init>(r1, r3)
            r1 = r4
        L_0x0191:
            r7.i = r1
            java.lang.Object r1 = r7.b
            monitor-enter(r1)
            int r2 = r7.k     // Catch:{ all -> 0x01b3 }
            if (r2 != r0) goto L_0x019b
            goto L_0x019c
        L_0x019b:
            r0 = 0
        L_0x019c:
            java.lang.String r2 = "CameraX.initInternal() should only be called once per instance"
            defpackage.c54.p(r2, r0)     // Catch:{ all -> 0x01b3 }
            r0 = 2
            r7.k = r0     // Catch:{ all -> 0x01b3 }
            f9 r0 = new f9     // Catch:{ all -> 0x01b3 }
            r2 = 16
            r0.<init>(r7, r2, r8)     // Catch:{ all -> 0x01b3 }
            oq1 r8 = defpackage.f8.g(r0)     // Catch:{ all -> 0x01b3 }
            monitor-exit(r1)     // Catch:{ all -> 0x01b3 }
            r7.j = r8
            return
        L_0x01b3:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01b3 }
            throw r7
        L_0x01b6:
            monitor-exit(r2)     // Catch:{ all -> 0x0100 }
            throw r7
        L_0x01b8:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay1.<init>(android.content.Context):void");
    }
}
