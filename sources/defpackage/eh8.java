package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: eh8  reason: default package */
public final class eh8 {
    public static final boolean c = Log.isLoggable("MediaRouter", 3);
    public static ah8 d;
    public final Context a;
    public final ArrayList b = new ArrayList();

    public eh8(Context context) {
        this.a = context;
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [jie, nie] */
    public static ah8 c() {
        ah8 ah8 = d;
        if (ah8 == null) {
            return null;
        }
        if (!ah8.b) {
            ah8.b = true;
            int i = Build.VERSION.SDK_INT;
            boolean z = false;
            Context context = ah8.a;
            if (i >= 30) {
                int i2 = dl8.b;
                Intent intent = new Intent(context, dl8.class);
                intent.setPackage(context.getPackageName());
                if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                    z = true;
                }
                ah8.d = z;
            } else {
                ah8.d = false;
            }
            if (ah8.d) {
                ah8.e = new kf8(context, new re6(20, (Object) ah8));
            } else {
                ah8.e = null;
            }
            ah8.c = new nie(context, ah8);
            ah8.o = new fh8(new q57(11, ah8));
            ah8.a(ah8.c);
            kf8 kf8 = ah8.e;
            if (kf8 != null) {
                ah8.a(kf8);
            }
            xu3 xu3 = new xu3(context, (zec) ah8);
            if (!xu3.a) {
                xu3.a = true;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                intentFilter.addDataScheme("package");
                Handler handler = (Handler) xu3.d;
                ((Context) xu3.b).registerReceiver((an) xu3.g, intentFilter, (String) null, handler);
                handler.post((q57) xu3.h);
            }
        }
        return d;
    }

    public static eh8 d(Context context) {
        if (context != null) {
            b();
            if (d == null) {
                d = new ah8(context.getApplicationContext());
            }
            ArrayList arrayList = d.f;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    eh8 eh8 = (eh8) ((WeakReference) arrayList.get(size)).get();
                    if (eh8 == null) {
                        arrayList.remove(size);
                    } else if (eh8.a == context) {
                        return eh8;
                    }
                } else {
                    eh8 eh82 = new eh8(context);
                    arrayList.add(new WeakReference(eh82));
                    return eh82;
                }
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    public static boolean e(wg8 wg8) {
        if (wg8 != null) {
            b();
            ah8 c2 = c();
            c2.getClass();
            if (wg8.c()) {
                return false;
            }
            if (!c2.n) {
                ArrayList arrayList = c2.g;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    dh8 dh8 = (dh8) arrayList.get(i);
                    if (dh8.d() || !dh8.h(wg8)) {
                        i++;
                    }
                }
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public static void g(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        b();
        ah8 c2 = c();
        dh8 c3 = c2.c();
        if (c2.f() != c3) {
            c2.h(c3, i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: xg8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.wg8 r7, defpackage.lz7 r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "selector must not be null"
            if (r7 == 0) goto L_0x00e4
            if (r8 == 0) goto L_0x00dc
            b()
            boolean r1 = c
            if (r1 == 0) goto L_0x0016
            r7.toString()
            r8.toString()
            java.lang.Integer.toHexString(r9)
        L_0x0016:
            java.util.ArrayList r1 = r6.b
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L_0x001e:
            if (r4 >= r2) goto L_0x002e
            java.lang.Object r5 = r1.get(r4)
            xg8 r5 = (defpackage.xg8) r5
            lz7 r5 = r5.b
            if (r5 != r8) goto L_0x002b
            goto L_0x002f
        L_0x002b:
            int r4 = r4 + 1
            goto L_0x001e
        L_0x002e:
            r4 = -1
        L_0x002f:
            if (r4 >= 0) goto L_0x003a
            xg8 r2 = new xg8
            r2.<init>(r6, r8)
            r1.add(r2)
            goto L_0x0041
        L_0x003a:
            java.lang.Object r6 = r1.get(r4)
            r2 = r6
            xg8 r2 = (defpackage.xg8) r2
        L_0x0041:
            int r6 = r2.d
            r8 = 1
            if (r9 == r6) goto L_0x0049
            r2.d = r9
            r3 = r8
        L_0x0049:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r6 = r9 & 1
            if (r6 == 0) goto L_0x0052
            r3 = r8
        L_0x0052:
            r2.e = r4
            wg8 r6 = r2.c
            r6.a()
            r7.a()
            java.util.List r6 = r6.b
            java.util.List r9 = r7.b
            boolean r6 = r6.containsAll(r9)
            if (r6 != 0) goto L_0x00d1
            wg8 r6 = r2.c
            if (r6 == 0) goto L_0x00cb
            r6.a()
            java.util.List r9 = r6.b
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x007d
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.List r6 = r6.b
            r9.<init>(r6)
            goto L_0x007e
        L_0x007d:
            r9 = 0
        L_0x007e:
            java.util.ArrayList r6 = r7.b()
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x00b3
            java.util.Iterator r6 = r6.iterator()
        L_0x008c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b3
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x00ab
            if (r9 != 0) goto L_0x00a1
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00a1:
            boolean r0 = r9.contains(r7)
            if (r0 != 0) goto L_0x008c
            r9.add(r7)
            goto L_0x008c
        L_0x00ab:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "category must not be null"
            r6.<init>(r7)
            throw r6
        L_0x00b3:
            if (r9 != 0) goto L_0x00b8
            wg8 r6 = defpackage.wg8.c
            goto L_0x00c8
        L_0x00b8:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = "controlCategories"
            r6.putStringArrayList(r7, r9)
            wg8 r7 = new wg8
            r7.<init>(r9, r6)
            r6 = r7
        L_0x00c8:
            r2.c = r6
            goto L_0x00d2
        L_0x00cb:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r0)
            throw r6
        L_0x00d1:
            r8 = r3
        L_0x00d2:
            if (r8 == 0) goto L_0x00db
            ah8 r6 = c()
            r6.j()
        L_0x00db:
            return
        L_0x00dc:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "callback must not be null"
            r6.<init>(r7)
            throw r6
        L_0x00e4:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh8.a(wg8, lz7, int):void");
    }

    public final void f(lz7 lz7) {
        if (lz7 != null) {
            b();
            if (c) {
                lz7.toString();
            }
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (((xg8) arrayList.get(i)).b == lz7) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                arrayList.remove(i);
                c().j();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }
}
