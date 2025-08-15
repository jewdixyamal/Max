package defpackage;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.SurfaceTexture;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.transformer.ExportException;
import com.google.android.gms.tasks.Task;
import com.my.tracker.obfuscated.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import one.me.webapp.settings.WebAppSettingsScreen;
import one.me.webapp.settings.WebAppsSettingScreen;
import org.apache.http.util.LangUtils;
import ru.ok.messages.video.fetcher.FetcherException;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: gte  reason: default package */
public final /* synthetic */ class gte implements qj3, y2a, km7, pj3, ehe, bb3, b66, pme, grd, l3a, o1d, y3g, pv6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gte() {
        this.a = 10;
        this.b = q8f.UPLOADING;
    }

    public x6g P(View view, x6g x6g) {
        Toolbar toolbar = (Toolbar) ((ai3) this.b).b;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) toolbar.getLayoutParams();
        v6g v6g = x6g.a;
        marginLayoutParams.topMargin = v6g.f(7).b;
        toolbar.setLayoutParams(marginLayoutParams);
        j47.p(toolbar, v6g.f(7).c);
        j47.q(toolbar, v6g.f(7).a);
        return x6g;
    }

    /* JADX INFO: finally extract failed */
    public Object a() {
        Object obj = this.b;
        switch (this.a) {
            case 4:
                gqc gqc = (gqc) ((l33) obj);
                gqc.getClass();
                int i = p33.e;
                m5d m5d = new m5d();
                HashMap hashMap = new HashMap();
                SQLiteDatabase m = gqc.m();
                m.beginTransaction();
                try {
                    p33 p33 = (p33) gqc.n0(m.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new u00((Object) gqc, (Object) hashMap, (Object) m5d, 27));
                    m.setTransactionSuccessful();
                    return p33;
                } finally {
                    m.endTransaction();
                }
            case 5:
                gqc gqc2 = (gqc) ((h45) obj);
                long a2 = gqc2.b.a() - gqc2.o.d;
                SQLiteDatabase m2 = gqc2.m();
                m2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(a2)};
                    gqc.n0(m2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new bqc(1, gqc2));
                    int delete = m2.delete("events", "timestamp_ms < ?", strArr);
                    m2.setTransactionSuccessful();
                    m2.endTransaction();
                    return Integer.valueOf(delete);
                } catch (Throwable th) {
                    m2.endTransaction();
                    throw th;
                }
            case 6:
                gqc gqc3 = (gqc) ((t8f) obj).i;
                SQLiteDatabase m3 = gqc3.m();
                m3.beginTransaction();
                try {
                    m3.compileStatement("DELETE FROM log_event_dropped").execute();
                    m3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gqc3.b.a()).execute();
                    m3.setTransactionSuccessful();
                    return null;
                } finally {
                    m3.endTransaction();
                }
            default:
                o7g o7g = (o7g) obj;
                for (hc0 a3 : (Iterable) ((gqc) o7g.b).o(new p4c(15))) {
                    o7g.c.a(a3, 1, false);
                }
                return null;
        }
    }

    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((tj8) obj2).c((dpd) obj);
                return;
            case 3:
                ((k1f) obj2).d((ExportException) obj);
                return;
            default:
                ((y8f) obj2).a((v6f) obj);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r6v11, types: [ee9] */
    /* JADX WARNING: type inference failed for: r6v12, types: [yn6] */
    /* JADX WARNING: type inference failed for: r6v13, types: [b24] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.a
            switch(r1) {
                case 10: goto L_0x012d;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = r23
            ff5 r1 = (defpackage.ff5) r1
            r2 = 0
            if (r1 == 0) goto L_0x0121
            java.util.List r3 = r1.b
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0018
            goto L_0x0121
        L_0x0018:
            java.lang.Object r0 = r0.b
            k20 r0 = (defpackage.k20) r0
            j20 r4 = r0.l
            r5 = 1
            if (r4 == 0) goto L_0x0027
            boolean r4 = r4.d
            if (r4 == 0) goto L_0x0027
            r4 = r5
            goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            java.util.Iterator r6 = r3.iterator()
        L_0x002c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x003e
            java.lang.Object r7 = r6.next()
            df5 r7 = (defpackage.df5) r7
            int r8 = r7.a
            r9 = 2
            if (r8 != r9) goto L_0x002c
            goto L_0x003f
        L_0x003e:
            r7 = r2
        L_0x003f:
            if (r7 == 0) goto L_0x006c
            b24 r2 = new b24
            int r3 = r0.p
            int r5 = r0.q
            java.lang.String r1 = r1.a
            java.lang.String r8 = r7.b
            long r9 = r0.k
            long r11 = r0.c
            long r13 = r0.a
            boolean r15 = r0.g
            uy r7 = r0.n
            int r6 = r0.e
            int r0 = r0.f
            r20 = r6
            r6 = r2
            r16 = r7
            r7 = r1
            r17 = r4
            r18 = r3
            r19 = r5
            r21 = r0
            r6.<init>(r7, r8, r9, r11, r13, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0121
        L_0x006c:
            java.util.Iterator r6 = r3.iterator()
        L_0x0070:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0081
            java.lang.Object r7 = r6.next()
            df5 r7 = (defpackage.df5) r7
            int r8 = r7.a
            if (r8 != r5) goto L_0x0070
            goto L_0x0082
        L_0x0081:
            r7 = r2
        L_0x0082:
            if (r7 == 0) goto L_0x00af
            yn6 r2 = new yn6
            int r3 = r0.p
            int r5 = r0.q
            java.lang.String r1 = r1.a
            java.lang.String r8 = r7.b
            long r9 = r0.k
            long r11 = r0.c
            long r13 = r0.a
            boolean r15 = r0.g
            uy r7 = r0.n
            int r6 = r0.e
            int r0 = r0.f
            r20 = r6
            r6 = r2
            r16 = r7
            r7 = r1
            r17 = r4
            r18 = r3
            r19 = r5
            r21 = r0
            r6.<init>(r7, r8, r9, r11, r13, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0121
        L_0x00af:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00b8:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00cd
            java.lang.Object r6 = r3.next()
            df5 r6 = (defpackage.df5) r6
            int r7 = r6.a
            r8 = 3
            if (r7 != r8) goto L_0x00b8
            r5.add(r6)
            goto L_0x00b8
        L_0x00cd:
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x00d4
            r5 = r2
        L_0x00d4:
            if (r5 == 0) goto L_0x0121
            java.util.ArrayList r8 = new java.util.ArrayList
            int r2 = r5.size()
            r8.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        L_0x00e3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0107
            java.lang.Object r3 = r2.next()
            df5 r3 = (defpackage.df5) r3     // Catch:{ all -> 0x0100 }
            ce9 r5 = new ce9     // Catch:{ all -> 0x0100 }
            java.lang.String r6 = r3.b     // Catch:{ all -> 0x0100 }
            int r7 = r3.c     // Catch:{ all -> 0x0100 }
            int r9 = r3.d     // Catch:{ all -> 0x0100 }
            int r3 = r3.e     // Catch:{ all -> 0x0100 }
            r5.<init>(r7, r6, r9, r3)     // Catch:{ all -> 0x0100 }
            r8.add(r5)     // Catch:{ all -> 0x0100 }
            goto L_0x00e3
        L_0x0100:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0107:
            ee9 r2 = new ee9
            long r13 = r0.a
            uy r15 = r0.n
            java.lang.String r7 = r1.a
            long r9 = r0.k
            long r11 = r0.c
            int r1 = r0.p
            int r0 = r0.q
            r6 = r2
            r16 = r4
            r17 = r1
            r18 = r0
            r6.<init>(r7, r8, r9, r11, r13, r15, r16, r17, r18)
        L_0x0121:
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            java.lang.String r1 = "VideoRipper"
            java.lang.String r3 = "getVideoContent: processFetchResult for videoContent %s"
            defpackage.hm9.m(r1, r3, r0)
            return r2
        L_0x012d:
            r1 = r23
            w8f r1 = (defpackage.w8f) r1
            r1.getClass()
            java.lang.String r2 = "SELECT * FROM uploads WHERE upload_status=?"
            r3 = 1
            xlc r2 = defpackage.xlc.a(r3, r2)
            java.lang.Object r0 = r0.b
            q8f r0 = (defpackage.q8f) r0
            int r0 = r0.a
            long r4 = (long) r0
            r2.j(r3, r4)
            u8f r0 = new u8f
            r3 = 1
            r0.<init>(r1, r2, r3)
            t28 r1 = new t28
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gte.apply(java.lang.Object):java.lang.Object");
    }

    public void b(ra3 ra3) {
        switch (this.a) {
            case 7:
                a9f a9f = (a9f) this.b;
                a9f.getClass();
                hm9.m("a9f", "clear: ", new Object[0]);
                synchronized (a9f) {
                    a9f.a.clear().e(((y8f) a9f.b.getValue()).clear()).a();
                }
                if (!ra3.h()) {
                    ra3.b();
                    return;
                }
                return;
            default:
                ((Map) ((c9f) this.b).b).clear();
                ra3.b();
                return;
        }
    }

    public void c(Display display) {
        kgf kgf = (kgf) this.b;
        if (display != null) {
            kgf.getClass();
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            kgf.i = refreshRate;
            kgf.j = (refreshRate * 80) / 100;
            return;
        }
        kgf.i = -9223372036854775807L;
        kgf.j = -9223372036854775807L;
    }

    public void f(qv6 qv6) {
        mag mag = (mag) this.b;
        mag.getClass();
        try {
            ov6 g = qv6.g();
            if (g != null) {
                mag.b.j(g);
            }
        } catch (IllegalStateException e) {
            e.getMessage();
        }
    }

    public int i(int i) {
        switch (this.a) {
            case LangUtils.HASH_SEED /*17*/:
                return ((w2g) ((ol7) ((WebAppSettingsScreen) this.b).Z.C(i))).a();
            default:
                w2g w2g = (w2g) ((ol7) ((WebAppsSettingScreen) this.b).o.C(i));
                if (w2g.a() != 0) {
                    return w2g.a();
                }
                return 0;
        }
    }

    public void invoke(Object obj) {
        h1f h1f = (h1f) this.b;
        ol8 ol8 = (ol8) obj;
        h1f.t.getClass();
        v85 a2 = h1f.q.a();
        String str = ol8.b;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, "onCompleted", (Throwable) null);
        }
        ml8 ml8 = ol8.a;
        ml8.f.set(a2);
        ml8.g.set((Object) null);
        ol8.a();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, rq9] */
    public void j(nqd nqd) {
        int i;
        boolean z;
        boolean z2;
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ypf ypf = (ypf) this.b;
                ypf.getClass();
                if (rq9.v0 == null) {
                    rq9.v0 = new Object();
                }
                rq9 rq9 = rq9.v0;
                l7b l7b = new l7b(ypf, 15, nqd);
                rq9.getClass();
                String str = ypf.a;
                if (str.length() == 0) {
                    new IllegalArgumentException("Video identifier cannot be empty");
                    l7b.j();
                    return;
                }
                try {
                    qq9.e(str).e(new bdb((Object) l7b, 13, new Object()));
                    return;
                } catch (IOException e) {
                    l7b.j();
                    e.printStackTrace();
                    return;
                }
            default:
                x9g x9g = (x9g) this.b;
                w9g w9g = x9g.b;
                w9g.execute(new String[]{x9g.a});
                SparseArray sparseArray = (SparseArray) w9g.get();
                if (sparseArray != null && sparseArray.size() != 0) {
                    ArrayList arrayList = new ArrayList();
                    int size = sparseArray.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        sparseArray.keyAt(i2);
                        y9g y9g = (y9g) sparseArray.valueAt(i2);
                        py5 py5 = y9g.a;
                        if (py5 != null && (i = py5.e) > 0 && !(z = py5.f) && !(z2 = py5.g)) {
                            arrayList.add(new df5(z ? 2 : z2 ? 1 : 3, -1, py5.c, i, y9g.b));
                        }
                    }
                    if (arrayList.isEmpty()) {
                        nqd.onError(new FetcherException(4, "Can't find any link"));
                        return;
                    } else if (!nqd.h()) {
                        nqd.a(new ff5("YouTube", arrayList));
                        return;
                    } else {
                        return;
                    }
                } else if (!nqd.h()) {
                    nqd.onError(new FetcherException(4, "Can't get video link"));
                    return;
                } else {
                    return;
                }
        }
    }

    public void l(Task task) {
        switch (this.a) {
            case 16:
                prf.b((Intent) this.b);
                return;
            case 20:
                ((c7g) this.b).b.d((Object) null);
                return;
            case 21:
                ((ScheduledFuture) this.b).cancel(false);
                return;
            default:
                x.b.a((x.c) this.b, task);
                return;
        }
    }

    public /* synthetic */ gte(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ gte(VideoView videoView, SurfaceTexture surfaceTexture) {
        this.a = 14;
        this.b = videoView;
    }
}
