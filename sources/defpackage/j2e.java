package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.MediaStreamTrack;

/* renamed from: j2e  reason: default package */
public final /* synthetic */ class j2e implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2e b;

    public /* synthetic */ j2e(o2e o2e, int i) {
        this.a = i;
        this.b = o2e;
    }

    /* JADX WARNING: type inference failed for: r3v17, types: [e20, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v21, types: [r2e, java.lang.Object] */
    public final void run() {
        xlc xlc;
        int i;
        String str;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        switch (this.a) {
            case 0:
                this.b.f();
                return;
            default:
                o2e o2e = this.b;
                n4e n4e = (n4e) ((khe) ((k24) ((c34) o2e.c.get())).h.c).getValue();
                n4e.getClass();
                xlc a2 = xlc.a(0, "SELECT * FROM stickers");
                ilc ilc = n4e.a;
                ilc.b();
                Cursor o = ilc.o(a2, (CancellationSignal) null);
                try {
                    int n = tfg.n(o, "id");
                    int n2 = tfg.n(o, "sticker_id");
                    int n3 = tfg.n(o, "width");
                    int n4 = tfg.n(o, "height");
                    int n5 = tfg.n(o, "url");
                    int n6 = tfg.n(o, "update_time");
                    int n7 = tfg.n(o, "mp4_url");
                    int n8 = tfg.n(o, "first_url");
                    int n9 = tfg.n(o, "preview_url");
                    int n10 = tfg.n(o, "tags");
                    int n11 = tfg.n(o, "sticker_type");
                    int n12 = tfg.n(o, "set_id");
                    int n13 = tfg.n(o, "lottie_url");
                    xlc = a2;
                    try {
                        int n14 = tfg.n(o, MediaStreamTrack.AUDIO_TRACK_KIND);
                        int n15 = tfg.n(o, "author_type");
                        int n16 = tfg.n(o, "video_url");
                        int i6 = n13;
                        ArrayList arrayList = new ArrayList(o.getCount());
                        while (true) {
                            ArrayList arrayList2 = arrayList;
                            if (o.moveToNext()) {
                                long j = o.getLong(n);
                                long j2 = o.getLong(n2);
                                int i7 = o.getInt(n3);
                                int i8 = o.getInt(n4);
                                String string = o.isNull(n5) ? null : o.getString(n5);
                                long j3 = o.getLong(n6);
                                String string2 = o.isNull(n7) ? null : o.getString(n7);
                                String string3 = o.isNull(n8) ? null : o.getString(n8);
                                String string4 = o.isNull(n9) ? null : o.getString(n9);
                                int i9 = n;
                                int i10 = n2;
                                List Q0 = w9e.Q0(o.isNull(n10) ? null : o.getString(n10), new String[]{","}, false, 6);
                                int i11 = o.getInt(n11);
                                if (i11 != 0) {
                                    if (i11 == 10) {
                                        i5 = 2;
                                    } else if (i11 == 20) {
                                        i = 3;
                                    } else if (i11 == 40) {
                                        i5 = 4;
                                    } else {
                                        throw new IllegalArgumentException("No such value " + i11 + " for StickerType");
                                    }
                                    i = i5;
                                } else {
                                    i = 1;
                                }
                                long j4 = o.getLong(n12);
                                int i12 = i6;
                                if (o.isNull(i12)) {
                                    i2 = n14;
                                    str = null;
                                } else {
                                    str = o.getString(i12);
                                    i2 = n14;
                                }
                                if (o.getInt(i2) != 0) {
                                    i3 = n12;
                                    i6 = i12;
                                    i4 = n15;
                                    z = true;
                                } else {
                                    i3 = n12;
                                    i6 = i12;
                                    i4 = n15;
                                    z = false;
                                }
                                int i13 = o.getInt(i4);
                                n15 = i4;
                                int[] v = au1.v(3);
                                int i14 = n11;
                                int length = v.length;
                                int i15 = i2;
                                int i16 = 0;
                                while (i16 < length) {
                                    int i17 = v[i16];
                                    int[] iArr = v;
                                    if (k7d.c(i17) == i13) {
                                        int i18 = n16;
                                        ArrayList arrayList3 = arrayList2;
                                        arrayList3.add(new u2e(j, j2, i7, i8, string, j3, string2, string3, string4, Q0, i, j4, str, z, i17, o.isNull(i18) ? null : o.getString(i18)));
                                        arrayList = arrayList3;
                                        n16 = i18;
                                        n11 = i14;
                                        n12 = i3;
                                        n = i9;
                                        n2 = i10;
                                        n14 = i15;
                                    } else {
                                        List list = Q0;
                                        ArrayList arrayList4 = arrayList2;
                                        i16++;
                                        n16 = n16;
                                        Q0 = list;
                                        v = iArr;
                                    }
                                }
                                Locale locale = Locale.ENGLISH;
                                throw new IllegalArgumentException("No such value " + i13 + " for StickerAuthorType");
                            }
                            ArrayList arrayList5 = arrayList2;
                            o.close();
                            xlc.n();
                            ArrayList arrayList6 = new ArrayList(z53.S(arrayList5, 10));
                            Iterator it = arrayList5.iterator();
                            while (it.hasNext()) {
                                u2e u2e = (u2e) it.next();
                                ? obj = new Object();
                                obj.a = u2e.a;
                                obj.b = u2e.b;
                                obj.c = u2e.c;
                                obj.d = u2e.d;
                                obj.e = u2e.e;
                                obj.f = u2e.f;
                                obj.g = u2e.g;
                                obj.h = u2e.h;
                                obj.i = u2e.i;
                                obj.j = u2e.j;
                                obj.k = u2e.k;
                                obj.l = u2e.l;
                                obj.m = u2e.m;
                                obj.n = u2e.n;
                                obj.o = u2e.o;
                                obj.p = u2e.p;
                                arrayList6.add(new s2e(obj));
                            }
                            Iterator it2 = arrayList6.iterator();
                            while (it2.hasNext()) {
                                s2e s2e = (s2e) it2.next();
                                ? obj2 = new Object();
                                obj2.a = s2e.c;
                                obj2.b = s2e.o;
                                obj2.c = s2e.X;
                                obj2.d = s2e.Y;
                                obj2.e = s2e.Z;
                                obj2.f = s2e.s0;
                                obj2.g = s2e.t0;
                                obj2.h = s2e.u0;
                                obj2.i = s2e.v0;
                                obj2.j = s2e.w0;
                                obj2.k = s2e.x0;
                                obj2.l = s2e.y0;
                                obj2.m = s2e.z0;
                                obj2.n = s2e.A0;
                                obj2.o = s2e.B0;
                                d2e b2 = obj2.b();
                                o2e.a.put(Long.valueOf(b2.a), b2);
                            }
                            ConcurrentHashMap concurrentHashMap = o2e.b;
                            synchronized (o2e) {
                                try {
                                    Object v2 = pag.v(((kk5) ((zi5) o2e.e.get())).p());
                                    if (v2 != null) {
                                        Map map = (Map) v2;
                                        if (!map.isEmpty()) {
                                            concurrentHashMap.putAll(map);
                                        }
                                    }
                                } catch (Exception e) {
                                    hm9.l("o2e", "Failed to load initial showcase", e);
                                    ((p7b) o2e.d).a.l("user.stickersLastSync", 0L);
                                }
                            }
                            o2e.l.e(o2e.b.values());
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        o.close();
                        xlc.n();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    xlc = a2;
                    o.close();
                    xlc.n();
                    throw th;
                }
        }
    }
}
