package defpackage;

import android.content.Context;
import android.content.pm.ShortcutManager;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: and  reason: default package */
public final class and implements qu7 {
    public static final /* synthetic */ bc7[] v0;
    public final je7 X;
    public final je7 Y;
    public final khe Z;
    public final Context a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final w4d s0 = mqd.D();
    public final khe t0;
    public final String u0;

    static {
        oi9 oi9 = new oi9(and.class, "shortcutsJob", "getShortcutsJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        v0 = new bc7[]{oi9};
    }

    public and(Context context, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77) {
        this.a = context;
        this.b = je7;
        this.c = je72;
        this.o = je74;
        this.X = je76;
        this.Y = je77;
        this.Z = new khe(new dr(je75, je73, 9));
        this.t0 = new khe(new zja(this, 24, je76));
        this.u0 = and.class.getName();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, umd] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.and r7, defpackage.e52 r8, kotlin.coroutines.Continuation r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof defpackage.ymd
            if (r0 == 0) goto L_0x0016
            r0 = r9
            ymd r0 = (defpackage.ymd) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x001b
        L_0x0016:
            ymd r0 = new ymd
            r0.<init>(r7, r9)
        L_0x001b:
            java.lang.Object r9 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            e52 r8 = r0.X
            and r7 = r0.o
            defpackage.od2.a0(r9)
            goto L_0x006c
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            defpackage.od2.a0(r9)
            java.lang.String r9 = r8.q()
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0045
            goto L_0x0053
        L_0x0045:
            je7 r9 = r7.o
            java.lang.Object r9 = r9.getValue()
            q33 r9 = (defpackage.q33) r9
            boolean r9 = r8.V(r9)
            if (r9 == 0) goto L_0x0056
        L_0x0053:
            r1 = r3
            goto L_0x014b
        L_0x0056:
            je7 r9 = r7.Y
            java.lang.Object r9 = r9.getValue()
            gt9 r9 = (defpackage.gt9) r9
            r0.o = r7
            r0.X = r8
            r0.s0 = r4
            java.lang.Object r9 = r9.b(r8, r0)
            if (r9 != r1) goto L_0x006c
            goto L_0x014b
        L_0x006c:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 != 0) goto L_0x0071
            goto L_0x0053
        L_0x0071:
            android.content.Context r0 = r7.a
            long r1 = r8.a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            umd r2 = new umd
            r2.<init>()
            r2.a = r0
            r2.b = r1
            java.lang.String r0 = r8.q()
            r2.d = r0
            java.lang.String r0 = r8.q()
            r2.e = r0
            androidx.core.graphics.drawable.IconCompat r9 = androidx.core.graphics.drawable.IconCompat.b(r9)
            r2.f = r9
            vw7 r9 = defpackage.vw7.c
            r9.getClass()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = ":chats?id="
            r9.<init>(r0)
            long r0 = r8.a
            r9.append(r0)
            java.lang.String r8 = "&type=local"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            je7 r9 = r7.X
            java.lang.Object r0 = r9.getValue()
            al r0 = (defpackage.al) r0
            fl7 r0 = (defpackage.fl7) r0
            java.lang.String r0 = r0.b
            java.lang.Object r9 = r9.getValue()
            al r9 = (defpackage.al) r9
            fl7 r9 = (defpackage.fl7) r9
            java.lang.String r9 = r9.e
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<one.me.android.MainActivity> r5 = one.me.android.MainActivity.class
            android.content.Context r6 = r7.a
            r1.<init>(r6, r5)
            java.lang.String r5 = "CUSTOM_DEEP_LINK"
            r1.setAction(r5)
            vw7 r5 = defpackage.vw7.c
            r5.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = "://"
            r5.append(r0)
            r5.append(r9)
            java.lang.String r9 = "/"
            r5.append(r9)
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r1.setData(r8)
            android.content.Intent[] r8 = new android.content.Intent[]{r1}
            r2.c = r8
            java.lang.String r8 = "ru.oneme.app.sharing.category.SHORTCUT_SHARE"
            java.util.Set r8 = java.util.Collections.singleton(r8)
            xs r9 = new xs
            r0 = 0
            r9.<init>((int) r0)
            r9.addAll(r8)
            r2.g = r9
            java.lang.CharSequence r8 = r2.d     // Catch:{ all -> 0x0141 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0141 }
            if (r8 != 0) goto L_0x0139
            android.content.Intent[] r8 = r2.c     // Catch:{ all -> 0x0141 }
            if (r8 == 0) goto L_0x0131
            int r8 = r8.length     // Catch:{ all -> 0x0141 }
            if (r8 == 0) goto L_0x0131
            xr7 r8 = r2.h     // Catch:{ all -> 0x0141 }
            if (r8 != 0) goto L_0x012d
            xr7 r8 = new xr7     // Catch:{ all -> 0x0141 }
            java.lang.String r9 = r2.b     // Catch:{ all -> 0x0141 }
            r8.<init>(r9)     // Catch:{ all -> 0x0141 }
            r2.h = r8     // Catch:{ all -> 0x0141 }
        L_0x012d:
            r2.i = r4     // Catch:{ all -> 0x0141 }
            r1 = r2
            goto L_0x014b
        L_0x0131:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0141 }
            java.lang.String r9 = "Shortcut must have an intent"
            r8.<init>(r9)     // Catch:{ all -> 0x0141 }
            throw r8     // Catch:{ all -> 0x0141 }
        L_0x0139:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0141 }
            java.lang.String r9 = "Shortcut must have a non-empty label"
            r8.<init>(r9)     // Catch:{ all -> 0x0141 }
            throw r8     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r8 = move-exception
            java.lang.String r7 = r7.u0
            java.lang.String r9 = "fail to create shortcut"
            defpackage.hm9.p(r7, r9, r8)
            goto L_0x0053
        L_0x014b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.and.b(and, e52, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a() {
        c();
    }

    public final void c() {
        try {
            Context context = this.a;
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
            wmd.u(context).getClass();
            Iterator it = wmd.t(context).iterator();
            if (it.hasNext()) {
                au1.r(it.next());
                throw null;
            }
        } catch (Throwable th) {
            hm9.p(this.u0, "clear: failed", th);
        }
    }

    public final void d() {
        vxd T = j47.T((sx3) this.Z.getValue(), (lx3) null, vx3.b, new zmd(this, (Continuation) null), 1);
        this.s0.o1(this, v0[0], T);
    }
}
