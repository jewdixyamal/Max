package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.messages.media.trim.FrgTrimVideo;

/* renamed from: x72  reason: default package */
public final /* synthetic */ class x72 implements qj3, lde, km7, mq1, grd, u98, eqc, ehe {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object o;

    public /* synthetic */ x72(xs5 xs5, bw4 bw4) {
        this.a = 5;
        this.b = xs5;
        this.o = bw4;
        this.c = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
    }

    public Object a() {
        t8f t8f = (t8f) this.b;
        gqc gqc = (gqc) t8f.c;
        gqc.getClass();
        gqc.o(new lt1(t8f.g.a() + this.c, (Object) (hc0) this.o, 9));
        return null;
    }

    public void accept(Object obj) {
        e08 e08;
        Object obj2 = this.o;
        long j = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                u82 u82 = (u82) obj;
                p82 p82 = (p82) obj3;
                p82.getClass();
                u82.f0 = (uaa) obj2;
                u82.g0 = j;
                u82.h0 = ((p7b) p82.n).a.n();
                return;
            case 1:
                u82 u822 = (u82) obj;
                p82 p822 = (p82) obj3;
                p822.getClass();
                cu8 cu8 = (cu8) obj2;
                if (cu8 == null) {
                    u822.k0 = 0;
                    return;
                }
                cu8 j2 = ((au8) p822.s.get()).j(j, u822.k0);
                if (j2 == null || cu8.o > j2.o) {
                    u822.k0 = cu8.c;
                    return;
                }
                return;
            case 3:
                hl3 hl3 = (hl3) obj;
                hl3.b = (String) obj3;
                hl3.c = (String) obj2;
                hl3.e = j;
                return;
            default:
                List list = (List) obj;
                fk9 fk9 = (fk9) obj3;
                fk9.getClass();
                hm9.m("fk9", "Update track for message %d: track length = %d", Long.valueOf(j), Integer.valueOf(list.size()));
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (true) {
                    e08 e082 = (e08) obj2;
                    if (it.hasNext()) {
                        ep3 ep3 = (ep3) it.next();
                        d08 d08 = new d08(ep3.c);
                        d08.b = ep3.a;
                        d08.j = ep3.b;
                        d08.k = e082.k;
                        d08.c = j;
                        d08.l = ep3.d;
                        arrayList.add(new e08(d08));
                    } else {
                        fk9.o.put(Long.valueOf(j), arrayList);
                        ((el9) ((kk9) fk9.b)).C(arrayList, e082.k);
                        ir7 ir7 = fk9.C0;
                        if (ir7.o != -1 && (e08 = (e08) fk9.c.get(Long.valueOf(ir7.h))) != null) {
                            fk9.H0.e(e08);
                            return;
                        }
                        return;
                    }
                }
                break;
        }
    }

    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        rs7 rs7 = (rs7) this.o;
        String num = Integer.toString(rs7.a);
        String str = (String) this.b;
        boolean booleanValue = ((Boolean) gqc.n0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num}), new p4c(16))).booleanValue();
        long j = this.c;
        int i = rs7.a;
        if (!booleanValue) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL(ey8.i(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
        }
        return null;
    }

    public void c(qr6 qr6, int i) {
        w98 w98 = (w98) this.b;
        w98.getClass();
        qr6 qr62 = qr6;
        int i2 = i;
        qr62.i(w98.c, i2, ((tb8) this.o).d(true), this.c);
    }

    public Object get() {
        p82 p82 = (p82) this.b;
        long j = this.c;
        e52 C = p82.C(j);
        if (C == null) {
            hm9.m("p82", "changeChatField: chat with id = " + j + " not found", new Object[0]);
            return null;
        }
        ((sj3) this.o).accept(C);
        l92 A = p82.A(j);
        k92 k92 = C.b;
        p82.U(j, A != null ? new l92(A.b, k92) : new l92(j, k92));
        p82.f0((String) null, new w72(p82, j, C, false));
        ((k24) ((c34) p82.l.get())).b.h(C.a, k92);
        return C;
    }

    public void invoke(Object obj) {
        ((gd) obj).e0((fd) this.b, this.o, this.c);
    }

    public void j(nqd nqd) {
        int i;
        boolean z;
        Bitmap bitmap;
        FrgTrimVideo frgTrimVideo = (FrgTrimVideo) this.b;
        ed3 ed3 = (ed3) frgTrimVideo.p1.b;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(vl.o, Uri.parse((String) this.o));
        try {
            i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            z = true;
        } catch (Exception e) {
            hm9.p("ru.ok.messages.media.trim.FrgTrimVideo", "Can't extract video rotation", e);
            z = false;
            i = 0;
        }
        long j = this.c;
        if (z) {
            ti4 f = ((y8a) ed3).f();
            Context d0 = frgTrimVideo.d0();
            f.getClass();
            Size i2 = ti4.i(d0);
            if (i == 0 || i == 180) {
                i2 = new Size(i2.getHeight(), i2.getWidth());
            }
            bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j * 1000, 1, i2.getWidth(), i2.getHeight());
        } else {
            bitmap = mediaMetadataRetriever.getFrameAtTime(j * 1000, 1);
        }
        kk5 h = ((y8a) ed3).h();
        h.getClass();
        String path = h.o((String) null, (String) null).getPath();
        ph4 ph4 = j47.X;
        j47.h0(path, bitmap, 90, Bitmap.CompressFormat.JPEG);
        nqd.a(path);
    }

    public String q(lq1 lq1) {
        switch (this.a) {
            case 5:
                xs5 xs5 = (xs5) this.b;
                xs5.getClass();
                xs5.b.execute(new ss5(xs5, lq1, (bw4) this.o, this.c, 0));
                return "startFocusAndMetering";
            default:
                bm7 bm7 = (bm7) this.b;
                kq0.y(bm7, lq1);
                if (!bm7.isDone()) {
                    long j = this.c;
                    bm7.d(new e76(((ScheduledExecutorService) this.o).schedule(new d76(lq1, bm7, j), j, TimeUnit.MILLISECONDS), 0), ju0.k());
                }
                return "TimeoutFuture[" + bm7 + "]";
        }
    }

    public /* synthetic */ x72(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = j;
        this.o = obj2;
    }

    public /* synthetic */ x72(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.b = obj;
        this.o = obj2;
        this.c = j;
    }
}
