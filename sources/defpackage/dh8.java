package defpackage;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: dh8  reason: default package */
public final class dh8 {
    public final ch8 a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Uri f;
    public boolean g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q = -1;
    public Bundle r;
    public IntentSender s;
    public zf8 t;
    public ArrayList u = new ArrayList();
    public us v;

    public dh8(ch8 ch8, String str, String str2) {
        this.a = ch8;
        this.b = str;
        this.c = str2;
    }

    public static sg8 a() {
        eh8.b();
        tg8 tg8 = eh8.c().s;
        if (tg8 instanceof sg8) {
            return (sg8) tg8;
        }
        return null;
    }

    public final gaa b(dh8 dh8) {
        if (dh8 != null) {
            us usVar = this.v;
            if (usVar == null) {
                return null;
            }
            String str = dh8.c;
            if (usVar.containsKey(str)) {
                return new gaa((Object) (rg8) this.v.get(str));
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final ug8 c() {
        ch8 ch8 = this.a;
        ch8.getClass();
        eh8.b();
        return ch8.a;
    }

    public final boolean d() {
        eh8.b();
        dh8 dh8 = eh8.c().p;
        if (dh8 != null) {
            if ((dh8 == this) || this.m == 3) {
                return true;
            }
            return TextUtils.equals(((ComponentName) c().b.b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO");
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    public final boolean e() {
        return Collections.unmodifiableList(this.u).size() >= 1;
    }

    public final boolean f() {
        return this.t != null && this.g;
    }

    public final boolean g() {
        eh8.b();
        return eh8.c().f() == this;
    }

    public final boolean h(wg8 wg8) {
        if (wg8 != null) {
            eh8.b();
            ArrayList arrayList = this.j;
            if (arrayList == null) {
                return false;
            }
            wg8.a();
            if (wg8.b.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                IntentFilter intentFilter = (IntentFilter) it.next();
                if (intentFilter != null) {
                    for (String hasCategory : wg8.b) {
                        if (intentFilter.hasCategory(hasCategory)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        if (r6.hasNext() != false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0103, code lost:
        if (r5.hasNext() != false) goto L_0x0106;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.zf8 r15) {
        /*
            r14 = this;
            zf8 r0 = r14.t
            r1 = 0
            if (r0 == r15) goto L_0x0250
            r14.t = r15
            if (r15 == 0) goto L_0x0250
            java.lang.String r0 = r14.d
            android.os.Bundle r2 = r15.a
            java.lang.String r3 = "name"
            java.lang.String r4 = r2.getString(r3)
            boolean r0 = java.util.Objects.equals(r0, r4)
            r4 = 1
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = r2.getString(r3)
            r14.d = r0
            r0 = r4
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            java.lang.String r3 = r14.e
            java.lang.String r5 = "status"
            java.lang.String r6 = r2.getString(r5)
            boolean r3 = java.util.Objects.equals(r3, r6)
            if (r3 != 0) goto L_0x0038
            java.lang.String r0 = r2.getString(r5)
            r14.e = r0
            r0 = r4
        L_0x0038:
            android.net.Uri r3 = r14.f
            java.lang.String r5 = "iconUri"
            java.lang.String r6 = r2.getString(r5)
            r7 = 0
            if (r6 != 0) goto L_0x0045
            r6 = r7
            goto L_0x0049
        L_0x0045:
            android.net.Uri r6 = android.net.Uri.parse(r6)
        L_0x0049:
            boolean r3 = java.util.Objects.equals(r3, r6)
            if (r3 != 0) goto L_0x005e
            java.lang.String r0 = r2.getString(r5)
            if (r0 != 0) goto L_0x0057
            r0 = r7
            goto L_0x005b
        L_0x0057:
            android.net.Uri r0 = android.net.Uri.parse(r0)
        L_0x005b:
            r14.f = r0
            r0 = r4
        L_0x005e:
            boolean r3 = r14.g
            java.lang.String r5 = "enabled"
            boolean r6 = r2.getBoolean(r5, r4)
            if (r3 == r6) goto L_0x006f
            boolean r0 = r2.getBoolean(r5, r4)
            r14.g = r0
            r0 = r4
        L_0x006f:
            int r3 = r14.h
            java.lang.String r5 = "connectionState"
            int r6 = r2.getInt(r5, r1)
            if (r3 == r6) goto L_0x0080
            int r0 = r2.getInt(r5, r1)
            r14.h = r0
            r0 = r4
        L_0x0080:
            java.util.ArrayList r3 = r14.j
            r15.a()
            java.util.List r5 = r15.c
            if (r3 != r5) goto L_0x008b
            goto L_0x0112
        L_0x008b:
            if (r3 == 0) goto L_0x0106
            if (r5 != 0) goto L_0x0091
            goto L_0x0106
        L_0x0091:
            java.util.ListIterator r6 = r3.listIterator()
            java.util.ListIterator r5 = r5.listIterator()
        L_0x0099:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00f9
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x00f9
            java.lang.Object r8 = r6.next()
            android.content.IntentFilter r8 = (android.content.IntentFilter) r8
            java.lang.Object r9 = r5.next()
            android.content.IntentFilter r9 = (android.content.IntentFilter) r9
            if (r8 != r9) goto L_0x00b4
            goto L_0x0099
        L_0x00b4:
            if (r8 == 0) goto L_0x0106
            if (r9 != 0) goto L_0x00b9
            goto L_0x0106
        L_0x00b9:
            int r10 = r8.countActions()
            int r11 = r9.countActions()
            if (r10 == r11) goto L_0x00c4
            goto L_0x0106
        L_0x00c4:
            r11 = r1
        L_0x00c5:
            if (r11 >= r10) goto L_0x00d9
            java.lang.String r12 = r8.getAction(r11)
            java.lang.String r13 = r9.getAction(r11)
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x00d6
            goto L_0x0106
        L_0x00d6:
            int r11 = r11 + 1
            goto L_0x00c5
        L_0x00d9:
            int r10 = r8.countCategories()
            int r11 = r9.countCategories()
            if (r10 == r11) goto L_0x00e4
            goto L_0x0106
        L_0x00e4:
            r11 = r1
        L_0x00e5:
            if (r11 >= r10) goto L_0x0099
            java.lang.String r12 = r8.getCategory(r11)
            java.lang.String r13 = r9.getCategory(r11)
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x00f6
            goto L_0x0106
        L_0x00f6:
            int r11 = r11 + 1
            goto L_0x00e5
        L_0x00f9:
            boolean r6 = r6.hasNext()
            if (r6 != 0) goto L_0x0106
            boolean r5 = r5.hasNext()
            if (r5 != 0) goto L_0x0106
            goto L_0x0112
        L_0x0106:
            r3.clear()
            r15.a()
            java.util.List r0 = r15.c
            r3.addAll(r0)
            r0 = r4
        L_0x0112:
            int r3 = r14.k
            java.lang.String r5 = "playbackType"
            int r6 = r2.getInt(r5, r4)
            if (r3 == r6) goto L_0x0123
            int r0 = r2.getInt(r5, r4)
            r14.k = r0
            r0 = r4
        L_0x0123:
            int r3 = r14.l
            java.lang.String r5 = "playbackStream"
            r6 = -1
            int r8 = r2.getInt(r5, r6)
            if (r3 == r8) goto L_0x0135
            int r0 = r2.getInt(r5, r6)
            r14.l = r0
            r0 = r4
        L_0x0135:
            int r3 = r14.m
            java.lang.String r5 = "deviceType"
            int r8 = r2.getInt(r5)
            if (r3 == r8) goto L_0x0146
            int r0 = r2.getInt(r5)
            r14.m = r0
            r0 = r4
        L_0x0146:
            int r3 = r14.n
            java.lang.String r5 = "volumeHandling"
            int r8 = r2.getInt(r5, r1)
            r9 = 3
            if (r3 == r8) goto L_0x0158
            int r0 = r2.getInt(r5, r1)
            r14.n = r0
            r0 = r9
        L_0x0158:
            int r3 = r14.o
            java.lang.String r5 = "volume"
            int r8 = r2.getInt(r5)
            if (r3 == r8) goto L_0x0169
            int r0 = r2.getInt(r5)
            r14.o = r0
            r0 = r9
        L_0x0169:
            int r3 = r14.p
            java.lang.String r5 = "volumeMax"
            int r8 = r2.getInt(r5)
            if (r3 == r8) goto L_0x017a
            int r0 = r2.getInt(r5)
            r14.p = r0
            goto L_0x017b
        L_0x017a:
            r9 = r0
        L_0x017b:
            int r0 = r14.q
            java.lang.String r3 = "presentationDisplayId"
            int r5 = r2.getInt(r3, r6)
            if (r0 == r5) goto L_0x018d
            int r0 = r2.getInt(r3, r6)
            r14.q = r0
            r9 = r9 | 5
        L_0x018d:
            android.os.Bundle r0 = r14.r
            java.lang.String r3 = "extras"
            android.os.Bundle r5 = r2.getBundle(r3)
            boolean r0 = java.util.Objects.equals(r0, r5)
            if (r0 != 0) goto L_0x01a3
            android.os.Bundle r0 = r2.getBundle(r3)
            r14.r = r0
            r9 = r9 | 1
        L_0x01a3:
            android.content.IntentSender r0 = r14.s
            java.lang.String r3 = "settingsIntent"
            android.os.Parcelable r5 = r2.getParcelable(r3)
            android.content.IntentSender r5 = (android.content.IntentSender) r5
            boolean r0 = java.util.Objects.equals(r0, r5)
            if (r0 != 0) goto L_0x01bd
            android.os.Parcelable r0 = r2.getParcelable(r3)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            r14.s = r0
            r9 = r9 | 1
        L_0x01bd:
            boolean r0 = r14.i
            java.lang.String r3 = "canDisconnect"
            boolean r5 = r2.getBoolean(r3, r1)
            if (r0 == r5) goto L_0x01cf
            boolean r0 = r2.getBoolean(r3, r1)
            r14.i = r0
            r9 = r9 | 5
        L_0x01cf:
            java.util.List r15 = r15.b()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r15.size()
            java.util.ArrayList r3 = r14.u
            int r3 = r3.size()
            if (r2 == r3) goto L_0x01e5
            r1 = r4
        L_0x01e5:
            boolean r2 = r15.isEmpty()
            if (r2 != 0) goto L_0x0248
            ah8 r2 = defpackage.eh8.c()
            java.util.Iterator r15 = r15.iterator()
        L_0x01f3:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x0248
            java.lang.Object r3 = r15.next()
            java.lang.String r3 = (java.lang.String) r3
            r2.getClass()
            ch8 r5 = r14.a
            ey1 r5 = r5.c
            java.lang.Object r5 = r5.b
            android.content.ComponentName r5 = (android.content.ComponentName) r5
            java.lang.String r5 = r5.flattenToShortString()
            java.util.HashMap r6 = r2.h
            mpa r8 = new mpa
            r8.<init>(r5, r3)
            java.lang.Object r3 = r6.get(r8)
            java.lang.String r3 = (java.lang.String) r3
            java.util.ArrayList r5 = r2.g
            java.util.Iterator r5 = r5.iterator()
        L_0x0221:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0236
            java.lang.Object r6 = r5.next()
            dh8 r6 = (defpackage.dh8) r6
            java.lang.String r8 = r6.c
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0221
            goto L_0x0237
        L_0x0236:
            r6 = r7
        L_0x0237:
            if (r6 == 0) goto L_0x01f3
            r0.add(r6)
            if (r1 != 0) goto L_0x01f3
            java.util.ArrayList r3 = r14.u
            boolean r3 = r3.contains(r6)
            if (r3 != 0) goto L_0x01f3
            r1 = r4
            goto L_0x01f3
        L_0x0248:
            if (r1 == 0) goto L_0x024f
            r14.u = r0
            r1 = r9 | 1
            goto L_0x0250
        L_0x024f:
            r1 = r9
        L_0x0250:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh8.i(zf8):int");
    }

    public final void j(int i2) {
        tg8 tg8;
        tg8 tg82;
        eh8.b();
        ah8 c2 = eh8.c();
        int min = Math.min(this.p, Math.max(0, i2));
        if (this != c2.r || (tg82 = c2.s) == null) {
            HashMap hashMap = c2.v;
            if (!hashMap.isEmpty() && (tg8 = (tg8) hashMap.get(this.c)) != null) {
                tg8.f(min);
                return;
            }
            return;
        }
        tg82.f(min);
    }

    public final void k(int i2) {
        tg8 tg8;
        tg8 tg82;
        eh8.b();
        if (i2 != 0) {
            ah8 c2 = eh8.c();
            if (this != c2.r || (tg82 = c2.s) == null) {
                HashMap hashMap = c2.v;
                if (!hashMap.isEmpty() && (tg8 = (tg8) hashMap.get(this.c)) != null) {
                    tg8.i(i2);
                    return;
                }
                return;
            }
            tg82.i(i2);
        }
    }

    public final void l() {
        eh8.b();
        eh8.c().h(this, 3);
    }

    public final boolean m(String str) {
        eh8.b();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((IntentFilter) arrayList.get(i2)).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [qpd, us] */
    public final void n(Collection collection) {
        this.u.clear();
        if (this.v == null) {
            this.v = new qpd(0);
        }
        this.v.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rg8 rg8 = (rg8) it.next();
            dh8 a2 = this.a.a(rg8.a.c());
            if (a2 != null) {
                this.v.put(a2.c, rg8);
                int i2 = rg8.b;
                if (i2 == 2 || i2 == 3) {
                    this.u.add(a2);
                }
            }
        }
        eh8.c().m.b(259, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouter.RouteInfo{ uniqueId=" + this.c + ", name=" + this.d + ", description=" + this.e + ", iconUri=" + this.f + ", enabled=" + this.g + ", connectionState=" + this.h + ", canDisconnect=" + this.i + ", playbackType=" + this.k + ", playbackStream=" + this.l + ", deviceType=" + this.m + ", volumeHandling=" + this.n + ", volume=" + this.o + ", volumeMax=" + this.p + ", presentationDisplayId=" + this.q + ", extras=" + this.r + ", settingsIntent=" + this.s + ", providerPackageName=" + ((ComponentName) this.a.c.b).getPackageName());
        if (e()) {
            sb.append(", members=[");
            int size = this.u.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                if (this.u.get(i2) != this) {
                    sb.append(((dh8) this.u.get(i2)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
