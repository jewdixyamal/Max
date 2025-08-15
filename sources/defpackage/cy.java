package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* renamed from: cy  reason: default package */
public final class cy extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ cy() {
        this.a = 6;
    }

    private final void a(Message message) {
        Set<lr4> set;
        Set<lr4> set2;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 1) {
            x94 x94 = (x94) this.b;
            if (obj != x94.y) {
                return;
            }
            if (x94.p == 2 || x94.i()) {
                x94.y = null;
                boolean z = obj2 instanceof Exception;
                imc imc = x94.c;
                if (z) {
                    imc.X((Exception) obj2, false);
                    return;
                }
                try {
                    x94.b.m((byte[]) obj2);
                    imc.c = null;
                    HashSet hashSet = (HashSet) imc.b;
                    zw6 j = zw6.j(hashSet);
                    hashSet.clear();
                    ls5 l = j.listIterator(0);
                    while (l.hasNext()) {
                        x94 x942 = (x94) l.next();
                        if (x942.l()) {
                            x942.h(true);
                        }
                    }
                } catch (Exception e) {
                    imc.X(e, true);
                }
            }
        } else if (i == 2) {
            x94 x943 = (x94) this.b;
            if (obj == x943.x && x943.i()) {
                x943.x = null;
                if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                    x943.k((Throwable) obj2, false);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (x943.e == 3) {
                        t65 t65 = x943.b;
                        byte[] bArr2 = x943.w;
                        int i2 = oaf.a;
                        t65.l(bArr2, bArr);
                        ex3 ex3 = x943.i;
                        synchronized (ex3.b) {
                            set2 = ex3.o;
                        }
                        for (lr4 b2 : set2) {
                            b2.b();
                        }
                        return;
                    }
                    byte[] l2 = x943.b.l(x943.v, bArr);
                    int i3 = x943.e;
                    if (!((i3 != 2 && (i3 != 0 || x943.w == null)) || l2 == null || l2.length == 0)) {
                        x943.w = l2;
                    }
                    x943.p = 4;
                    ex3 ex32 = x943.i;
                    synchronized (ex32.b) {
                        set = ex32.o;
                    }
                    for (lr4 a2 : set) {
                        a2.a();
                    }
                } catch (Exception | NoSuchMethodError e2) {
                    x943.k(e2, true);
                }
            }
        }
    }

    private final void b(Message message) {
        Set<kr4> set;
        Set<kr4> set2;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 0) {
            w94 w94 = (w94) this.b;
            if (obj != w94.x) {
                return;
            }
            if (w94.o == 2 || w94.i()) {
                w94.x = null;
                boolean z = obj2 instanceof Exception;
                h7b h7b = w94.c;
                if (z) {
                    h7b.s((Exception) obj2, false);
                    return;
                }
                try {
                    w94.b.m((byte[]) obj2);
                    h7b.c = null;
                    HashSet hashSet = (HashSet) h7b.b;
                    zw6 j = zw6.j(hashSet);
                    hashSet.clear();
                    ls5 l = j.listIterator(0);
                    while (l.hasNext()) {
                        w94 w942 = (w94) l.next();
                        if (w942.l()) {
                            w942.h(true);
                        }
                    }
                } catch (Exception e) {
                    h7b.s(e, true);
                }
            }
        } else if (i == 1) {
            w94 w943 = (w94) this.b;
            if (obj == w943.w && w943.i()) {
                w943.w = null;
                if (obj2 instanceof Exception) {
                    w943.k((Exception) obj2, false);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (w943.e == 3) {
                        s65 s65 = w943.b;
                        byte[] bArr2 = w943.v;
                        int i2 = maf.a;
                        s65.l(bArr2, bArr);
                        ex3 ex3 = w943.i;
                        synchronized (ex3.b) {
                            set2 = ex3.o;
                        }
                        for (kr4 b2 : set2) {
                            b2.b();
                        }
                        return;
                    }
                    byte[] l2 = w943.b.l(w943.u, bArr);
                    int i3 = w943.e;
                    if (!((i3 != 2 && (i3 != 0 || w943.v == null)) || l2 == null || l2.length == 0)) {
                        w943.v = l2;
                    }
                    w943.o = 4;
                    ex3 ex32 = w943.i;
                    synchronized (ex32.b) {
                        set = ex32.o;
                    }
                    for (kr4 a2 : set) {
                        a2.a();
                    }
                } catch (Exception e2) {
                    w943.k(e2, true);
                }
            }
        }
    }

    private final void c(Message message) {
        th8 th8;
        t68 t68;
        cy cyVar;
        if (message.what == 1) {
            synchronized (((t68) this.b).a) {
                th8 = (th8) ((WeakReference) ((t68) this.b).c).get();
                t68 = (t68) this.b;
                cyVar = (cy) t68.d;
            }
            if (th8 != null && t68 == th8.getCallback() && cyVar != null) {
                th8.a((vi8) message.obj);
                ((t68) this.b).getClass();
                th8.a((vi8) null);
            }
        }
    }

    public void d(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: dy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: dy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: ey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: dy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: ey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: dy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: dy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: dy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: dy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: dy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: dy} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0373 A[LOOP:3: B:115:0x0373->B:118:0x037f, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0425 A[LOOP:7: B:172:0x0425->B:175:0x0430, LOOP_START] */
    public final void handleMessage(android.os.Message r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 3
            r3 = 4
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            int r8 = r0.a
            switch(r8) {
                case 0: goto L_0x0408;
                case 1: goto L_0x0354;
                case 2: goto L_0x0350;
                case 3: goto L_0x034c;
                case 4: goto L_0x0314;
                case 5: goto L_0x02d9;
                case 6: goto L_0x00f2;
                case 7: goto L_0x00bb;
                case 8: goto L_0x0095;
                case 9: goto L_0x006f;
                case 10: goto L_0x0056;
                case 11: goto L_0x002d;
                case 12: goto L_0x0029;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.Object r1 = r1.obj
            oh8 r1 = (defpackage.oh8) r1
            java.lang.Object r0 = r0.b
            m5d r0 = (defpackage.m5d) r0
            boolean r2 = r0.E(r1)
            if (r2 == 0) goto L_0x0028
            nh8 r2 = r1.d     // Catch:{ RemoteException -> 0x0025 }
            defpackage.fm9.l(r2)     // Catch:{ RemoteException -> 0x0025 }
            r2.onDisconnected()     // Catch:{ RemoteException -> 0x0025 }
        L_0x0025:
            r0.L(r1)
        L_0x0028:
            return
        L_0x0029:
            r20.c(r21)
            return
        L_0x002d:
            int r1 = r1.what
            java.lang.Object r0 = r0.b
            ug8 r0 = (defpackage.ug8) r0
            if (r1 == r7) goto L_0x0040
            if (r1 == r5) goto L_0x0038
            goto L_0x0055
        L_0x0038:
            r0.Y = r6
            bg8 r1 = r0.X
            r0.f(r1)
            goto L_0x0055
        L_0x0040:
            r0.s0 = r6
            fd7 r1 = r0.o
            if (r1 == 0) goto L_0x0055
            vg8 r2 = r0.Z
            java.lang.Object r1 = r1.a
            ah8 r1 = (defpackage.ah8) r1
            ch8 r0 = r1.d(r0)
            if (r0 == 0) goto L_0x0055
            r1.l(r0, r2)
        L_0x0055:
            return
        L_0x0056:
            int r1 = r1.what
            java.lang.Object r0 = r0.b
            pg8 r0 = (defpackage.pg8) r0
            if (r1 == r7) goto L_0x006b
            if (r1 == r5) goto L_0x0061
            goto L_0x006e
        L_0x0061:
            dh8 r1 = r0.H0
            if (r1 == 0) goto L_0x006e
            r0.H0 = r4
            r0.o()
            goto L_0x006e
        L_0x006b:
            r0.n()
        L_0x006e:
            return
        L_0x006f:
            int r2 = r1.what
            if (r2 == r7) goto L_0x0074
            goto L_0x0094
        L_0x0074:
            java.lang.Object r1 = r1.obj
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.b
            gg8 r0 = (defpackage.gg8) r0
            r0.getClass()
            long r2 = android.os.SystemClock.uptimeMillis()
            r0.A0 = r2
            java.util.ArrayList r2 = r0.u0
            r2.clear()
            java.util.ArrayList r2 = r0.u0
            r2.addAll(r1)
            fg8 r0 = r0.v0
            r0.C()
        L_0x0094:
            return
        L_0x0095:
            int r2 = r1.what
            if (r2 == r7) goto L_0x009a
            goto L_0x00ba
        L_0x009a:
            java.lang.Object r1 = r1.obj
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.b
            qf8 r0 = (defpackage.qf8) r0
            r0.getClass()
            long r2 = android.os.SystemClock.uptimeMillis()
            r0.y0 = r2
            java.util.ArrayList r2 = r0.u0
            r2.clear()
            java.util.ArrayList r2 = r0.u0
            r2.addAll(r1)
            pf8 r0 = r0.v0
            r0.notifyDataSetChanged()
        L_0x00ba:
            return
        L_0x00bb:
            int r4 = r1.what
            int r5 = r1.arg1
            java.lang.Object r6 = r1.obj
            android.os.Bundle r1 = r21.peekData()
            java.lang.Object r0 = r0.b
            gf8 r0 = (defpackage.gf8) r0
            android.util.SparseArray r7 = r0.j
            java.lang.Object r7 = r7.get(r5)
            vec r7 = (defpackage.vec) r7
            if (r7 != 0) goto L_0x00d4
            goto L_0x00f1
        L_0x00d4:
            android.util.SparseArray r0 = r0.j
            r0.remove(r5)
            if (r4 == r2) goto L_0x00ec
            if (r4 == r3) goto L_0x00de
            goto L_0x00f1
        L_0x00de:
            if (r1 != 0) goto L_0x00e1
            goto L_0x00e6
        L_0x00e1:
            java.lang.String r0 = "error"
            r1.getString(r0)
        L_0x00e6:
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.util.Objects.toString(r6)
            goto L_0x00f1
        L_0x00ec:
            android.os.Bundle r6 = (android.os.Bundle) r6
            r7.a(r6)
        L_0x00f1:
            return
        L_0x00f2:
            java.lang.Object r2 = r0.b
            cj8 r2 = (defpackage.cj8) r2
            if (r2 == 0) goto L_0x02d5
            android.os.Bundle r0 = r21.getData()
            int r3 = r1.what
            java.lang.String r4 = "data_callback_token"
            java.lang.String r5 = "data_calling_uid"
            java.lang.String r8 = "data_calling_pid"
            java.lang.String r9 = "data_package_name"
            java.lang.String r10 = "data_root_hints"
            java.lang.String r11 = "data_media_item_id"
            java.lang.String r12 = "data_result_receiver"
            gaa r2 = r2.b
            switch(r3) {
                case 1: goto L_0x026d;
                case 2: goto L_0x0255;
                case 3: goto L_0x0229;
                case 4: goto L_0x0206;
                case 5: goto L_0x01d8;
                case 6: goto L_0x01a9;
                case 7: goto L_0x0190;
                case 8: goto L_0x0153;
                case 9: goto L_0x0116;
                default: goto L_0x0111;
            }
        L_0x0111:
            r21.toString()
            goto L_0x02d8
        L_0x0116:
            java.lang.String r3 = "data_custom_action_extras"
            android.os.Bundle r17 = r0.getBundle(r3)
            defpackage.bi8.a(r17)
            java.lang.String r3 = "data_custom_action"
            java.lang.String r16 = r0.getString(r3)
            android.os.Parcelable r0 = r0.getParcelable(r12)
            r18 = r0
            android.support.v4.os.ResultReceiver r18 = (android.support.v4.os.ResultReceiver) r18
            c78 r15 = new c78
            android.os.Messenger r0 = r1.replyTo
            r15.<init>(r0)
            r2.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L_0x02d8
            if (r18 != 0) goto L_0x0141
            goto L_0x02d8
        L_0x0141:
            java.lang.Object r0 = r2.a
            cj8 r0 = (defpackage.cj8) r0
            cy r0 = r0.Z
            r8g r1 = new r8g
            r13 = r1
            r14 = r2
            r13.<init>((defpackage.gaa) r14, (defpackage.c78) r15, (java.lang.String) r16, (android.os.Bundle) r17, (android.support.v4.os.ResultReceiver) r18)
            r0.d(r1)
            goto L_0x02d8
        L_0x0153:
            java.lang.String r3 = "data_search_extras"
            android.os.Bundle r17 = r0.getBundle(r3)
            defpackage.bi8.a(r17)
            java.lang.String r3 = "data_search_query"
            java.lang.String r16 = r0.getString(r3)
            android.os.Parcelable r0 = r0.getParcelable(r12)
            r18 = r0
            android.support.v4.os.ResultReceiver r18 = (android.support.v4.os.ResultReceiver) r18
            c78 r15 = new c78
            android.os.Messenger r0 = r1.replyTo
            r15.<init>(r0)
            r2.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L_0x02d8
            if (r18 != 0) goto L_0x017e
            goto L_0x02d8
        L_0x017e:
            java.lang.Object r0 = r2.a
            cj8 r0 = (defpackage.cj8) r0
            cy r0 = r0.Z
            a78 r1 = new a78
            r13 = r1
            r14 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            r0.d(r1)
            goto L_0x02d8
        L_0x0190:
            c78 r0 = new c78
            android.os.Messenger r1 = r1.replyTo
            r0.<init>(r1)
            java.lang.Object r1 = r2.a
            cj8 r1 = (defpackage.cj8) r1
            cy r1 = r1.Z
            i76 r3 = new i76
            r4 = 9
            r3.<init>((java.lang.Object) r2, (java.lang.Object) r0, (boolean) r6, (int) r4)
            r1.d(r3)
            goto L_0x02d8
        L_0x01a9:
            android.os.Bundle r18 = r0.getBundle(r10)
            defpackage.bi8.a(r18)
            c78 r3 = new c78
            android.os.Messenger r1 = r1.replyTo
            r3.<init>(r1)
            java.lang.String r19 = r0.getString(r9)
            int r15 = r0.getInt(r8)
            int r14 = r0.getInt(r5)
            java.lang.Object r0 = r2.a
            cj8 r0 = (defpackage.cj8) r0
            cy r0 = r0.Z
            k84 r1 = new k84
            r13 = r1
            r16 = r3
            r17 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.d(r1)
            goto L_0x02d8
        L_0x01d8:
            java.lang.String r3 = r0.getString(r11)
            android.os.Parcelable r0 = r0.getParcelable(r12)
            android.support.v4.os.ResultReceiver r0 = (android.support.v4.os.ResultReceiver) r0
            c78 r4 = new c78
            android.os.Messenger r1 = r1.replyTo
            r4.<init>(r1)
            r2.getClass()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x02d8
            if (r0 != 0) goto L_0x01f6
            goto L_0x02d8
        L_0x01f6:
            java.lang.Object r1 = r2.a
            cj8 r1 = (defpackage.cj8) r1
            cy r1 = r1.Z
            a78 r5 = new a78
            r5.<init>(r2, r4, r3, r0)
            r1.d(r5)
            goto L_0x02d8
        L_0x0206:
            java.lang.String r16 = r0.getString(r11)
            android.os.IBinder r17 = r0.getBinder(r4)
            c78 r15 = new c78
            android.os.Messenger r0 = r1.replyTo
            r15.<init>(r0)
            java.lang.Object r0 = r2.a
            cj8 r0 = (defpackage.cj8) r0
            cy r0 = r0.Z
            r8g r1 = new r8g
            r18 = 3
            r13 = r1
            r14 = r2
            r13.<init>((java.lang.Object) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (int) r18)
            r0.d(r1)
            goto L_0x02d8
        L_0x0229:
            java.lang.String r3 = "data_options"
            android.os.Bundle r18 = r0.getBundle(r3)
            defpackage.bi8.a(r18)
            java.lang.String r16 = r0.getString(r11)
            android.os.IBinder r17 = r0.getBinder(r4)
            c78 r15 = new c78
            android.os.Messenger r0 = r1.replyTo
            r15.<init>(r0)
            java.lang.Object r0 = r2.a
            cj8 r0 = (defpackage.cj8) r0
            cy r0 = r0.Z
            z68 r1 = new z68
            r19 = 0
            r13 = r1
            r14 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.d(r1)
            goto L_0x02d8
        L_0x0255:
            c78 r0 = new c78
            android.os.Messenger r1 = r1.replyTo
            r0.<init>(r1)
            java.lang.Object r1 = r2.a
            cj8 r1 = (defpackage.cj8) r1
            cy r1 = r1.Z
            h76 r3 = new h76
            r4 = 11
            r3.<init>((java.lang.Object) r2, (java.lang.Object) r0, (boolean) r6, (int) r4)
            r1.d(r3)
            goto L_0x02d8
        L_0x026d:
            android.os.Bundle r18 = r0.getBundle(r10)
            defpackage.bi8.a(r18)
            java.lang.String r3 = r0.getString(r9)
            int r14 = r0.getInt(r8)
            int r15 = r0.getInt(r5)
            c78 r0 = new c78
            android.os.Messenger r1 = r1.replyTo
            r0.<init>(r1)
            java.lang.Object r1 = r2.a
            cj8 r1 = (defpackage.cj8) r1
            if (r3 == 0) goto L_0x02b6
            android.content.pm.PackageManager r4 = r1.getPackageManager()
            java.lang.String[] r4 = r4.getPackagesForUid(r15)
            if (r4 == 0) goto L_0x02b9
            int r5 = r4.length
        L_0x0298:
            if (r6 >= r5) goto L_0x02b9
            r8 = r4[r6]
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x02b4
            y68 r4 = new y68
            r13 = r4
            r16 = r0
            r17 = r2
            r19 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19)
            cy r0 = r1.Z
            r0.d(r4)
            goto L_0x02d8
        L_0x02b4:
            int r6 = r6 + r7
            goto L_0x0298
        L_0x02b6:
            r1.getClass()
        L_0x02b9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Package/uid mismatch: uid="
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r2 = " package="
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02d5:
            r0.removeCallbacksAndMessages(r4)
        L_0x02d8:
            return
        L_0x02d9:
            java.lang.Object r2 = r1.obj
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L_0x02e0
            goto L_0x0313
        L_0x02e0:
            java.lang.Object r0 = r0.b
            ba4 r0 = (defpackage.ba4) r0
            java.util.ArrayList r0 = r0.m
            java.util.Iterator r0 = r0.iterator()
        L_0x02ea:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0313
            java.lang.Object r4 = r0.next()
            x94 r4 = (defpackage.x94) r4
            r4.p()
            byte[] r7 = r4.v
            boolean r7 = java.util.Arrays.equals(r7, r2)
            if (r7 == 0) goto L_0x02ea
            int r0 = r1.what
            if (r0 == r5) goto L_0x0306
            goto L_0x0313
        L_0x0306:
            int r0 = r4.e
            if (r0 != 0) goto L_0x0313
            int r0 = r4.p
            if (r0 != r3) goto L_0x0313
            int r0 = defpackage.oaf.a
            r4.h(r6)
        L_0x0313:
            return
        L_0x0314:
            java.lang.Object r2 = r1.obj
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L_0x031b
            goto L_0x034b
        L_0x031b:
            java.lang.Object r0 = r0.b
            aa4 r0 = (defpackage.aa4) r0
            java.util.ArrayList r0 = r0.m
            java.util.Iterator r0 = r0.iterator()
        L_0x0325:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x034b
            java.lang.Object r4 = r0.next()
            w94 r4 = (defpackage.w94) r4
            byte[] r7 = r4.u
            boolean r7 = java.util.Arrays.equals(r7, r2)
            if (r7 == 0) goto L_0x0325
            int r0 = r1.what
            if (r0 == r5) goto L_0x033e
            goto L_0x034b
        L_0x033e:
            int r0 = r4.e
            if (r0 != 0) goto L_0x034b
            int r0 = r4.o
            if (r0 != r3) goto L_0x034b
            int r0 = defpackage.maf.a
            r4.h(r6)
        L_0x034b:
            return
        L_0x034c:
            r20.a(r21)
            return
        L_0x0350:
            r20.b(r21)
            return
        L_0x0354:
            java.lang.Object r0 = r0.b
            r6 = r0
            gy r6 = (defpackage.gy) r6
            r6.getClass()
            int r0 = r1.what
            if (r0 == r7) goto L_0x03d3
            if (r0 == r5) goto L_0x03a5
            if (r0 == r2) goto L_0x039f
            if (r0 == r3) goto L_0x0383
            java.util.concurrent.atomic.AtomicReference r0 = r6.o
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            int r1 = r1.what
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.<init>(r1)
        L_0x0373:
            boolean r1 = r0.compareAndSet(r4, r2)
            if (r1 == 0) goto L_0x037b
            goto L_0x03fa
        L_0x037b:
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x0373
            goto L_0x03fa
        L_0x0383:
            java.lang.Object r0 = r1.obj
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.media.MediaCodec r1 = r6.a     // Catch:{ RuntimeException -> 0x038e }
            r1.setParameters(r0)     // Catch:{ RuntimeException -> 0x038e }
            goto L_0x03fa
        L_0x038e:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r1 = r6.o
        L_0x0391:
            boolean r2 = r1.compareAndSet(r4, r0)
            if (r2 == 0) goto L_0x0398
            goto L_0x03fa
        L_0x0398:
            java.lang.Object r2 = r1.get()
            if (r2 == 0) goto L_0x0391
            goto L_0x03fa
        L_0x039f:
            ae3 r0 = r6.X
            r0.g()
            goto L_0x03fa
        L_0x03a5:
            java.lang.Object r0 = r1.obj
            r2 = r0
            ey r2 = (defpackage.ey) r2
            int r8 = r2.a
            int r9 = r2.b
            android.media.MediaCodec$CryptoInfo r10 = r2.d
            long r11 = r2.e
            int r13 = r2.f
            java.lang.Object r1 = defpackage.gy.s0     // Catch:{ RuntimeException -> 0x03c1 }
            monitor-enter(r1)     // Catch:{ RuntimeException -> 0x03c1 }
            android.media.MediaCodec r7 = r6.a     // Catch:{ all -> 0x03be }
            r7.queueSecureInputBuffer(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x03be }
            monitor-exit(r1)     // Catch:{ all -> 0x03be }
            goto L_0x03d1
        L_0x03be:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03be }
            throw r0     // Catch:{ RuntimeException -> 0x03c1 }
        L_0x03c1:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r3 = r6.o
        L_0x03c4:
            boolean r1 = r3.compareAndSet(r4, r0)
            if (r1 == 0) goto L_0x03cb
            goto L_0x03d1
        L_0x03cb:
            java.lang.Object r1 = r3.get()
            if (r1 == 0) goto L_0x03c4
        L_0x03d1:
            r4 = r2
            goto L_0x03fa
        L_0x03d3:
            java.lang.Object r0 = r1.obj
            r2 = r0
            ey r2 = (defpackage.ey) r2
            int r8 = r2.a
            int r9 = r2.b
            int r10 = r2.c
            long r11 = r2.e
            int r13 = r2.f
            android.media.MediaCodec r7 = r6.a     // Catch:{ RuntimeException -> 0x03e8 }
            r7.queueInputBuffer(r8, r9, r10, r11, r13)     // Catch:{ RuntimeException -> 0x03e8 }
            goto L_0x03f9
        L_0x03e8:
            r0 = move-exception
            r3 = r0
            java.util.concurrent.atomic.AtomicReference r6 = r6.o
        L_0x03ec:
            boolean r0 = r6.compareAndSet(r4, r3)
            if (r0 == 0) goto L_0x03f3
            goto L_0x03f9
        L_0x03f3:
            java.lang.Object r0 = r6.get()
            if (r0 == 0) goto L_0x03ec
        L_0x03f9:
            goto L_0x03d1
        L_0x03fa:
            if (r4 == 0) goto L_0x0407
            java.util.ArrayDeque r1 = defpackage.gy.Z
            monitor-enter(r1)
            r1.add(r4)     // Catch:{ all -> 0x0404 }
            monitor-exit(r1)     // Catch:{ all -> 0x0404 }
            goto L_0x0407
        L_0x0404:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0404 }
            throw r0
        L_0x0407:
            return
        L_0x0408:
            java.lang.Object r0 = r0.b
            r2 = r0
            fy r2 = (defpackage.fy) r2
            r2.getClass()
            int r0 = r1.what
            if (r0 == 0) goto L_0x0467
            if (r0 == r7) goto L_0x0439
            if (r0 == r5) goto L_0x0433
            java.util.concurrent.atomic.AtomicReference r0 = r2.d
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            int r1 = r1.what
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.<init>(r1)
        L_0x0425:
            boolean r1 = r0.compareAndSet(r4, r3)
            if (r1 == 0) goto L_0x042c
            goto L_0x048d
        L_0x042c:
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x0425
            goto L_0x048d
        L_0x0433:
            ae3 r0 = r2.e
            r0.g()
            goto L_0x048d
        L_0x0439:
            java.lang.Object r0 = r1.obj
            r3 = r0
            dy r3 = (defpackage.dy) r3
            int r6 = r3.a
            int r7 = r3.b
            android.media.MediaCodec$CryptoInfo r8 = r3.d
            long r9 = r3.e
            int r11 = r3.f
            java.lang.Object r1 = defpackage.fy.h     // Catch:{ RuntimeException -> 0x0455 }
            monitor-enter(r1)     // Catch:{ RuntimeException -> 0x0455 }
            android.media.MediaCodec r5 = r2.a     // Catch:{ all -> 0x0452 }
            r5.queueSecureInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ all -> 0x0452 }
            monitor-exit(r1)     // Catch:{ all -> 0x0452 }
            goto L_0x0465
        L_0x0452:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0452 }
            throw r0     // Catch:{ RuntimeException -> 0x0455 }
        L_0x0455:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r5 = r2.d
        L_0x0458:
            boolean r1 = r5.compareAndSet(r4, r0)
            if (r1 == 0) goto L_0x045f
            goto L_0x0465
        L_0x045f:
            java.lang.Object r1 = r5.get()
            if (r1 == 0) goto L_0x0458
        L_0x0465:
            r4 = r3
            goto L_0x048d
        L_0x0467:
            java.lang.Object r0 = r1.obj
            r1 = r0
            dy r1 = (defpackage.dy) r1
            int r6 = r1.a
            int r7 = r1.b
            int r8 = r1.c
            long r9 = r1.e
            int r11 = r1.f
            android.media.MediaCodec r5 = r2.a     // Catch:{ RuntimeException -> 0x047c }
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ RuntimeException -> 0x047c }
            goto L_0x048c
        L_0x047c:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r2.d
        L_0x047f:
            boolean r3 = r2.compareAndSet(r4, r0)
            if (r3 == 0) goto L_0x0486
            goto L_0x048c
        L_0x0486:
            java.lang.Object r3 = r2.get()
            if (r3 == 0) goto L_0x047f
        L_0x048c:
            r4 = r1
        L_0x048d:
            if (r4 == 0) goto L_0x049a
            java.util.ArrayDeque r1 = defpackage.fy.g
            monitor-enter(r1)
            r1.add(r4)     // Catch:{ all -> 0x0497 }
            monitor-exit(r1)     // Catch:{ all -> 0x0497 }
            goto L_0x049a
        L_0x0497:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0497 }
            throw r0
        L_0x049a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy.handleMessage(android.os.Message):void");
    }

    public boolean sendMessageAtTime(Message message, long j) {
        switch (this.a) {
            case 6:
                Bundle data = message.getData();
                ClassLoader classLoader = q68.class.getClassLoader();
                classLoader.getClass();
                data.setClassLoader(classLoader);
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                return super.sendMessageAtTime(message, j);
            default:
                return super.sendMessageAtTime(message, j);
        }
    }

    public /* synthetic */ cy(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cy(gf8 gf8) {
        super(Looper.getMainLooper());
        this.a = 7;
        this.b = gf8;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cy(Looper looper, m5d m5d) {
        super(looper);
        this.a = 13;
        this.b = m5d;
    }
}
